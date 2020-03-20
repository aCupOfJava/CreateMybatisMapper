package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StRvevsR;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StRvevsRMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("idtm") Date idtm, @Param("sttdrcd") String sttdrcd);

    int insert(StRvevsR record);

    StRvevsR selectByPrimaryKey(@Param("stcd") String stcd, @Param("idtm") Date idtm, @Param("sttdrcd") String sttdrcd);

    List<StRvevsR> selectAll();

    int updateByPrimaryKey(StRvevsR record);
}