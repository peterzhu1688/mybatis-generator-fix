package com.ky.mms.dal.mysql.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * 入库明细表
 *
 * 表名: MMS_INCOME_DETAIL
 *
 */
public class IncomeDetailDo {
    /**
     * MMS_INCOME_DETAIL.ID
     */
    private Long id;

    /**
     * MMS_INCOME_DETAIL.ARTICLE_ID (物品ID)
     */
    private String articleId;

    /**
     * MMS_INCOME_DETAIL.EVENT_ID (入库事件ID)
     */
    private String eventId;

    /**
     * MMS_INCOME_DETAIL.MAT_ID (物资编码)
     */
    private String matId;

    /**
     * MMS_INCOME_DETAIL.WHS_ID (仓库编码)
     */
    private String whsId;

    /**
     * MMS_INCOME_DETAIL.UNIT_FEE (单价)
     */
    private BigDecimal unitFee;

    /**
     * MMS_INCOME_DETAIL.CREATE_TIME (创建时间)
     */
    private Date createTime;

    /**
     * MMS_INCOME_DETAIL.UPDATE_TIME (更新时间)
     */
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getMatId() {
        return matId;
    }

    public void setMatId(String matId) {
        this.matId = matId;
    }

    public String getWhsId() {
        return whsId;
    }

    public void setWhsId(String whsId) {
        this.whsId = whsId;
    }

    public BigDecimal getUnitFee() {
        return unitFee;
    }

    public void setUnitFee(BigDecimal unitFee) {
        this.unitFee = unitFee;
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
}