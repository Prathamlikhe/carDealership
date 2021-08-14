package com.firstjava;

public class Main {

    public static void main(String[] args) {
        customer person1 = new customer();
        person1.setName("Pratham");
        person1.setAddress();
        person1.setCashOnHand(15000);
        customer person2 = new customer();

        Vehicle vehicle  = new Vehicle("Ferrari","Roma",25000);

        Employee worker = new Employee();
        person1.purchaseCar(vehicle, worker,false);
        Vehicle  car = new Vehicle("Bmw","X5",100000);
        boolean value = car.equals(vehicle);
        System.out.println(value);
    }
}
