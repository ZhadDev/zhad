package com.ecomerce.zhad.dto.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapper;

import com.ecomerce.zhad.dto.ProductDto;
import com.ecomerce.zhad.entity.Product;

/*
 *  ProductMapper Interfaz encargada de mapear la entidad de Productos 
 *  @author John Jairo Arteaga Sanchez
 *  @fecha 31/07/2022
 *  Derechos reservados por Zhad
 * 
 * MODIFICACIONES A LA CLASE
 * @fecha
 * @author
 * @cambios
 */

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductMapper MAPPER = Mappers.getMapper(ProductMapper.class);

    ProductDto modelToDto(Product product);

    @InheritInverseConfiguration
    Product dtoToModel(ProductDto ProductDto);

    List<ProductDto> modelToDtos(List<Product> product);
}
