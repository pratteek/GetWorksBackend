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

    @Override
    public String delete(Long id){
        jobRepository.deleteById(id);
        return "Deleted";

    }

    @Override
    public Job getById(Long id){
        if(jobRepository.findById(id).isPresent()) {
            return jobRepository.findById(id).get();
        }else{
            return null;
        }
    }
    @Override
    public Job updateJob(Long id,Job job){

        if(jobRepository.findById(id).isPresent()) {
            Job oldJob = jobRepository.findById(id).get();
            oldJob.setCompany(job.getCompany());
            oldJob.setPosition(job.getPosition());
            oldJob.setUrl(job.getUrl());
            return jobRepository.save(oldJob);
        }else{
            return null;
        }


    }

}
