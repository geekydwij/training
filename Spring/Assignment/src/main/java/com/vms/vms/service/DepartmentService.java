package com.vms.vms.service;

import com.vms.vms.entity.Department;
import com.vms.vms.repository.DepartmentRepository;
import com.vms.vms.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    public Department getDepartmentById(Long id) {
        return departmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Department not found"));
    }

    public Department updateDepartment(Long id, Department department) {
        if (!departmentRepository.existsById(id)) {
            throw new RuntimeException("Department not found");
        }
        department.setId(id);
        return departmentRepository.save(department);
    }

    public Department getDepartmentWithEmployees(Long id) {
        Department department = getDepartmentById(id);
        department.setEmployees(employeeRepository.findByDepartmentId(id));
        return department;
    }

    public void deleteDepartment(Long id) {
        Department department = getDepartmentById(id);
        if (!department.getEmployees().isEmpty()) {
            throw new RuntimeException("Cannot delete department with associated employees");
        }
        departmentRepository.deleteById(id);
    }
}
