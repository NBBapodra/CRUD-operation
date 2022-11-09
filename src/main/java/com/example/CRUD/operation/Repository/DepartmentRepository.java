package com.example.CRUD.operation.Repository;


import com.example.CRUD.operation.Entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

// Interface
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    @Query(value = "SELECT d FROM Department d where departmentName=:departmentName")
    List<Department> getDepartmentByName(@Param("departmentName") String departmentName);
}