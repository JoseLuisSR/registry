package com.domain.product.entity;

public class Product {

    private String id;

    private String name;

    private String description;

    private Double value;

    public Product(String id, String name, String description, Double value){
        this.id = id;
        this.name = name;
        this.description = description;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getValue() {
        return value;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
