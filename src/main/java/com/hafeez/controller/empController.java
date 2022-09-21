package com.hafeez.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hafeez.model.Employee;
import com.hafeez.repo.empRepo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.models.annotations.OpenAPI31;

@RestController
@RequestMapping("employees")
public class empController {
	@Autowired
	private empRepo repo;
	
	
	@GetMapping("/all")
	public List<Employee> getAll(){
		return repo.findAll();
	}
	@GetMapping("/{id}")
	public Employee getAll(@PathVariable int id){
		return repo.findById(id).get();
	}
	@PostMapping()
	public void createEmp(@RequestBody Employee e){
		repo.save(e);
	}
	@DeleteMapping("/{id}")
	public void deleteEmp(@PathVariable int id){
		repo.deleteById(id);
	}
	@PutMapping
	public void  updateEmp(@RequestBody Employee e){
		repo.save(e);
	}
}
