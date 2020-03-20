package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StRsvrstrlB;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StRsvrstrlBMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("rlstcd") String rlstcd, @Param("iomrk") String iomrk);

    int insert(StRsvrstrlB record);

    StRsvrstrlB selectByPrimaryKey(@Param("stcd") String stcd, @Param("rlstcd") String rlstcd, @Param("iomrk") String iomrk);

    List<StRsvrstrlB> selectAll();

    int updateByPrimaryKey(StRsvrstrlB record);
}