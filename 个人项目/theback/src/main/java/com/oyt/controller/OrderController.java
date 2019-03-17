package com.oyt.controller;

import com.oyt.dao.OrdersMapper;
import com.oyt.entity.Orders;
import com.oyt.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrdersService ordersService;

    @GetMapping
    public List<Orders> listOrder(){
        return ordersService.selectAll();
    }

    @RequestMapping(path = "/delorder", method = RequestMethod.DELETE)
    public int delOrder(int id){
        return ordersService.deleteByPrimaryKey(id);
    }

}
