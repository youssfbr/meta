package com.github.youssfbr.meta.controllers;

import com.github.youssfbr.meta.entities.Sale;
import com.github.youssfbr.meta.services.ISaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/sales")
public class SaleController {

    @Autowired
    private ISaleService saleService;

    @GetMapping
    public List<Sale> findAll() {
        return saleService.findSales();
    }
}
