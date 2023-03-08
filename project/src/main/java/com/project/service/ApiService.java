package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.project.repository.ApiRepository;
import com.project.model.ApiModel;

@Service
public class ApiService {
	@Autowired
	ApiRepository rep;
	public List<ApiModel> getProducts() {
		return rep.findAll();
	}
	public Optional<ApiModel> getProductByID(int id) {
		return rep.findById(id);
	}
	public String createProducts(ApiModel product) {
		rep.save(product);
		return "Added";
	}
	public String deleteProduct(int id) {
		rep.deleteById(id);
		return "Deleted";
	}
	public String updateProduct(ApiModel product) {
		rep.save(product);
		return "Updated";
	}
}
