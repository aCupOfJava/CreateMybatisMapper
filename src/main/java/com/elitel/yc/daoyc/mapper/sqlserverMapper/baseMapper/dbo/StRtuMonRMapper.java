package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StRtuMonR;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StRtuMonRMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("tm") Date tm);

    int insert(StRtuMonR record);

    StRtuMonR selectByPrimaryKey(@Param("stcd") String stcd, @Param("tm") Date tm);

    List<StRtuMonR> selectAll();

    int updateByPrimaryKey(StRtuMonR record);
}