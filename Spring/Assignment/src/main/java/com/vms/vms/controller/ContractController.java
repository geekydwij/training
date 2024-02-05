package com.vms.vms.controller;

import com.vms.vms.entity.Employee;
import com.vms.vms.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/contracts")
public class ContractController {
    @Autowired
    private ContractService contractService;

    @GetMapping
    public List<Employee> getAllContracts() {
        return contractService.getAllContracts();
    }

    // other endpoints for contract management
}
