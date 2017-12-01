package com.cloud.spring.study.mysql_service.core;

import com.cloud.spring.study.mysql_service.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class MapperServiceImplTest {
    @Autowired
    MapperServiceImpl mapperService;
    @Test
    private void getiUserMapper() throws Exception {

        List<User> users=mapperService.getiUserMapper().findAllUsers();
        User u=users.get(0);


    }

}