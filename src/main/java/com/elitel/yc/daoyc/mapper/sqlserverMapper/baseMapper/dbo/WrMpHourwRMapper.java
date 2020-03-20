package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.WrMpHourwR;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WrMpHourwRMapper {
    int deleteByPrimaryKey(@Param("dt") Date dt, @Param("mpCd") String mpCd);

    int insert(WrMpHourwR record);

    WrMpHourwR selectByPrimaryKey(@Param("dt") Date dt, @Param("mpCd") String mpCd);

    List<WrMpHourwR> selectAll();

    int updateByPrimaryKey(WrMpHourwR record);
}