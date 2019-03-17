package com.oyt.dao;

import com.oyt.entity.House;
import java.util.List;

public interface HouseMapper {
    int deleteByPrimaryKey(Integer h_id);

    int insert(House record);

    House selectByPrimaryKey(Integer h_id);

    List<House> selectAll();

    int updateByPrimaryKey(House record);

    List<House> selectBymsg(String msg);

    List<House> selectPagenum(int page);
}