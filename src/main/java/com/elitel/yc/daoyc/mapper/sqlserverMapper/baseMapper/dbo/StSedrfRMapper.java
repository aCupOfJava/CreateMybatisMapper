package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StSedrfR;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StSedrfRMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("idtm") Date idtm, @Param("sttdrcd") String sttdrcd);

    int insert(StSedrfR record);

    StSedrfR selectByPrimaryKey(@Param("stcd") String stcd, @Param("idtm") Date idtm, @Param("sttdrcd") String sttdrcd);

    List<StSedrfR> selectAll();

    int updateByPrimaryKey(StSedrfR record);
}