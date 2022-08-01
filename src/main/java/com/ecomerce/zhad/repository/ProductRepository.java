package com.ecomerce.zhad.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecomerce.zhad.entity.Product;

@Repository
@Transactional
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
