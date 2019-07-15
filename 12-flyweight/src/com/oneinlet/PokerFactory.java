package com.oneinlet;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by WangZiHe on 19-7-15
 * QQ/WeChat:648830605
 * QQ-Group:368512253
 * Blog:www.520code.net
 * Github:https://github.com/yancheng199287
 */
public class PokerFactory {


    public static final int RED_PEACH = 0;
    public static final int SQUARE = 1;
    public static final int BLACK_PEACH = 2;
    public static final int BLACK_CLUB = 3;

    private static final PokerFactory factoryPocker = new PokerFactory();

    private static final Map<Integer, AbstractPoker> pokerMap = new HashMap<>();

    public static PokerFactory getInstance() {
        return factoryPocker;
    }


    public AbstractPoker getPocker(int color) {
        AbstractPoker abstractPoker;
        if (pokerMap.containsKey(color)) {
            abstractPoker = pokerMap.get(color);
        } else {
            switch (color) {
                case 0:
                    abstractPoker = new RedPeachPoker();
                    break;
                case 1:
                    abstractPoker = new SquarePoker();
                    break;
                case 2:
                    abstractPoker = new BlackPeachPoker();
                    break;
                case 3:
                    abstractPoker = new BlackClubPoker();
                    break;
                default:
                    throw new IllegalArgumentException("Invalid color value:"+color);
            }
        }
        return abstractPoker;
    }
}
