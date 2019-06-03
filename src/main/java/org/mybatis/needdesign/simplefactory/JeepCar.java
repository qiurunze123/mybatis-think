package org.mybatis.needdesign.simplefactory;

import javax.swing.*;

/**
 * @author 邱润泽 bullock
 */
public class JeepCar implements ICar {
    @Override
    public void GetCar() {
        System.out.println("把吉普车交给邱润泽！");
    }
}
