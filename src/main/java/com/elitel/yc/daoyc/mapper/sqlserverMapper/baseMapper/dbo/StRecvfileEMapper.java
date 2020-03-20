package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StRecvfileE;
import java.util.List;

public interface StRecvfileEMapper {
    int deleteByPrimaryKey(Long rfnum);

    int insert(StRecvfileE record);

    StRecvfileE selectByPrimaryKey(Long rfnum);

    List<StRecvfileE> selectAll();

    int updateByPrimaryKey(StRecvfileE record);
}