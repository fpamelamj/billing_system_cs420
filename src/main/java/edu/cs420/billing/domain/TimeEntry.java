package edu.cs420.billing.domain;

import java.time.LocalDateTime;
import edu.cs420.billing.domain.*;

public class TimeEntry {
    private User user;
    private Project project;
    private double hours;
    private String notes;
    private LocalDateTime timestamp;

    public TimeEntry(User user, Project project, double hours, String notes) {
        this.user = user;
        this.project = project;
        this.hours = hours;
        this.notes = notes;
        this.timestamp = LocalDateTime.now();
    }

    public double getBillableValue() {
        return hours * user.getHourlyRate();
    }

    @Override
    public String toString() {
        return String.format("%s worked %.2f hrs on %s (%s) - $%.2f",
                user.getName(), hours, project.getName(), notes, getBillableValue());
    }
}
