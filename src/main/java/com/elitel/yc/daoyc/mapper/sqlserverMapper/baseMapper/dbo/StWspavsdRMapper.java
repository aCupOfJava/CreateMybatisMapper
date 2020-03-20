package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StWspavsdR;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StWspavsdRMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("idtm") Date idtm);

    int insert(StWspavsdR record);

    StWspavsdR selectByPrimaryKey(@Param("stcd") String stcd, @Param("idtm") Date idtm);

    List<StWspavsdR> selectAll();

    int updateByPrimaryKey(StWspavsdR record);
}