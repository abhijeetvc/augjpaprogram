package com.augjpademo.augjpaprogram.controller;

import com.augjpademo.augjpaprogram.model.Student;
import com.augjpademo.augjpaprogram.repository.StudentInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    private StudentInterface studentInterface;

    @PostMapping(value="/savestu")
    public String saveStudent(@RequestBody Student student){
        studentInterface.save(student);
        return "Data Saved";
    }

    @GetMapping(value="/getstu/{name}")
    public Student saveStudent(@PathVariable String name){
        System.out.println("-------"+name);
        String name1="%"+name+"%";
        Student s=studentInterface.findByNameLike(name1);
        System.out.println(name1);
        return s;
    }

}
