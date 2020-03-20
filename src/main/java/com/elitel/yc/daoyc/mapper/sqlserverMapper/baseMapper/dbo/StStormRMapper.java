package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StStormR;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StStormRMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("tm") Date tm);

    int insert(StStormR record);

    StStormR selectByPrimaryKey(@Param("stcd") String stcd, @Param("tm") Date tm);

    List<StStormR> selectAll();

    int updateByPrimaryKey(StStormR record);
}