package com.github.youssfbr.meta.services;

import com.github.youssfbr.meta.entities.Sale;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ISaleService {

    Page<Sale> findSales(String minDate, String maxDate, Pageable pageable);

}
