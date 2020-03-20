package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StTableE;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StTableEMapper {
    int deleteByPrimaryKey(@Param("instcd") String instcd, @Param("tabid") String tabid);

    int insert(StTableE record);

    StTableE selectByPrimaryKey(@Param("instcd") String instcd, @Param("tabid") String tabid);

    List<StTableE> selectAll();

    int updateByPrimaryKey(StTableE record);
}