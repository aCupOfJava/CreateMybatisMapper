package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StRecvstatE;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StRecvstatEMapper {
    int deleteByPrimaryKey(@Param("instcd") String instcd, @Param("countday") Date countday, @Param("sttdrcd") String sttdrcd, @Param("frgrd") String frgrd, @Param("operation") String operation, @Param("inftype") String inftype);

    int insert(StRecvstatE record);

    StRecvstatE selectByPrimaryKey(@Param("instcd") String instcd, @Param("countday") Date countday, @Param("sttdrcd") String sttdrcd, @Param("frgrd") String frgrd, @Param("operation") String operation, @Param("inftype") String inftype);

    List<StRecvstatE> selectAll();

    int updateByPrimaryKey(StRecvstatE record);
}