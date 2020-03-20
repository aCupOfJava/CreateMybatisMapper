package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.WrMpZR;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WrMpZRMapper {
    int deleteByPrimaryKey(@Param("mpCd") String mpCd, @Param("tm") Date tm);

    int insert(WrMpZR record);

    WrMpZR selectByPrimaryKey(@Param("mpCd") String mpCd, @Param("tm") Date tm);

    List<WrMpZR> selectAll();

    int updateByPrimaryKey(WrMpZR record);
}