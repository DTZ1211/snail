package com.oyt.dao;

import com.oyt.entity.Invoice;
import java.util.List;

public interface InvoiceMapper {
    int deleteByPrimaryKey(Integer i_id);

    int insert(Invoice record);

    Invoice selectByPrimaryKey(Integer i_id);

    List<Invoice> selectAll();

    int updateByPrimaryKey(Invoice record);
}