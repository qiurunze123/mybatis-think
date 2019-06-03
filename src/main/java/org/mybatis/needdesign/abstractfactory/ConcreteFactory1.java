package org.mybatis.needdesign.abstractfactory;

/**
 * @author 邱润泽 bullock
 */
public class ConcreteFactory1 implements AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
