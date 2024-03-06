package com.subham.restdemo.controller;

import com.subham.restdemo.Vendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vendor")
public class Controller {

    Vendor vendor;

    @GetMapping("{id}")
    public Vendor getVendordetails(Long id){
       // return new Vendor("Subham",1l,"kolkata");
     return vendor;
    }

    @PostMapping
    public String createVendorDetails(@RequestBody Vendor vendor){
    this.vendor=vendor;
    return "Vendor created successfully";
    }

    @PutMapping
    public String updateVendorDetails(@RequestBody Vendor vendor){
        this.vendor=vendor;
        return "Vendor updated successfully";
    }
    @DeleteMapping("{id}")
    public String deleteVendorDetails(Long id){
        this.vendor=null;
        return "Vendor deleted successfully";
    }
}
