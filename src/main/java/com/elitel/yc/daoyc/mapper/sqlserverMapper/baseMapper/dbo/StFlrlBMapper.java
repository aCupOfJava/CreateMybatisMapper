package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StFlrlB;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StFlrlBMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("lnnm") String lnnm);

    int insert(StFlrlB record);

    StFlrlB selectByPrimaryKey(@Param("stcd") String stcd, @Param("lnnm") String lnnm);

    List<StFlrlB> selectAll();

    int updateByPrimaryKey(StFlrlB record);
}