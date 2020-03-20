package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StSendtoE;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StSendtoEMapper {
    int deleteByPrimaryKey(@Param("instcd") String instcd, @Param("slsh") Long slsh);

    int insert(StSendtoE record);

    StSendtoE selectByPrimaryKey(@Param("instcd") String instcd, @Param("slsh") Long slsh);

    List<StSendtoE> selectAll();

    int updateByPrimaryKey(StSendtoE record);
}