package com.oneinlet;


public class GoddessConcreteDectrator extends Decorator {

    public GoddessConcreteDectrator(AppearanceComponent appearanceComponent) {
        super(appearanceComponent);
    }


    @Override
    public void hairStyle() {
        appearanceComponent.hairStyle();
        System.out.println("   戴上黄金发夹");
    }

}
