package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StSedR;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StSedRMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("tm") Date tm);

    int insert(StSedR record);

    StSedR selectByPrimaryKey(@Param("stcd") String stcd, @Param("tm") Date tm);

    List<StSedR> selectAll();

    int updateByPrimaryKey(StSedR record);
}