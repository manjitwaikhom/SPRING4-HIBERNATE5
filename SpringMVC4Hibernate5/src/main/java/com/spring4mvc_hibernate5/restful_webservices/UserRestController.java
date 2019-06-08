package com.spring4mvc_hibernate5.restful_webservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring4mvc_hibernate5.model.User;
import com.spring4mvc_hibernate5.service.UserService;

@RestController
@Component
public class UserRestController {
    
    @Autowired
    private UserService userService;
    
	@GetMapping("/users")
	public List<User> getCustomers() {
		return userService.list();
	}

    @GetMapping("/users/{id}")
    public ResponseEntity getCustomer(@PathVariable("id") int id) {
    
    	User customer = userService.getById(id);
    	if (customer == null) {
    		return new ResponseEntity("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
    	}
    
    	return new ResponseEntity(customer, HttpStatus.OK);
    }


}
