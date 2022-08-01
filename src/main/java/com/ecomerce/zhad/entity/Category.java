package com.ecomerce.zhad.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/*
 *  Category Clase que define la entidad encargada de gestionar las categorias
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
@Table(name = "TBL_Category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name = "Name")
    private String Name;
    @Column(name = "State")
    private boolean State;
}
