package org.mybatis.internal.example.mapper;

import org.mybatis.internal.example.pojo.User;

public interface UserMapper {
    public User getUser(int id);
}