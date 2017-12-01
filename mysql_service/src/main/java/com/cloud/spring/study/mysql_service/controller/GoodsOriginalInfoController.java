package com.cloud.spring.study.mysql_service.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.cloud.spring.study.mysql_service.core.MapperServiceImpl;
import com.cloud.spring.study.mysql_service.entity.GoodsOriginalInfo;
import com.cloud.spring.study.mysql_service.entity.GoodsOriginalInfoExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/goodsOriginalInfo")
public class GoodsOriginalInfoController {
    @Autowired
    private MapperServiceImpl mapperService;

   private static final Logger logger = LoggerFactory.getLogger(GoodsOriginalInfoController.class);
   @RequestMapping("/queryApi")
//   @Scheduled(initialDelay=1000*5,fixedDelay =1000*20)
    public void /*List<GoodsOriginalInfo>*/ insert(){
    	//@RequestParam Map<String,Object> param
    	 Map<String,Object> param = new HashMap<String, Object>();
       // return goodsOriginalInfoService.searchAndInsert(param);
    	logger.info("定时任务开始采集数据"+new Date().toLocaleString());
       GoodsOriginalInfoExample example = new GoodsOriginalInfoExample();
       long a =  mapperService.getGoodsOriginalInfoMapper().countByExample(example);
       //        logger.info(((List)(searchAndInsertBy_adzone_id.get("insert"))).size()+"");
//        logger.info(((List)(searchAndInsertBy_adzone_id.get("update"))).size()+"");
        logger.info("定时任务采集数据结束"+new Date().toLocaleString());
    }
/**
     * 获取选品库的信息
     * @param param
     * @return


    @RequestMapping("/utam")
    public List<GoodsOriginalInfo> insert_uatm(@RequestParam Map<String,Object> param){
    	// return goodsOriginalInfoService.searchAndInsert(param);
    	Map<String, Object> searchAndInsertBy_adzone_id = goodsOriginalInfoService.searchBy_uatm(param);
    	logger.info(((List)(searchAndInsertBy_adzone_id.get("insert"))).size()+"");
    	logger.info(((List)(searchAndInsertBy_adzone_id.get("update"))).size()+"");
    	return null;
    }
*
     * 调用淘宝的商品接口
     * @param param
     * @return


    @RequestMapping("/searchShop")
    public List<GoodsOriginalInfo> searchAndInsert(@RequestParam Map<String,String> param){
    	// return goodsOriginalInfoService.searchAndInsert(param);
    	goodsOriginalInfoService.searchAndInsert(param);

    	return null;
    }*/
}
