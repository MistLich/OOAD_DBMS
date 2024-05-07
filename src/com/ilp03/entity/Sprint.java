package com.ilp03.entity;

import java.util.Date;

public class Sprint {
	private int sprintId;
	private int sprintNo;
	private Date startDate;
	private Date endDate;
	private int createdBy;
	private Project projectId;

	public Sprint(int sprintNo, Date startDate, Date endDate, Project projectId) {
		this.sprintNo = sprintNo;
		this.startDate = startDate;
		this.endDate = endDate;
		this.projectId = projectId;

	}

	public int getSprintId() {
		return sprintId;
	}

	public int getSprintNo() {
		return sprintNo;
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public Project getProjectId() {
		return projectId;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setSprintId(int sprintId) {
		this.sprintId = sprintId;
	}

	public void setSprintNo(int sprintNo) {
		this.sprintNo = sprintNo;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public void setProjectId(Project projectId) {
		this.projectId = projectId;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
}
