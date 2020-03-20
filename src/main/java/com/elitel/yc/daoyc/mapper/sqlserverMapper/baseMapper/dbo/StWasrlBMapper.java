package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StWasrlB;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StWasrlBMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("rlstcd") String rlstcd, @Param("rlmrk") String rlmrk);

    int insert(StWasrlB record);

    StWasrlB selectByPrimaryKey(@Param("stcd") String stcd, @Param("rlstcd") String rlstcd, @Param("rlmrk") String rlmrk);

    List<StWasrlB> selectAll();

    int updateByPrimaryKey(StWasrlB record);
}