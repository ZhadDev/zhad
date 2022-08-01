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

import com.ecomerce.zhad.dto.CategoryDto;
import com.ecomerce.zhad.dto.ResponseApiDto;
import com.ecomerce.zhad.service.ICategoryService;

@RestController
@RequestMapping("api/v1/category")
public class CategoryController {
    private ResponseApiDto responseApiDto;

    public CategoryController() {
        responseApiDto = new ResponseApiDto();
        responseApiDto.setCodeName("Proceso realizado correctamente");
    }

    @Autowired
    ICategoryService categoryService;

    // http://localhost:80/api/v1/category/allCategory
    @GetMapping(path = "allCategory")
    public ResponseEntity<ResponseApiDto> allCategory() {
        responseApiDto.setCodeResponse(HttpStatus.OK.value());
        responseApiDto.setData(categoryService.listCategory());

        return new ResponseEntity<ResponseApiDto>(responseApiDto, HttpStatus.OK);
    }

    @GetMapping(path = "categoryId/{id}")
    public ResponseEntity<ResponseApiDto> categoryId(@PathVariable("id") Integer id) {
        responseApiDto.setCodeResponse(HttpStatus.OK.value());
        responseApiDto.setData(categoryService.searchCategory(id));

        return new ResponseEntity<ResponseApiDto>(responseApiDto, HttpStatus.OK);
    }

    @PostMapping(path = "saveCategory")
    public ResponseEntity<ResponseApiDto> saveCategory(@RequestBody CategoryDto categoryDto) {
        responseApiDto.setCodeResponse(HttpStatus.CREATED.value());
        responseApiDto.setData(categoryService.createUpdateCategory(categoryDto));

        return new ResponseEntity<ResponseApiDto>(responseApiDto, HttpStatus.OK);
    }

    @DeleteMapping(path = "deleteCategory/{id}")
    public ResponseEntity<ResponseApiDto> deleteCategory(@PathVariable("id") Integer id) {
        responseApiDto.setCodeResponse(HttpStatus.CREATED.value());
        categoryService.deleteCategory(id);
        responseApiDto.setData(null);

        return new ResponseEntity<ResponseApiDto>(responseApiDto, HttpStatus.OK);
    }
}
