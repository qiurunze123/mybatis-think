package org.mybatis.simpledemo;

import java.util.HashMap;
import java.util.Map;

public class UserMapperXml {
    public static final String nameSpace = "org.mybatis.simpledemo.UserMapper";

    public static final Map<String, String> methodSqlMapping = new HashMap<String, String>();

    static {
        methodSqlMapping.put("selectByPrimaryKey", "select * from user where id = %d");
    }
}