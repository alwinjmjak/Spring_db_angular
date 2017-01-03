package com.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dao.LanguageElasticsearchRepository;
import com.project.dao.LanguageMongodbRepository;
import com.project.model.Language;
import com.project.model.LanguageV1;

@RestController
public class MainController {


	
	@Autowired
	LanguageElasticsearchRepository langEsRepo;
	
	@Autowired
	LanguageMongodbRepository langMongoRepo;
	
    @RequestMapping("/greeting")
	    public void greeting() {
	    	System.out.println("Method entered");
	        Language lang = new Language();
	        lang.setLanguageName("Angular JS");
	        lang.setLanguageDescription("Anagular JS is a front end java script tool");
	        
	        LanguageV1 langV1 = new LanguageV1();
	        langV1.setLanguageName("Angular JS");
	        langV1.setLanguageDescription("Anagular JS is a front end java script tool");
	        
	        
	        LanguageV1 mongoReturned = langMongoRepo.save(langV1);
	        System.out.println(mongoReturned.getId());
	        Language esReturned = langEsRepo.save(lang);
	        System.out.println(esReturned.getId());
	    	System.out.println("Method ended");

	        
	    }    
}
