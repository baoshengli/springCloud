package com.cloud.spring.study.eureka_service.service;


import java.util.Map;

public interface GoodsOriginalInfoService {
    /**
     * 从淘宝的api采集数据
     * @param param
     * @return
     */
    Map<String, Object> searchAndInsertByTask(Map<String, Object> param);

}
