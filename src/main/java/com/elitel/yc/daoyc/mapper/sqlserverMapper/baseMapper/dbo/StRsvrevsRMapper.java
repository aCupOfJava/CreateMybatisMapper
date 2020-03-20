package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StRsvrevsR;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StRsvrevsRMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("idtm") Date idtm, @Param("sttdrcd") String sttdrcd);

    int insert(StRsvrevsR record);

    StRsvrevsR selectByPrimaryKey(@Param("stcd") String stcd, @Param("idtm") Date idtm, @Param("sttdrcd") String sttdrcd);

    List<StRsvrevsR> selectAll();

    int updateByPrimaryKey(StRsvrevsR record);
}