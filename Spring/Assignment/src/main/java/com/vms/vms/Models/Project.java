package com.vms.vms.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "Project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @JsonIgnore
    @ManyToMany(mappedBy = "projects")
    private List<Employee> team=new ArrayList<>();

    @Enumerated(EnumType.STRING)
    private Status status;

    private LocalDate startDate;
    private LocalDate endDate;
}



