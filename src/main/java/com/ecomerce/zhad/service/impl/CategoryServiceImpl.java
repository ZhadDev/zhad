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

/*
 *  CategoryServiceImpl Clase  encargada de implementar
 *  los servicios de la entidad de Categorias
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
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    CategoryMapper categoryMapper;

    /*
     * @name createUpdateCategory
     * 
     * @description metodo encargado de crear y actualizar una categoria
     * 
     * @param{entidadDto} se le ingresa el dto de categoria
     * 
     * @return regresar el dto creado
     */
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

    /*
     * @name searchCategory
     * 
     * @description metodo encargado de buscar una categoria
     * 
     * @param{id} se le ingresa el id de la categoria
     * 
     * @return regresar el dto buscado
     */
    @Override
    public CategoryDto searchCategory(Integer Id) {
        CategoryDto categoryDto = new CategoryDto();
        if (categoryRepository.findById(Id).isPresent()) {
            categoryDto = categoryMapper.modelToDto(categoryRepository.findById(Id).get());
        }

        return categoryDto;
    }

    /*
     * @name listCategory
     * 
     * @description metodo encargado de listar las categorias
     * 
     * @param{} no recibe parametro
     * 
     * @return regresa una lista de dtos de la entidad de categorias
     */
    @Override
    public List<CategoryDto> listCategory() {
        List<CategoryDto> categoryDtos = new ArrayList<>();
        List<Category> categories = (List<Category>) categoryRepository.findAll();
        categoryDtos = categoryMapper.modelToDtos(categories);

        return categoryDtos;
    }

    /*
     * @name deleteCategory
     * 
     * @description metodo encargado de eliminar una categoria
     * 
     * @param{id} id de la categoria a eliminar
     */
    @Override
    public void deleteCategory(Integer Id) {
        categoryRepository.deleteById(Id);
    }
}
