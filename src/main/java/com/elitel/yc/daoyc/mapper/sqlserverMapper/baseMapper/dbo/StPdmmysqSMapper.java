package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StPdmmysqS;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StPdmmysqSMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("yr") Short yr, @Param("mnth") Short mnth, @Param("prdtp") Short prdtp);

    int insert(StPdmmysqS record);

    StPdmmysqS selectByPrimaryKey(@Param("stcd") String stcd, @Param("yr") Short yr, @Param("mnth") Short mnth, @Param("prdtp") Short prdtp);

    List<StPdmmysqS> selectAll();

    int updateByPrimaryKey(StPdmmysqS record);
}