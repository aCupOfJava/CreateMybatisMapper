package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StStsmcntE;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StStsmcntEMapper {
    int deleteByPrimaryKey(@Param("instcd") String instcd, @Param("stcd") String stcd, @Param("countday") Date countday, @Param("infstatus") String infstatus, @Param("inftype") String inftype);

    int insert(StStsmcntE record);

    StStsmcntE selectByPrimaryKey(@Param("instcd") String instcd, @Param("stcd") String stcd, @Param("countday") Date countday, @Param("infstatus") String infstatus, @Param("inftype") String inftype);

    List<StStsmcntE> selectAll();

    int updateByPrimaryKey(StStsmcntE record);
}