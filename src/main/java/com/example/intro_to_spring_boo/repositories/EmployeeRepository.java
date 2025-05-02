package com.example.intro_to_spring_boo.repositories;

import com.example.intro_to_spring_boo.models.Employee;
import com.example.intro_to_spring_boo.models.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository <Employee, Integer>{

    List<Employee> findEmployeesByStatus(Status status);
    List<Employee> findEmployeesByDepartment(String department);
}
