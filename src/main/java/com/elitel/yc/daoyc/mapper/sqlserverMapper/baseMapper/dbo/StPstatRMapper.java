package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StPstatR;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StPstatRMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("idtm") Date idtm, @Param("sttdrcd") String sttdrcd);

    int insert(StPstatR record);

    StPstatR selectByPrimaryKey(@Param("stcd") String stcd, @Param("idtm") Date idtm, @Param("sttdrcd") String sttdrcd);

    List<StPstatR> selectAll();

    int updateByPrimaryKey(StPstatR record);
}