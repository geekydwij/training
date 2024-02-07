package com.vms.vms.Models;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double salary;
    private String designation;
    private String address;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id",referencedColumnName = "id")
    private Department department;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "project_employee",
            joinColumns = @JoinColumn(name = "project_id"),
            inverseJoinColumns = @JoinColumn(name = "employee_id")
    )
    private List<Project> projects=new ArrayList<>();

}
