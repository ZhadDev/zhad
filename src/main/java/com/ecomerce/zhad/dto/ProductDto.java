package com.ecomerce.zhad.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

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
