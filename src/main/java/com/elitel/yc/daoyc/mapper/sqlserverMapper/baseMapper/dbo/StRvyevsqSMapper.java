package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StRvyevsqS;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StRvyevsqSMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("yr") Short yr);

    int insert(StRvyevsqS record);

    StRvyevsqS selectByPrimaryKey(@Param("stcd") String stcd, @Param("yr") Short yr);

    List<StRvyevsqS> selectAll();

    int updateByPrimaryKey(StRvyevsqS record);
}