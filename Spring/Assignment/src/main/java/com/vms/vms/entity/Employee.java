package com.vms.vms.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double salary;
    private String designation;

    @ManyToOne(fetch = FetchType.LAZY) // Assuming a many-to-one relationship
    @JoinColumn(name = "department_id") // This should match the column name in your database
    private Department department;

    private String address;
    @ElementCollection
    private List<Long> projects;
}
