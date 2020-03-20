package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StTdfrF;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StTdfrFMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("unitname") String unitname, @Param("plcd") String plcd, @Param("fymdh") Date fymdh, @Param("iymdh") Date iymdh, @Param("ymdh") Date ymdh);

    int insert(StTdfrF record);

    StTdfrF selectByPrimaryKey(@Param("stcd") String stcd, @Param("unitname") String unitname, @Param("plcd") String plcd, @Param("fymdh") Date fymdh, @Param("iymdh") Date iymdh, @Param("ymdh") Date ymdh);

    List<StTdfrF> selectAll();

    int updateByPrimaryKey(StTdfrF record);
}