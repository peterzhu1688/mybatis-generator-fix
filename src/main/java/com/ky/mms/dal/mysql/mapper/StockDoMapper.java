package com.ky.mms.dal.mysql.mapper;

import com.ky.mms.dal.mysql.model.StockDo;

public interface StockDoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(StockDo record);

    int insertSelective(StockDo record);

    StockDo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(StockDo record);

    int updateByPrimaryKey(StockDo record);
}