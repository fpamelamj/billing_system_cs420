package edu.cs420.billing.domain;

public class Client {
    private int id;
    private String name;
    private String contactEmail;

    public Client(int id, String name, String contactEmail) {
        this.id = id;
        this.name = name;
        this.contactEmail = contactEmail;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getContactEmail() { return contactEmail; }

    @Override
    public String toString() {
        return String.format("%s (Email: %s)", name, contactEmail);
    }
}
