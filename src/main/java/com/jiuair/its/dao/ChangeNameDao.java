package com.jiuair.its.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * Created by reason on 17/5/8.
 */
public interface ChangeNameDao {
    @Select("select * from order_psg where 1=1 and psg_id = #{order_id}")
    List<Map<Object,Object>> getOrderPsg(@Param("order_id") String orderId);
}
