package com.example.project_test.buysell.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project_test.buysell.models.Product;
import java.util.List;


public interface ProductRepository extends JpaRepository<Product, Long>{

    List<Product> findByTitle(String title);
}
