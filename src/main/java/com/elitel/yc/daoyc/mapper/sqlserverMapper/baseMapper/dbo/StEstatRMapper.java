package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StEstatR;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StEstatRMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("idtm") Date idtm, @Param("sttdrcd") String sttdrcd);

    int insert(StEstatR record);

    StEstatR selectByPrimaryKey(@Param("stcd") String stcd, @Param("idtm") Date idtm, @Param("sttdrcd") String sttdrcd);

    List<StEstatR> selectAll();

    int updateByPrimaryKey(StEstatR record);
}