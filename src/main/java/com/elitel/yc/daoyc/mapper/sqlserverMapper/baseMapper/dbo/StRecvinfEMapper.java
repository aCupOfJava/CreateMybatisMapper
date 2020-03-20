package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StRecvinfE;
import java.util.List;

public interface StRecvinfEMapper {
    int deleteByPrimaryKey(Long rlsh);

    int insert(StRecvinfE record);

    StRecvinfE selectByPrimaryKey(Long rlsh);

    List<StRecvinfE> selectAll();

    int updateByPrimaryKey(StRecvinfE record);
}