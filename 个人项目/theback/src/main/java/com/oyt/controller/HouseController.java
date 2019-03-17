package com.oyt.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.oyt.dao.HouseMapper;
import com.oyt.entity.House;
import com.oyt.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/house")
public class HouseController {

    @Autowired
    private HouseService houseService;


    @RequestMapping(method = RequestMethod.GET)
    public List<House> listall(){
        return houseService.selectAll();
    }

    /*
    *  对查询的结果进行分页
    */
    @RequestMapping("/listpage")
    public List<House> listpage(){
        PageHelper.startPage(1, 6);
        List<House> houses = houseService.selectAll();
        PageInfo info = new PageInfo(houses);
        info.getPages();
        return houses;
    }

    @RequestMapping("/changePage")
    public List<House> changePage(int page){
        return houseService.selectPagenum(page);
    }

    @RequestMapping("/search")
    public List<House> search(String msg){
        return houseService.selectBymsg(msg);
    }

    @RequestMapping(path = "/delhouse", method = RequestMethod.DELETE)
    public int delHouse(int id){
        return houseService.deleteByPrimaryKey(id);
    }

}
