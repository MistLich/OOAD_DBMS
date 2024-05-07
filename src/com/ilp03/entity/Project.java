package com.ilp03.entity;

import java.util.Date;

public class Project {
	private int projectId;
	private String name;
	private String description;
	private Date startDate;
	private Date endDate;
	private int createdBy;

	public Project(int projectId, String name, String description, Date startDate, Date endDate, int createdBy) {
		this.projectId = projectId;
		this.name = name;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.createdBy = createdBy;
	}

	public int getProjectId() {
		return projectId;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
}
