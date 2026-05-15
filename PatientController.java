package com.legacyhealth.api.controller;

import com.legacyhealth.api.model.Patient;
import com.legacyhealth.api.service.PatientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/api/patients")
    public List<Patient> getPatients() {
        return patientService.getPatients();
    }
}
