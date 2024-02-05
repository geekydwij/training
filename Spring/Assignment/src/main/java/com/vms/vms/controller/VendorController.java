package com.vms.vms.controller;

import com.vms.vms.entity.Department;
import com.vms.vms.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/vendors")
public class VendorController {
    @Autowired
    private VendorService vendorService;

    @GetMapping
    public List<Department> getAllVendors() {
        return vendorService.getAllVendors();
    }

    // other endpoints for vendor management
}
