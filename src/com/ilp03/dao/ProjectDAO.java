package com.ilp03.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import com.ilp03.entity.Project;
import com.ilp03.entity.Sprint;
import com.ilp03.entity.UserStory;

public class ProjectDAO {

	public static Connection getConnection() {
		String connectionString = "jdbc:mysql://localhost:3306/projectwf?useSSL=false";
		String userName = "root";
		String userPassword = "Warlock2001B";

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(connectionString, userName, userPassword);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	public static void closeConnection(Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static ArrayList<UserStory> displayUserStories(Connection connection, String projectName)
			throws SQLException {
		ArrayList<UserStory> userStories = new ArrayList<>();
		PreparedStatement preparedStatement = connection.prepareStatement(
				"SELECT project.projectid, sprint.sprintno, user_story.description, assigned_employee.username AS assigned_employee, user_story.createdby AS created_by_id, created_by.username AS created_by_username, user_story.status, user_story.startdate, user_story.enddate,user_story.storypoints FROM project INNER JOIN sprint ON project.projectid = sprint.projectid INNER JOIN user_story ON sprint.sprintid = user_story.sprintid LEFT JOIN employee AS assigned_employee ON user_story.assignedto = assigned_employee.username LEFT JOIN employee AS created_by ON user_story.createdby = created_by.employeeid WHERE project.name = ?");
		preparedStatement.setString(1, projectName);
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {

			int projectId = resultSet.getInt("projectid");
			Project project = new Project(projectId, null, null, null, null, 0);
			int sprintNo = resultSet.getInt("sprintno");
			Sprint sprint = new Sprint(sprintNo, null, null, project);
			String description = resultSet.getString("description");
			String assignedEmployee = resultSet.getString("assigned_employee");
			String status = resultSet.getString("status");
			Date startDate = resultSet.getDate("startdate");
			Date endDate = resultSet.getDate("enddate");
			int storyPoints = resultSet.getInt("storypoints");
			String createdby = resultSet.getString("created_by_username");
			UserStory userStory = new UserStory(0, description, assignedEmployee, status, sprint, startDate, endDate,
					storyPoints, createdby);
			userStories.add(userStory);
		}
		return userStories;
	}

}
