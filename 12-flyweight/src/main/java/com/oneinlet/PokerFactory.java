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


    public static final int RED_PEACH = 1;
    public static final int SQUARE = 2;
    public static final int BLACK_PEACH = 3;
    public static final int BLACK_CLUB = 4;

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
                case RED_PEACH:
                    abstractPoker = new RedPeachPoker();
                    break;
                case SQUARE:
                    abstractPoker = new SquarePoker();
                    break;
                case BLACK_PEACH:
                    abstractPoker = new BlackPeachPoker();
                    break;
                case BLACK_CLUB:
                    abstractPoker = new BlackClubPoker();
                    break;
                default:
                    throw new IllegalArgumentException("Invalid color value:"+color);
            }
        }
        return abstractPoker;
    }
}
