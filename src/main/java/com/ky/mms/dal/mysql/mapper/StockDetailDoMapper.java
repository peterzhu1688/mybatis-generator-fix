package com.ky.mms.dal.mysql.mapper;

import com.ky.mms.dal.mysql.model.StockDetailDo;

public interface StockDetailDoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(StockDetailDo record);

    int insertSelective(StockDetailDo record);

    StockDetailDo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(StockDetailDo record);

    int updateByPrimaryKey(StockDetailDo record);
}