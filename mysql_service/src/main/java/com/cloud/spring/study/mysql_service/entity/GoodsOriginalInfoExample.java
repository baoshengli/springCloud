package com.cloud.spring.study.mysql_service.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;



public class GoodsOriginalInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsOriginalInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNumIidIsNull() {
            addCriterion("num_iid is null");
            return (Criteria) this;
        }

        public Criteria andNumIidIsNotNull() {
            addCriterion("num_iid is not null");
            return (Criteria) this;
        }

        public Criteria andNumIidEqualTo(String value) {
            addCriterion("num_iid =", value, "numIid");
            return (Criteria) this;
        }

        public Criteria andNumIidNotEqualTo(String value) {
            addCriterion("num_iid <>", value, "numIid");
            return (Criteria) this;
        }

        public Criteria andNumIidGreaterThan(String value) {
            addCriterion("num_iid >", value, "numIid");
            return (Criteria) this;
        }

        public Criteria andNumIidGreaterThanOrEqualTo(String value) {
            addCriterion("num_iid >=", value, "numIid");
            return (Criteria) this;
        }

        public Criteria andNumIidLessThan(String value) {
            addCriterion("num_iid <", value, "numIid");
            return (Criteria) this;
        }

        public Criteria andNumIidLessThanOrEqualTo(String value) {
            addCriterion("num_iid <=", value, "numIid");
            return (Criteria) this;
        }

        public Criteria andNumIidLike(String value) {
            addCriterion("num_iid like", value, "numIid");
            return (Criteria) this;
        }

        public Criteria andNumIidNotLike(String value) {
            addCriterion("num_iid not like", value, "numIid");
            return (Criteria) this;
        }

        public Criteria andNumIidIn(List<String> values) {
            addCriterion("num_iid in", values, "numIid");
            return (Criteria) this;
        }

        public Criteria andNumIidNotIn(List<String> values) {
            addCriterion("num_iid not in", values, "numIid");
            return (Criteria) this;
        }

        public Criteria andNumIidBetween(String value1, String value2) {
            addCriterion("num_iid between", value1, value2, "numIid");
            return (Criteria) this;
        }

        public Criteria andNumIidNotBetween(String value1, String value2) {
            addCriterion("num_iid not between", value1, value2, "numIid");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        
        
        public Criteria andTitleGreaterThanOrEqualTo(String value) {
        	addCriterion("title >=", value, "title");
        	return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andPictUrlIsNull() {
            addCriterion("pict_url is null");
            return (Criteria) this;
        }

        public Criteria andPictUrlIsNotNull() {
            addCriterion("pict_url is not null");
            return (Criteria) this;
        }

        public Criteria andPictUrlEqualTo(String value) {
            addCriterion("pict_url =", value, "pictUrl");
            return (Criteria) this;
        }

        public Criteria andPictUrlNotEqualTo(String value) {
            addCriterion("pict_url <>", value, "pictUrl");
            return (Criteria) this;
        }

        public Criteria andPictUrlGreaterThan(String value) {
            addCriterion("pict_url >", value, "pictUrl");
            return (Criteria) this;
        }

        public Criteria andPictUrlGreaterThanOrEqualTo(String value) {
            addCriterion("pict_url >=", value, "pictUrl");
            return (Criteria) this;
        }

        public Criteria andPictUrlLessThan(String value) {
            addCriterion("pict_url <", value, "pictUrl");
            return (Criteria) this;
        }

        public Criteria andPictUrlLessThanOrEqualTo(String value) {
            addCriterion("pict_url <=", value, "pictUrl");
            return (Criteria) this;
        }

        public Criteria andPictUrlLike(String value) {
            addCriterion("pict_url like", value, "pictUrl");
            return (Criteria) this;
        }

        public Criteria andPictUrlNotLike(String value) {
            addCriterion("pict_url not like", value, "pictUrl");
            return (Criteria) this;
        }

        public Criteria andPictUrlIn(List<String> values) {
            addCriterion("pict_url in", values, "pictUrl");
            return (Criteria) this;
        }

        public Criteria andPictUrlNotIn(List<String> values) {
            addCriterion("pict_url not in", values, "pictUrl");
            return (Criteria) this;
        }

        public Criteria andPictUrlBetween(String value1, String value2) {
            addCriterion("pict_url between", value1, value2, "pictUrl");
            return (Criteria) this;
        }

        public Criteria andPictUrlNotBetween(String value1, String value2) {
            addCriterion("pict_url not between", value1, value2, "pictUrl");
            return (Criteria) this;
        }

        public Criteria andSmallImagesIsNull() {
            addCriterion("small_images is null");
            return (Criteria) this;
        }

        public Criteria andSmallImagesIsNotNull() {
            addCriterion("small_images is not null");
            return (Criteria) this;
        }

        public Criteria andSmallImagesEqualTo(String value) {
            addCriterion("small_images =", value, "smallImages");
            return (Criteria) this;
        }

        public Criteria andSmallImagesNotEqualTo(String value) {
            addCriterion("small_images <>", value, "smallImages");
            return (Criteria) this;
        }

        public Criteria andSmallImagesGreaterThan(String value) {
            addCriterion("small_images >", value, "smallImages");
            return (Criteria) this;
        }

        public Criteria andSmallImagesGreaterThanOrEqualTo(String value) {
            addCriterion("small_images >=", value, "smallImages");
            return (Criteria) this;
        }

        public Criteria andSmallImagesLessThan(String value) {
            addCriterion("small_images <", value, "smallImages");
            return (Criteria) this;
        }

        public Criteria andSmallImagesLessThanOrEqualTo(String value) {
            addCriterion("small_images <=", value, "smallImages");
            return (Criteria) this;
        }

        public Criteria andSmallImagesLike(String value) {
            addCriterion("small_images like", value, "smallImages");
            return (Criteria) this;
        }

        public Criteria andSmallImagesNotLike(String value) {
            addCriterion("small_images not like", value, "smallImages");
            return (Criteria) this;
        }

        public Criteria andSmallImagesIn(List<String> values) {
            addCriterion("small_images in", values, "smallImages");
            return (Criteria) this;
        }

        public Criteria andSmallImagesNotIn(List<String> values) {
            addCriterion("small_images not in", values, "smallImages");
            return (Criteria) this;
        }

        public Criteria andSmallImagesBetween(String value1, String value2) {
            addCriterion("small_images between", value1, value2, "smallImages");
            return (Criteria) this;
        }

        public Criteria andSmallImagesNotBetween(String value1, String value2) {
            addCriterion("small_images not between", value1, value2, "smallImages");
            return (Criteria) this;
        }

        public Criteria andReservePriceIsNull() {
            addCriterion("reserve_price is null");
            return (Criteria) this;
        }

        public Criteria andReservePriceIsNotNull() {
            addCriterion("reserve_price is not null");
            return (Criteria) this;
        }

        public Criteria andReservePriceEqualTo(String value) {
            addCriterion("reserve_price =", value, "reservePrice");
            return (Criteria) this;
        }

        public Criteria andReservePriceNotEqualTo(String value) {
            addCriterion("reserve_price <>", value, "reservePrice");
            return (Criteria) this;
        }

        public Criteria andReservePriceGreaterThan(String value) {
            addCriterion("reserve_price >", value, "reservePrice");
            return (Criteria) this;
        }

        public Criteria andReservePriceGreaterThanOrEqualTo(String value) {
            addCriterion("reserve_price >=", value, "reservePrice");
            return (Criteria) this;
        }

        public Criteria andReservePriceLessThan(String value) {
            addCriterion("reserve_price <", value, "reservePrice");
            return (Criteria) this;
        }

        public Criteria andReservePriceLessThanOrEqualTo(String value) {
            addCriterion("reserve_price <=", value, "reservePrice");
            return (Criteria) this;
        }

        public Criteria andReservePriceLike(String value) {
            addCriterion("reserve_price like", value, "reservePrice");
            return (Criteria) this;
        }

        public Criteria andReservePriceNotLike(String value) {
            addCriterion("reserve_price not like", value, "reservePrice");
            return (Criteria) this;
        }

        public Criteria andReservePriceIn(List<String> values) {
            addCriterion("reserve_price in", values, "reservePrice");
            return (Criteria) this;
        }

        public Criteria andReservePriceNotIn(List<String> values) {
            addCriterion("reserve_price not in", values, "reservePrice");
            return (Criteria) this;
        }

        public Criteria andReservePriceBetween(String value1, String value2) {
            addCriterion("reserve_price between", value1, value2, "reservePrice");
            return (Criteria) this;
        }

        public Criteria andReservePriceNotBetween(String value1, String value2) {
            addCriterion("reserve_price not between", value1, value2, "reservePrice");
            return (Criteria) this;
        }

        public Criteria andZkFinalPriceIsNull() {
            addCriterion("zk_final_price is null");
            return (Criteria) this;
        }

        public Criteria andZkFinalPriceIsNotNull() {
            addCriterion("zk_final_price is not null");
            return (Criteria) this;
        }

        public Criteria andZkFinalPriceEqualTo(Double value) {
            addCriterion("zk_final_price =", value, "zkFinalPrice");
            return (Criteria) this;
        }

        public Criteria andZkFinalPriceNotEqualTo(Double value) {
            addCriterion("zk_final_price <>", value, "zkFinalPrice");
            return (Criteria) this;
        }

        public Criteria andZkFinalPriceGreaterThan(Double value) {
            addCriterion("zk_final_price >", value, "zkFinalPrice");
            return (Criteria) this;
        }

        public Criteria andZkFinalPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("zk_final_price >=", value, "zkFinalPrice");
            return (Criteria) this;
        }

        public Criteria andZkFinalPriceLessThan(Double value) {
            addCriterion("zk_final_price <", value, "zkFinalPrice");
            return (Criteria) this;
        }

        public Criteria andZkFinalPriceLessThanOrEqualTo(Double value) {
            addCriterion("zk_final_price <=", value, "zkFinalPrice");
            return (Criteria) this;
        }

        public Criteria andZkFinalPriceLike(Double value) {
            addCriterion("zk_final_price like", value, "zkFinalPrice");
            return (Criteria) this;
        }

        public Criteria andZkFinalPriceNotLike(Double value) {
            addCriterion("zk_final_price not like", value, "zkFinalPrice");
            return (Criteria) this;
        }

        public Criteria andZkFinalPriceIn(List<Double> values) {
            addCriterion("zk_final_price in", values, "zkFinalPrice");
            return (Criteria) this;
        }

        public Criteria andZkFinalPriceNotIn(List<Double> values) {
            addCriterion("zk_final_price not in", values, "zkFinalPrice");
            return (Criteria) this;
        }

        public Criteria andZkFinalPriceBetween(Double value1, Double value2) {
            addCriterion("zk_final_price between", value1, value2, "zkFinalPrice");
            return (Criteria) this;
        }

        public Criteria andZkFinalPriceNotBetween(Double value1, Double value2) {
            addCriterion("zk_final_price not between", value1, value2, "zkFinalPrice");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("user_type like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("user_type not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andProvcityIsNull() {
            addCriterion("provcity is null");
            return (Criteria) this;
        }

        public Criteria andProvcityIsNotNull() {
            addCriterion("provcity is not null");
            return (Criteria) this;
        }

        public Criteria andProvcityEqualTo(String value) {
            addCriterion("provcity =", value, "provcity");
            return (Criteria) this;
        }

        public Criteria andProvcityNotEqualTo(String value) {
            addCriterion("provcity <>", value, "provcity");
            return (Criteria) this;
        }

        public Criteria andProvcityGreaterThan(String value) {
            addCriterion("provcity >", value, "provcity");
            return (Criteria) this;
        }

        public Criteria andProvcityGreaterThanOrEqualTo(String value) {
            addCriterion("provcity >=", value, "provcity");
            return (Criteria) this;
        }

        public Criteria andProvcityLessThan(String value) {
            addCriterion("provcity <", value, "provcity");
            return (Criteria) this;
        }

        public Criteria andProvcityLessThanOrEqualTo(String value) {
            addCriterion("provcity <=", value, "provcity");
            return (Criteria) this;
        }

        public Criteria andProvcityLike(String value) {
            addCriterion("provcity like", value, "provcity");
            return (Criteria) this;
        }

        public Criteria andProvcityNotLike(String value) {
            addCriterion("provcity not like", value, "provcity");
            return (Criteria) this;
        }

        public Criteria andProvcityIn(List<String> values) {
            addCriterion("provcity in", values, "provcity");
            return (Criteria) this;
        }

        public Criteria andProvcityNotIn(List<String> values) {
            addCriterion("provcity not in", values, "provcity");
            return (Criteria) this;
        }

        public Criteria andProvcityBetween(String value1, String value2) {
            addCriterion("provcity between", value1, value2, "provcity");
            return (Criteria) this;
        }

        public Criteria andProvcityNotBetween(String value1, String value2) {
            addCriterion("provcity not between", value1, value2, "provcity");
            return (Criteria) this;
        }

        public Criteria andItemUrlIsNull() {
            addCriterion("item_url is null");
            return (Criteria) this;
        }

        public Criteria andItemUrlIsNotNull() {
            addCriterion("item_url is not null");
            return (Criteria) this;
        }

        public Criteria andItemUrlEqualTo(String value) {
            addCriterion("item_url =", value, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlNotEqualTo(String value) {
            addCriterion("item_url <>", value, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlGreaterThan(String value) {
            addCriterion("item_url >", value, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlGreaterThanOrEqualTo(String value) {
            addCriterion("item_url >=", value, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlLessThan(String value) {
            addCriterion("item_url <", value, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlLessThanOrEqualTo(String value) {
            addCriterion("item_url <=", value, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlLike(String value) {
            addCriterion("item_url like", value, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlNotLike(String value) {
            addCriterion("item_url not like", value, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlIn(List<String> values) {
            addCriterion("item_url in", values, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlNotIn(List<String> values) {
            addCriterion("item_url not in", values, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlBetween(String value1, String value2) {
            addCriterion("item_url between", value1, value2, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlNotBetween(String value1, String value2) {
            addCriterion("item_url not between", value1, value2, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andClickUrlIsNull() {
            addCriterion("click_url is null");
            return (Criteria) this;
        }

        public Criteria andClickUrlIsNotNull() {
            addCriterion("click_url is not null");
            return (Criteria) this;
        }

        public Criteria andClickUrlEqualTo(String value) {
            addCriterion("click_url =", value, "clickUrl");
            return (Criteria) this;
        }

        public Criteria andClickUrlNotEqualTo(String value) {
            addCriterion("click_url <>", value, "clickUrl");
            return (Criteria) this;
        }

        public Criteria andClickUrlGreaterThan(String value) {
            addCriterion("click_url >", value, "clickUrl");
            return (Criteria) this;
        }

        public Criteria andClickUrlGreaterThanOrEqualTo(String value) {
            addCriterion("click_url >=", value, "clickUrl");
            return (Criteria) this;
        }

        public Criteria andClickUrlLessThan(String value) {
            addCriterion("click_url <", value, "clickUrl");
            return (Criteria) this;
        }

        public Criteria andClickUrlLessThanOrEqualTo(String value) {
            addCriterion("click_url <=", value, "clickUrl");
            return (Criteria) this;
        }

        public Criteria andClickUrlLike(String value) {
            addCriterion("click_url like", value, "clickUrl");
            return (Criteria) this;
        }

        public Criteria andClickUrlNotLike(String value) {
            addCriterion("click_url not like", value, "clickUrl");
            return (Criteria) this;
        }

        public Criteria andClickUrlIn(List<String> values) {
            addCriterion("click_url in", values, "clickUrl");
            return (Criteria) this;
        }

        public Criteria andClickUrlNotIn(List<String> values) {
            addCriterion("click_url not in", values, "clickUrl");
            return (Criteria) this;
        }

        public Criteria andClickUrlBetween(String value1, String value2) {
            addCriterion("click_url between", value1, value2, "clickUrl");
            return (Criteria) this;
        }

        public Criteria andClickUrlNotBetween(String value1, String value2) {
            addCriterion("click_url not between", value1, value2, "clickUrl");
            return (Criteria) this;
        }

        public Criteria andNickIsNull() {
            addCriterion("nick is null");
            return (Criteria) this;
        }

        public Criteria andNickIsNotNull() {
            addCriterion("nick is not null");
            return (Criteria) this;
        }

        public Criteria andNickEqualTo(String value) {
            addCriterion("nick =", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickNotEqualTo(String value) {
            addCriterion("nick <>", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickGreaterThan(String value) {
            addCriterion("nick >", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickGreaterThanOrEqualTo(String value) {
            addCriterion("nick >=", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickLessThan(String value) {
            addCriterion("nick <", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickLessThanOrEqualTo(String value) {
            addCriterion("nick <=", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickLike(String value) {
            addCriterion("nick like", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickNotLike(String value) {
            addCriterion("nick not like", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickIn(List<String> values) {
            addCriterion("nick in", values, "nick");
            return (Criteria) this;
        }

        public Criteria andNickNotIn(List<String> values) {
            addCriterion("nick not in", values, "nick");
            return (Criteria) this;
        }

        public Criteria andNickBetween(String value1, String value2) {
            addCriterion("nick between", value1, value2, "nick");
            return (Criteria) this;
        }

        public Criteria andNickNotBetween(String value1, String value2) {
            addCriterion("nick not between", value1, value2, "nick");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNull() {
            addCriterion("seller_id is null");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNotNull() {
            addCriterion("seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIdEqualTo(Integer value) {
            addCriterion("seller_id =", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotEqualTo(Integer value) {
            addCriterion("seller_id <>", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThan(Integer value) {
            addCriterion("seller_id >", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("seller_id >=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThan(Integer value) {
            addCriterion("seller_id <", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThanOrEqualTo(Integer value) {
            addCriterion("seller_id <=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIn(List<Integer> values) {
            addCriterion("seller_id in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotIn(List<Integer> values) {
            addCriterion("seller_id not in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdBetween(Integer value1, Integer value2) {
            addCriterion("seller_id between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("seller_id not between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNull() {
            addCriterion("volume is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("volume is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(Integer value) {
            addCriterion("volume =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(Integer value) {
            addCriterion("volume <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(Integer value) {
            addCriterion("volume >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("volume >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(Integer value) {
            addCriterion("volume <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(Integer value) {
            addCriterion("volume <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<Integer> values) {
            addCriterion("volume in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<Integer> values) {
            addCriterion("volume not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(Integer value1, Integer value2) {
            addCriterion("volume between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(Integer value1, Integer value2) {
            addCriterion("volume not between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andCatLeafNameIsNull() {
            addCriterion("cat_leaf_name is null");
            return (Criteria) this;
        }

        public Criteria andCatLeafNameIsNotNull() {
            addCriterion("cat_leaf_name is not null");
            return (Criteria) this;
        }

        public Criteria andCatLeafNameEqualTo(String value) {
            addCriterion("cat_leaf_name =", value, "catLeafName");
            return (Criteria) this;
        }

        public Criteria andCatLeafNameNotEqualTo(String value) {
            addCriterion("cat_leaf_name <>", value, "catLeafName");
            return (Criteria) this;
        }

        public Criteria andCatLeafNameGreaterThan(String value) {
            addCriterion("cat_leaf_name >", value, "catLeafName");
            return (Criteria) this;
        }

        public Criteria andCatLeafNameGreaterThanOrEqualTo(String value) {
            addCriterion("cat_leaf_name >=", value, "catLeafName");
            return (Criteria) this;
        }

        public Criteria andCatLeafNameLessThan(String value) {
            addCriterion("cat_leaf_name <", value, "catLeafName");
            return (Criteria) this;
        }

        public Criteria andCatLeafNameLessThanOrEqualTo(String value) {
            addCriterion("cat_leaf_name <=", value, "catLeafName");
            return (Criteria) this;
        }

        public Criteria andCatLeafNameLike(String value) {
            addCriterion("cat_leaf_name like", value, "catLeafName");
            return (Criteria) this;
        }

        public Criteria andCatLeafNameNotLike(String value) {
            addCriterion("cat_leaf_name not like", value, "catLeafName");
            return (Criteria) this;
        }

        public Criteria andCatLeafNameIn(List<String> values) {
            addCriterion("cat_leaf_name in", values, "catLeafName");
            return (Criteria) this;
        }

        public Criteria andCatLeafNameNotIn(List<String> values) {
            addCriterion("cat_leaf_name not in", values, "catLeafName");
            return (Criteria) this;
        }

        public Criteria andCatLeafNameBetween(String value1, String value2) {
            addCriterion("cat_leaf_name between", value1, value2, "catLeafName");
            return (Criteria) this;
        }

        public Criteria andCatLeafNameNotBetween(String value1, String value2) {
            addCriterion("cat_leaf_name not between", value1, value2, "catLeafName");
            return (Criteria) this;
        }

        public Criteria andCatNameIsNull() {
            addCriterion("cat_name is null");
            return (Criteria) this;
        }

        public Criteria andCatNameIsNotNull() {
            addCriterion("cat_name is not null");
            return (Criteria) this;
        }

        public Criteria andCatNameEqualTo(String value) {
            addCriterion("cat_name =", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameNotEqualTo(String value) {
            addCriterion("cat_name <>", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameGreaterThan(String value) {
            addCriterion("cat_name >", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameGreaterThanOrEqualTo(String value) {
            addCriterion("cat_name >=", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameLessThan(String value) {
            addCriterion("cat_name <", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameLessThanOrEqualTo(String value) {
            addCriterion("cat_name <=", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameLike(String value) {
            addCriterion("cat_name like", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameNotLike(String value) {
            addCriterion("cat_name not like", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameIn(List<String> values) {
            addCriterion("cat_name in", values, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameNotIn(List<String> values) {
            addCriterion("cat_name not in", values, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameBetween(String value1, String value2) {
            addCriterion("cat_name between", value1, value2, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameNotBetween(String value1, String value2) {
            addCriterion("cat_name not between", value1, value2, "catName");
            return (Criteria) this;
        }

        public Criteria andTkRateIsNull() {
            addCriterion("tk_rate is null");
            return (Criteria) this;
        }

        public Criteria andTkRateIsNotNull() {
            addCriterion("tk_rate is not null");
            return (Criteria) this;
        }

        public Criteria andTkRateEqualTo(Double value) {
            addCriterion("tk_rate =", value, "tkRate");
            return (Criteria) this;
        }

        public Criteria andTkRateNotEqualTo(Double value) {
            addCriterion("tk_rate <>", value, "tkRate");
            return (Criteria) this;
        }

        public Criteria andTkRateGreaterThan(Double value) {
            addCriterion("tk_rate >", value, "tkRate");
            return (Criteria) this;
        }

        public Criteria andTkRateGreaterThanOrEqualTo(Double value) {
            addCriterion("tk_rate >=", value, "tkRate");
            return (Criteria) this;
        }

        public Criteria andTkRateLessThan(Double value) {
            addCriterion("tk_rate <", value, "tkRate");
            return (Criteria) this;
        }

        public Criteria andTkRateLessThanOrEqualTo(Double value) {
            addCriterion("tk_rate <=", value, "tkRate");
            return (Criteria) this;
        }

        public Criteria andTkRateLike(Double value) {
            addCriterion("tk_rate like", value, "tkRate");
            return (Criteria) this;
        }

        public Criteria andTkRateNotLike(String value) {
            addCriterion("tk_rate not like", value, "tkRate");
            return (Criteria) this;
        }

        public Criteria andTkRateIn(List<String> values) {
            addCriterion("tk_rate in", values, "tkRate");
            return (Criteria) this;
        }

        public Criteria andTkRateNotIn(List<String> values) {
            addCriterion("tk_rate not in", values, "tkRate");
            return (Criteria) this;
        }

        public Criteria andTkRateBetween(String value1, String value2) {
            addCriterion("tk_rate between", value1, value2, "tkRate");
            return (Criteria) this;
        }

        public Criteria andTkRateNotBetween(String value1, String value2) {
            addCriterion("tk_rate not between", value1, value2, "tkRate");
            return (Criteria) this;
        }

        public Criteria andZkFinalPriceWapIsNull() {
            addCriterion("zk_final_price_wap is null");
            return (Criteria) this;
        }

        public Criteria andZkFinalPriceWapIsNotNull() {
            addCriterion("zk_final_price_wap is not null");
            return (Criteria) this;
        }

        public Criteria andZkFinalPriceWapEqualTo(String value) {
            addCriterion("zk_final_price_wap =", value, "zkFinalPriceWap");
            return (Criteria) this;
        }

        public Criteria andZkFinalPriceWapNotEqualTo(String value) {
            addCriterion("zk_final_price_wap <>", value, "zkFinalPriceWap");
            return (Criteria) this;
        }

        public Criteria andZkFinalPriceWapGreaterThan(String value) {
            addCriterion("zk_final_price_wap >", value, "zkFinalPriceWap");
            return (Criteria) this;
        }

        public Criteria andZkFinalPriceWapGreaterThanOrEqualTo(String value) {
            addCriterion("zk_final_price_wap >=", value, "zkFinalPriceWap");
            return (Criteria) this;
        }

        public Criteria andZkFinalPriceWapLessThan(String value) {
            addCriterion("zk_final_price_wap <", value, "zkFinalPriceWap");
            return (Criteria) this;
        }

        public Criteria andZkFinalPriceWapLessThanOrEqualTo(String value) {
            addCriterion("zk_final_price_wap <=", value, "zkFinalPriceWap");
            return (Criteria) this;
        }

        public Criteria andZkFinalPriceWapLike(String value) {
            addCriterion("zk_final_price_wap like", value, "zkFinalPriceWap");
            return (Criteria) this;
        }

        public Criteria andZkFinalPriceWapNotLike(String value) {
            addCriterion("zk_final_price_wap not like", value, "zkFinalPriceWap");
            return (Criteria) this;
        }

        public Criteria andZkFinalPriceWapIn(List<String> values) {
            addCriterion("zk_final_price_wap in", values, "zkFinalPriceWap");
            return (Criteria) this;
        }

        public Criteria andZkFinalPriceWapNotIn(List<String> values) {
            addCriterion("zk_final_price_wap not in", values, "zkFinalPriceWap");
            return (Criteria) this;
        }

        public Criteria andZkFinalPriceWapBetween(String value1, String value2) {
            addCriterion("zk_final_price_wap between", value1, value2, "zkFinalPriceWap");
            return (Criteria) this;
        }

        public Criteria andZkFinalPriceWapNotBetween(String value1, String value2) {
            addCriterion("zk_final_price_wap not between", value1, value2, "zkFinalPriceWap");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeIsNull() {
            addCriterion("event_start_time is null");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeIsNotNull() {
            addCriterion("event_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeEqualTo(Date value) {
            addCriterionForJDBCDate("event_start_time =", value, "eventStartTime");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("event_start_time <>", value, "eventStartTime");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("event_start_time >", value, "eventStartTime");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("event_start_time >=", value, "eventStartTime");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeLessThan(Date value) {
            addCriterionForJDBCDate("event_start_time <", value, "eventStartTime");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("event_start_time <=", value, "eventStartTime");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeIn(List<Date> values) {
            addCriterionForJDBCDate("event_start_time in", values, "eventStartTime");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("event_start_time not in", values, "eventStartTime");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("event_start_time between", value1, value2, "eventStartTime");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("event_start_time not between", value1, value2, "eventStartTime");
            return (Criteria) this;
        }

        public Criteria andEventEndTimeIsNull() {
            addCriterion("event_end_time is null");
            return (Criteria) this;
        }

        public Criteria andEventEndTimeIsNotNull() {
            addCriterion("event_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEventEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("event_end_time =", value, "eventEndTime");
            return (Criteria) this;
        }

        public Criteria andEventEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("event_end_time <>", value, "eventEndTime");
            return (Criteria) this;
        }

        public Criteria andEventEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("event_end_time >", value, "eventEndTime");
            return (Criteria) this;
        }

        public Criteria andEventEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("event_end_time >=", value, "eventEndTime");
            return (Criteria) this;
        }

        public Criteria andEventEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("event_end_time <", value, "eventEndTime");
            return (Criteria) this;
        }

        public Criteria andEventEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("event_end_time <=", value, "eventEndTime");
            return (Criteria) this;
        }

        public Criteria andEventEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("event_end_time in", values, "eventEndTime");
            return (Criteria) this;
        }

        public Criteria andEventEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("event_end_time not in", values, "eventEndTime");
            return (Criteria) this;
        }

        public Criteria andEventEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("event_end_time between", value1, value2, "eventEndTime");
            return (Criteria) this;
        }

        public Criteria andEventEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("event_end_time not between", value1, value2, "eventEndTime");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCouponClickUrlIsNull() {
            addCriterion("coupon_click_url is null");
            return (Criteria) this;
        }

        public Criteria andCouponClickUrlIsNotNull() {
            addCriterion("coupon_click_url is not null");
            return (Criteria) this;
        }

        public Criteria andCouponClickUrlEqualTo(String value) {
            addCriterion("coupon_click_url =", value, "couponClickUrl");
            return (Criteria) this;
        }

        public Criteria andCouponClickUrlNotEqualTo(String value) {
            addCriterion("coupon_click_url <>", value, "couponClickUrl");
            return (Criteria) this;
        }

        public Criteria andCouponClickUrlGreaterThan(String value) {
            addCriterion("coupon_click_url >", value, "couponClickUrl");
            return (Criteria) this;
        }

        public Criteria andCouponClickUrlGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_click_url >=", value, "couponClickUrl");
            return (Criteria) this;
        }

        public Criteria andCouponClickUrlLessThan(String value) {
            addCriterion("coupon_click_url <", value, "couponClickUrl");
            return (Criteria) this;
        }

        public Criteria andCouponClickUrlLessThanOrEqualTo(String value) {
            addCriterion("coupon_click_url <=", value, "couponClickUrl");
            return (Criteria) this;
        }

        public Criteria andCouponClickUrlLike(String value) {
            addCriterion("coupon_click_url like", value, "couponClickUrl");
            return (Criteria) this;
        }

        public Criteria andCouponClickUrlNotLike(String value) {
            addCriterion("coupon_click_url not like", value, "couponClickUrl");
            return (Criteria) this;
        }

        public Criteria andCouponClickUrlIn(List<String> values) {
            addCriterion("coupon_click_url in", values, "couponClickUrl");
            return (Criteria) this;
        }

        public Criteria andCouponClickUrlNotIn(List<String> values) {
            addCriterion("coupon_click_url not in", values, "couponClickUrl");
            return (Criteria) this;
        }

        public Criteria andCouponClickUrlBetween(String value1, String value2) {
            addCriterion("coupon_click_url between", value1, value2, "couponClickUrl");
            return (Criteria) this;
        }

        public Criteria andCouponClickUrlNotBetween(String value1, String value2) {
            addCriterion("coupon_click_url not between", value1, value2, "couponClickUrl");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeIsNull() {
            addCriterion("coupon_end_time is null");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeIsNotNull() {
            addCriterion("coupon_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("coupon_end_time =", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("coupon_end_time <>", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("coupon_end_time >", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("coupon_end_time >=", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("coupon_end_time <", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("coupon_end_time <=", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("coupon_end_time in", values, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("coupon_end_time not in", values, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("coupon_end_time between", value1, value2, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("coupon_end_time not between", value1, value2, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponInfoIsNull() {
            addCriterion("coupon_info is null");
            return (Criteria) this;
        }

        public Criteria andCouponInfoIsNotNull() {
            addCriterion("coupon_info is not null");
            return (Criteria) this;
        }

        public Criteria andCouponInfoEqualTo(String value) {
            addCriterion("coupon_info =", value, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoNotEqualTo(String value) {
            addCriterion("coupon_info <>", value, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoGreaterThan(String value) {
            addCriterion("coupon_info >", value, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_info >=", value, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoLessThan(String value) {
            addCriterion("coupon_info <", value, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoLessThanOrEqualTo(String value) {
            addCriterion("coupon_info <=", value, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoIn(List<String> values) {
            addCriterion("coupon_info in", values, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoNotIn(List<String> values) {
            addCriterion("coupon_info not in", values, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoBetween(String value1, String value2) {
            addCriterion("coupon_info between", value1, value2, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoNotBetween(String value1, String value2) {
            addCriterion("coupon_info not between", value1, value2, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeIsNull() {
            addCriterion("coupon_start_time is null");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeIsNotNull() {
            addCriterion("coupon_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeEqualTo(Date value) {
            addCriterionForJDBCDate("coupon_start_time =", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("coupon_start_time <>", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("coupon_start_time >", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("coupon_start_time >=", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeLessThan(Date value) {
            addCriterionForJDBCDate("coupon_start_time <", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("coupon_start_time <=", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeIn(List<Date> values) {
            addCriterionForJDBCDate("coupon_start_time in", values, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("coupon_start_time not in", values, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("coupon_start_time between", value1, value2, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("coupon_start_time not between", value1, value2, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponTotalCountIsNull() {
            addCriterion("coupon_total_count is null");
            return (Criteria) this;
        }

        public Criteria andCouponTotalCountIsNotNull() {
            addCriterion("coupon_total_count is not null");
            return (Criteria) this;
        }

        public Criteria andCouponTotalCountEqualTo(Integer value) {
            addCriterion("coupon_total_count =", value, "couponTotalCount");
            return (Criteria) this;
        }

        public Criteria andCouponTotalCountNotEqualTo(Integer value) {
            addCriterion("coupon_total_count <>", value, "couponTotalCount");
            return (Criteria) this;
        }

        public Criteria andCouponTotalCountGreaterThan(Integer value) {
            addCriterion("coupon_total_count >", value, "couponTotalCount");
            return (Criteria) this;
        }

        public Criteria andCouponTotalCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_total_count >=", value, "couponTotalCount");
            return (Criteria) this;
        }

        public Criteria andCouponTotalCountLessThan(Integer value) {
            addCriterion("coupon_total_count <", value, "couponTotalCount");
            return (Criteria) this;
        }

        public Criteria andCouponTotalCountLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_total_count <=", value, "couponTotalCount");
            return (Criteria) this;
        }

        public Criteria andCouponTotalCountIn(List<Integer> values) {
            addCriterion("coupon_total_count in", values, "couponTotalCount");
            return (Criteria) this;
        }

        public Criteria andCouponTotalCountNotIn(List<Integer> values) {
            addCriterion("coupon_total_count not in", values, "couponTotalCount");
            return (Criteria) this;
        }

        public Criteria andCouponTotalCountBetween(Integer value1, Integer value2) {
            addCriterion("coupon_total_count between", value1, value2, "couponTotalCount");
            return (Criteria) this;
        }

        public Criteria andCouponTotalCountNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_total_count not between", value1, value2, "couponTotalCount");
            return (Criteria) this;
        }

        public Criteria andCouponRemainCountIsNull() {
            addCriterion("coupon_remain_count is null");
            return (Criteria) this;
        }

        public Criteria andCouponRemainCountIsNotNull() {
            addCriterion("coupon_remain_count is not null");
            return (Criteria) this;
        }

        public Criteria andCouponRemainCountEqualTo(Integer value) {
            addCriterion("coupon_remain_count =", value, "couponRemainCount");
            return (Criteria) this;
        }

        public Criteria andCouponRemainCountNotEqualTo(Integer value) {
            addCriterion("coupon_remain_count <>", value, "couponRemainCount");
            return (Criteria) this;
        }

        public Criteria andCouponRemainCountGreaterThan(Integer value) {
            addCriterion("coupon_remain_count >", value, "couponRemainCount");
            return (Criteria) this;
        }

        public Criteria andCouponRemainCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_remain_count >=", value, "couponRemainCount");
            return (Criteria) this;
        }

        public Criteria andCouponRemainCountLessThan(Integer value) {
            addCriterion("coupon_remain_count <", value, "couponRemainCount");
            return (Criteria) this;
        }

        public Criteria andCouponRemainCountLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_remain_count <=", value, "couponRemainCount");
            return (Criteria) this;
        }

        public Criteria andCouponRemainCountIn(List<Integer> values) {
            addCriterion("coupon_remain_count in", values, "couponRemainCount");
            return (Criteria) this;
        }

        public Criteria andCouponRemainCountNotIn(List<Integer> values) {
            addCriterion("coupon_remain_count not in", values, "couponRemainCount");
            return (Criteria) this;
        }

        public Criteria andCouponRemainCountBetween(Integer value1, Integer value2) {
            addCriterion("coupon_remain_count between", value1, value2, "couponRemainCount");
            return (Criteria) this;
        }

        public Criteria andCouponRemainCountNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_remain_count not between", value1, value2, "couponRemainCount");
            return (Criteria) this;
        }

        public Criteria andTpwdIsNull() {
            addCriterion("tpwd is null");
            return (Criteria) this;
        }

        public Criteria andTpwdIsNotNull() {
            addCriterion("tpwd is not null");
            return (Criteria) this;
        }

        public Criteria andTpwdEqualTo(String value) {
            addCriterion("tpwd =", value, "tpwd");
            return (Criteria) this;
        }

        public Criteria andTpwdNotEqualTo(String value) {
            addCriterion("tpwd <>", value, "tpwd");
            return (Criteria) this;
        }

        public Criteria andTpwdGreaterThan(String value) {
            addCriterion("tpwd >", value, "tpwd");
            return (Criteria) this;
        }

        public Criteria andTpwdGreaterThanOrEqualTo(String value) {
            addCriterion("tpwd >=", value, "tpwd");
            return (Criteria) this;
        }

        public Criteria andTpwdLessThan(String value) {
            addCriterion("tpwd <", value, "tpwd");
            return (Criteria) this;
        }

        public Criteria andTpwdLessThanOrEqualTo(String value) {
            addCriterion("tpwd <=", value, "tpwd");
            return (Criteria) this;
        }

        public Criteria andTpwdLike(String value) {
            addCriterion("tpwd like", value, "tpwd");
            return (Criteria) this;
        }

        public Criteria andTpwdNotLike(String value) {
            addCriterion("tpwd not like", value, "tpwd");
            return (Criteria) this;
        }

        public Criteria andTpwdIn(List<String> values) {
            addCriterion("tpwd in", values, "tpwd");
            return (Criteria) this;
        }

        public Criteria andTpwdNotIn(List<String> values) {
            addCriterion("tpwd not in", values, "tpwd");
            return (Criteria) this;
        }

        public Criteria andTpwdBetween(String value1, String value2) {
            addCriterion("tpwd between", value1, value2, "tpwd");
            return (Criteria) this;
        }

        public Criteria andTpwdNotBetween(String value1, String value2) {
            addCriterion("tpwd not between", value1, value2, "tpwd");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailIsNull() {
            addCriterion("goods_detail is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailIsNotNull() {
            addCriterion("goods_detail is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailEqualTo(String value) {
            addCriterion("goods_detail =", value, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailNotEqualTo(String value) {
            addCriterion("goods_detail <>", value, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailGreaterThan(String value) {
            addCriterion("goods_detail >", value, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailGreaterThanOrEqualTo(String value) {
            addCriterion("goods_detail >=", value, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailLessThan(String value) {
            addCriterion("goods_detail <", value, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailLessThanOrEqualTo(String value) {
            addCriterion("goods_detail <=", value, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailLike(String value) {
            addCriterion("goods_detail like", value, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailNotLike(String value) {
            addCriterion("goods_detail not like", value, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailIn(List<String> values) {
            addCriterion("goods_detail in", values, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailNotIn(List<String> values) {
            addCriterion("goods_detail not in", values, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailBetween(String value1, String value2) {
            addCriterion("goods_detail between", value1, value2, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailNotBetween(String value1, String value2) {
            addCriterion("goods_detail not between", value1, value2, "goodsDetail");
            return (Criteria) this;
        }
        //PriceAfterCoupon
        public Criteria andPriceAfterCouponIsNull() {
            addCriterion("price_after_coupon is null");
            return (Criteria) this;
        }

        public Criteria andPriceAfterCouponIsNotNull() {
            addCriterion("price_after_coupon is not null");
            return (Criteria) this;
        }

        public Criteria andPriceAfterCouponEqualTo(Double value) {
            addCriterion("price_after_coupon =", value, "priceAfterCoupon");
            return (Criteria) this;
        }

        public Criteria andPriceAfterCouponNotEqualTo(Double value) {
            addCriterion("price_after_coupon <>", value, "priceAfterCoupon");
            return (Criteria) this;
        }

        public Criteria andPriceAfterCouponGreaterThan(Double value) {
            addCriterion("price_after_coupon >", value, "priceAfterCoupon");
            return (Criteria) this;
        }

        public Criteria andPriceAfterCouponGreaterThanOrEqualTo(Double value) {
            addCriterion("price_after_coupon >=", value, "priceAfterCoupon");
            return (Criteria) this;
        }

        public Criteria andPriceAfterCouponLessThan(Double value) {
            addCriterion("price_after_coupon <", value, "priceAfterCoupon");
            return (Criteria) this;
        }

        public Criteria andPriceAfterCouponLessThanOrEqualTo(Double value) {
            addCriterion("price_after_coupon <=", value, "priceAfterCoupon");
            return (Criteria) this;
        }

        public Criteria andPriceAfterCouponIn(List<Double> values) {
            addCriterion("price_after_coupon in", values, "priceAfterCoupon");
            return (Criteria) this;
        }

        public Criteria andPriceAfterCouponNotIn(List<Double> values) {
            addCriterion("price_after_coupon not in", values, "priceAfterCoupon");
            return (Criteria) this;
        }

        public Criteria andPriceAfterCouponBetween(Double value1, Double value2) {
            addCriterion("price_after_coupon between", value1, value2, "priceAfterCoupon");
            return (Criteria) this;
        }

        public Criteria andPriceAfterCouponNotBetween(Double value1, Double value2) {
            addCriterion("price_after_coupon not between", value1, value2, "priceAfterCoupon");
            return (Criteria) this;
        }

        public Criteria andSourceIdIsNull() {
            addCriterion("source_id is null");
            return (Criteria) this;
        }

        public Criteria andSourceIdIsNotNull() {
            addCriterion("source_id is not null");
            return (Criteria) this;
        }

        public Criteria andSourceIdEqualTo(String value) {
            addCriterion("source_id =", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotEqualTo(String value) {
            addCriterion("source_id <>", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdGreaterThan(String value) {
            addCriterion("source_id >", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdGreaterThanOrEqualTo(String value) {
            addCriterion("source_id >=", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdLessThan(String value) {
            addCriterion("source_id <", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdLessThanOrEqualTo(String value) {
            addCriterion("source_id <=", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdLike(String value) {
            addCriterion("source_id like", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotLike(String value) {
            addCriterion("source_id not like", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdIn(List<String> values) {
            addCriterion("source_id in", values, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotIn(List<String> values) {
            addCriterion("source_id not in", values, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdBetween(String value1, String value2) {
            addCriterion("source_id between", value1, value2, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotBetween(String value1, String value2) {
            addCriterion("source_id not between", value1, value2, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceNameIsNull() {
            addCriterion("source_name is null");
            return (Criteria) this;
        }

        public Criteria andSourceNameIsNotNull() {
            addCriterion("source_name is not null");
            return (Criteria) this;
        }

        public Criteria andSourceNameEqualTo(String value) {
            addCriterion("source_name =", value, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameNotEqualTo(String value) {
            addCriterion("source_name <>", value, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameGreaterThan(String value) {
            addCriterion("source_name >", value, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameGreaterThanOrEqualTo(String value) {
            addCriterion("source_name >=", value, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameLessThan(String value) {
            addCriterion("source_name <", value, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameLessThanOrEqualTo(String value) {
            addCriterion("source_name <=", value, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameLike(String value) {
            addCriterion("source_name like", value, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameNotLike(String value) {
            addCriterion("source_name not like", value, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameIn(List<String> values) {
            addCriterion("source_name in", values, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameNotIn(List<String> values) {
            addCriterion("source_name not in", values, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameBetween(String value1, String value2) {
            addCriterion("source_name between", value1, value2, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameNotBetween(String value1, String value2) {
            addCriterion("source_name not between", value1, value2, "sourceName");
            return (Criteria) this;
        }
        public Criteria andCouponValueIsNull() {
            addCriterion("coupon_value is null");
            return (Criteria) this;
        }

        public Criteria andCouponValueIsNotNull() {
            addCriterion("coupon_value is not null");
            return (Criteria) this;
        }

        public Criteria andCouponValueEqualTo(Double value) {
            addCriterion("coupon_value =", value, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueNotEqualTo(Double value) {
            addCriterion("coupon_value <>", value, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueGreaterThan(Double value) {
            addCriterion("coupon_value >", value, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueGreaterThanOrEqualTo(Double value) {
            addCriterion("coupon_value >=", value, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueLessThan(Double value) {
            addCriterion("coupon_value <", value, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueLessThanOrEqualTo(Double value) {
            addCriterion("coupon_value <=", value, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueIn(List<Double> values) {
            addCriterion("coupon_value in", values, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueNotIn(List<Double> values) {
            addCriterion("coupon_value not in", values, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueBetween(Double value1, Double value2) {
            addCriterion("coupon_value between", value1, value2, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueNotBetween(Double value1, Double value2) {
            addCriterion("coupon_value not between", value1, value2, "couponValue");
            return (Criteria) this;
        }
        public Criteria andFinalDiscoutRateIsNull() {
            addCriterion("final_discout_rate is null");
            return (Criteria) this;
        }

        public Criteria andFinalDiscoutRateIsNotNull() {
            addCriterion("final_discout_rate is not null");
            return (Criteria) this;
        }

        public Criteria andFinalDiscoutRateEqualTo(Double value) {
            addCriterion("final_discout_rate =", value, "finalDiscoutRate");
            return (Criteria) this;
        }

        public Criteria andFinalDiscoutRateNotEqualTo(Double value) {
            addCriterion("final_discout_rate <>", value, "finalDiscoutRate");
            return (Criteria) this;
        }

        public Criteria andFinalDiscoutRateGreaterThan(Double value) {
            addCriterion("final_discout_rate >", value, "finalDiscoutRate");
            return (Criteria) this;
        }

        public Criteria andFinalDiscoutRateGreaterThanOrEqualTo(Double value) {
            addCriterion("final_discout_rate >=", value, "finalDiscoutRate");
            return (Criteria) this;
        }

        public Criteria andFinalDiscoutRateLessThan(Double value) {
            addCriterion("final_discout_rate <", value, "finalDiscoutRate");
            return (Criteria) this;
        }

        public Criteria andFinalDiscoutRateLessThanOrEqualTo(Double value) {
            addCriterion("final_discout_rate <=", value, "finalDiscoutRate");
            return (Criteria) this;
        }

        public Criteria andFinalDiscoutRateIn(List<Double> values) {
            addCriterion("final_discout_rate in", values, "finalDiscoutRate");
            return (Criteria) this;
        }

        public Criteria andFinalDiscoutRateNotIn(List<Double> values) {
            addCriterion("final_discout_rate not in", values, "finalDiscoutRate");
            return (Criteria) this;
        }

        public Criteria andFinalDiscoutRateBetween(Double value1, Double value2) {
            addCriterion("final_discout_rate between", value1, value2, "finalDiscoutRate");
            return (Criteria) this;
        }

        public Criteria andFinalDiscoutRateNotBetween(Double value1, Double value2) {
            addCriterion("final_discout_rate not between", value1, value2, "finalDiscoutRate");
            return (Criteria) this;
        }
        public Criteria andInSelectionsIsNull() {
            addCriterion("in_selections is null");
            return (Criteria) this;
        }

        public Criteria andInSelectionsIsNotNull() {
            addCriterion("in_selections is not null");
            return (Criteria) this;
        }

        public Criteria andInSelectionsEqualTo(String value) {
            addCriterion("in_selections =", value, "inSelections");
            return (Criteria) this;
        }

        public Criteria andInSelectionsNotEqualTo(String value) {
            addCriterion("in_selections <>", value, "inSelections");
            return (Criteria) this;
        }

        public Criteria andInSelectionsGreaterThan(String value) {
            addCriterion("in_selections >", value, "inSelections");
            return (Criteria) this;
        }

        public Criteria andInSelectionsGreaterThanOrEqualTo(String value) {
            addCriterion("in_selections >=", value, "inSelections");
            return (Criteria) this;
        }

        public Criteria andInSelectionsLessThan(String value) {
            addCriterion("in_selections <", value, "inSelections");
            return (Criteria) this;
        }

        public Criteria andInSelectionsLessThanOrEqualTo(String value) {
            addCriterion("in_selections <=", value, "inSelections");
            return (Criteria) this;
        }

        public Criteria andInSelectionsLike(String value) {
            addCriterion("in_selections like", value, "inSelections");
            return (Criteria) this;
        }

        public Criteria andInSelectionsNotLike(String value) {
            addCriterion("in_selections not like", value, "inSelections");
            return (Criteria) this;
        }

        public Criteria andInSelectionsIn(List<String> values) {
            addCriterion("in_selections in", values, "inSelections");
            return (Criteria) this;
        }

        public Criteria andInSelectionsNotIn(List<String> values) {
            addCriterion("in_selections not in", values, "inSelections");
            return (Criteria) this;
        }

        public Criteria andInSelectionsBetween(String value1, String value2) {
            addCriterion("in_selections between", value1, value2, "inSelections");
            return (Criteria) this;
        }

        public Criteria andInSelectionsNotBetween(String value1, String value2) {
            addCriterion("in_selections not between", value1, value2, "inSelections");
            return (Criteria) this;
        }

        public Criteria andIsSelectedIsNull() {
            addCriterion("is_selected is null");
            return (Criteria) this;
        }

        public Criteria andIsSelectedIsNotNull() {
            addCriterion("is_selected is not null");
            return (Criteria) this;
        }

        public Criteria andIsSelectedEqualTo(String value) {
            addCriterion("is_selected =", value, "isSelected");
            return (Criteria) this;
        }

        public Criteria andIsSelectedNotEqualTo(String value) {
            addCriterion("is_selected <>", value, "isSelected");
            return (Criteria) this;
        }

        public Criteria andIsSelectedGreaterThan(String value) {
            addCriterion("is_selected >", value, "isSelected");
            return (Criteria) this;
        }

        public Criteria andIsSelectedGreaterThanOrEqualTo(String value) {
            addCriterion("is_selected >=", value, "isSelected");
            return (Criteria) this;
        }

        public Criteria andIsSelectedLessThan(String value) {
            addCriterion("is_selected <", value, "isSelected");
            return (Criteria) this;
        }

        public Criteria andIsSelectedLessThanOrEqualTo(String value) {
            addCriterion("is_selected <=", value, "isSelected");
            return (Criteria) this;
        }

        public Criteria andIsSelectedLike(String value) {
            addCriterion("is_selected like", value, "isSelected");
            return (Criteria) this;
        }

        public Criteria andIsSelectedNotLike(String value) {
            addCriterion("is_selected not like", value, "isSelected");
            return (Criteria) this;
        }

        public Criteria andIsSelectedIn(List<String> values) {
            addCriterion("is_selected in", values, "isSelected");
            return (Criteria) this;
        }

        public Criteria andIsSelectedNotIn(List<String> values) {
            addCriterion("is_selected not in", values, "isSelected");
            return (Criteria) this;
        }

        public Criteria andIsSelectedBetween(String value1, String value2) {
            addCriterion("is_selected between", value1, value2, "isSelected");
            return (Criteria) this;
        }

        public Criteria andIsSelectedNotBetween(String value1, String value2) {
            addCriterion("is_selected not between", value1, value2, "isSelected");
            return (Criteria) this;
        }
        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterionForJDBCDate("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
        public Criteria andField1IsNull() {
            addCriterion("field1 is null");
            return (Criteria) this;
        }

        public Criteria andField1IsNotNull() {
            addCriterion("field1 is not null");
            return (Criteria) this;
        }

        public Criteria andField1EqualTo(String value) {
            addCriterion("field1 =", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1NotEqualTo(String value) {
            addCriterion("field1 <>", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1GreaterThan(String value) {
            addCriterion("field1 >", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1GreaterThanOrEqualTo(String value) {
            addCriterion("field1 >=", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1LessThan(String value) {
            addCriterion("field1 <", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1LessThanOrEqualTo(String value) {
            addCriterion("field1 <=", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1Like(String value) {
            addCriterion("field1 like", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1NotLike(String value) {
            addCriterion("field1 not like", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1In(List<String> values) {
            addCriterion("field1 in", values, "field1");
            return (Criteria) this;
        }

        public Criteria andField1NotIn(List<String> values) {
            addCriterion("field1 not in", values, "field1");
            return (Criteria) this;
        }

        public Criteria andField1Between(String value1, String value2) {
            addCriterion("field1 between", value1, value2, "field1");
            return (Criteria) this;
        }

        public Criteria andField1NotBetween(String value1, String value2) {
            addCriterion("field1 not between", value1, value2, "field1");
            return (Criteria) this;
        }

        public Criteria andField2IsNull() {
            addCriterion("field2 is null");
            return (Criteria) this;
        }

        public Criteria andField2IsNotNull() {
            addCriterion("field2 is not null");
            return (Criteria) this;
        }

        public Criteria andField2EqualTo(String value) {
            addCriterion("field2 =", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2NotEqualTo(String value) {
            addCriterion("field2 <>", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2GreaterThan(String value) {
            addCriterion("field2 >", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2GreaterThanOrEqualTo(String value) {
            addCriterion("field2 >=", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2LessThan(String value) {
            addCriterion("field2 <", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2LessThanOrEqualTo(String value) {
            addCriterion("field2 <=", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2Like(String value) {
            addCriterion("field2 like", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2NotLike(String value) {
            addCriterion("field2 not like", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2In(List<String> values) {
            addCriterion("field2 in", values, "field2");
            return (Criteria) this;
        }

        public Criteria andField2NotIn(List<String> values) {
            addCriterion("field2 not in", values, "field2");
            return (Criteria) this;
        }

        public Criteria andField2Between(String value1, String value2) {
            addCriterion("field2 between", value1, value2, "field2");
            return (Criteria) this;
        }

        public Criteria andField2NotBetween(String value1, String value2) {
            addCriterion("field2 not between", value1, value2, "field2");
            return (Criteria) this;
        }

        public Criteria andField3IsNull() {
            addCriterion("field3 is null");
            return (Criteria) this;
        }

        public Criteria andField3IsNotNull() {
            addCriterion("field3 is not null");
            return (Criteria) this;
        }

        public Criteria andField3EqualTo(String value) {
            addCriterion("field3 =", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3NotEqualTo(String value) {
            addCriterion("field3 <>", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3GreaterThan(String value) {
            addCriterion("field3 >", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3GreaterThanOrEqualTo(String value) {
            addCriterion("field3 >=", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3LessThan(String value) {
            addCriterion("field3 <", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3LessThanOrEqualTo(String value) {
            addCriterion("field3 <=", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3Like(String value) {
            addCriterion("field3 like", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3NotLike(String value) {
            addCriterion("field3 not like", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3In(List<String> values) {
            addCriterion("field3 in", values, "field3");
            return (Criteria) this;
        }

        public Criteria andField3NotIn(List<String> values) {
            addCriterion("field3 not in", values, "field3");
            return (Criteria) this;
        }

        public Criteria andField3Between(String value1, String value2) {
            addCriterion("field3 between", value1, value2, "field3");
            return (Criteria) this;
        }

        public Criteria andField3NotBetween(String value1, String value2) {
            addCriterion("field3 not between", value1, value2, "field3");
            return (Criteria) this;
        }

        public Criteria andField4IsNull() {
            addCriterion("field4 is null");
            return (Criteria) this;
        }

        public Criteria andField4IsNotNull() {
            addCriterion("field4 is not null");
            return (Criteria) this;
        }

        public Criteria andField4EqualTo(String value) {
            addCriterion("field4 =", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4NotEqualTo(String value) {
            addCriterion("field4 <>", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4GreaterThan(String value) {
            addCriterion("field4 >", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4GreaterThanOrEqualTo(String value) {
            addCriterion("field4 >=", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4LessThan(String value) {
            addCriterion("field4 <", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4LessThanOrEqualTo(String value) {
            addCriterion("field4 <=", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4Like(String value) {
            addCriterion("field4 like", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4NotLike(String value) {
            addCriterion("field4 not like", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4In(List<String> values) {
            addCriterion("field4 in", values, "field4");
            return (Criteria) this;
        }

        public Criteria andField4NotIn(List<String> values) {
            addCriterion("field4 not in", values, "field4");
            return (Criteria) this;
        }

        public Criteria andField4Between(String value1, String value2) {
            addCriterion("field4 between", value1, value2, "field4");
            return (Criteria) this;
        }

        public Criteria andField4NotBetween(String value1, String value2) {
            addCriterion("field4 not between", value1, value2, "field4");
            return (Criteria) this;
        }

        public Criteria andField5IsNull() {
            addCriterion("field5 is null");
            return (Criteria) this;
        }

        public Criteria andField5IsNotNull() {
            addCriterion("field5 is not null");
            return (Criteria) this;
        }

        public Criteria andField5EqualTo(String value) {
            addCriterion("field5 =", value, "field5");
            return (Criteria) this;
        }

        public Criteria andField5NotEqualTo(String value) {
            addCriterion("field5 <>", value, "field5");
            return (Criteria) this;
        }

        public Criteria andField5GreaterThan(String value) {
            addCriterion("field5 >", value, "field5");
            return (Criteria) this;
        }

        public Criteria andField5GreaterThanOrEqualTo(String value) {
            addCriterion("field5 >=", value, "field5");
            return (Criteria) this;
        }

        public Criteria andField5LessThan(String value) {
            addCriterion("field5 <", value, "field5");
            return (Criteria) this;
        }

        public Criteria andField5LessThanOrEqualTo(String value) {
            addCriterion("field5 <=", value, "field5");
            return (Criteria) this;
        }

        public Criteria andField5Like(String value) {
            addCriterion("field5 like", value, "field5");
            return (Criteria) this;
        }

        public Criteria andField5NotLike(String value) {
            addCriterion("field5 not like", value, "field5");
            return (Criteria) this;
        }

        public Criteria andField5In(List<String> values) {
            addCriterion("field5 in", values, "field5");
            return (Criteria) this;
        }

        public Criteria andField5NotIn(List<String> values) {
            addCriterion("field5 not in", values, "field5");
            return (Criteria) this;
        }

        public Criteria andField5Between(String value1, String value2) {
            addCriterion("field5 between", value1, value2, "field5");
            return (Criteria) this;
        }

        public Criteria andField5NotBetween(String value1, String value2) {
            addCriterion("field5 not between", value1, value2, "field5");
            return (Criteria) this;
        }
        //////////////////////////////////////////////////////
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}