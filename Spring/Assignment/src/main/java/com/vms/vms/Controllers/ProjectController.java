package com.vms.vms.Controllers;

import com.vms.vms.API.APIResponse;
import com.vms.vms.DTOs.ProjectDTO;
import com.vms.vms.Models.Project;
import com.vms.vms.Models.Status;
import com.vms.vms.Services.ProjectService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @PostMapping("/create")
    public APIResponse<Project> createProject(@RequestBody Project project) {
        return projectService.createProject(project);
    }

    @GetMapping("/getall")
    public APIResponse<List<Project>> getAllProjects() {
        return projectService.getAllProjects();
    }

    @GetMapping("/getallwithteam")
    public APIResponse<List<ProjectDTO>> getAllProjectsWithTeamMembers() {
        return projectService.getAllProjectsWithTeamMembers();
    }

    @GetMapping("/get/{projId}")
    public APIResponse<ProjectDTO> getAllDetailsById(@PathVariable Long projId) {
        return projectService.getAllDetailsById(projId);
    }

    @PutMapping("/{projectId}/status")
    public APIResponse<String> updateProjectStatus(@PathVariable Long projectId, @RequestParam Status newStatus) {
        return projectService.updateProjectStatus(projectId,newStatus);
    }
    @GetMapping("/{projectId}/budget")
    public APIResponse<Double> getProjectBudget(@PathVariable Long projectId) {
        return projectService.getProjectBudget(projectId);
    }
    @GetMapping("/new")
    public APIResponse<List<Project>> getNewProjects() {

        return projectService.getNewProjects();
    }
    @GetMapping("/on-going")
    public APIResponse<List<Project>> getOngoingProjects() {
        return projectService.getOngoingProjects();
    }
    @GetMapping("/ended")
    public APIResponse<List<Project>> getEndProjects() {
        return projectService.getOngoingProjects();
    }

    @DeleteMapping("/delete/{projectId}")
    public APIResponse<String> deleteProject(@PathVariable Long projectId) {
        return projectService.deleteProject(projectId);
    }
}
