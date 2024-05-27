package com.example.project_test.buysell.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // самостоятельно объявляет геттеры и сеттеры, переопределяет toString, создает конструкторы
@AllArgsConstructor
public class Product {
    private Long id;
    private String title;
    private String description;
    private Integer price;
    private String city;
    private String author;

}
