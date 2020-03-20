package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StPmevsR;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StPmevsRMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("idtm") Date idtm, @Param("sttdrcd") String sttdrcd);

    int insert(StPmevsR record);

    StPmevsR selectByPrimaryKey(@Param("stcd") String stcd, @Param("idtm") Date idtm, @Param("sttdrcd") String sttdrcd);

    List<StPmevsR> selectAll();

    int updateByPrimaryKey(StPmevsR record);
}