package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StNetstatE;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StNetstatEMapper {
    int deleteByPrimaryKey(@Param("instcd") String instcd, @Param("changetime") Date changetime);

    int insert(StNetstatE record);

    StNetstatE selectByPrimaryKey(@Param("instcd") String instcd, @Param("changetime") Date changetime);

    List<StNetstatE> selectAll();

    int updateByPrimaryKey(StNetstatE record);
}