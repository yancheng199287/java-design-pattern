package com.oneinlet;

/* ConcreteDecorator（具体装饰者）
 * 具体的装饰对象，给内部持有的具体被装饰对象，增加具体的职责
 */
public class BelleConcreteDectrator extends Decorator {

    public BelleConcreteDectrator(AppearanceComponent appearanceComponent) {
        super(appearanceComponent);
    }

    @Override
    public void dress() {
        //appearanceComponent是构造器中的接口对象
        appearanceComponent.dress();
        System.out.println("   配上白色手套");
    }

    @Override
    public void shoe() {
        //appearanceComponent是构造器中的接口对象
        appearanceComponent.shoe();
        System.out.println("   配上白色丝筒袜");
    }
}
