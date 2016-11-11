package com.ky.mms.dal.mysql.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * 物资入库事件表
 *
 * 表名: MMS_INCOME_EVENT
 *
 */
public class IncomeEventDo {
    /**
     * MMS_INCOME_EVENT.ID
     */
    private Long id;

    /**
     * MMS_INCOME_EVENT.EVENT_ID (入库事件编号)
     */
    private String eventId;

    /**
     * MMS_INCOME_EVENT.MAT_ID (物资编码)
     */
    private String matId;

    /**
     * MMS_INCOME_EVENT.WHS_ID (仓库编号)
     */
    private String whsId;

    /**
     * MMS_INCOME_EVENT.MAT_COUNT (入库物资数量)
     */
    private Integer matCount;

    /**
     * MMS_INCOME_EVENT.UNIT_FEE (单价)
     */
    private BigDecimal unitFee;

    /**
     * MMS_INCOME_EVENT.TOTAL_FEE (总价)
     */
    private BigDecimal totalFee;

    /**
     * MMS_INCOME_EVENT.OPERATOR (经办人)
     */
    private String operator;

    /**
     * MMS_INCOME_EVENT.REMARK (备注)
     */
    private String remark;

    /**
     * MMS_INCOME_EVENT.CREATE_TIME (创建时间)
     */
    private Date createTime;

    /**
     * MMS_INCOME_EVENT.UPDATE_TIME (更新时间)
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

    public BigDecimal getUnitFee() {
        return unitFee;
    }

    public void setUnitFee(BigDecimal unitFee) {
        this.unitFee = unitFee;
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