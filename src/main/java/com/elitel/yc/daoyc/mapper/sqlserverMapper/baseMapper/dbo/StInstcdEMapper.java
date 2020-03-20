package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StInstcdE;
import java.util.List;

public interface StInstcdEMapper {
    int deleteByPrimaryKey(String instcd);

    int insert(StInstcdE record);

    StInstcdE selectByPrimaryKey(String instcd);

    List<StInstcdE> selectAll();

    int updateByPrimaryKey(StInstcdE record);
}