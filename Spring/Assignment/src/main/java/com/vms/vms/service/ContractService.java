package com.vms.vms.service;

import com.vms.vms.entity.Employee;
import com.vms.vms.repository.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ContractService {
    @Autowired
    private ContractRepository contractRepository;

    public List<Employee> getAllContracts() {
        return contractRepository.findAll();
    }

    // other methods for contract management
}
