package com.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.project.service.ApiService;
import com.project.model.ApiModel;

@RestController
public class ApiController {
	@Autowired
	ApiService service;
	@CrossOrigin(origins = "*")	
	@GetMapping("/")
	public List<ApiModel> getProducts() {
		return service.getProducts();
	}
	@CrossOrigin(origins = "*")	
	@GetMapping("/{id}")
	public Optional<ApiModel> getProductByID(@PathVariable int id) {
		return service.getProductByID(id);
	}
	@CrossOrigin(origins = "*")
	@PostMapping("/") 
	public String createProduct(@RequestBody ApiModel product) {
		return service.createProducts(product);
	}
	@CrossOrigin(origins = "*")
	@DeleteMapping("/{id}")
	public String deleteProduct(@PathVariable int id) {
		return service.deleteProduct(id);
	}
	@CrossOrigin(origins = "*")
	@PutMapping("/")
	public String updateProduct(@RequestBody ApiModel model) {
		return service.updateProduct(model);
	}
}
