
package com.atharva.jobtrack;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/applications")
public class JobApplicationController {

    private final JobApplicationService service;

    public JobApplicationController(JobApplicationService service) {
        this.service = service;
    }

    @GetMapping
    public List<JobApplication> getApplications() {
        return service.getAllApplications();
    }

    @PostMapping
    public JobApplication addApplication(
            @RequestBody JobApplication application) {
        return service.addApplication(application);
    }

    @PutMapping("/{id}")
    public JobApplication updateApplication(
            @PathVariable Long id,
            @RequestBody JobApplication updatedApplication) {
        return service.updateApplication(id, updatedApplication);
    }

    @DeleteMapping("/{id}")
    public void deleteApplication(@PathVariable Long id) {
        service.deleteApplication(id);
    }
}
