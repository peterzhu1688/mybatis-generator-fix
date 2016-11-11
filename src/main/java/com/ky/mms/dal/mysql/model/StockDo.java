package com.ky.mms.dal.mysql.model;

import java.util.Date;

/**
 *
 * 物资库存表
 *
 * 表名: MMS_STOCK
 *
 */
public class StockDo {
    /**
     * MMS_STOCK.ID
     */
    private Long id;

    /**
     * MMS_STOCK.MAT_ID (物资编码)
     */
    private String matId;

    /**
     * MMS_STOCK.WHS_ID (仓库编号)
     */
    private String whsId;

    /**
     * MMS_STOCK.TOTAL_COUNT (库存数量)
     */
    private Long totalCount;

    /**
     * MMS_STOCK.CREATE_TIME (创建时间)
     */
    private Date createTime;

    /**
     * MMS_STOCK.UPDATE_TIME (更新时间)
     */
    private Date updateTime;

    /**
     * MMS_STOCK.LOCK_VERSION (乐观锁标记（并发锁）)
     */
    private Long lockVersion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
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

    public Long getLockVersion() {
        return lockVersion;
    }

    public void setLockVersion(Long lockVersion) {
        this.lockVersion = lockVersion;
    }
}