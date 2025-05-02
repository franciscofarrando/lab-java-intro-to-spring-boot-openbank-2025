package com.example.intro_to_spring_boo.controllers;

import com.example.intro_to_spring_boo.models.Patient;
import com.example.intro_to_spring_boo.models.Status;
import com.example.intro_to_spring_boo.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/patient")
public class PatientController {
    @Autowired
    PatientRepository patientRepository;
    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<Patient> getAllPatients(){
       return patientRepository.findAll();
    }

    @GetMapping("/id/{patientId}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Patient> getEmployeeById(@PathVariable(name = "patientId")int id) {
        return patientRepository.findById(id);
    }

   @GetMapping("/department/{department}")
    @ResponseStatus(HttpStatus.OK)
    public List<Patient> findPatientByDepartment(@PathVariable String department) {
        return patientRepository.findByAdmittedBy_Department(department);
    }

    @GetMapping("/status/{status}")
    @ResponseStatus(HttpStatus.OK)
    public List<Patient> findByAdmittedBy_Status(@PathVariable Status status) {
        return patientRepository.findByAdmittedBy_Status(status);
    }


}
