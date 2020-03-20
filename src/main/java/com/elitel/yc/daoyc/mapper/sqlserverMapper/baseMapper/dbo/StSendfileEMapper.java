package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StSendfileE;
import java.util.List;

public interface StSendfileEMapper {
    int deleteByPrimaryKey(Long sfnum);

    int insert(StSendfileE record);

    StSendfileE selectByPrimaryKey(Long sfnum);

    List<StSendfileE> selectAll();

    int updateByPrimaryKey(StSendfileE record);
}