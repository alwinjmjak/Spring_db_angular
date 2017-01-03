package com.project.dao;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.project.model.Language;

public interface LanguageElasticsearchRepository extends ElasticsearchRepository<Language, String>{

}
