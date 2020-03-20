package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StTideavR;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StTideavRMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("idtm") Date idtm, @Param("sttdrcd") String sttdrcd);

    int insert(StTideavR record);

    StTideavR selectByPrimaryKey(@Param("stcd") String stcd, @Param("idtm") Date idtm, @Param("sttdrcd") String sttdrcd);

    List<StTideavR> selectAll();

    int updateByPrimaryKey(StTideavR record);
}