package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.WqMispD;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WqMispDMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("spt") Date spt, @Param("prpnm") String prpnm, @Param("lynm") String lynm, @Param("wbtp") String wbtp);

    int insert(WqMispD record);

    WqMispD selectByPrimaryKey(@Param("stcd") String stcd, @Param("spt") Date spt, @Param("prpnm") String prpnm, @Param("lynm") String lynm, @Param("wbtp") String wbtp);

    List<WqMispD> selectAll();

    int updateByPrimaryKey(WqMispD record);
}