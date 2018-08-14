package com.capg;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Random;

public class CouponCode {

	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
		char[] couponCodeSet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();
		StringBuilder couponGenerating = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < 6; i++) {
			char c = couponCodeSet[random.nextInt(couponCodeSet.length)];
			couponGenerating.append(c);
		}
		String coupon = couponGenerating.toString();
		System.out.println(coupon);
		Connection connection = getConnection();
		checkCouponTimingsForDeletion(connection);
		saveToDatabase(coupon, connection);
	}

	private static void checkCouponTimingsForDeletion(Connection connection)
			throws ClassNotFoundException, IOException {
		PreparedStatement preparedStatement = null;
		String sql = "DELETE FROM coupon WHERE expiry_time < (NOW() - INTERVAL 1 MINUTE)";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void saveToDatabase(String output, Connection connection)
			throws ClassNotFoundException, IOException, SQLException {
		String email_id = "vik@gmail.com";
		String coupon_code = output;
		java.util.Date date = new java.util.Date();
		java.sql.Timestamp expiry_time = new java.sql.Timestamp(date.getTime());
		int discount = 40;
		PreparedStatement preparedStatement = null;
		String sql = "insert into coupon values ( ?, ?, ?, ?)";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, email_id);
			preparedStatement.setString(2, coupon_code);
			preparedStatement.setTimestamp(3, expiry_time);
			preparedStatement.setInt(4, discount);
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static Connection getConnection() throws ClassNotFoundException, IOException {
		Properties props = new Properties();
		FileInputStream in = new FileInputStream("db.properties");
		props.load(in);
		in.close();
		String driver = props.getProperty("driver");
		if (driver != null) {
			Class.forName(driver);
		}
		String url = props.getProperty("url");
		String username = props.getProperty("username");
		String password = props.getProperty("password");
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return con;
	}
}
