package com.ilp03.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.ilp03.dao.ProjectDAO;
import com.ilp03.entity.UserStory;

public class ProjectServiceImpl implements ProjectService {

	@Override
	public void getInfo() {
		Connection connection = ProjectDAO.getConnection();
		ArrayList<UserStory> userStories = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter project name : ");
		String projectName = scanner.nextLine();
		try {
			userStories = ProjectDAO.displayUserStories(connection, projectName);
			System.out.println(
					"+-------------+---------------+----------------------------------------+-------------------+-----------------+------------+------------+-------------+----------------+");
			System.out.println(
					"| projectId   | SprintNo      | Description                            | Assigned_employee | Created_by      | StartDate  | EndDate    | Storypoints | Status         |");
			System.out.println(
					"+-------------+---------------+----------------------------------------+-------------------+-----------------+------------+------------+-------------+----------------+");
			for (UserStory story : userStories) {
				System.out.printf("| %-11s | %-13s | %-20s | %-17s | %-15s | %-10s | %-10s | %-11s | %-14s |\n",
						story.getSprintId().getProjectId().getProjectId(), story.getSprintId().getSprintNo(),
						story.getDescription(), story.getAssignedTo(), story.getCreatedBy(), story.getStartDate(),
						story.getEndDate(), story.getStoryPoints(), story.getStatus());
			}
			System.out.println(
					"+-------------+---------------+----------------------------------------+-------------------+-----------------+------------+------------+-------------+----------------+");
			ProjectDAO.closeConnection(connection);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
