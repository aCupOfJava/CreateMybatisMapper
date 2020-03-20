package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.WqOpcpD;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WqOpcpDMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("spt") Date spt, @Param("prpnm") String prpnm, @Param("lynm") String lynm, @Param("wbtp") String wbtp);

    int insert(WqOpcpD record);

    WqOpcpD selectByPrimaryKey(@Param("stcd") String stcd, @Param("spt") Date spt, @Param("prpnm") String prpnm, @Param("lynm") String lynm, @Param("wbtp") String wbtp);

    List<WqOpcpD> selectAll();

    int updateByPrimaryKey(WqOpcpD record);
}