package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StWasavR;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StWasavRMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("idtm") Date idtm, @Param("sttdrcd") String sttdrcd);

    int insert(StWasavR record);

    StWasavR selectByPrimaryKey(@Param("stcd") String stcd, @Param("idtm") Date idtm, @Param("sttdrcd") String sttdrcd);

    List<StWasavR> selectAll();

    int updateByPrimaryKey(StWasavR record);
}