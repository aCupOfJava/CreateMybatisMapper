package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StSoilchB;
import java.util.List;

public interface StSoilchBMapper {
    int deleteByPrimaryKey(String stcd);

    int insert(StSoilchB record);

    StSoilchB selectByPrimaryKey(String stcd);

    List<StSoilchB> selectAll();

    int updateByPrimaryKey(StSoilchB record);
}