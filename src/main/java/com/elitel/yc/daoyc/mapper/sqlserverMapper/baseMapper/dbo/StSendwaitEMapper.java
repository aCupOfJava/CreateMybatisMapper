package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StSendwaitE;
import java.util.List;

public interface StSendwaitEMapper {
    int deleteByPrimaryKey(Long slsh);

    int insert(StSendwaitE record);

    StSendwaitE selectByPrimaryKey(Long slsh);

    List<StSendwaitE> selectAll();

    int updateByPrimaryKey(StSendwaitE record);
}