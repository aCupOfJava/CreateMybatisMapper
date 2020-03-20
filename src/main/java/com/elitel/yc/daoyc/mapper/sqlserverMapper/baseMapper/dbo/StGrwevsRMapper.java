package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StGrwevsR;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StGrwevsRMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("idtm") Date idtm, @Param("sttdrcd") String sttdrcd);

    int insert(StGrwevsR record);

    StGrwevsR selectByPrimaryKey(@Param("stcd") String stcd, @Param("idtm") Date idtm, @Param("sttdrcd") String sttdrcd);

    List<StGrwevsR> selectAll();

    int updateByPrimaryKey(StGrwevsR record);
}