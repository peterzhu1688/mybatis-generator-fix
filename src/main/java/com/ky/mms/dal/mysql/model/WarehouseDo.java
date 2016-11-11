package com.ky.mms.dal.mysql.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * 仓库信息表
 *
 * 表名: MMS_WAREHOUSE
 *
 */
public class WarehouseDo {
    /**
     * MMS_WAREHOUSE.ID
     */
    private Long id;

    /**
     * MMS_WAREHOUSE.WHS_ID (仓库编号(C450000001))
     */
    private String whsId;

    /**
     * MMS_WAREHOUSE.WHS_NAME (仓库名称)
     */
    private String whsName;

    /**
     * MMS_WAREHOUSE.WHS_STATUS (仓库状态(1-正常;0-停用))
     */
    private Byte whsStatus;

    /**
     * MMS_WAREHOUSE.WHS_SIZE (仓库面积)
     */
    private Double whsSize;

    /**
     * MMS_WAREHOUSE.WHS_TYPE (仓库类别(O-自有; L-租赁))
     */
    private String whsType;

    /**
     * MMS_WAREHOUSE.RENT_FEE (租金)
     */
    private BigDecimal rentFee;

    /**
     * MMS_WAREHOUSE.RENT_START_DATE (租赁开始日期)
     */
    private Date rentStartDate;

    /**
     * MMS_WAREHOUSE.RENT_END_DATE (租赁结束日期)
     */
    private Date rentEndDate;

    /**
     * MMS_WAREHOUSE.WHS_ADDRESS (仓库地址)
     */
    private String whsAddress;

    /**
     * MMS_WAREHOUSE.WHS_LGT (仓库坐标-经度)
     */
    private String whsLgt;

    /**
     * MMS_WAREHOUSE.WHS_LAT (仓库坐标-纬度)
     */
    private String whsLat;

    /**
     * MMS_WAREHOUSE.WHS_OWNER (仓库负责人)
     */
    private String whsOwner;

    /**
     * MMS_WAREHOUSE.WHS_OWNER_CELLPHONE (仓库负责人手机)
     */
    private String whsOwnerCellphone;

    /**
     * MMS_WAREHOUSE.WHS_KEEPER (仓库保管人)
     */
    private String whsKeeper;

    /**
     * MMS_WAREHOUSE.WHS_KEEPER_CELLPHONE (仓库保管人手机)
     */
    private String whsKeeperCellphone;

    /**
     * MMS_WAREHOUSE.REMARK (备注)
     */
    private String remark;

    /**
     * MMS_WAREHOUSE.CREATE_USER (创建人)
     */
    private String createUser;

    /**
     * MMS_WAREHOUSE.CREATE_TIME (创建时间)
     */
    private Date createTime;

    /**
     * MMS_WAREHOUSE.UPDATE_USER (更新人)
     */
    private String updateUser;

    /**
     * MMS_WAREHOUSE.UPDATE_TIME (更新时间)
     */
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWhsId() {
        return whsId;
    }

    public void setWhsId(String whsId) {
        this.whsId = whsId;
    }

    public String getWhsName() {
        return whsName;
    }

    public void setWhsName(String whsName) {
        this.whsName = whsName;
    }

    public Byte getWhsStatus() {
        return whsStatus;
    }

    public void setWhsStatus(Byte whsStatus) {
        this.whsStatus = whsStatus;
    }

    public Double getWhsSize() {
        return whsSize;
    }

    public void setWhsSize(Double whsSize) {
        this.whsSize = whsSize;
    }

    public String getWhsType() {
        return whsType;
    }

    public void setWhsType(String whsType) {
        this.whsType = whsType;
    }

    public BigDecimal getRentFee() {
        return rentFee;
    }

    public void setRentFee(BigDecimal rentFee) {
        this.rentFee = rentFee;
    }

    public Date getRentStartDate() {
        return rentStartDate;
    }

    public void setRentStartDate(Date rentStartDate) {
        this.rentStartDate = rentStartDate;
    }

    public Date getRentEndDate() {
        return rentEndDate;
    }

    public void setRentEndDate(Date rentEndDate) {
        this.rentEndDate = rentEndDate;
    }

    public String getWhsAddress() {
        return whsAddress;
    }

    public void setWhsAddress(String whsAddress) {
        this.whsAddress = whsAddress;
    }

    public String getWhsLgt() {
        return whsLgt;
    }

    public void setWhsLgt(String whsLgt) {
        this.whsLgt = whsLgt;
    }

    public String getWhsLat() {
        return whsLat;
    }

    public void setWhsLat(String whsLat) {
        this.whsLat = whsLat;
    }

    public String getWhsOwner() {
        return whsOwner;
    }

    public void setWhsOwner(String whsOwner) {
        this.whsOwner = whsOwner;
    }

    public String getWhsOwnerCellphone() {
        return whsOwnerCellphone;
    }

    public void setWhsOwnerCellphone(String whsOwnerCellphone) {
        this.whsOwnerCellphone = whsOwnerCellphone;
    }

    public String getWhsKeeper() {
        return whsKeeper;
    }

    public void setWhsKeeper(String whsKeeper) {
        this.whsKeeper = whsKeeper;
    }

    public String getWhsKeeperCellphone() {
        return whsKeeperCellphone;
    }

    public void setWhsKeeperCellphone(String whsKeeperCellphone) {
        this.whsKeeperCellphone = whsKeeperCellphone;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}