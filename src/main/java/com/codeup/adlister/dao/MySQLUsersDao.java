package com.codeup.adlister.dao;

import com.codeup.adlister.Config;
import com.codeup.adlister.dao.Ads;
import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLUsersDao implements Users {
	private Connection connection = null;

	public MySQLUsersDao(Config config) {
		try {
			DriverManager.registerDriver(new Driver());
			connection = DriverManager.getConnection(
					config.getUrl(),
					config.getUser(),
					config.getPassword()
			);
		} catch (SQLException e) {
			throw new RuntimeException("Error connecting to the database!", e);
		}
	}


	@Override
	public User findByUsername(String username) {
		return null;
	}

	@Override
	public Long insert(User user) {
		try {
			Statement statement = connection.createStatement();
			statement.executeUpdate(createInsertQuery(user), Statement.RETURN_GENERATED_KEYS);
			ResultSet resultSet = statement.getGeneratedKeys();
			resultSet.next();
			return resultSet.getLong(1);
		} catch (SQLException e) {
			throw new RuntimeException("Error creating a new user.", e);
		}
	}

	private String createInsertQuery(User user) {
		return "INSERT INTO users (username, password, email) VALUES "
				+ "('"+ user.getUsername() +"', "
				+ "'" + user.getPassword() + "',"
				+ "'" + user.getEmail() + "')";
	}
}