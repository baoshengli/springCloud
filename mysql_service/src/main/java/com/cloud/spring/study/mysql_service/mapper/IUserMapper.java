package com.cloud.spring.study.mysql_service.mapper;



import com.cloud.spring.study.mysql_service.entity.User;

import java.util.List;

/**
 * 用户 mybatis 接口文件。
 *
 * @author hmilyylimh
 *
 * @version 0.0.1
 *
 * @date 2017-10-19
 *
 */
public interface IUserMapper {



    User findUserById(Long id);

    List<User> findAllUsers();

    int insertUser(User user);
}