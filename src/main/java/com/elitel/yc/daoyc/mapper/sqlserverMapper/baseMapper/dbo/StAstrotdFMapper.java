package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StAstrotdF;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StAstrotdFMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("ymdh") Date ymdh);

    int insert(StAstrotdF record);

    StAstrotdF selectByPrimaryKey(@Param("stcd") String stcd, @Param("ymdh") Date ymdh);

    List<StAstrotdF> selectAll();

    int updateByPrimaryKey(StAstrotdF record);
}