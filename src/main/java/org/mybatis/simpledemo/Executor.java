package org.mybatis.simpledemo;

/**
 * @auther 邱润泽 bullock
 * @date 2019/6/9
 */
public interface Executor {

    <E> E query(String statement, Object parameter);

}
