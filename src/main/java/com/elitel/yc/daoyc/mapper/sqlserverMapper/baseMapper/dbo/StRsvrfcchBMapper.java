package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StRsvrfcchB;
import java.util.List;

public interface StRsvrfcchBMapper {
    int deleteByPrimaryKey(String stcd);

    int insert(StRsvrfcchB record);

    StRsvrfcchB selectByPrimaryKey(String stcd);

    List<StRsvrfcchB> selectAll();

    int updateByPrimaryKey(StRsvrfcchB record);
}