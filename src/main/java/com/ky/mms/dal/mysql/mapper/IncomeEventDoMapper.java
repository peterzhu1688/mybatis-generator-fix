package com.ky.mms.dal.mysql.mapper;

import com.ky.mms.dal.mysql.model.IncomeEventDo;

public interface IncomeEventDoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(IncomeEventDo record);

    int insertSelective(IncomeEventDo record);

    IncomeEventDo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IncomeEventDo record);

    int updateByPrimaryKey(IncomeEventDo record);
}