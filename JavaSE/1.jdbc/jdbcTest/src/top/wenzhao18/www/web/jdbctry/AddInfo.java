package top.wenzhao18.www.web.jdbctry;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class AddInfo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Properties properties = null;
		properties = new PropInfoGet().getProp();
		String url = properties.getProperty("url");
		String user = properties.getProperty("user");
		String password = properties.getProperty("password");
		Connection conn = null;
		PreparedStatement ps = null;
		Class.forName("com.mysql.jdbc.Driver");
		try {
			conn = DriverManager.getConnection(url, user, password);
			String sql = "insert into user_tbl(username,password) values(?,?)";
			ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setString(1, "zhangsan");
			ps.setString(2, "123");
			int executeUpdate = ps.executeUpdate();
			System.out.println("您的操作使表格发生了" + executeUpdate + "次变化");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
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
