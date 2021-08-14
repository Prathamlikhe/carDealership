package com.firstjava;

import java.util.Objects;

public class Vehicle {
    private String Brand;

    public Vehicle(String make, String model, double price) {
        this.Brand = make;
        this.model = model;
        this.price = price;
    }

    private String model;
    private double price;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return Double.compare(vehicle.getPrice(), getPrice()) == 0 && Brand.equals(vehicle.Brand) && getModel().equals(vehicle.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(Brand, getModel(), getPrice());
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + Brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public String getMake() {
        return Brand;
    }

    public void setMake(String make) {
        this.Brand = make;
    }
}
