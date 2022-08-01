package com.ecomerce.zhad.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecomerce.zhad.entity.Category;

@Repository
@Transactional
public interface CategoryRepository extends CrudRepository<Category, Integer> {
}
