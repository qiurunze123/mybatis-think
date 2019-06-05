package org.mybatis.needdesign.decoratorcatch;

/**
 * @author 邱润泽 bullock
 *
 * 具体构件角色(真实对象)
 */
public class SuperCar implements Icar {

    private Icar icar ;

    public SuperCar(Icar icar) {
        this.icar = icar;
    }

    @Override
    public void move() {

        icar.move();
    }
}
