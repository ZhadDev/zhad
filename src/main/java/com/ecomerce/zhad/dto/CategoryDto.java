package com.ecomerce.zhad.dto;

import lombok.Getter;
import lombok.Setter;

/*
 *  CategoryDto  Clase encargada de enmascarar los productos
 *  @author John Jairo Arteaga Sanchez
 *  @fecha 31/07/2022
 *  Derechos reservados por Zhad
 * 
 * MODIFICACIONES A LA CLASE
 * @fecha
 * @author
 * @cambios
 */

@Getter
@Setter

public class CategoryDto {
    private int Id;
    private String Name;
    private boolean State;
}
