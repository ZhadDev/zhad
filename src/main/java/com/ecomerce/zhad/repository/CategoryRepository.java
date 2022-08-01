package com.ecomerce.zhad.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecomerce.zhad.entity.Category;

/*
 *  CategoryRepository Interfaz encargada de gestionar los CRUD
 *  de la entidad categorias
 *  @author John Jairo Arteaga Sanchez
 *  @fecha 31/07/2022
 *  Derechos reservados por Zhad
 * 
 * MODIFICACIONES A LA CLASE
 * @fecha
 * @author
 * @cambios
 */

@Repository
@Transactional
public interface CategoryRepository extends CrudRepository<Category, Integer> {
}
