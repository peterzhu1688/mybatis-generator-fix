package com.ky.mms.dal.mysql.mapper;

import com.ky.mms.dal.mysql.model.TransferDetailDo;

public interface TransferDetailDoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TransferDetailDo record);

    int insertSelective(TransferDetailDo record);

    TransferDetailDo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TransferDetailDo record);

    int updateByPrimaryKey(TransferDetailDo record);
}