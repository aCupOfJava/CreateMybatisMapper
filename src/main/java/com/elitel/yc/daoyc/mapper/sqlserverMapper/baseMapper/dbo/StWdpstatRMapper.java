package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StWdpstatR;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StWdpstatRMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("idtm") Date idtm, @Param("sttdrcd") String sttdrcd);

    int insert(StWdpstatR record);

    StWdpstatR selectByPrimaryKey(@Param("stcd") String stcd, @Param("idtm") Date idtm, @Param("sttdrcd") String sttdrcd);

    List<StWdpstatR> selectAll();

    int updateByPrimaryKey(StWdpstatR record);
}