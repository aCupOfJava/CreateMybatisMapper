package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.WqWbhpD;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WqWbhpDMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("spt") Date spt, @Param("prpnm") String prpnm, @Param("lynm") String lynm, @Param("wbtp") String wbtp);

    int insert(WqWbhpD record);

    WqWbhpD selectByPrimaryKey(@Param("stcd") String stcd, @Param("spt") Date spt, @Param("prpnm") String prpnm, @Param("lynm") String lynm, @Param("wbtp") String wbtp);

    List<WqWbhpD> selectAll();

    int updateByPrimaryKey(WqWbhpD record);
}