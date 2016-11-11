package com.ky.mms.dal.mysql.mapper;

import com.ky.mms.dal.mysql.model.MaterialDo;

public interface MaterialDoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MaterialDo record);

    int insertSelective(MaterialDo record);

    MaterialDo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MaterialDo record);

    int updateByPrimaryKey(MaterialDo record);
}