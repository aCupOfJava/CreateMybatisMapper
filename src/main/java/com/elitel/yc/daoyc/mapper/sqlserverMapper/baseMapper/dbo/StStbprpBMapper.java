package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StStbprpB;
import java.util.List;

public interface StStbprpBMapper {
    int deleteByPrimaryKey(String stcd);

    int insert(StStbprpB record);

    StStbprpB selectByPrimaryKey(String stcd);

    List<StStbprpB> selectAll();

    int updateByPrimaryKey(StStbprpB record);
}