package com.ecomerce.zhad.service;

import java.util.List;

import com.ecomerce.zhad.dto.CategoryDto;

/*
 *  ICategoryService Interfaz encargada de gestionar
 *  los servicios de las Categorias
 *  @author John Jairo Arteaga Sanchez
 *  @fecha 31/07/2022
 *  Derechos reservados por Zhad
 * 
 * MODIFICACIONES A LA CLASE
 * @fecha
 * @author
 * @cambios
 */

public interface ICategoryService {
    CategoryDto createUpdateCategory(CategoryDto categoryDto);

    CategoryDto searchCategory(Integer Id);

    List<CategoryDto> listCategory();

    void deleteCategory(Integer Id);
}
