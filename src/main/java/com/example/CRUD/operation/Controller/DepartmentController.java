package com.example.CRUD.operation.Controller;

import com.example.CRUD.operation.Entities.Department;
import com.example.CRUD.operation.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class DepartmentController {

    // Annotation
    @Autowired
    private DepartmentService departmentService;

    // Save operation
    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department)
    {
        return departmentService.saveDepartment(department);
    }

    // Read operation
    @GetMapping("/departments")
    public List<Department> fetchDepartmentList()
    {
        return departmentService.fetchDepartmentList();
    }

    // Update operation
    @PutMapping("/departments/{id}")
    public Department
    updateDepartment(@RequestBody Department department,
                     @PathVariable("id") Long departmentId)
    {
        return departmentService.updateDepartment(
                department, departmentId);
    }

    @GetMapping("/departments/{departmentName}")
    public ResponseEntity<List<Department>> getDepartmentByName(@PathVariable("departmentName") String departmentName)
    {
        return new ResponseEntity<>(departmentService.getDepartmentByName(departmentName), HttpStatus.OK);
    }


    // Delete operation
    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id")
                                       Long departmentId)
    {
        departmentService.deleteDepartmentById(
                departmentId);
        return "Deleted Successfully";
    }
}