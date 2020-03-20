package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StStworkR;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StStworkRMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("tm") Date tm);

    int insert(StStworkR record);

    StStworkR selectByPrimaryKey(@Param("stcd") String stcd, @Param("tm") Date tm);

    List<StStworkR> selectAll();

    int updateByPrimaryKey(StStworkR record);
}