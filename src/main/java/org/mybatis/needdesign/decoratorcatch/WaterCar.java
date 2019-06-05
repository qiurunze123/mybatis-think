package org.mybatis.needdesign.decoratorcatch;

/**
 * @author 邱润泽 bullock
 */
public class WaterCar extends SuperCar {
    public WaterCar(Icar icar) {
        super(icar);
    }

    @Override
    public void move() {
        super.move();
        water();
    }

    private void water() {
        System.out.println("我会游泳了!");
    }
}
