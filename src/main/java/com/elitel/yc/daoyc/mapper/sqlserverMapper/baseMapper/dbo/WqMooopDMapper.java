package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.WqMooopD;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WqMooopDMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("spt") Date spt, @Param("prpnm") String prpnm, @Param("lynm") String lynm, @Param("wbtp") String wbtp);

    int insert(WqMooopD record);

    WqMooopD selectByPrimaryKey(@Param("stcd") String stcd, @Param("spt") Date spt, @Param("prpnm") String prpnm, @Param("lynm") String lynm, @Param("wbtp") String wbtp);

    List<WqMooopD> selectAll();

    int updateByPrimaryKey(WqMooopD record);
}