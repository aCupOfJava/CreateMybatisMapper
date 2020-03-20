package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StWdwvR;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StWdwvRMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("tm") Date tm);

    int insert(StWdwvR record);

    StWdwvR selectByPrimaryKey(@Param("stcd") String stcd, @Param("tm") Date tm);

    List<StWdwvR> selectAll();

    int updateByPrimaryKey(StWdwvR record);
}