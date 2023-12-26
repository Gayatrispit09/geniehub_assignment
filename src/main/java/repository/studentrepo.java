package repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import student.students;

public interface studentrepo extends MongoRepository<students, Integer>{

}
