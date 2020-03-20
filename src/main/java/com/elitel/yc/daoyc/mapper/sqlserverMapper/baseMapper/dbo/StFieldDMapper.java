package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StFieldD;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StFieldDMapper {
    int deleteByPrimaryKey(@Param("tabid") String tabid, @Param("flid") String flid);

    int insert(StFieldD record);

    StFieldD selectByPrimaryKey(@Param("tabid") String tabid, @Param("flid") String flid);

    List<StFieldD> selectAll();

    int updateByPrimaryKey(StFieldD record);
}