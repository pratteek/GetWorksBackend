package com.GetTech.getworks.controller;

import com.GetTech.getworks.model.Job;
import com.GetTech.getworks.service.JobService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class JobController {

    private final JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/job")
    public ResponseEntity<List<Job>> getJob(){
        return ResponseEntity.ok(jobService.get());
    }

    @PostMapping("/job")
    public ResponseEntity<Job> createJob(@RequestBody Job job){
        return ResponseEntity.ok(
                        jobService.create(job)
        );
    }

    @DeleteMapping("/job/{id}")
    public ResponseEntity<String> deleteJob(@PathVariable Long id){
        return ResponseEntity.ok(jobService.delete(id));
    }

    @GetMapping("/job/{id}")
    public ResponseEntity<Job> getJobById(@PathVariable Long id){
        return ResponseEntity.ok(jobService.getById(id));
    }
    @PutMapping("/job/{id}")
    public ResponseEntity<?> updateJob(@PathVariable Long id, @RequestBody Job job){
        return ResponseEntity.ok(jobService.updateJob(id,job));
    }
}
