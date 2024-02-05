package com.vms.vms.repository;

import com.vms.vms.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Department, Long> {
}
