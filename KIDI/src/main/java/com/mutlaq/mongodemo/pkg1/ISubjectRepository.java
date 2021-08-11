package com.mutlaq.mongodemo.pkg1;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

@Repository
public interface ISubjectRepository extends MongoRepository<Subject, String>{

}
