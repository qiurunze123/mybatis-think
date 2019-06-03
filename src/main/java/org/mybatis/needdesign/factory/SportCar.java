package org.mybatis.needdesign.factory;

/**
 * @author 邱润泽 bullock
 */
public class SportCar implements ICar {
    @Override
    public void getCar() {
        System.out.println("把运动车交给我!");
    }
}
