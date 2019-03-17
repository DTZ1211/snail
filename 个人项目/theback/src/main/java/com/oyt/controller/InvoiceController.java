package com.oyt.controller;

import com.oyt.dao.InvoiceMapper;
import com.oyt.entity.Invoice;
import com.oyt.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/invoice")
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    @GetMapping
    public List<Invoice> listInvoice(){
        return invoiceService.selectAll();
    }

    @RequestMapping(path = "/delinvoice", method = RequestMethod.DELETE)
    public int delInvoice(int id){
        return invoiceService.deleteByPrimaryKey(id);
    }

}
