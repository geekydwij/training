package com.vms.vms.Controllers;

import com.vms.vms.API.APIResponse;
import com.vms.vms.DTOs.DepartmentDTO;
import com.vms.vms.Models.Department;
import com.vms.vms.Services.DepartmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/createDepartment")
    public APIResponse<Department> createDepartment(@RequestBody Department department) {
        return departmentService.createDepartment(department);
    }

    @GetMapping("/getDepartments")
    public APIResponse<List<Department>> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @GetMapping("/getDepartmentsWithEmployees")
    public APIResponse<List<DepartmentDTO>> getAllDepartmentsWithEmployees() {
        return departmentService.getAllDepartmentsWithEmployees();
    }

    @GetMapping("/getTotalSalaryByDepartment")
    public APIResponse<Map<String, Double>> getTotalSalaryByDepartment() {
        return departmentService.getTotalSalaryByDepartment();
    }

    @PutMapping("/updateDepartment/{departmentId}")
    public APIResponse<Department> updateDepartment(@PathVariable Long departmentId, @RequestBody Department updatedDepartmentData) {
        return departmentService.updateDepartment(departmentId,updatedDepartmentData);
    }

    @DeleteMapping("/deleteDepartment/{departmentId}")
    public APIResponse<String> deleteDepartment(@PathVariable Long departmentId) {
        return departmentService.deleteDepartment(departmentId);
    }
}
