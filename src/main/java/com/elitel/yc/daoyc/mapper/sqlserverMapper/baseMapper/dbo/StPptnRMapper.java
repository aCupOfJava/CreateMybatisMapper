package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StPptnR;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StPptnRMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("tm") Date tm);

    int insert(StPptnR record);

    StPptnR selectByPrimaryKey(@Param("stcd") String stcd, @Param("tm") Date tm);

    List<StPptnR> selectAll();

    int updateByPrimaryKey(StPptnR record);
}