package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StWasR;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StWasRMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("tm") Date tm);

    int insert(StWasR record);

    StWasR selectByPrimaryKey(@Param("stcd") String stcd, @Param("tm") Date tm);

    List<StWasR> selectAll();

    int updateByPrimaryKey(StWasR record);
}