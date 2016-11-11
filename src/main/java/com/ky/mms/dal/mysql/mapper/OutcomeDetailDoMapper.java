package com.ky.mms.dal.mysql.mapper;

import com.ky.mms.dal.mysql.model.OutcomeDetailDo;

public interface OutcomeDetailDoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OutcomeDetailDo record);

    int insertSelective(OutcomeDetailDo record);

    OutcomeDetailDo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OutcomeDetailDo record);

    int updateByPrimaryKey(OutcomeDetailDo record);
}