package com.ecomerce.zhad.dto.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapper;

import com.ecomerce.zhad.dto.ProductDto;
import com.ecomerce.zhad.entity.Product;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductMapper MAPPER = Mappers.getMapper(ProductMapper.class);

    ProductDto modelToDto(Product product);

    @InheritInverseConfiguration
    Product dtoToModel(ProductDto ProductDto);

    List<ProductDto> modelToDtos(List<Product> product);
}
