package com.jiuair.its.dao;

import com.jiuair.its.domain.OPsgListEntity;
import org.apache.ibatis.annotations.Param;

public interface OPsgListMapper {
    int deleteByPrimaryKey(String oPsgSn);

    int insert(OPsgListEntity record);

    int insertSelective(OPsgListEntity record);

    OPsgListEntity selectByPrimaryKey(String oPsgSn);

    int updateByPrimaryKeySelective(OPsgListEntity record);

    int updateByPrimaryKey(OPsgListEntity record);

    int changeName(@Param("psgId")String psgId,@Param("oldName")String oldName,@Param("newName")String newName,@Param("newNameEn")String newNameEn);
}