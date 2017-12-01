package com.cloud.spring.study.mysql_service.entity;

import java.util.Date;

public class GoodsOriginalInfo {
	@Override
	public String toString() {
		return "GoodsOriginalInfo [id=" + id + ", numIid=" + numIid + ", title=" + title + ", pictUrl=" + pictUrl
				+ ", smallImages=" + smallImages + ", reservePrice=" + reservePrice + ", zkFinalPrice=" + zkFinalPrice
				+ ", userType=" + userType + ", provcity=" + provcity + ", itemUrl=" + itemUrl + ", clickUrl="
				+ clickUrl + ", nick=" + nick + ", sellerId=" + sellerId + ", volume=" + volume + ", catLeafName="
				+ catLeafName + ", catName=" + catName + ", tkRate=" + tkRate + ", zkFinalPriceWap=" + zkFinalPriceWap
				+ ", eventStartTime=" + eventStartTime + ", eventEndTime=" + eventEndTime + ", type=" + type
				+ ", status=" + status + ", category=" + category + ", couponClickUrl=" + couponClickUrl
				+ ", couponEndTime=" + couponEndTime + ", couponInfo=" + couponInfo + ", couponStartTime="
				+ couponStartTime + ", couponTotalCount=" + couponTotalCount + ", couponRemainCount="
				+ couponRemainCount + ", tpwd=" + tpwd + ", goodsDetail=" + goodsDetail + ", priceAfterCoupon="
				+ priceAfterCoupon + ", sourceId=" + sourceId + ", sourceName=" + sourceName + ", couponValue="
				+ couponValue + ", finalDiscoutRate=" + finalDiscoutRate + ", inSelections=" + inSelections
				+ ", isSelected=" + isSelected + ", createTime=" + createTime + ", updateTime=" + updateTime
				+ ", field1=" + field1 + ", field2=" + field2 + ", field3=" + field3 + ", field4=" + field4
				+ ", field5=" + field5 + ", getId()=" + getId() + ", getNumIid()=" + getNumIid() + ", getTitle()="
				+ getTitle() + ", getPictUrl()=" + getPictUrl() + ", getSmallImages()=" + getSmallImages()
				+ ", getReservePrice()=" + getReservePrice() + ", getZkFinalPrice()=" + getZkFinalPrice()
				+ ", getUserType()=" + getUserType() + ", getProvcity()=" + getProvcity() + ", getItemUrl()="
				+ getItemUrl() + ", getClickUrl()=" + getClickUrl() + ", getNick()=" + getNick() + ", getSellerId()="
				+ getSellerId() + ", getVolume()=" + getVolume() + ", getCatLeafName()=" + getCatLeafName()
				+ ", getCatName()=" + getCatName() + ", getTkRate()=" + getTkRate() + ", getZkFinalPriceWap()="
				+ getZkFinalPriceWap() + ", getEventStartTime()=" + getEventStartTime() + ", getEventEndTime()="
				+ getEventEndTime() + ", getType()=" + getType() + ", getStatus()=" + getStatus() + ", getCategory()="
				+ getCategory() + ", getCouponClickUrl()=" + getCouponClickUrl() + ", getCouponEndTime()="
				+ getCouponEndTime() + ", getCouponInfo()=" + getCouponInfo() + ", getCouponStartTime()="
				+ getCouponStartTime() + ", getCouponTotalCount()=" + getCouponTotalCount()
				+ ", getCouponRemainCount()=" + getCouponRemainCount() + ", getTpwd()=" + getTpwd()
				+ ", getGoodsDetail()=" + getGoodsDetail() + ", getPriceAfterCoupon()=" + getPriceAfterCoupon()
				+ ", getSourceId()=" + getSourceId() + ", getSourceName()=" + getSourceName() + ", getCouponValue()="
				+ getCouponValue() + ", getFinalDiscoutRate()=" + getFinalDiscoutRate() + ", getInSelections()="
				+ getInSelections() + ", getIsSelected()=" + getIsSelected() + ", getCreateTime()=" + getCreateTime()
				+ ", getUpdateTime()=" + getUpdateTime() + ", getField1()=" + getField1() + ", getField2()="
				+ getField2() + ", getField3()=" + getField3() + ", getField4()=" + getField4() + ", getField5()="
				+ getField5() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	private String id;
	private String numIid;

    private String title;

    private String pictUrl;

    private String smallImages;

    private Double reservePrice;

    private Double zkFinalPrice;

    private String userType;

    private String provcity;

    private String itemUrl;

    private String clickUrl;

    private String nick;

    private Integer sellerId;

    private Integer volume;

    private String catLeafName;

    private String catName;

    private Double tkRate;

    private Double zkFinalPriceWap;

    private Date eventStartTime;

    private Date eventEndTime;

    private String type;

    private String status;

    private String category;

    private String couponClickUrl;

    private Date couponEndTime;

    private String couponInfo;

    private Date couponStartTime;

    private Integer couponTotalCount;

    private Integer couponRemainCount;

    private String tpwd;

    private String goodsDetail;

    private Double priceAfterCoupon;

    private String sourceId;

    private String sourceName;
    //卷面值
    private Double  couponValue;
    //商品券后折扣率
    private Double  finalDiscoutRate;
    //是否来自选品库
   private String  inSelections;
   //商品被选择
   private String  isSelected;
   private  Date createTime;
   private Date updateTime;

    private String field1;

    private String field2;

    private String field3;

    private String field4;

    private String field5;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getNumIid() {
        return numIid;
    }

    public void setNumIid(String numIid) {
        this.numIid = numIid == null ? null : numIid.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getPictUrl() {
        return pictUrl;
    }

    public void setPictUrl(String pictUrl) {
        this.pictUrl = pictUrl == null ? null : pictUrl.trim();
    }

    public String getSmallImages() {
        return smallImages;
    }

    public void setSmallImages(String smallImages) {
        this.smallImages = smallImages == null ? null : smallImages.trim();
    }

    public Double getReservePrice() {
        return reservePrice;
    }

    public void setReservePrice(Double reservePrice) {
        this.reservePrice = reservePrice;
    }

    public Double getZkFinalPrice() {
        return zkFinalPrice;
    }

    public void setZkFinalPrice(Double zkFinalPrice) {
        this.zkFinalPrice = zkFinalPrice;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getProvcity() {
        return provcity;
    }

    public void setProvcity(String provcity) {
        this.provcity = provcity == null ? null : provcity.trim();
    }

    public String getItemUrl() {
        return itemUrl;
    }

    public void setItemUrl(String itemUrl) {
        this.itemUrl = itemUrl == null ? null : itemUrl.trim();
    }

    public String getClickUrl() {
        return clickUrl;
    }

    public void setClickUrl(String clickUrl) {
        this.clickUrl = clickUrl == null ? null : clickUrl.trim();
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick == null ? null : nick.trim();
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public String getCatLeafName() {
        return catLeafName;
    }

    public void setCatLeafName(String catLeafName) {
        this.catLeafName = catLeafName == null ? null : catLeafName.trim();
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName == null ? null : catName.trim();
    }

    public Double getTkRate() {
        return tkRate;
    }

    public void setTkRate(Double tkRate) {
        this.tkRate = tkRate;
    }

    public Double getZkFinalPriceWap() {
        return zkFinalPriceWap;
    }

    public void setZkFinalPriceWap(Double zkFinalPriceWap) {
        this.zkFinalPriceWap = zkFinalPriceWap;
    }

    public Date getEventStartTime() {
        return eventStartTime;
    }

    public void setEventStartTime(Date eventStartTime) {
        this.eventStartTime = eventStartTime;
    }

    public Date getEventEndTime() {
        return eventEndTime;
    }

    public void setEventEndTime(Date eventEndTime) {
        this.eventEndTime = eventEndTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getCouponClickUrl() {
        return couponClickUrl;
    }

    public void setCouponClickUrl(String couponClickUrl) {
        this.couponClickUrl = couponClickUrl == null ? null : couponClickUrl.trim();
    }

    public Date getCouponEndTime() {
        return couponEndTime;
    }

    public void setCouponEndTime(Date couponEndTime) {
        this.couponEndTime = couponEndTime;
    }

    public String getCouponInfo() {
        return couponInfo;
    }

    public void setCouponInfo(String couponInfo) {
        this.couponInfo = couponInfo == null ? null : couponInfo.trim();
    }

    public Date getCouponStartTime() {
        return couponStartTime;
    }

    public void setCouponStartTime(Date couponStartTime) {
        this.couponStartTime = couponStartTime;
    }

    public Integer getCouponTotalCount() {
        return couponTotalCount;
    }

    public void setCouponTotalCount(Integer couponTotalCount) {
        this.couponTotalCount = couponTotalCount;
    }

    public Integer getCouponRemainCount() {
        return couponRemainCount;
    }

    public void setCouponRemainCount(Integer couponRemainCount) {
        this.couponRemainCount = couponRemainCount;
    }

    public String getTpwd() {
        return tpwd;
    }

    public void setTpwd(String tpwd) {
        this.tpwd = tpwd == null ? null : tpwd.trim();
    }

    public String getGoodsDetail() {
        return goodsDetail;
    }

    public void setGoodsDetail(String goodsDetail) {
        this.goodsDetail = goodsDetail == null ? null : goodsDetail.trim();
    }

    public Double getPriceAfterCoupon() {
        return priceAfterCoupon;
    }

    public void setPriceAfterCoupon(Double priceAfterCoupon) {
        this.priceAfterCoupon = priceAfterCoupon;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId == null ? null : sourceId.trim();
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName == null ? null : sourceName.trim();
    }

    public Double getCouponValue() {
        return couponValue;
    }

    public void setCouponValue(Double couponValue) {
        this.couponValue = couponValue;
    }

    public Double getFinalDiscoutRate() {
        return finalDiscoutRate;
    }

    public void setFinalDiscoutRate(Double finalDiscoutRate) {
        this.finalDiscoutRate = finalDiscoutRate;
    }

    public String getInSelections() {
        return inSelections;
    }

    public void setInSelections(String inSelections) {
        this.inSelections = inSelections == null ? null : inSelections.trim();
    }

    public String getIsSelected() {
        return isSelected;
    }

    public void setIsSelected(String isSelected) {
        this.isSelected = isSelected == null ? null : isSelected.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1 == null ? null : field1.trim();
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2 == null ? null : field2.trim();
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3 == null ? null : field3.trim();
    }

    public String getField4() {
        return field4;
    }

    public void setField4(String field4) {
        this.field4 = field4 == null ? null : field4.trim();
    }

    public String getField5() {
        return field5;
    }

    public void setField5(String field5) {
        this.field5 = field5 == null ? null : field5.trim();
    }
}