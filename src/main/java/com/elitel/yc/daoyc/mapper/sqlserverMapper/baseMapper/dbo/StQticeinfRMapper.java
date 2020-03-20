package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StQticeinfR;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StQticeinfRMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("tm") Date tm, @Param("exkey") String exkey);

    int insert(StQticeinfR record);

    StQticeinfR selectByPrimaryKey(@Param("stcd") String stcd, @Param("tm") Date tm, @Param("exkey") String exkey);

    List<StQticeinfR> selectAll();

    int updateByPrimaryKey(StQticeinfR record);
}