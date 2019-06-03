package org.mybatis.needdesign.simplefactory;

/**
 * @author 邱润泽 bullock
 */
public class CarFactory {

   public ICar getCar1(Integer carType){

       /**
        * cartype 1 运动车  2 吉普车
        */
       if(carType==1){
           return new SportCar();
       }else if(carType ==2){
           return new JeepCar();
       }
       return null;
   }
}
