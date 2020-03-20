package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StQliceinfR;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StQliceinfRMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("tm") Date tm, @Param("exkey") String exkey);

    int insert(StQliceinfR record);

    StQliceinfR selectByPrimaryKey(@Param("stcd") String stcd, @Param("tm") Date tm, @Param("exkey") String exkey);

    List<StQliceinfR> selectAll();

    int updateByPrimaryKey(StQliceinfR record);
}