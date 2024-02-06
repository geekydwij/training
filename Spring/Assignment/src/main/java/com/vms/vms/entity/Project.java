package com.vms.vms.entity;

import java.util.List;

import static org.apache.tomcat.util.http.FastHttpDateFormat.getCurrentDate;

// Project Model
public class Project {
    private long id;
    private String name;
    private List<Employee> team;
    private Employee teamLead;
    private ProjectStatus status;
    private String startDate;
    private String endDate;

    public void determineStatus() {
        String currentDate = getCurrentDate();

        if (currentDate.compareTo(startDate) < 0) {
            status = ProjectStatus.NEW;
        } else if (currentDate.compareTo(startDate) >= 0 && currentDate.compareTo(endDate) <= 0) {
            status = ProjectStatus.ON_GOING;
        } else {
            status = ProjectStatus.ENDED;
        }
    }

}