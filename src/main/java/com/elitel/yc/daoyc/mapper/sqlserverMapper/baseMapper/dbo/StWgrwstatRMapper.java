package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StWgrwstatR;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StWgrwstatRMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("idtm") Date idtm, @Param("sttdrcd") String sttdrcd);

    int insert(StWgrwstatR record);

    StWgrwstatR selectByPrimaryKey(@Param("stcd") String stcd, @Param("idtm") Date idtm, @Param("sttdrcd") String sttdrcd);

    List<StWgrwstatR> selectAll();

    int updateByPrimaryKey(StWgrwstatR record);
}