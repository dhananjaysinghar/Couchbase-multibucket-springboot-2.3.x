package com.cb.demo.controller;

import com.cb.demo.model.Customer;
import com.cb.demo.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerRepo customerRepo;

    @PostMapping
    public String saveCustomer(@RequestBody Customer customer) {
        customerRepo.save(customer);
        return "saved successfully!!";
    }

    @GetMapping
    public List<Customer> getAllCustomer() {
        return customerRepo.findAll();
    }


}
