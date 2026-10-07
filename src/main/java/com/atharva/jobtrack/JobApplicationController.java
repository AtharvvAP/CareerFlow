
package com.atharva.jobtrack;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/applications")
public class JobApplicationController {

    private final JobApplicationRepository repository;

    public JobApplicationController(JobApplicationRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<JobApplication> getApplications() {
        return repository.findAll();
    }

    @PostMapping
    public JobApplication addApplication(
            @RequestBody JobApplication application) {
        return repository.save(application);
    }

    @PutMapping("/{id}")
    public JobApplication updateApplication(
            @PathVariable Long id,
            @RequestBody JobApplication updatedApplication) {

        JobApplication existingApplication = repository.findById(id)
                .orElseThrow();

        existingApplication.setCompany(updatedApplication.getCompany());
        existingApplication.setRole(updatedApplication.getRole());
        existingApplication.setStatus(updatedApplication.getStatus());
        existingApplication.setDate(updatedApplication.getDate());
        existingApplication.setNotes(updatedApplication.getNotes());

        return repository.save(existingApplication);
    }
}
