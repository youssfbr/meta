package com.github.youssfbr.meta.services;

import com.github.youssfbr.meta.entities.Sale;
import com.github.youssfbr.meta.repositories.ISaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SaleService implements ISaleService {

    @Autowired
    private ISaleRepository saleRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Sale> findSales() {
        return saleRepository.findAll();
    }

}
