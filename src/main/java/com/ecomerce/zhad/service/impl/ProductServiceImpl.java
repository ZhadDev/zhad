package com.ecomerce.zhad.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomerce.zhad.dto.ProductDto;
import com.ecomerce.zhad.dto.mapper.ProductMapper;
import com.ecomerce.zhad.entity.Product;
import com.ecomerce.zhad.repository.ProductRepository;
import com.ecomerce.zhad.service.IProductService;
// import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductMapper productMapper;

    @Override
    public ProductDto createUpdateProduct(ProductDto productDto) {
        if (productDto.getId() == 0) {
            Product product = new Product();
            product = productMapper.dtoToModel(productDto);
            product = productRepository.save(product);
            productDto = productMapper.modelToDto(product);
        } else {
            Product product = productRepository.findById(productDto.getId()).get();
            product = productMapper.dtoToModel(productDto);
            product = productRepository.save(product);
            productDto = productMapper.modelToDto(product);
        }
        return productDto;
    }

    @Override
    public ProductDto searchProduct(Integer Id) {
        ProductDto productDto = new ProductDto();
        if (productRepository.findById(Id).isPresent()) {
            productDto = productMapper.modelToDto(productRepository.findById(Id).get());
        }

        return productDto;
    }

    @Override
    public List<ProductDto> listProduct() {
        List<ProductDto> productDtos = new ArrayList<>();
        List<Product> products = (List<Product>) productRepository.findAll();
        productDtos = productMapper.modelToDtos(products);

        return productDtos;
    }

    @Override
    public void deleteProduct(Integer Id) {
        productRepository.deleteById(Id);
    }

    @Override
    public List<ProductDto> listProductIdCategory(Integer Id) {
        List<ProductDto> productDtos = new ArrayList<>();
        List<Product> products = (List<Product>) productRepository.findAll();
        productDtos = productMapper.modelToDtos(products);

        return productDtos;
    }

    @Override
    public List<ProductDto> deleteProductById(Integer Id) {
        productRepository.deleteById(Id);
        List<ProductDto> productDtos = new ArrayList<>();
        List<Product> products = (List<Product>) productRepository.findAll();
        productDtos = productMapper.modelToDtos(products);

        return productDtos;
    }

    @Override
    public List<ProductDto> createReturnAll(ProductDto productDto) {
        if (productDto.getId() == 0) {
            Product product = new Product();
            product = productMapper.dtoToModel(productDto);
            product = productRepository.save(product);
            productDto = productMapper.modelToDto(product);
        } else {
            Product product = productRepository.findById(productDto.getId()).get();
            product = productMapper.dtoToModel(productDto);
            product = productRepository.save(product);
            productDto = productMapper.modelToDto(product);
        }

        List<ProductDto> productDtos = new ArrayList<>();
        List<Product> products = (List<Product>) productRepository.findAll();
        productDtos = productMapper.modelToDtos(products);

        return productDtos;
    }

}
