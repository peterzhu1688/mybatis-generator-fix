package com.ky.mms.dal.mysql.mapper;

import com.ky.mms.dal.mysql.model.OutcomeEventDo;

public interface OutcomeEventDoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OutcomeEventDo record);

    int insertSelective(OutcomeEventDo record);

    OutcomeEventDo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OutcomeEventDo record);

    int updateByPrimaryKey(OutcomeEventDo record);
}