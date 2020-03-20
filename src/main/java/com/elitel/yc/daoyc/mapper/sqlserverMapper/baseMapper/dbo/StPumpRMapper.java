package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StPumpR;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StPumpRMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("tm") Date tm);

    int insert(StPumpR record);

    StPumpR selectByPrimaryKey(@Param("stcd") String stcd, @Param("tm") Date tm);

    List<StPumpR> selectAll();

    int updateByPrimaryKey(StPumpR record);
}