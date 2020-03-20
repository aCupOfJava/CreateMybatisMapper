package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StPddmyavS;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StPddmyavSMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("mnth") Short mnth, @Param("day") Short day);

    int insert(StPddmyavS record);

    StPddmyavS selectByPrimaryKey(@Param("stcd") String stcd, @Param("mnth") Short mnth, @Param("day") Short day);

    List<StPddmyavS> selectAll();

    int updateByPrimaryKey(StPddmyavS record);
}