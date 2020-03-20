package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.RelMpZQ;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RelMpZQMapper {
    int deleteByPrimaryKey(@Param("mpCd") String mpCd, @Param("enabTm") Date enabTm, @Param("ptNo") String ptNo);

    int insert(RelMpZQ record);

    RelMpZQ selectByPrimaryKey(@Param("mpCd") String mpCd, @Param("enabTm") Date enabTm, @Param("ptNo") String ptNo);

    List<RelMpZQ> selectAll();

    int updateByPrimaryKey(RelMpZQ record);
}