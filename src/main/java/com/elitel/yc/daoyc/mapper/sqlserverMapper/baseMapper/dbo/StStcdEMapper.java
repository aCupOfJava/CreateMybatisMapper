package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StStcdE;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StStcdEMapper {
    int deleteByPrimaryKey(@Param("instcd") String instcd, @Param("stcd") String stcd);

    int insert(StStcdE record);

    StStcdE selectByPrimaryKey(@Param("instcd") String instcd, @Param("stcd") String stcd);

    List<StStcdE> selectAll();

    int updateByPrimaryKey(StStcdE record);
}