package com.firstjava;

public class Employee {
    public void handleCustomer(customer cust, boolean finance, Vehicle vehicle){
        if(finance==true){
            double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
            runCreditHistory(cust, loanAmount);

        }else if(vehicle.getPrice() <= cust.getCashOnHand()){
            processTransaction(cust, vehicle);

        }else {
            System.out.println("Insufficient money to buy "+ vehicle);
        }

    }

    public void runCreditHistory(customer cust, double loanAmount){
        System.out.println("Ran credit history for the customer");
        System.out.println("Customer has been approved to purchase the vehicle");
    }

    public void processTransaction(customer cust, Vehicle vehicle){
        System.out.println("Customer has purchased the " + vehicle  + " for price "+ vehicle.getPrice());
    }
}
