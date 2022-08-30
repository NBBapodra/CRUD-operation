package com.example.CRUD.operation.Repository;


import com.example.CRUD.operation.Entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

// Interface
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}