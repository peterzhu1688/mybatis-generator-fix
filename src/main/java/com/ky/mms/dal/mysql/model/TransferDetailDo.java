package com.ky.mms.dal.mysql.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * 物资调拨明细表
 *
 * 表名: MMS_TRANSFER_DETAIL
 *
 */
public class TransferDetailDo {
    /**
     * MMS_TRANSFER_DETAIL.ID
     */
    private Long id;

    /**
     * MMS_TRANSFER_DETAIL.ARTICLE_ID (物品ID)
     */
    private String articleId;

    /**
     * MMS_TRANSFER_DETAIL.EVENT_ID (物资调拨事件ID)
     */
    private String eventId;

    /**
     * MMS_TRANSFER_DETAIL.SRC_WHS_ID (源仓库编号)
     */
    private String srcWhsId;

    /**
     * MMS_TRANSFER_DETAIL.DST_WHS_ID (目标仓库编号)
     */
    private String dstWhsId;

    /**
     * MMS_TRANSFER_DETAIL.UNIT_FEE (物品单价)
     */
    private BigDecimal unitFee;

    /**
     * MMS_TRANSFER_DETAIL.DC_STATUS (物品调拨状态：0-未到仓 1-已到仓)
     */
    private Byte dcStatus;

    /**
     * MMS_TRANSFER_DETAIL.CREATE_TIME (创建时间)
     */
    private Date createTime;

    /**
     * MMS_TRANSFER_DETAIL.UPDATE_TIME (更新时间)
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

    public String getSrcWhsId() {
        return srcWhsId;
    }

    public void setSrcWhsId(String srcWhsId) {
        this.srcWhsId = srcWhsId;
    }

    public String getDstWhsId() {
        return dstWhsId;
    }

    public void setDstWhsId(String dstWhsId) {
        this.dstWhsId = dstWhsId;
    }

    public BigDecimal getUnitFee() {
        return unitFee;
    }

    public void setUnitFee(BigDecimal unitFee) {
        this.unitFee = unitFee;
    }

    public Byte getDcStatus() {
        return dcStatus;
    }

    public void setDcStatus(Byte dcStatus) {
        this.dcStatus = dcStatus;
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