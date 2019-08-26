package com.augjpademo.augjpaprogram.controller;

import com.augjpademo.augjpaprogram.model.Student;
import com.augjpademo.augjpaprogram.repository.StudentInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentInterface studentInterface;

    @PostMapping(value="/savestu")
    public String saveStudent(@RequestBody Student student){
        studentInterface.save(student);
        return "Data Saved";
    }
}
