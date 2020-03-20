package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StRiverR;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StRiverRMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("tm") Date tm);

    int insert(StRiverR record);

    StRiverR selectByPrimaryKey(@Param("stcd") String stcd, @Param("tm") Date tm);

    List<StRiverR> selectAll();

    int updateByPrimaryKey(StRiverR record);
}