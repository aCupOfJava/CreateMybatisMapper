package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StEuntlangD;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StEuntlangDMapper {
    int deleteByPrimaryKey(@Param("flid") String flid, @Param("eucd") String eucd);

    int insert(StEuntlangD record);

    StEuntlangD selectByPrimaryKey(@Param("flid") String flid, @Param("eucd") String eucd);

    List<StEuntlangD> selectAll();

    int updateByPrimaryKey(StEuntlangD record);
}