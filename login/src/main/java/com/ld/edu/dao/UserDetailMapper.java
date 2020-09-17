package com.ld.edu.dao;



import com.ld.edu.entity.AuthUserDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: Li dong.
 * @date: 2020/4/29 - 21:18
 */

public interface UserDetailMapper {

    // 根据用户ID查询用户信息
    AuthUserDetail findByUserName(@Param("username") String username);

    // 根据用户ID查询用户角色
    List<String> findRoleByUserName(@Param("username") String username);

    // 根据roleCodes查询用户权限
    List<String> findAuthorityByRoleCodes(@Param("roleCodes") List<String> roleCodes);

    // 根据用户ID查询用户权限
    List<String> findUrlsByUserName(@Param("username") String username);
}
