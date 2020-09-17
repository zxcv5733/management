package com.ld.edu.service.impl;

import com.ld.edu.dao.UserDetailMapper;
import com.ld.edu.entity.AuthUserDetail;
import com.ld.edu.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * @Author Ling dong.
 * @Date 2020/9/17 - 9:54
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserDetailMapper userDetailMapper;

    @Resource
    PasswordEncoder passwordEncoder;

    @Override
    public boolean checkLogin(String username, String password) throws Exception {
        AuthUserDetail userDetail = userDetailMapper.findByUserName(username);
        if (Objects.isNull(userDetail)){
            //设置友好提示
            throw new Exception("账号不存在，请重新尝试！");
        }else {
            // 加密的密码
            String encodedPassword = userDetail.getPassword();
            //和加密后的密码进行比配
            if(!passwordEncoder.matches(password,encodedPassword)) {
                //设置友好提示
                throw new Exception("密码不正确！");
            }else{
                return  true;
            }
        }
    }
}
