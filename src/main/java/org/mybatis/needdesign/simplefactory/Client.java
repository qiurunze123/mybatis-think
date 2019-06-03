package org.mybatis.needdesign.simplefactory;

/**
 * @author 邱润泽 bullock
 *
 *
 * 开闭原则 --  依赖倒置 --  单一职责
 *
 * 简单工厂模式 如果想要重新加一辆车 那么就必须修改代码  违反了开闭原则
 */
public class Client {

    public static void main(String[] args) {

        CarFactory factory = new CarFactory();

        System.out.println("开跑车========去兜风 !!! ");

        factory.getCar1(1).GetCar();
    }
}
