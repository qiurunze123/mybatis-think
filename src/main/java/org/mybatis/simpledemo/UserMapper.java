package org.mybatis.simpledemo;


public interface UserMapper {
    User selectByPrimaryKey(Integer userId);
}