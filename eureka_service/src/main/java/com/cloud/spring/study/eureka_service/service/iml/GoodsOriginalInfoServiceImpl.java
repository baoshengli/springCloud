/*
package com.cloud.spring.study.eureka_service.service.iml;

import com.cloud.spring.study.eureka_service.model.GoodsOriginalInfo;
import com.cloud.spring.study.eureka_service.service.GoodsOriginalInfoService;
import com.taobao.api.ApiException;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.TbkDgItemCouponGetRequest;
import com.taobao.api.response.TbkDgItemCouponGetResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GoodsOriginalInfoServiceImpl implements GoodsOriginalInfoService {
    private static final Logger logger = LoggerFactory.getLogger(GoodsOriginalInfoServiceImpl.class);
    */
/**
     * 从淘宝的api采集数据
     * @param param
     * @return
     *//*

    @Override
    public Map<String, Object> searchAndInsertByTask(Map <String, Object> param) {
        Date ds = new Date();
        Map<String,Object> m = new HashMap<String, Object>();
       // GoodsCollectUpdate gcu = new GoodsCollectUpdate();
       // List<GoodsOriginalInfo> results_source = new ArrayList<GoodsOriginalInfo>(15000);
       // List<GoodsOriginalInfo> results_in = new ArrayList<GoodsOriginalInfo>();
       // List<GoodsOriginalInfo> result_up = new ArrayList<GoodsOriginalInfo>();
       // m.put("results_source", results_source);
       // m.put("insert", results_in);
       // m.put("update", result_up);
       // m.put("GoodsCollectUpdate", gcu);
//        gcu.setId(PropertiesService.getOrderIdByUUId());
//        gcu.setInvalidNum(0);
//        gcu.setResultNum(0);
//        gcu.setUpdateNum(0);
//        gcu.setSaveNum(0);
//        gcu.setSourceId("1");
//        gcu.setRequestNum(1);

        Map<String, Object> resu_map = searchAndInsertBy_adzone_id(param,m);
        batchInsertBy_Adzone_id(resu_map);
        return null;
    }

    */
/**
     * 通过好卷采集数据
     * @param param
     * @param m
     * @return
     *//*

    private Map<String,Object> searchAndInsertBy_adzone_id(Map<String, Object> param, Map<String, Object> m) {
        logger.info("采集数据开始"+new Date().toLocaleString());
        List<GoodsOriginalInfo> results_source =(List) m.get("results_source");
        //通过好劵清单
//        TaobaoClient client = PropertiesService.getTaobaoClient();
        TaobaoClient client = null;
        TbkDgItemCouponGetRequest req = new TbkDgItemCouponGetRequest();
        req.setAdzoneId(143842027L);
        req.setPageSize(100L);
        long pageNo = 0;//294967294    294967294
//		long pageNo = 147483647L;//294967294    294967294
        int queryNum = PropertiesService.queryNumber;
        //遍历查询页插入数据
        //上一次查询出来的数据
        TbkDgItemCouponGetResponse rspold = null;
        //本次查询出来的数据
        TbkDgItemCouponGetResponse rsp = null;
        while(pageNo <= queryNum) {
            pageNo++;
            logger.info("查询第"+pageNo+"次");
            param.put("pageNo", pageNo);
            //关键字 q
            req.setPageNo((Long) param.get("pageNo"));
            //这里是搜索的条件
            if(null != param.get("q") && !"".equals(param.get("q"))){
                req.setQ((String) param.get("q"));
            }
            req.setPlatform(2L);
            //req.setPlatform(1L);
            //req.setCat("16,18");
            //req.setPageSize(1L);
            // req.setPageNo(1L);
            ////查询条件结束

            do{
                try {
                    rsp = client.execute(req);
                } catch (ApiException e) {
                    e.printStackTrace();
                    logger.info("查询出错"+pageNo);

                }
            }while(rsp == null);
//				while(true){
            List<TbkCoupon> rt1 = null;
            List<TbkCoupon> rt2 = null;

            rt2 = rsp.getResults();
            if(rt2 == null || rt2.size()==0){
                logger.info("没有查询到相关的商品,退出查询");
                break;
            }
            if(null!= rspold && pageNo>100){
                rt1  = rspold.getResults();
                boolean repeat = true;
                for(int i =0;i<rt2.size();i++){
                    if(!rt1.get(i).getItemUrl().equals(rt2.get(i).getItemUrl())){
                        repeat = false;
                        break;
                    }
                }
                //数据重复
                if(repeat){
                    // found = true;
                    logger.info("第"+pageNo+"次查询数据重复结束");
                    continue;
                }
            }
            for (TbkCoupon tb: rsp.getResults()) {
                GoodsOriginalInfo gd1 = encapsulation(tb);
                results_source.add(gd1);
					*/
/*if(null!=gd1){
					}else{
						//抛弃掉的数据
						logger.info("抛弃掉的数据");
					}*//*

            }
            logger.info(pageNo+"查询结束");
            //插入数据
            rspold = rsp;
        }
				*/
/*//*
/保存数据
				if(null !=results_in&&results_in.size()!=0){
				goodsOriginalInfoMapper.batchInsert(results_in);
				}
				for (GoodsOriginalInfo goodsOriginalInfo : result_up) {
					goodsOriginalInfoMapper.updateByPrimaryKey(goodsOriginalInfo);
				}*//*

        logger.info("采集数据结束"+new Date().toLocaleString());
        return m;
        return null;
    }

    private void batchInsertBy_Adzone_id(Map<String, Object> resu_map) {

    }
}
*/
