package com.vms.vms.DTOs;

import com.vms.vms.Models.Department;
import com.vms.vms.Models.Employee;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class DepartmentDTO {
    private Long id;
    private String name;
    private List<String> employeeNames;

    public DepartmentDTO(Department department) {
        this.id = department.getId();
        this.name = department.getName();
        this.employeeNames = department.getEmployees().stream().map(Employee::getName).collect(Collectors.toList());
    }
}
