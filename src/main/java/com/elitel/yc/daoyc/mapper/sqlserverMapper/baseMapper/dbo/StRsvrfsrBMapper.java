package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StRsvrfsrB;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StRsvrfsrBMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("bgmd") String bgmd);

    int insert(StRsvrfsrB record);

    StRsvrfsrB selectByPrimaryKey(@Param("stcd") String stcd, @Param("bgmd") String bgmd);

    List<StRsvrfsrB> selectAll();

    int updateByPrimaryKey(StRsvrfsrB record);
}