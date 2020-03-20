package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StRvfcchB;
import java.util.List;

public interface StRvfcchBMapper {
    int deleteByPrimaryKey(String stcd);

    int insert(StRvfcchB record);

    StRvfcchB selectByPrimaryKey(String stcd);

    List<StRvfcchB> selectAll();

    int updateByPrimaryKey(StRvfcchB record);
}