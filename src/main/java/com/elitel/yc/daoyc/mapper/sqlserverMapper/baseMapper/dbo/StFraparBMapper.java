package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StFraparB;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StFraparBMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("tpcyr") Short tpcyr, @Param("vartp") String vartp);

    int insert(StFraparB record);

    StFraparB selectByPrimaryKey(@Param("stcd") String stcd, @Param("tpcyr") Short tpcyr, @Param("vartp") String vartp);

    List<StFraparB> selectAll();

    int updateByPrimaryKey(StFraparB record);
}