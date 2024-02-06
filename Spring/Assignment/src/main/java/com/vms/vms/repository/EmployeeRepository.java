package com.vms.vms.repository;

import com.vms.vms.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository extends JpaRepository<Employee, Long> {
}
