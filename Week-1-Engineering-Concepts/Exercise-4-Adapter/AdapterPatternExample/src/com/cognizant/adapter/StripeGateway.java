package com.cognizant.adapter;

public class StripeGateway {

    public void charge(double amount) {
        System.out.println("Payment of $" + amount + " processed using Stripe.");
    }
}