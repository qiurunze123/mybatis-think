package org.mybatis.needdesign.decoratorcatch;

/**
 * @author 邱润泽 bullock
 */
public class Car implements Icar {
    @Override
    public void move() {
        System.out.println("在陆地上跑!");
    }
}
