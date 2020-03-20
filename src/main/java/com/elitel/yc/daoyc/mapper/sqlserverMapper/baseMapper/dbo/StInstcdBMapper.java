package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StInstcdB;
import java.util.List;

public interface StInstcdBMapper {
    int deleteByPrimaryKey(String instcd);

    int insert(StInstcdB record);

    StInstcdB selectByPrimaryKey(String instcd);

    List<StInstcdB> selectAll();

    int updateByPrimaryKey(StInstcdB record);
}