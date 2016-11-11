package com.ky.mms.dal.mysql.mapper;

import com.ky.mms.dal.mysql.model.WarehouseDo;

public interface WarehouseDoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WarehouseDo record);

    int insertSelective(WarehouseDo record);

    WarehouseDo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WarehouseDo record);

    int updateByPrimaryKey(WarehouseDo record);
}