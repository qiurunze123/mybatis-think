package org.mybatis.needdesign.decoratorcatch;

/**
 * @author 邱润泽 bullock
 */
public class Client {

    public static void main(String[] args) {
        Car car = new Car();
        car.move();

        System.out.println("增加飞的功能!");

        FlyCar flyCar = new FlyCar(car);

        flyCar.move();

        System.out.println("增加游泳的功能!");

        WaterCar waterCar =new WaterCar(flyCar);

        waterCar.move();
    }

}
