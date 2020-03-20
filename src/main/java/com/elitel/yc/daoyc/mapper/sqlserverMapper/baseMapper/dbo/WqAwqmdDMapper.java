package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.WqAwqmdD;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WqAwqmdDMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("spt") Date spt);

    int insert(WqAwqmdD record);

    WqAwqmdD selectByPrimaryKey(@Param("stcd") String stcd, @Param("spt") Date spt);

    List<WqAwqmdD> selectAll();

    int updateByPrimaryKey(WqAwqmdD record);
}