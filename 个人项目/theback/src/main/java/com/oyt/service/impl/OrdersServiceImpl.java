package com.oyt.service.impl;

import com.oyt.dao.OrdersMapper;
import com.oyt.entity.Orders;
import com.oyt.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public int deleteByPrimaryKey(Integer o_id) {
        return ordersMapper.deleteByPrimaryKey(o_id);
    }

    @Override
    public int insert(Orders record) {
        return 0;
    }

    @Override
    public Orders selectByPrimaryKey(Integer o_id) {
        return null;
    }

    @Override
    public List<Orders> selectAll() {
        return ordersMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Orders record) {
        return 0;
    }
}
