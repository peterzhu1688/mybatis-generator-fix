package com.ky.mms.dal.mysql.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * 物资调拨事件表
 *
 * 表名: MMS_TRANSFER_EVENT
 *
 */
public class TransferEventDo {
    /**
     * MMS_TRANSFER_EVENT.ID
     */
    private Long id;

    /**
     * MMS_TRANSFER_EVENT.EVENT_ID (调仓事件ID)
     */
    private String eventId;

    /**
     * MMS_TRANSFER_EVENT.MAT_ID (物资编码)
     */
    private String matId;

    /**
     * MMS_TRANSFER_EVENT.SRC_WHS_ID (源仓库编号)
     */
    private String srcWhsId;

    /**
     * MMS_TRANSFER_EVENT.DST_WHS_ID (目标仓库编号)
     */
    private String dstWhsId;

    /**
     * MMS_TRANSFER_EVENT.MAT_COUNT (调拨数量)
     */
    private Integer matCount;

    /**
     * MMS_TRANSFER_EVENT.TOTAL_FEE (调拨物资总额)
     */
    private BigDecimal totalFee;

    /**
     * MMS_TRANSFER_EVENT.OPERATOR (经办人)
     */
    private String operator;

    /**
     * MMS_TRANSFER_EVENT.REMARK (备注)
     */
    private String remark;

    /**
     * MMS_TRANSFER_EVENT.DC_STATUS (物资调拨状态：0-待调仓 1-调仓中 2-调仓完成)
     */
    private Byte dcStatus;

    /**
     * MMS_TRANSFER_EVENT.CREATE_TIME (创建时间)
     */
    private Date createTime;

    /**
     * MMS_TRANSFER_EVENT.UPDATE_TIME (更新时间)
     */
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Integer getMatCount() {
        return matCount;
    }

    public void setMatCount(Integer matCount) {
        this.matCount = matCount;
    }

    public BigDecimal getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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