package com.ecomerce.zhad.dto.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapper;

import com.ecomerce.zhad.dto.CategoryDto;
import com.ecomerce.zhad.entity.Category;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryMapper MAPPER = Mappers.getMapper(CategoryMapper.class);

    CategoryDto modelToDto(Category category);

    @InheritInverseConfiguration
    Category dtoToModel(CategoryDto categoryDto);

    List<CategoryDto> modelToDtos(List<Category> category);
}
