package com.oyt.dao;

import com.oyt.entity.Collection;
import java.util.List;

public interface CollectionMapper {
    int deleteByPrimaryKey(Integer co_id);

    int insert(Collection record);

    Collection selectByPrimaryKey(Integer co_id);

    List<Collection> selectAll();

    int updateByPrimaryKey(Collection record);
}