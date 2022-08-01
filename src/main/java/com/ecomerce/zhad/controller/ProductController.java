package com.ecomerce.zhad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecomerce.zhad.dto.ProductDto;
import com.ecomerce.zhad.dto.ResponseApiDto;
import com.ecomerce.zhad.service.IProductService;

@RestController
@RequestMapping("api/v1/product")
public class ProductController {
    private ResponseApiDto responseApiDto;

    public ProductController() {
        responseApiDto = new ResponseApiDto();
        responseApiDto.setCodeName("Proceso realizado correctamente");
    }

    @Autowired
    IProductService productService;

    // http://localhost:80/api/v1/product/allProduct
    @GetMapping(path = "allProduct")
    public ResponseEntity<ResponseApiDto> allProduct() {
        responseApiDto.setCodeResponse(HttpStatus.OK.value());
        responseApiDto.setData(productService.listProduct());

        return new ResponseEntity<ResponseApiDto>(responseApiDto, HttpStatus.OK);
    }

    @GetMapping(path = "productId/{id}")
    public ResponseEntity<ResponseApiDto> productId(@PathVariable("id") Integer id) {
        responseApiDto.setCodeResponse(HttpStatus.OK.value());
        responseApiDto.setData(productService.searchProduct(id));

        return new ResponseEntity<ResponseApiDto>(responseApiDto, HttpStatus.OK);
    }

    @PostMapping(path = "saveProduct")
    public ResponseEntity<ResponseApiDto> saveProduct(@RequestBody ProductDto productDto) {
        responseApiDto.setCodeResponse(HttpStatus.CREATED.value());
        responseApiDto.setData(productService.createUpdateProduct(productDto));

        return new ResponseEntity<ResponseApiDto>(responseApiDto, HttpStatus.OK);
    }

    @DeleteMapping(path = "deleteProduct/{id}")
    public ResponseEntity<ResponseApiDto> deleteProduct(@PathVariable("id") Integer id) {
        responseApiDto.setCodeResponse(HttpStatus.CREATED.value());
        productService.deleteProduct(id);
        responseApiDto.setData(null);

        return new ResponseEntity<ResponseApiDto>(responseApiDto, HttpStatus.OK);
    }

    @DeleteMapping(path = "delete/{id}")
    public ResponseEntity<ResponseApiDto> delete(@PathVariable("id") Integer id) {

        responseApiDto.setCodeResponse(HttpStatus.CREATED.value());
        productService.deleteProductById(id);
        responseApiDto.setData(productService.listProduct());

        return new ResponseEntity<ResponseApiDto>(responseApiDto, HttpStatus.OK);
    }

    @PostMapping(path = "save")
    public ResponseEntity<ResponseApiDto> save(@RequestBody ProductDto productDto) {
        responseApiDto.setCodeResponse(HttpStatus.CREATED.value());
        productService.createReturnAll(productDto);
        responseApiDto.setData(productService.listProduct());

        return new ResponseEntity<ResponseApiDto>(responseApiDto, HttpStatus.OK);
    }
}
