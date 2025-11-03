package edu.cs420.billing.domain;

public class RateCard {
    private String role;
    private double rate;

    public RateCard(String role, double rate) {
        this.role = role;
        this.rate = rate;
    }

    public String getRole() { return role; }
    public double getRate() { return rate; }

    @Override
    public String toString() {
        return String.format("Role: %s | Rate: $%.2f/hr", role, rate);
    }
}
