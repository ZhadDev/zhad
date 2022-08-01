package com.ecomerce.zhad.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/*
 *  ProductDto  Clase  encargada de enmascarar las categorias
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

public class ProductDto {
    private int Id;
    private String Name;
    private String Icon;
    private int IdCategory;
    private Double Price;
    private Double Amount;
    private Date ProductRegister;
}
