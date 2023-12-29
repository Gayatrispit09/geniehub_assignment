package com.example.first;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface studentrepo extends MongoRepository<students, String>
{

}
