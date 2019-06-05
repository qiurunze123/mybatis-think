package org.mybatis.needdesign.factory;

/**
 * @author 邱润泽 bullock
 * 简单工厂模式
 */
public class Client {

    public static void main(String[] args) {
        JeepFactory carFactory = new JeepFactory();

       carFactory.CreateCar().getCar();
    }
}
