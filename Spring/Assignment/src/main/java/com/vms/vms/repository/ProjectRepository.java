package com.vms.vms.repository;

import com.vms.vms.entity.Employee;
import com.vms.vms.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
