package com.oneinlet;


public class GoddessConcreteDectrator extends Decorator {

    public GoddessConcreteDectrator(AppearanceComponent appearanceComponent) {
        super(appearanceComponent);
    }


    @Override
    public void hairStyle() {
        //appearanceComponent是构造器中的接口对象
        appearanceComponent.hairStyle();
        System.out.println("   戴上黄金发夹");
    }

}
