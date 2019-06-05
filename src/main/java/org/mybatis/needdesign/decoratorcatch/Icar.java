package org.mybatis.needdesign.decoratorcatch;

/**
 * @author 邱润泽 bullock
 * mybatis 的 源码的缓存模块用的装饰器模式
 *
 * 装饰器模式可以减少 -- 子类的数量
 *
 * 装饰器模式以对客户端透明的方式动态地给一个对象附加上了更多的责任
 * 换言之，客户端并不会角色对象在装饰前和装饰后有什么不同
 */
public interface Icar {
    //基本功能move
    void move();
}
