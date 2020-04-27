package top.wenzhao18.www.web.jdbctry;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class DelInfo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Connection conn = null;
		Properties properties = null;
		properties = new PropInfoGet().getProp();
		String url = properties.getProperty("url");
		String user = properties.getProperty("user");
		String passwd = properties.getProperty("password");
		PreparedStatement ps = null;
		Class.forName("com.mysql.jdbc.Driver");
		try {
			conn = DriverManager.getConnection(url, user, passwd);
			String sql = "delete from user_tbl where username=?";
			ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setString(1, "zhangsan");
			int executeUpdate = ps.executeUpdate();
			System.out.println("本次有" + executeUpdate + "次变化");
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
