package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StGrwavR;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StGrwavRMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("idtm") Date idtm, @Param("sttdrcd") String sttdrcd);

    int insert(StGrwavR record);

    StGrwavR selectByPrimaryKey(@Param("stcd") String stcd, @Param("idtm") Date idtm, @Param("sttdrcd") String sttdrcd);

    List<StGrwavR> selectAll();

    int updateByPrimaryKey(StGrwavR record);
}