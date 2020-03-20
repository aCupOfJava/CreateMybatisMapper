package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StTmpR;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StTmpRMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("tm") Date tm);

    int insert(StTmpR record);

    StTmpR selectByPrimaryKey(@Param("stcd") String stcd, @Param("tm") Date tm);

    List<StTmpR> selectAll();

    int updateByPrimaryKey(StTmpR record);
}