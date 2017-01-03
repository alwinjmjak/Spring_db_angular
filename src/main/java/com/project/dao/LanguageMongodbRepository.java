package com.project.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.model.LanguageV1;

public interface LanguageMongodbRepository extends MongoRepository<LanguageV1, String>{

}
