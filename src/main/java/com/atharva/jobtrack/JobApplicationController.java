
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
}
