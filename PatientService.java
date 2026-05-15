package com.legacyhealth.api.service;

import com.legacyhealth.api.model.Patient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientService {

    public List<Patient> getPatients() {

        List<Patient> patients = new ArrayList<>();

        patients.add(new Patient(1001L, "John Smith", "Diabetes", "Dr. Robert"));
        patients.add(new Patient(1002L, "Emma Johnson", "Hypertension", "Dr. Williams"));

        return patients;
    }
}
