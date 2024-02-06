package com.vms.vms.repository;

import com.vms.vms.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("SELECT e FROM Employee e WHERE e.department.id = ?1")
    List<Employee> findByDepartmentId(Long departmentId);
}
