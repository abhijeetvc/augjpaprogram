package com.augjpademo.augjpaprogram.repository;

import com.augjpademo.augjpaprogram.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentInterface extends JpaRepository<Student,Integer> {

    Student findByNameLike(String name);
}
