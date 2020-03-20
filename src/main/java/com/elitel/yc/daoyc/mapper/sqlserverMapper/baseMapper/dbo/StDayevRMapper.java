package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StDayevR;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StDayevRMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("tm") Date tm);

    int insert(StDayevR record);

    StDayevR selectByPrimaryKey(@Param("stcd") String stcd, @Param("tm") Date tm);

    List<StDayevR> selectAll();

    int updateByPrimaryKey(StDayevR record);
}