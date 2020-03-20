package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StSoilR;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StSoilRMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("tm") Date tm, @Param("exkey") String exkey);

    int insert(StSoilR record);

    StSoilR selectByPrimaryKey(@Param("stcd") String stcd, @Param("tm") Date tm, @Param("exkey") String exkey);

    List<StSoilR> selectAll();

    int updateByPrimaryKey(StSoilR record);
}