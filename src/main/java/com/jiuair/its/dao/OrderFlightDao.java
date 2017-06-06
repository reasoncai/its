package com.jiuair.its.dao;

import com.jiuair.its.domain.OrderFlightEntity;

public interface OrderFlightDao {
    int deleteByPrimaryKey(String seqNo);

    int insert(OrderFlightEntity record);

    int insertSelective(OrderFlightEntity record);

    OrderFlightEntity selectByPrimaryKey(String seqNo);

    int updateByPrimaryKeySelective(OrderFlightEntity record);

    int updateByPrimaryKey(OrderFlightEntity record);
}