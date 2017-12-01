package com.cloud.spring.study.mysql_service.mapper;


import java.util.List;

import com.cloud.spring.study.mysql_service.entity.GoodsOriginalInfo;
import com.cloud.spring.study.mysql_service.entity.GoodsOriginalInfoExample;
import org.apache.ibatis.annotations.Param;

public interface GoodsOriginalInfoMapper {
    long countByExample(GoodsOriginalInfoExample example);

    int deleteByExample(GoodsOriginalInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(GoodsOriginalInfo record);

    int insertSelective(GoodsOriginalInfo record);

    List<GoodsOriginalInfo> selectByExample(GoodsOriginalInfoExample example);

    GoodsOriginalInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") GoodsOriginalInfo record, @Param("example") GoodsOriginalInfoExample example);

    int updateByExample(@Param("record") GoodsOriginalInfo record, @Param("example") GoodsOriginalInfoExample example);

    int updateByPrimaryKeySelective(GoodsOriginalInfo record);

    int updateByPrimaryKey(GoodsOriginalInfo record);
    void batchInsert(List<GoodsOriginalInfo> results);

	void batchUpdate(List<GoodsOriginalInfo> list);
}