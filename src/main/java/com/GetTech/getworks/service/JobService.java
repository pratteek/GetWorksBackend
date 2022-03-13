package com.GetTech.getworks.service;

import com.GetTech.getworks.model.Job;

import java.util.List;

public interface JobService {
    Job create(Job job);

    List<Job> get();

    String delete(Long id);

    Job getById(Long id);

    Job updateJob(Long id, Job job);
}
