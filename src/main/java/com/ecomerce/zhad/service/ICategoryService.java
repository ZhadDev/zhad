package com.ecomerce.zhad.service;

import java.util.List;

import com.ecomerce.zhad.dto.CategoryDto;

public interface ICategoryService {
    CategoryDto createUpdateCategory(CategoryDto categoryDto);

    CategoryDto searchCategory(Integer Id);

    List<CategoryDto> listCategory();

    void deleteCategory(Integer Id);
}
