package edu.cs420.billing.domain;

public class User {
    private int id;
    private String name;
    private String role;
    private double hourlyRate;

    public User(int id, String name, String role, double hourlyRate) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.hourlyRate = hourlyRate;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getRole() { return role; }
    public double getHourlyRate() { return hourlyRate; }

    public void setRole(String role) { this.role = role; }
    public void setHourlyRate(double hourlyRate) { this.hourlyRate = hourlyRate; }

    @Override
    public String toString() {
        return String.format("%s (Role: %s, Rate: $%.2f)", name, role, hourlyRate);
    }
}
