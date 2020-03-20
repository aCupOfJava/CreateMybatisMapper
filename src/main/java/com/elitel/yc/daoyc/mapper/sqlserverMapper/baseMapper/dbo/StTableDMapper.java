package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StTableD;
import java.util.List;

public interface StTableDMapper {
    int deleteByPrimaryKey(String tabid);

    int insert(StTableD record);

    StTableD selectByPrimaryKey(String tabid);

    List<StTableD> selectAll();

    int updateByPrimaryKey(StTableD record);
}