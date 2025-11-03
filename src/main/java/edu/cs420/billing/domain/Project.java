package edu.cs420.billing.domain;

import java.time.LocalDateTime;
import edu.cs420.billing.domain.*;


public class Project {
    private int id;
    private String name;
    private Client client;

    public Project(int id, String name, Client client) {
        this.id = id;
        this.name = name;
        this.client = client;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public Client getClient() { return client; }

    @Override
    public String toString() {
        return String.format("%s (Client: %s)", name, client.getName());
    }
}
