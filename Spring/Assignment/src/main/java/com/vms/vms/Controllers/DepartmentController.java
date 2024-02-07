package com.vms.vms.Controllers;

import com.vms.vms.API.APIResponse;
import com.vms.vms.DTOs.DepartmentDTO;
import com.vms.vms.Models.Department;
import com.vms.vms.Services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/create")
    public APIResponse<Department> createDepartment(@RequestBody Department department) {
        return departmentService.createDepartment(department);
    }

    @GetMapping("/getall")
    public APIResponse<List<Department>> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @GetMapping("/getallwithemployees")
    public APIResponse<List<DepartmentDTO>> getAllDepartmentsWithEmployees() {
        return departmentService.getAllDepartmentsWithEmployees();
    }

    @GetMapping("/total-salary")
    public APIResponse<Map<String, Double>> getTotalSalaryByDepartment() {
        return departmentService.getTotalSalaryByDepartment();
    }

    @PutMapping("/update/{departmentId}")
    public APIResponse<Department> updateDepartment(@PathVariable Long departmentId, @RequestBody Department updatedDepartmentData) {
        return departmentService.updateDepartment(departmentId,updatedDepartmentData);
    }

    @DeleteMapping("/delete/{departmentId}")
    public APIResponse<String> deleteDepartment(@PathVariable Long departmentId) {
        return departmentService.deleteDepartment(departmentId);
    }
}
