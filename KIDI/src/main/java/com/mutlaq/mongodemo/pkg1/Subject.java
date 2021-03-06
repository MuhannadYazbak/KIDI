package com.mutlaq.mongodemo.pkg1;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Subject {
	
	@Id
	private String id;
	@Field
	private String name;
	@Field
	private String description;
	
	
	
	public Subject() {
		super();
	}


	public Subject(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
