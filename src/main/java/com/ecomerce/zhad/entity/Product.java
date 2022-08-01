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
