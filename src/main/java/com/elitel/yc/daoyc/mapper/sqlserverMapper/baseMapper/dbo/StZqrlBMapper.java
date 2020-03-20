package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.StZqrlB;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StZqrlBMapper {
    int deleteByPrimaryKey(@Param("stcd") String stcd, @Param("lnnm") String lnnm, @Param("bgtm") Date bgtm, @Param("ptno") Short ptno);

    int insert(StZqrlB record);

    StZqrlB selectByPrimaryKey(@Param("stcd") String stcd, @Param("lnnm") String lnnm, @Param("bgtm") Date bgtm, @Param("ptno") Short ptno);

    List<StZqrlB> selectAll();

    int updateByPrimaryKey(StZqrlB record);
}