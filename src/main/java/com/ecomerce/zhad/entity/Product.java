package com.ecomerce.zhad.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

/*
 *  Product Clase que define la entidad encargada de gestionar los productos
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
@Entity
@Table(name = "TBL_Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column
    private String Name;
    @Column
    private String Icon;
    @Column
    private int IdCategory;
    @Column
    private Double Price;
    @Column
    private Double Amount;
    @Column
    private Date ProductRegister;
}
