package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StRvdmmysqS;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StRvdmmysqSMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("yr") Short yr, @Param("mnth") Short mnth, @Param("prdtp") Short prdtp);

    int insert(StRvdmmysqS record);

    StRvdmmysqS selectByPrimaryKey(@Param("stcd") String stcd, @Param("yr") Short yr, @Param("mnth") Short mnth, @Param("prdtp") Short prdtp);

    List<StRvdmmysqS> selectAll();

    int updateByPrimaryKey(StRvdmmysqS record);
}