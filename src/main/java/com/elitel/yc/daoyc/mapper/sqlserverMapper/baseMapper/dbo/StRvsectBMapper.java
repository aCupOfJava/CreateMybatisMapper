package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StRvsectB;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StRvsectBMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("mstm") Date mstm, @Param("vtno") Short vtno);

    int insert(StRvsectB record);

    StRvsectB selectByPrimaryKey(@Param("stcd") String stcd, @Param("mstm") Date mstm, @Param("vtno") Short vtno);

    List<StRvsectB> selectAll();

    int updateByPrimaryKey(StRvsectB record);
}