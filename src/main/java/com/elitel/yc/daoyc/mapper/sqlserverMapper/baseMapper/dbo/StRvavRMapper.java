package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StRvavR;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StRvavRMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("idtm") Date idtm, @Param("sttdrcd") String sttdrcd);

    int insert(StRvavR record);

    StRvavR selectByPrimaryKey(@Param("stcd") String stcd, @Param("idtm") Date idtm, @Param("sttdrcd") String sttdrcd);

    List<StRvavR> selectAll();

    int updateByPrimaryKey(StRvavR record);
}