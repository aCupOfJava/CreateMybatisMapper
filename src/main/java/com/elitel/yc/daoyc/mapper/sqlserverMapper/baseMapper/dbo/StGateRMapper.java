package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StGateR;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StGateRMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("tm") Date tm, @Param("exkey") String exkey);

    int insert(StGateR record);

    StGateR selectByPrimaryKey(@Param("stcd") String stcd, @Param("tm") Date tm, @Param("exkey") String exkey);

    List<StGateR> selectAll();

    int updateByPrimaryKey(StGateR record);
}