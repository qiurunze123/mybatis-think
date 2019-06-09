package org.mybatis.simpledemo;



/**
 * @auther 邱润泽 bullock
 * @date 2019/6/9
 */
public class client {
    public static void main(String[] args) {

        SimpleSqlSession simpleSqlSession = new SimpleSqlSession();
        UserMapper userMapper = simpleSqlSession.getMapper(UserMapper.class);

        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user);
    }
}
