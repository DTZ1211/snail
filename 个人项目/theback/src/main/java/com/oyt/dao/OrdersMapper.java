package com.oyt.dao;

import com.oyt.entity.Orders;
import java.util.List;

public interface OrdersMapper {
    int deleteByPrimaryKey(Integer o_id);

    int insert(Orders record);

    Orders selectByPrimaryKey(Integer o_id);

    List<Orders> selectAll();

    int updateByPrimaryKey(Orders record);
}