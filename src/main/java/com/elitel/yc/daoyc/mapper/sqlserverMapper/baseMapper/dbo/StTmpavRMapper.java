package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StTmpavR;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StTmpavRMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("idtm") Date idtm, @Param("sttdrcd") String sttdrcd);

    int insert(StTmpavR record);

    StTmpavR selectByPrimaryKey(@Param("stcd") String stcd, @Param("idtm") Date idtm, @Param("sttdrcd") String sttdrcd);

    List<StTmpavR> selectAll();

    int updateByPrimaryKey(StTmpavR record);
}