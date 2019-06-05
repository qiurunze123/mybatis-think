package org.mybatis.needdesign.decoratorcatch;

/**
 * @author 邱润泽 bullock
 */
public class AICar extends SuperCar {
    public AICar(Icar icar) {
        super(icar);
    }

    @Override
    public void move() {
        super.move();
        AIMove();
    }

    private void AIMove() {
        System.out.println("自动驾驶!");
    }
}
