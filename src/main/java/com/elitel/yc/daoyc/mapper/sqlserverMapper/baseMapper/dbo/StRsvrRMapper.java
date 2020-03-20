package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StRsvrR;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StRsvrRMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("tm") Date tm);

    int insert(StRsvrR record);

    StRsvrR selectByPrimaryKey(@Param("stcd") String stcd, @Param("tm") Date tm);

    List<StRsvrR> selectAll();

    int updateByPrimaryKey(StRsvrR record);
}