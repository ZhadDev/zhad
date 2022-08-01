package com.ecomerce.zhad.service;

import java.util.List;

import com.ecomerce.zhad.dto.ProductDto;

/*
 *  IProductService Interfaz encargada de gestionar
 *  los servicios de los Productos
 *  @author John Jairo Arteaga Sanchez
 *  @fecha 31/07/2022
 *  Derechos reservados por Zhad
 * 
 * MODIFICACIONES A LA CLASE
 * @fecha
 * @author
 * @cambios
 */

public interface IProductService {
    ProductDto createUpdateProduct(ProductDto productDto);

    ProductDto searchProduct(Integer Id);

    List<ProductDto> listProduct();

    List<ProductDto> listProductIdCategory(Integer Id);

    void deleteProduct(Integer Id);

    List<ProductDto> deleteProductById(Integer Id);

    List<ProductDto> createReturnAll(ProductDto productDto);

}
