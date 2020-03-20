package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StSnowR;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StSnowRMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("tm") Date tm);

    int insert(StSnowR record);

    StSnowR selectByPrimaryKey(@Param("stcd") String stcd, @Param("tm") Date tm);

    List<StSnowR> selectAll();

    int updateByPrimaryKey(StSnowR record);
}