package org.mybatis.demo.mapper;

import org.mybatis.demo.session.SqlSession;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @auther 邱润泽 bullock
 * @date 2019/6/8
 */
public class MapperProxy<T> implements InvocationHandler {


    /**
     * 希望类是不可变的  final
     */
    private final SqlSession sqlSession;
    private final Class<T> mapperInteface;
    public MapperProxy(SqlSession sqlSession,Class<T> clazz) {
        this.sqlSession = sqlSession;
        this.mapperInteface = clazz;

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (method.getDeclaringClass().getName().equals(sqlSession.getConfiguration())) {
//        String
//        }
//        }
        }

        return null;
    }
}
