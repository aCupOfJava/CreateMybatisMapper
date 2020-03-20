package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StSenddoE;
import java.util.List;

public interface StSenddoEMapper {
    int deleteByPrimaryKey(Long slsh);

    int insert(StSenddoE record);

    StSenddoE selectByPrimaryKey(Long slsh);

    List<StSenddoE> selectAll();

    int updateByPrimaryKey(StSenddoE record);
}