package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StRsvrmyavS;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StRsvrmyavSMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("mnth") Short mnth, @Param("day") Short day);

    int insert(StRsvrmyavS record);

    StRsvrmyavS selectByPrimaryKey(@Param("stcd") String stcd, @Param("mnth") Short mnth, @Param("day") Short day);

    List<StRsvrmyavS> selectAll();

    int updateByPrimaryKey(StRsvrmyavS record);
}