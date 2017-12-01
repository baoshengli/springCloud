package com.cloud.spring.study.mysql_service.controller;


import com.cloud.spring.study.mysql_service.core.MapperServiceImpl;
import com.cloud.spring.study.mysql_service.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户微服务Controller。
 *
 * @author hmilyylimh
 * @version 0.0.1
 * @date 2017-10-19
 */
@RestController
public class ProviderUserMysqlMybatisMapperController {

    @Autowired
    private MapperServiceImpl mapperService;


    @GetMapping("/simple/{id}")
    public User findUserById(@PathVariable Long id) {
        return this.mapperService.getiUserMapper().findUserById(id);
    }

    @GetMapping("/simple/list")
    @ResponseBody
    public List<User> findUserList() {
        return this.mapperService.getiUserMapper().findAllUsers();
    }

    /**
     * 添加一个student,使用postMapping接收post请求
     * <p>
     * http://localhost:8330/simple/addUser?username=user11&age=11&balance=11
     *
     * @return
     */
    @PostMapping("/simple/addUser")
    public User addUser(@RequestParam(value = "username", required = false) String username, @RequestParam(value = "age", required = false) Integer age, @RequestParam(value = "balance", required = false) String balance) {
        User user = new User();


        user.setName(username);


        int result = mapperService.getiUserMapper().insertUser(user);
        if (result > 0) {
            return user;
        }

        user.setId(0L);
        user.setName(null);
        return user;
    }
}
