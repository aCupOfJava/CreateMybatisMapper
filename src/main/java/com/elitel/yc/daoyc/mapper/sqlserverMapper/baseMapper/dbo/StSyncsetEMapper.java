package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StSyncsetE;
import java.util.List;

public interface StSyncsetEMapper {
    int deleteByPrimaryKey(String sysname);

    int insert(StSyncsetE record);

    StSyncsetE selectByPrimaryKey(String sysname);

    List<StSyncsetE> selectAll();

    int updateByPrimaryKey(StSyncsetE record);
}