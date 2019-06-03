package org.mybatis.needdesign.abstractfactory;

/**
 * @author 邱润泽 bullock
 */
public interface AbstractFactory {
    /**

     * 创建产品A

     * @return

     */

    public AbstractProductA createProductA();

    /**

     * 创建产品B

     * @return

     */

    public AbstractProductB createProductB();
}
