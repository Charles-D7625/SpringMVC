package com.example.project_test.buysell.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.project_test.buysell.models.Product;
import com.example.project_test.buysell.services.ProductService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("")
    public String products(Model model){

        model.addAttribute("products", productService.listProducts());
        return "buysell/products";
    }

    @GetMapping("/{id}")
    public String productInfo(@PathVariable Long id, Model model) {

        model.addAttribute("product", productService.getProductById(id));
        return "buysell/product-info";
    }

    @PostMapping("/create")
    public String createProduct(Product product) {
        productService.saveProduct(product);
        return "redirect:/products";
    }

    @PostMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {

        productService.deleteProduct(id);
        return "redirect:/products";
    }
}
