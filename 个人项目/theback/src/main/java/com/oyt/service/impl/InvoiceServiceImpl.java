package com.oyt.service.impl;

import com.oyt.dao.InvoiceMapper;
import com.oyt.entity.Invoice;
import com.oyt.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Autowired
    private InvoiceMapper invoiceMapper;

    @Override
    public int deleteByPrimaryKey(Integer i_id) {
        return invoiceMapper.deleteByPrimaryKey(i_id);
    }

    @Override
    public int insert(Invoice record) {
        return 0;
    }

    @Override
    public Invoice selectByPrimaryKey(Integer i_id) {
        return null;
    }

    @Override
    public List<Invoice> selectAll() {
        return invoiceMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Invoice record) {
        return 0;
    }
}
