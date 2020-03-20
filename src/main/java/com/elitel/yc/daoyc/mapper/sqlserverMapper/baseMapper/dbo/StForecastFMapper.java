package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StForecastF;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StForecastFMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("unitname") String unitname, @Param("plcd") String plcd, @Param("fymdh") Date fymdh, @Param("iymdh") Date iymdh, @Param("ymdh") Date ymdh);

    int insert(StForecastF record);

    StForecastF selectByPrimaryKey(@Param("stcd") String stcd, @Param("unitname") String unitname, @Param("plcd") String plcd, @Param("fymdh") Date fymdh, @Param("iymdh") Date iymdh, @Param("ymdh") Date ymdh);

    List<StForecastF> selectAll();

    int updateByPrimaryKey(StForecastF record);
}