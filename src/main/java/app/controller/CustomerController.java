package app.controller;

import app.domain.Customer;
import app.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("customers")
    public String createCustomer(@RequestBody Customer customer) {
        return customerService.create(customer);
    }

    @GetMapping("customers/last-entity")
    public String getLastEntity() {
        return customerService.getLastEntity();
    }

    @GetMapping("customers")
    public String fetchAllCustomers() {
        return customerService.fetchAll();
    }

    @GetMapping("customers/{id}")
    public String fetchCustomerById(@PathVariable("id") Long id) {
        return customerService.fetchById(id);
    }

    @PutMapping("customers/{id}")
    public String updateCustomer(@PathVariable("id") Long id, @RequestBody Customer customer) {
        return customerService.update(id, customer);
    }

    @DeleteMapping("customers/{id}")
    public String deleteCustomers(@PathVariable("id") Long id) {
        return customerService.delete(id);
    }

}
