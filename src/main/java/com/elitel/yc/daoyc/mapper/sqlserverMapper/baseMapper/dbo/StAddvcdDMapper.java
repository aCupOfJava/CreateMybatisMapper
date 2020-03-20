package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StAddvcdD;
import java.util.List;

public interface StAddvcdDMapper {
    int deleteByPrimaryKey(String addvcd);

    int insert(StAddvcdD record);

    StAddvcdD selectByPrimaryKey(String addvcd);

    List<StAddvcdD> selectAll();

    int updateByPrimaryKey(StAddvcdD record);
}