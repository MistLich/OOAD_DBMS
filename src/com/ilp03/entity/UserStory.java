package com.ilp03.entity;

import java.util.Date;

public class UserStory {
	private int storyId;
	private String description;
	private String assignedTo;
	private String status;
	private Sprint sprintId;
	private Date startDate;
	private Date endDate;
	private int storyPoints;
	private String createdBy;

	public UserStory(int storyId, String description, String assignedTo, String status, Sprint sprintId, Date startDate,
			Date endDate, int storyPoints, String createdBy) {
		this.storyId = storyId;
		this.description = description;
		this.assignedTo = assignedTo;
		this.status = status;
		this.sprintId = sprintId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.storyPoints = storyPoints;
		this.createdBy = createdBy;
	}

	public int getStoryId() {
		return storyId;
	}

	public String getDescription() {
		return description;
	}

	public String getAssignedTo() {
		return assignedTo;
	}

	public String getStatus() {
		return status;
	}

	public Sprint getSprintId() {
		return sprintId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public int getStoryPoints() {
		return storyPoints;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	// Setters
	public void setStoryId(int storyId) {
		this.storyId = storyId;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setSprintId(Sprint sprintId) {
		this.sprintId = sprintId;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public void setStoryPoints(int storyPoints) {
		this.storyPoints = storyPoints;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
}
