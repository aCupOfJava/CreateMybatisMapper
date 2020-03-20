package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StSendstatE;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StSendstatEMapper {
    int deleteByPrimaryKey(@Param("instcd") String instcd, @Param("countday") Date countday, @Param("sttdrcd") String sttdrcd, @Param("frgrd") String frgrd, @Param("operation") String operation, @Param("inftype") String inftype);

    int insert(StSendstatE record);

    StSendstatE selectByPrimaryKey(@Param("instcd") String instcd, @Param("countday") Date countday, @Param("sttdrcd") String sttdrcd, @Param("frgrd") String frgrd, @Param("operation") String operation, @Param("inftype") String inftype);

    List<StSendstatE> selectAll();

    int updateByPrimaryKey(StSendstatE record);
}