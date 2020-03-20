package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StForecastcF;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StForecastcFMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("unitname") String unitname, @Param("plcd") String plcd, @Param("fymdh") Date fymdh, @Param("iymdh") Date iymdh);

    int insert(StForecastcF record);

    StForecastcF selectByPrimaryKey(@Param("stcd") String stcd, @Param("unitname") String unitname, @Param("plcd") String plcd, @Param("fymdh") Date fymdh, @Param("iymdh") Date iymdh);

    List<StForecastcF> selectAll();

    int updateByPrimaryKey(StForecastcF record);
}