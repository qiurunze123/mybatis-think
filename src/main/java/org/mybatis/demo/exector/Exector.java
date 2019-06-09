package org.mybatis.demo.exector;

public interface Exector {

    public <T> T execute(String statemnet,Object parameter);
}
