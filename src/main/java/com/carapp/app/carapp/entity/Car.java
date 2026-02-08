package com.carapp.app.carapp.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "cars") // Table name explicitly added
public class Car {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // Changed to lowercase to make JPA convention

    @NotBlank(message= "Brand is required")
    private String brand;

    @NotBlank(message = "model is required")
    private String model;

    @Min(1900)
    private Integer modelYear; //Year is reserved in h2

    @NotBlank(message = "regnumber is required")
    private String regNumber;


    @Min(0)
    private Integer price;

    public Car(){

    }

    public Car(String brand, String model, Integer modelYear ,String regNumber, Integer price) {
        this.brand = brand;
        this.model = model;
        this.modelYear = modelYear;
        this.regNumber = regNumber;
        this.price = price;

    }

    public Long getId() {
        return id;
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

    public Integer getYear() {
        return modelYear;
    }

    public void setYear(Integer year) {
        this.modelYear = year;
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
