package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StTmpevsR;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StTmpevsRMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("idtm") Date idtm, @Param("sttdrcd") String sttdrcd);

    int insert(StTmpevsR record);

    StTmpevsR selectByPrimaryKey(@Param("stcd") String stcd, @Param("idtm") Date idtm, @Param("sttdrcd") String sttdrcd);

    List<StTmpevsR> selectAll();

    int updateByPrimaryKey(StTmpevsR record);
}