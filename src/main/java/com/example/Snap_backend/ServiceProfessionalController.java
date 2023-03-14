package com.example.Snap_backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServiceProfessionalController {
    @Autowired
    private ServiceProfessionalRepository repository;

    @GetMapping("/service-professionals")
    public List<ServiceProfessional> getServiceProfessionals(@RequestParam("service_subcategory") String subCategory) {
        return repository.findByServiceSubcategory(subCategory);
    }
}
