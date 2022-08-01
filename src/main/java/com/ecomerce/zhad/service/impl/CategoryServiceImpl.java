package com.ecomerce.zhad.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomerce.zhad.dto.CategoryDto;
import com.ecomerce.zhad.dto.mapper.CategoryMapper;
import com.ecomerce.zhad.entity.Category;
import com.ecomerce.zhad.repository.CategoryRepository;
import com.ecomerce.zhad.service.ICategoryService;

@Service
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public CategoryDto createUpdateCategory(CategoryDto categoryDto) {
        if (categoryDto.getId() == 0) {
            Category category = new Category();
            category = categoryMapper.dtoToModel(categoryDto);
            category = categoryRepository.save(category);
            categoryDto = categoryMapper.modelToDto(category);
        } else {
            Category category = categoryRepository.findById(categoryDto.getId()).get();
            category = categoryMapper.dtoToModel(categoryDto);
            category = categoryRepository.save(category);
            categoryDto = categoryMapper.modelToDto(category);
        }
        return categoryDto;
    }

    @Override
    public CategoryDto searchCategory(Integer Id) {
        CategoryDto categoryDto = new CategoryDto();
        if (categoryRepository.findById(Id).isPresent()) {
            categoryDto = categoryMapper.modelToDto(categoryRepository.findById(Id).get());
        }

        return categoryDto;
    }

    @Override
    public List<CategoryDto> listCategory() {
        List<CategoryDto> categoryDtos = new ArrayList<>();
        List<Category> categories = (List<Category>) categoryRepository.findAll();
        categoryDtos = categoryMapper.modelToDtos(categories);

        return categoryDtos;
    }

    @Override
    public void deleteCategory(Integer Id) {
        categoryRepository.deleteById(Id);
    }
}
