package com.cloud.spring.study.mysql_service.controller;

import com.cloud.spring.study.mysql_service.core.MapperServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cloud.spring.study.mysql_service.core.MapperServiceImpl;
import com.cloud.spring.study.mysql_service.entity.User;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodsOriginalInfoControllerTest {
    @Autowired
    MapperServiceImpl mapperService;
    @Test
    private void getiUserMapper() throws Exception {

        List<User> users=mapperService.getiUserMapper().findAllUsers();
        User u=users.get(0);
    }
   /* @Test
    private void aaa() throws Exception {

       mapperService.getGoodsOriginalInfoMapper();
        User u=users.get(0);
    }*/


}