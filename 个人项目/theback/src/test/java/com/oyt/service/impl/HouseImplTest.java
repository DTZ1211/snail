package com.oyt.service.impl;

import com.oyt.dao.HouseMapper;
import com.oyt.entity.House;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:jdbc.properties")
public class HouseImplTest {

    @Autowired
    private HouseMapper houseMapper;

    @Test
    public void selectBymsg() {
        List<House> houses = houseMapper.selectBymsg("前山");
        System.out.println(houses);
    }
}