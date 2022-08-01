package com.ecomerce.zhad.service;

import java.util.List;

import com.ecomerce.zhad.dto.ProductDto;

public interface IProductService {
    ProductDto createUpdateProduct(ProductDto productDto);

    ProductDto searchProduct(Integer Id);

    List<ProductDto> listProduct();

    List<ProductDto> listProductIdCategory(Integer Id);

    void deleteProduct(Integer Id);

    List<ProductDto> deleteProductById(Integer Id);

    List<ProductDto> createReturnAll(ProductDto productDto);

}
