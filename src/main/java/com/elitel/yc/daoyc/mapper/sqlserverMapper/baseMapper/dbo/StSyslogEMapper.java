package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StSyslogE;
import java.util.List;

public interface StSyslogEMapper {
    int deleteByPrimaryKey(Long loglsh);

    int insert(StSyslogE record);

    StSyslogE selectByPrimaryKey(Long loglsh);

    List<StSyslogE> selectAll();

    int updateByPrimaryKey(StSyslogE record);
}