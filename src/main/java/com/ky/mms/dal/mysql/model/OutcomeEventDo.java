package com.ky.mms.dal.mysql.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * 物资出库事件表
 *
 * 表名: MMS_OUTCOME_EVENT
 *
 */
public class OutcomeEventDo {
    /**
     * MMS_OUTCOME_EVENT.ID
     */
    private Long id;

    /**
     * MMS_OUTCOME_EVENT.EVENT_ID (出库事件编号)
     */
    private String eventId;

    /**
     * MMS_OUTCOME_EVENT.MAT_ID (物资编码)
     */
    private String matId;

    /**
     * MMS_OUTCOME_EVENT.WHS_ID (仓库编号)
     */
    private String whsId;

    /**
     * MMS_OUTCOME_EVENT.MAT_COUNT (出库物资数量)
     */
    private Integer matCount;

    /**
     * MMS_OUTCOME_EVENT.TOTAL_FEE (总价)
     */
    private BigDecimal totalFee;

    /**
     * MMS_OUTCOME_EVENT.COLLAR (领用人)
     */
    private String collar;

    /**
     * MMS_OUTCOME_EVENT.OPERATOR (经办人)
     */
    private String operator;

    /**
     * MMS_OUTCOME_EVENT.REMARK (备注)
     */
    private String remark;

    /**
     * MMS_OUTCOME_EVENT.CREATE_TIME (出库时间)
     */
    private Date createTime;

    /**
     * MMS_OUTCOME_EVENT.UPDATE_TIME (更新时间)
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

    public String getWhsId() {
        return whsId;
    }

    public void setWhsId(String whsId) {
        this.whsId = whsId;
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

    public String getCollar() {
        return collar;
    }

    public void setCollar(String collar) {
        this.collar = collar;
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