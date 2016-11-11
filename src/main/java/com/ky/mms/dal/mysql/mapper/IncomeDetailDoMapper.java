package com.ky.mms.dal.mysql.mapper;

import com.ky.mms.dal.mysql.model.IncomeDetailDo;

public interface IncomeDetailDoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(IncomeDetailDo record);

    int insertSelective(IncomeDetailDo record);

    IncomeDetailDo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IncomeDetailDo record);

    int updateByPrimaryKey(IncomeDetailDo record);
}