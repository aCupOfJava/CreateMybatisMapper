package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StFfrarB;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StFfrarBMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("tpcyr") Short tpcyr, @Param("rcint") Integer rcint);

    int insert(StFfrarB record);

    StFfrarB selectByPrimaryKey(@Param("stcd") String stcd, @Param("tpcyr") Short tpcyr, @Param("rcint") Integer rcint);

    List<StFfrarB> selectAll();

    int updateByPrimaryKey(StFfrarB record);
}