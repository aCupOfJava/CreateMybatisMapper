package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StRvdmmyavS;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StRvdmmyavSMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("mnth") Short mnth, @Param("prdtp") Short prdtp);

    int insert(StRvdmmyavS record);

    StRvdmmyavS selectByPrimaryKey(@Param("stcd") String stcd, @Param("mnth") Short mnth, @Param("prdtp") Short prdtp);

    List<StRvdmmyavS> selectAll();

    int updateByPrimaryKey(StRvdmmyavS record);
}