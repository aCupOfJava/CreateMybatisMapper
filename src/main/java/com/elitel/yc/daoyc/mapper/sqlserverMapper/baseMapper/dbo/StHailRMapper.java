package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StHailR;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StHailRMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("tm") Date tm);

    int insert(StHailR record);

    StHailR selectByPrimaryKey(@Param("stcd") String stcd, @Param("tm") Date tm);

    List<StHailR> selectAll();

    int updateByPrimaryKey(StHailR record);
}