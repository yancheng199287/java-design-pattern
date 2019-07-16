package com.oneinlet;

/**
 * 享元模式（Flyweight Pattern）主要用于减少创建对象的数量，以减少内存占用和提高性能。
 * 这种类型的设计模式属于结构型模式，它提供了减少对象数量从而改善应用所需的对象结构的方式。
 */
public class App {


    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            int num = (int) (Math.random() * 13 + 1);
            int color = (int) (Math.random() * 4 + 1);

            String numStr;
            switch (num) {
                case 11:
                    numStr = "J";
                    break;
                case 12:
                    numStr = "Q";
                    break;
                case 13:
                    numStr = "K";
                    break;
                default:
                    numStr = String.valueOf(num);
            }
            PokerFactory.getInstance().getPocker(color).description(numStr);
        }

    }
}
