package com.cloud.spring.study.mysql_service.core;

import com.cloud.spring.study.mysql_service.mapper.GoodsOriginalInfoMapper;
import com.cloud.spring.study.mysql_service.mapper.IUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MapperServiceImpl {
    @Autowired
    private IUserMapper iUserMapper;
    @Autowired
    private GoodsOriginalInfoMapper goodsOriginalInfoMapper;
    public IUserMapper getiUserMapper() {
        return iUserMapper;
    }

    public void setiUserMapper(IUserMapper iUserMapper) {
        this.iUserMapper = iUserMapper;
    }

    public GoodsOriginalInfoMapper getGoodsOriginalInfoMapper() {
        return goodsOriginalInfoMapper;
    }

    public void setGoodsOriginalInfoMapper(GoodsOriginalInfoMapper goodsOriginalInfoMapper) {
        this.goodsOriginalInfoMapper = goodsOriginalInfoMapper;
    }
}
