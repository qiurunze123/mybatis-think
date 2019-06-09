package org.mybatis.demo.session;

import org.mybatis.demo.config.Configuration;
import org.mybatis.demo.exector.Exector;
import org.mybatis.demo.mapper.MapperProxy;

import java.lang.reflect.Proxy;

public class SqlSession {

    private Configuration configuration ;
    private Exector exector ;

    /**
     * 关联
     * @param configuration
     * @param exector
     */
    public SqlSession(Configuration configuration, Exector exector) {
        this.configuration = configuration;
        this.exector = exector;
    }


    public Configuration getConfiguration() {
        return configuration;
    }

    /**
     * 代理mapperproxy
     * @param clazz
     * @param <T>
     * @return
     */
    public <T> T getMapper(Class<T> clazz){
        return (T)Proxy.newProxyInstance(clazz.getClassLoader(),new Class[]{clazz},
                new MapperProxy(this,clazz));
    }

    public <T> T selectOne(String statemnet,Object parameter){
        return exector.execute(statemnet,parameter);
    }

}
