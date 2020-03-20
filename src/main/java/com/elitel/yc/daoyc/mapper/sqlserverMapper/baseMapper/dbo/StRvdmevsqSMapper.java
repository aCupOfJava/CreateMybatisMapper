package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StRvdmevsqS;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StRvdmevsqSMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("yr") Short yr, @Param("mnth") Short mnth, @Param("prdtp") Short prdtp);

    int insert(StRvdmevsqS record);

    StRvdmevsqS selectByPrimaryKey(@Param("stcd") String stcd, @Param("yr") Short yr, @Param("mnth") Short mnth, @Param("prdtp") Short prdtp);

    List<StRvdmevsqS> selectAll();

    int updateByPrimaryKey(StRvdmevsqS record);
}