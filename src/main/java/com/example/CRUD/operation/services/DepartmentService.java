package com.example.CRUD.operation.services;


import com.example.CRUD.operation.Entities.Department;

import java.util.List;

public interface DepartmentService {

    // Save operation
    Department saveDepartment(Department department);

    // Read operation
    List<Department> fetchDepartmentList();

    List<Department> getDepartmentByName(String name);

    // Update operation
    Department updateDepartment(Department department,
                                Long departmentId);

    // Delete operation
    void deleteDepartmentById(Long departmentId);
}