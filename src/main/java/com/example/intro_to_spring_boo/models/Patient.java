package com.example.intro_to_spring_boo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "patient")
public class Patient {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer patientId;
        private String name;
        private String dateOfBirth;
        @ManyToOne
        @JoinColumn(name = "admitted_by", referencedColumnName = "employeeId")
        private Employee admittedBy;

    public Patient() {
    }

    public Patient(String name, String dateOfBirth, Employee admittedBy) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.admittedBy = admittedBy;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Employee getAdmittedBy() {
        return admittedBy;
    }

    public void setAdmittedBy(Employee admittedBy) {
        this.admittedBy = admittedBy;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", admittedBy=" + admittedBy +
                '}';
    }
}
