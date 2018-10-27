package com.project.backend.dto;

public class Category {
	
	/*
	 * Private Members of Category
	 */

	private int id;
	private String name;
	private String description;
	private String imageuRL;
	private boolean isActive=true;
	
	/*
	 * Generating getters and setters
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public String getImageuRL() {
		return imageuRL;
	}
	public void setImageuRL(String imageuRL) {
		this.imageuRL = imageuRL;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
}
