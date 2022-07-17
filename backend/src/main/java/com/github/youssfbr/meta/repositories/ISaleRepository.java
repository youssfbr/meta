package com.github.youssfbr.meta.repositories;

import com.github.youssfbr.meta.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISaleRepository extends JpaRepository<Sale, Long> {
}
