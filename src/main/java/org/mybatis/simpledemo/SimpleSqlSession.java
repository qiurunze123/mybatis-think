package org.mybatis.simpledemo;

import java.lang.reflect.Proxy;

/**
 * @auther 邱润泽 bullock
 * @date 2019/6/9
 */
public class SimpleSqlSession {

    private Executor executor = new SimpleExecutor();

    public <T> T selectOne(String statement, Object parameter) {
        return executor.query(statement,parameter);
    }

    /**
     * // 方法 1: 该方法用于获取指定代理对象所关联的InvocationHandler
     * static InvocationHandler getInvocationHandler(Object proxy)
     *
     * // 方法 2：该方法用于获取关联于指定类装载器和一组接口的动态代理类的类对象
     * static Class getProxyClass(ClassLoader loader, Class[] interfaces)
     *
     * // 方法 3：该方法用于判断指定类是否是一个动态代理类
     * static boolean isProxyClass(Class cl)
     *
     * // 方法 4：该方法用于为指定类装载器、一组接口及调用处理器生成动态代理类实例
     * static Object newProxyInstance(ClassLoader loader, Class[] interfaces, InvocationHandler h)
     *
     * 动态代理  --  代理mapperProxy接口
     * @param clazz
     * @param <T>
     * @return
     */
    public <T> T getMapper(Class<T> clazz) {
        return (T) Proxy.newProxyInstance(clazz.getClassLoader(),
                new Class[]{clazz}, new MapperProxy(this, clazz));
    }

}
