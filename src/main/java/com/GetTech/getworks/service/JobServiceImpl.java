package com.GetTech.getworks.service;

import com.GetTech.getworks.model.Job;
import com.GetTech.getworks.repository.JobRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService{
    private final JobRepository jobRepository;

    public JobServiceImpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public Job create(Job job){
        return jobRepository.save(job);
    }

    @Override
    public List<Job> get(){
        return jobRepository.findAll();
    }

}
