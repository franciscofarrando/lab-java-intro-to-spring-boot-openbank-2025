package com.example.intro_to_spring_boo.repositories;

import com.example.intro_to_spring_boo.models.Patient;
import com.example.intro_to_spring_boo.models.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
   // List<Patient> findPatientByBirthRange(String dateOfBirth);
    List<Patient> findByAdmittedBy_Department(String department); //EL NOMBRE DESPUES DE FIND, DEBE COINCIDIR CON EL NOMBRE DE LAS COLUMNAS/PARAMETROS DE LA OTRA TABLA/CLASE
    List<Patient> findByAdmittedBy_Status(Status status);
}
