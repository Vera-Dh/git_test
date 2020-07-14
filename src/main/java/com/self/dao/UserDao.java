package com.self.dao;

import com.self.domain.User;

import java.util.List;

/**
 * @Author Vera-D
 * @Date 2020-07-14 18:43
 */
public interface UserDao {

    List<User> findAll();

    User findById(Integer id);
}
