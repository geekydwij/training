package com.vms.vms.Repository;

import com.vms.vms.Models.Project;
import com.vms.vms.Models.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {
    List<Project> findByStatus(Status status);
}
