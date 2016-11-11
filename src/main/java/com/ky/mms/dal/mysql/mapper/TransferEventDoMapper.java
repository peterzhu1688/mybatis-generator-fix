package com.ky.mms.dal.mysql.mapper;

import com.ky.mms.dal.mysql.model.TransferEventDo;

public interface TransferEventDoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TransferEventDo record);

    int insertSelective(TransferEventDo record);

    TransferEventDo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TransferEventDo record);

    int updateByPrimaryKey(TransferEventDo record);
}