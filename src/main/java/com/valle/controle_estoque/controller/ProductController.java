package com.valle.controle_estoque.controller;

import com.valle.controle_estoque.model.Product;
import com.valle.controle_estoque.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAll() {
        List<Product> products = productService.getAll();
        System.out.println(products);

        return products;
    }

}
