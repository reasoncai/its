package com.jiuair.its.dao;

import com.jiuair.its.domain.OrderPsg;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderPsgMapper {
    int deleteByPrimaryKey(String psgId);

    int insert(OrderPsg record);

    int insertSelective(OrderPsg record);

    OrderPsg selectByPrimaryKey(String psgId);

    int updateByPrimaryKeySelective(OrderPsg record);

    int updateByPrimaryKey(OrderPsg record);

    List<OrderPsg> selectByOrderIdAndName(@Param("orderId") String orderId,@Param("psgName")String psgName);

    List<OrderPsg> selectByOrderId(@Param("orderId") String orderId);

    int changeName(@Param("psgId")String psgId,@Param("oldName")String oldName,@Param("newName")String newName);

}