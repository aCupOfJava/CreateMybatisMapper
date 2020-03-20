package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StZvarlB;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StZvarlBMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("mstm") Date mstm, @Param("ptno") Short ptno);

    int insert(StZvarlB record);

    StZvarlB selectByPrimaryKey(@Param("stcd") String stcd, @Param("mstm") Date mstm, @Param("ptno") Short ptno);

    List<StZvarlB> selectAll();

    int updateByPrimaryKey(StZvarlB record);
}