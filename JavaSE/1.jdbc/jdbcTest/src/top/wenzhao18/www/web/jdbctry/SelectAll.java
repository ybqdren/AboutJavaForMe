package top.wenzhao18.www.web.jdbctry;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class SelectAll {

	public static void main(String[] args) throws IOException {
		Driver driver;
		Connection conn = null;
		Properties properties = null;
		properties = new PropInfoGet().getProp();

		String url = properties.getProperty("url");
		String name = properties.getProperty("user");
		String passwd = properties.getProperty("password");
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		try {
			conn = DriverManager.getConnection(url, name, passwd);
			String sql = "select * from user_tbl";
			ps = (PreparedStatement) conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String username = rs.getString("username");
				String password = rs.getString("password");
				System.out.println(username + "...." + "...." + password);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}

			} catch (SQLException e1) {
				e1.printStackTrace();
			} finally {
				rs = null;
			}

			try {
				if (ps != null) {
					ps.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				ps = null;
			}
			

			try {
				if (conn != null) {
					conn.close();
				}
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				conn = null;
			}
		}

	}

}
