package com.hafeez.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hafeez.model.Employee;

@Repository
public interface empRepo extends JpaRepository<Employee, Integer>{

}
