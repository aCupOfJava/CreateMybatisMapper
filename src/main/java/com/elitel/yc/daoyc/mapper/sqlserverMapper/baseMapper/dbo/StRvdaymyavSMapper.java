package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StRvdaymyavS;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StRvdaymyavSMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("mnth") Short mnth, @Param("day") Short day);

    int insert(StRvdaymyavS record);

    StRvdaymyavS selectByPrimaryKey(@Param("stcd") String stcd, @Param("mnth") Short mnth, @Param("day") Short day);

    List<StRvdaymyavS> selectAll();

    int updateByPrimaryKey(StRvdaymyavS record);
}