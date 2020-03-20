package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.WqNmispD;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WqNmispDMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("spt") Date spt, @Param("prpnm") String prpnm, @Param("lynm") String lynm, @Param("wbtp") String wbtp);

    int insert(WqNmispD record);

    WqNmispD selectByPrimaryKey(@Param("stcd") String stcd, @Param("spt") Date spt, @Param("prpnm") String prpnm, @Param("lynm") String lynm, @Param("wbtp") String wbtp);

    List<WqNmispD> selectAll();

    int updateByPrimaryKey(WqNmispD record);
}