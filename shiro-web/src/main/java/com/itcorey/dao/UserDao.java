package com.itcorey.dao;

import com.itcorey.vo.User;

import java.util.List;

/**
 * Created by ：Corey
 * 15:58 2018/12/13
 */
public interface UserDao {

    User getUserByUserName(String username);

    List<String> queryRolesByUserName(String username);
}
