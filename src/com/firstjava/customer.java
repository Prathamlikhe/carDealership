package com.firstjava;

public class customer {

    private String name;
    private String address;
    public double cashOnHand;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress() {
        address+="Dealership city";
        this.address = address;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }

    public void setCashOnHand(double cashOnHand) {
        cashOnHand +=500;
        this.cashOnHand = cashOnHand;
    }

    public void purchaseCar(Vehicle vehicle, Employee worker, boolean finance){
        worker.handleCustomer(this, finance, vehicle);

    }
}
