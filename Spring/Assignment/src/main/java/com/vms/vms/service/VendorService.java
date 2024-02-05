package com.vms.vms.service;

import com.vms.vms.entity.Department;
import com.vms.vms.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VendorService {
    @Autowired
    private VendorRepository vendorRepository;

    public List<Department> getAllVendors() {
        return vendorRepository.findAll();
    }

    // other methods for vendor management
}
