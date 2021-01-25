package com.zah.ecommerce.dao;

import com.zah.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {  // <Entity, PK>

}
