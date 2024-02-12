package com.vms.vms.Controllers;

import com.vms.vms.API.APIResponse;
import com.vms.vms.Models.Department;
import com.vms.vms.Models.Employee;
import com.vms.vms.Services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/createEmployee")
    public APIResponse<Employee> createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @PutMapping("/assignDepartmentByEmployeeId/{emp_id}/{dep_id}")
    public APIResponse<Employee> assignDepToEmployee(@PathVariable Long emp_id, @PathVariable Long dep_id) {
        return employeeService.assignDepToEmployee(emp_id, dep_id);
    }

    @PutMapping("/assignProjectByEmployeeId/{emp_id}/{project_id}")
    public APIResponse<Employee> assignProjectToEmployee(@PathVariable Long emp_id, @PathVariable Long project_id) {
        return employeeService.assignProjectToEmployee(emp_id, project_id);
    }

    @PutMapping("/updateEmployeeById/{employeeId}")
    public APIResponse<Employee> updateEmployee(@PathVariable Long employeeId, @RequestBody Employee updatedEmployeeData) {
        return employeeService.updateEmployee(employeeId,updatedEmployeeData);
    }

    @GetMapping("/getAllEmployee")
    public APIResponse<List<Employee>> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/getEmployeeById/{emp_id}")
    public APIResponse<Employee> getAnEmployee(@PathVariable Long emp_id) {
        return employeeService.getAnEmployee(emp_id);
    }

    @GetMapping("/getEmployee/department/{emp_id}")
    public APIResponse<Department> getDeptEmployee(@PathVariable Long emp_id) {
        return employeeService.getDeptEmployee(emp_id);
    }

    @GetMapping("/getHighestSalaryEmployee")
    public APIResponse<List<Employee>> getEmployeesWithHighestSalary() {
        return employeeService.getEmployeesWithHighestSalary();
    }

    @GetMapping("/getSecondHighestSalaryHoldersByDepartment")
    public APIResponse<Map<String, Employee>> getSecondHighestSalaryHoldersByDepartment() {
        return employeeService.getSecondHighestSalaryHoldersByDepartment();
    }

    @DeleteMapping("/deleteEmployeeById/{employeeId}")
    public APIResponse<String> deleteEmployee(@PathVariable Long employeeId) {
        return employeeService.deleteEmployee(employeeId);
    }
}
