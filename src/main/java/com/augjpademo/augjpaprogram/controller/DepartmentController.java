package com.augjpademo.augjpaprogram.controller;

import com.augjpademo.augjpaprogram.model.Department;
import com.augjpademo.augjpaprogram.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    @PostMapping(value="/savedept")
    public String addDept(@RequestBody Department department){
        departmentRepository.save(department);
        return "Dept saved";
    }
}
