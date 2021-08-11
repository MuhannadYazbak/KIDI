package com.mutlaq.mongodemo.pkg1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public class Course {
	
	@Id
	private String ID;
	
	@Field
	private String name;
	
	@Field
	private int price;

@Field
	private String startDateTime;
	
	@Field 
	private String finishDateTime;
	
	@Field 
	private List<Category> categories; 
	
	@Field
	private ArrayList<String> leadersIDs;
	
	@Field 
	private String zoomMeetingLink;
	
	@Field
	private ArrayList<String> kidsIDs;
	

	public Course() {
		super();
	}

	public Course(String name, int price, String startDateTime, String finishDateTime, List<Category> categories, String zoomMeetingLink) {
		super();
		this.name = name;
		this.price = price;
		this.startDateTime = startDateTime;
		this.finishDateTime = finishDateTime;
		this.categories = categories;
		this.leadersIDs = new ArrayList<String>();
		this.zoomMeetingLink = zoomMeetingLink;
		this.kidsIDs = new ArrayList<String>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(String startDateTime) {
		this.startDateTime = startDateTime;
	}

	public String getFinishDateTime() {
		return finishDateTime;
	}

	public void setFinishDateTime(String finishDateTime) {
		this.finishDateTime = finishDateTime;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategorys(List<Category> categories) {
		this.categories = categories;
	}

	public ArrayList<String> getLeadersIDs() {
		return leadersIDs;
	}

	public void setLeadersIDs(ArrayList<String> leadersIDs) {
		this.leadersIDs = leadersIDs;
	}

	public String getZoomMeetingLink() {
		return zoomMeetingLink;
	}

	public void setZoomMeetingLink(String zoomMeetingLink) {
		this.zoomMeetingLink = zoomMeetingLink;
	}

	public ArrayList<String> getKidsIDs() {
		return kidsIDs;
	}

	public void setKidsIDs(ArrayList<String> kidsIDs) {
		this.kidsIDs = kidsIDs;
	}	
}