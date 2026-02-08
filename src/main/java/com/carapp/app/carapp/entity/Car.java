package com.carapp.app.carapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Car {

    // generated value
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private String brand;
    private String model;
    private String regNumber;
    private Integer price;

    public Car(){

    }

    public Car(String brand, String model, String regNumber, Integer price) {
        this.brand = brand;
        this.model = model;
        this.regNumber = regNumber;
        this.price = price;
    }

    public Long getId() {
        return Id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
