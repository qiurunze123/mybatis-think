package org.mybatis.needdesign.decoratorcatch;

/**
 * @author 邱润泽 bullock
 */
public class FlyCar extends SuperCar {
    public FlyCar(Icar icar) {
        super(icar);
    }

    @Override
    public void move() {
        super.move();
        fly();
    }

    public void fly(){
        System.out.println("我会飞了!");
    }
}
