package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StWgrwR;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StWgrwRMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("idtm") Date idtm, @Param("sttdrcd") String sttdrcd);

    int insert(StWgrwR record);

    StWgrwR selectByPrimaryKey(@Param("stcd") String stcd, @Param("idtm") Date idtm, @Param("sttdrcd") String sttdrcd);

    List<StWgrwR> selectAll();

    int updateByPrimaryKey(StWgrwR record);
}