package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StFsdrB;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StFsdrBMapper {
    int deleteByPrimaryKey(@Param("upstcd") String upstcd, @Param("dwstcd") String dwstcd, @Param("qmgn") Integer qmgn);

    int insert(StFsdrB record);

    StFsdrB selectByPrimaryKey(@Param("upstcd") String upstcd, @Param("dwstcd") String dwstcd, @Param("qmgn") Integer qmgn);

    List<StFsdrB> selectAll();

    int updateByPrimaryKey(StFsdrB record);
}