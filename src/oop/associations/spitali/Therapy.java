package oop.associations.spitali;

import java.time.LocalDateTime;

public class Therapy {
    private static int nextId = 1;
    private int id;
    private Hospital hospital;
    private Patient patient;
    private Doctor doctor;
    private String symptoms;
    private LocalDateTime visitDate;
    private String description;

    public Therapy(Hospital hospital, Patient patient, Doctor doctor,
                   String symptoms, LocalDateTime visitDate, String description) {
        this.hospital = hospital;
        this.patient = patient;
        this.doctor = doctor;
        this.symptoms = symptoms;
        this.visitDate = visitDate;
        this.description = description;
        this.id = nextId++;
    }

    public int getId() {
        return id;
    }


    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public LocalDateTime getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(LocalDateTime visitDate) {
        this.visitDate = visitDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Therapy{" +
                "id=" + id +
                ", hospital=" + hospital +
                ", patient=" + patient +
                ", doctor=" + doctor +
                ", symptoms='" + symptoms + '\'' +
                ", visitDate=" + visitDate +
                ", description='" + description + '\'' +
                '}';
    }
}
