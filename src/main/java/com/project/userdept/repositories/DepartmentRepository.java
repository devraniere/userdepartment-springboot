package com.project.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.userdept.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{
	
}
