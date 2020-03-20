package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StStsmtaskB;
import java.util.List;

public interface StStsmtaskBMapper {
    int deleteByPrimaryKey(String stcd);

    int insert(StStsmtaskB record);

    StStsmtaskB selectByPrimaryKey(String stcd);

    List<StStsmtaskB> selectAll();

    int updateByPrimaryKey(StStsmtaskB record);
}