package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.WrDayWR;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WrDayWRMapper {
    int deleteByPrimaryKey(@Param("mpCd") String mpCd, @Param("dt") Date dt);

    int insert(WrDayWR record);

    WrDayWR selectByPrimaryKey(@Param("mpCd") String mpCd, @Param("dt") Date dt);

    List<WrDayWR> selectAll();

    int updateByPrimaryKey(WrDayWR record);
}