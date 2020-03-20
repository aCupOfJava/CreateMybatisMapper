package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StGrwR;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StGrwRMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("tm") Date tm);

    int insert(StGrwR record);

    StGrwR selectByPrimaryKey(@Param("stcd") String stcd, @Param("tm") Date tm);

    List<StGrwR> selectAll();

    int updateByPrimaryKey(StGrwR record);
}