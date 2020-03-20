package com.elitel.yc.daoyc.mapper.sqlserverMapper.baseMapper.dbo;

import com.elitel.yc.entity.baseEntity.WrMpQR;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WrMpQRMapper {
    int deleteByPrimaryKey(@Param("mpCd") String mpCd, @Param("tm") Date tm);

    int insert(WrMpQR record);

    WrMpQR selectByPrimaryKey(@Param("mpCd") String mpCd, @Param("tm") Date tm);

    List<WrMpQR> selectAll();

    int updateByPrimaryKey(WrMpQR record);
}