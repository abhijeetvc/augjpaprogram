package com.augjpademo.augjpaprogram.repository;

import com.augjpademo.augjpaprogram.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
