package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StTideR;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StTideRMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("tm") Date tm);

    int insert(StTideR record);

    StTideR selectByPrimaryKey(@Param("stcd") String stcd, @Param("tm") Date tm);

    List<StTideR> selectAll();

    int updateByPrimaryKey(StTideR record);
}