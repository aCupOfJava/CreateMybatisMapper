package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StRsvravR;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StRsvravRMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("idtm") Date idtm, @Param("sttdrcd") String sttdrcd);

    int insert(StRsvravR record);

    StRsvravR selectByPrimaryKey(@Param("stcd") String stcd, @Param("idtm") Date idtm, @Param("sttdrcd") String sttdrcd);

    List<StRsvravR> selectAll();

    int updateByPrimaryKey(StRsvravR record);
}