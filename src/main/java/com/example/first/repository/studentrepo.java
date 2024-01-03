package com.example.first.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.first.models.students;

@Repository
public interface studentrepo extends MongoRepository<students, String>
{

}
