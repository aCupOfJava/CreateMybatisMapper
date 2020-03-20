package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StEnnmcdD;
import java.util.List;

public interface StEnnmcdDMapper {
    int deleteByPrimaryKey(String ennmcd);

    int insert(StEnnmcdD record);

    StEnnmcdD selectByPrimaryKey(String ennmcd);

    List<StEnnmcdD> selectAll();

    int updateByPrimaryKey(StEnnmcdD record);
}