package com.GetTech.getworks.repository;


import com.GetTech.getworks.model.Job;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends MongoRepository<Job,Long> {


}
