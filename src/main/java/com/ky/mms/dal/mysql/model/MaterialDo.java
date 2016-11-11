package com.ky.mms.dal.mysql.model;

import java.util.Date;

/**
 *
 * 物资信息表
 *
 * 表名: MMS_MATERIAL
 *
 */
public class MaterialDo {
    /**
     * MMS_MATERIAL.ID
     */
    private Long id;

    /**
     * MMS_MATERIAL.MAT_ID (物资编码(W450000001))
     */
    private String matId;

    /**
     * MMS_MATERIAL.MAT_NAME (物资名称)
     */
    private String matName;

    /**
     * MMS_MATERIAL.MAT_SPE (规格型号)
     */
    private String matSpe;

    /**
     * MMS_MATERIAL.MAT_BRAND (品牌)
     */
    private String matBrand;

    /**
     * MMS_MATERIAL.MAT_UNIT (计量单位)
     */
    private String matUnit;

    /**
     * MMS_MATERIAL.CREATE_USER (创建人)
     */
    private String createUser;

    /**
     * MMS_MATERIAL.CREATE_TIME (创建时间)
     */
    private Date createTime;

    /**
     * MMS_MATERIAL.UPDATE_USER (更新人)
     */
    private String updateUser;

    /**
     * MMS_MATERIAL.UPDATE_TIME (更新时间)
     */
    private Date updateTime;

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

    public String getMatName() {
        return matName;
    }

    public void setMatName(String matName) {
        this.matName = matName;
    }

    public String getMatSpe() {
        return matSpe;
    }

    public void setMatSpe(String matSpe) {
        this.matSpe = matSpe;
    }

    public String getMatBrand() {
        return matBrand;
    }

    public void setMatBrand(String matBrand) {
        this.matBrand = matBrand;
    }

    public String getMatUnit() {
        return matUnit;
    }

    public void setMatUnit(String matUnit) {
        this.matUnit = matUnit;
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