package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StPdmmyavS;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StPdmmyavSMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("mnth") Short mnth, @Param("prdtp") Short prdtp);

    int insert(StPdmmyavS record);

    StPdmmyavS selectByPrimaryKey(@Param("stcd") String stcd, @Param("mnth") Short mnth, @Param("prdtp") Short prdtp);

    List<StPdmmyavS> selectAll();

    int updateByPrimaryKey(StPdmmyavS record);
}