package com.vms.vms.Repository;

import com.vms.vms.Models.Department;
import com.vms.vms.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findTop3ByOrderBySalaryDesc();
    List<Employee> findByDepartmentOrderBySalaryDesc(Department d);
}

