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

/*
 *  ProductServiceImpl Clase  encargada de implementar
 *  los servicios de la entidad de Productos
 *  @author John Jairo Arteaga Sanchez
 *  @fecha 31/07/2022
 *  Derechos reservados por Zhad
 * 
 * MODIFICACIONES A LA CLASE
 * @fecha
 * @author
 * @cambios
 */

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductMapper productMapper;

    /*
     * @name createUpdateProduct
     * 
     * @description metodo encargado de crear y actualizar un producto
     * 
     * @param{entidadDto} se le ingresa el dto de producto
     * 
     * @return regresar el dto creado
     */
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

    /*
     * @name searchProduct
     * 
     * @description metodo encargado de buscar un proudcto
     * 
     * @param{id} se le ingresa el id del producto
     * 
     * @return regresar el dto buscado
     */
    @Override
    public ProductDto searchProduct(Integer Id) {
        ProductDto productDto = new ProductDto();
        if (productRepository.findById(Id).isPresent()) {
            productDto = productMapper.modelToDto(productRepository.findById(Id).get());
        }

        return productDto;
    }

    /*
     * @name listProduct
     * 
     * @description metodo encargado de listar los productos
     * 
     * @param{} no recibe parametro
     * 
     * @return regresa una lista de dtos de la entidad de productos
     */
    @Override
    public List<ProductDto> listProduct() {
        List<ProductDto> productDtos = new ArrayList<>();
        List<Product> products = (List<Product>) productRepository.findAll();
        productDtos = productMapper.modelToDtos(products);

        return productDtos;
    }

    /*
     * @name deleteProduct
     * 
     * @description metodo encargado de eliminar un producto
     * 
     * @param{id} id del producto a eliminar
     */
    @Override
    public void deleteProduct(Integer Id) {
        productRepository.deleteById(Id);
    }

    /*
     * @name listProductIdCategory
     * 
     * @description metodo encargado de listar los productos de una categoria
     * 
     * @param{id} id de la categoria
     * 
     * @return regresa una lista de dtos de productos con el id de la categoria
     * selecionada
     */
    @Override
    public List<ProductDto> listProductIdCategory(Integer Id) {
        List<ProductDto> productDtos = new ArrayList<>();
        List<Product> products = (List<Product>) productRepository.findAll();
        productDtos = productMapper.modelToDtos(products);

        return productDtos;
    }

    /*
     * @name deleteProductById
     * 
     * @description metodo encargado de eliminar un producto
     * 
     * @param{id} id del producto a eliminar
     * 
     * @return regresa una lista de los dtos de productos
     */
    @Override
    public List<ProductDto> deleteProductById(Integer Id) {
        productRepository.deleteById(Id);
        List<ProductDto> productDtos = new ArrayList<>();
        List<Product> products = (List<Product>) productRepository.findAll();
        productDtos = productMapper.modelToDtos(products);

        return productDtos;
    }

    /*
     * @name createReturnAll
     * 
     * @description metodo encargado de crear y actualizar un producto
     * 
     * @param{entidadDto} se le ingresa el dto de producto
     * 
     * @return regresa una lista de los dtos de productos incluido
     * el dto recien creado
     */
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
