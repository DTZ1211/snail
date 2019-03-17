package com.oyt.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.oyt.dao.HouseMapper;
import com.oyt.entity.House;
import com.oyt.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseServiceImpl implements HouseService {

    @Autowired
    private HouseMapper houseMapper;

    @Override
    public int deleteByPrimaryKey(Integer h_id) {
        return houseMapper.deleteByPrimaryKey(h_id);
    }

    @Override
    public int insert(House record) {
        return 0;
    }

    @Override
    public House selectByPrimaryKey(Integer h_id) {
        return null;
    }

    @Override
    public List<House> selectAll() {
        List<House> houses = houseMapper.selectAll();
        return houses;
    }

    @Override
    public int updateByPrimaryKey(House record) {
        return 0;
    }

    @Override
    public List<House> selectBymsg(String msg) {
        return houseMapper.selectBymsg(msg);
    }

    @Override
    public List<House> selectPagenum(int page) {
        PageHelper.startPage(page, 6);
        List<House> houses = houseMapper.selectAll();
        return houses;
    }
}
