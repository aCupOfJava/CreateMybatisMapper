package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StIcefrF;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StIcefrFMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("unitname") String unitname, @Param("plcd") String plcd, @Param("fymdh") Date fymdh, @Param("iymdh") Date iymdh, @Param("ymdh") Date ymdh, @Param("exkey") String exkey);

    int insert(StIcefrF record);

    StIcefrF selectByPrimaryKey(@Param("stcd") String stcd, @Param("unitname") String unitname, @Param("plcd") String plcd, @Param("fymdh") Date fymdh, @Param("iymdh") Date iymdh, @Param("ymdh") Date ymdh, @Param("exkey") String exkey);

    List<StIcefrF> selectAll();

    int updateByPrimaryKey(StIcefrF record);
}