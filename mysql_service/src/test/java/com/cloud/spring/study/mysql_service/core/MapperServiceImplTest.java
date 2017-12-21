package com.cloud.spring.study.mysql_service.core;

import com.cloud.spring.study.mysql_service.entity.GoodsOriginalInfo;
import com.cloud.spring.study.mysql_service.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest
public class MapperServiceImplTest {
    @Autowired
    MapperServiceImpl mapperService;
    @Test
    public void getiUserMapper() throws Exception {

        List<User> users=mapperService.getiUserMapper().findAllUsers();
        User u=users.get(0);


    }
    @Test
    public void getGoodsOriginalInfoMapper() throws Exception {
        GoodsOriginalInfo goodsOriginalInfo = mapperService.getGoodsOriginalInfoMapper().selectByPrimaryKey("000B8F3E858F22DB8185E2E4A60F410E");
        System.out.println("dfsf");
    }
}