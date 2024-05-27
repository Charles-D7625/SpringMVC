package com.example.project_test.buysell.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.project_test.buysell.models.Product;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();
    private long ID = 0;

    {
        products.add(new Product(++ID ,"Computer", "description", 10000, "Rostov", "Man"));
        products.add(new Product(++ID ,"Telephone", "description", 20000, "Rostov123", "WOmen"));
    }

    public List<Product> listProducts() {
        return products;
    }

    public void saveProduct(Product product) {
        System.out.println(product);
        product.setId(++ID);
        products.add(product);
    }

    public void deleteProduct(Long id) {
        products.removeIf(product -> product.getId() == id);
    }

    public Product getProductById(Long id) {
        for (Product product : products) {
            if (product.getId() == id) return product;
        }

        return null;
    }
}
