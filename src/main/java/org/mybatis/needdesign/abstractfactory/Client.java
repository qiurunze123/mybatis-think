package org.mybatis.needdesign.abstractfactory;

/**
 * @author 邱润泽 bullock
 */
public class Client {

    public static void main(String[] args) {
        AbstractFactory f1 = new ConcreteFactory1();
        f1.createProductA();
        f1.createProductB();
        AbstractFactory f2 = new ConcreteFactory2();

        f2.createProductB();
        f2.createProductA();
    }
}
