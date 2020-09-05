package com.atguigu.dao;

import com.atguigu.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Administrator
 * @create 2020-09-02 20:52
 */
@Repository
public interface UserDao {

    @Select("select * from user")
    public List<User> findAll();
}
