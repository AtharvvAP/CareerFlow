package com.atharva.jobtrack;

import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

@Service
public class JobApplicationService {

    private final JobApplicationRepository repository;

    public JobApplicationService(JobApplicationRepository repository) {
        this.repository = repository;
    }

    public List<JobApplication> getAllApplications() {
        return repository.findAll();
    }

    public JobApplication addApplication(JobApplication application) {
        return repository.save(application);
    }

    public JobApplication updateApplication(Long id, JobApplication updatedApplication) {

        JobApplication existingApplication = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Application not found"));

        existingApplication.setCompany(updatedApplication.getCompany());
        existingApplication.setRole(updatedApplication.getRole());
        existingApplication.setStatus(updatedApplication.getStatus());
        existingApplication.setDate(updatedApplication.getDate());
        existingApplication.setNextActionDate(updatedApplication.getNextActionDate());
        existingApplication.setInterviewDate(updatedApplication.getInterviewDate());
        existingApplication.setNotes(updatedApplication.getNotes());
        existingApplication.setJobLink(updatedApplication.getJobLink());
        existingApplication.setLocation(updatedApplication.getLocation());
        existingApplication.setSource(updatedApplication.getSource());

        if (updatedApplication.getFollowUpDone() != null) {
            existingApplication.setFollowUpDone(updatedApplication.getFollowUpDone());
        }

        return repository.save(existingApplication);
    }

    public void deleteApplication(Long id) {

        if (!repository.existsById(id)) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Application not found");
        }

        repository.deleteById(id);
    }
}