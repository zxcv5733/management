package com.ld.edu.service;

/**
 * @Author Ling dong.
 * @Date 2020/9/17 - 9:51
 */
public interface UserService {
    boolean checkLogin(String username, String password) throws Exception;
}
