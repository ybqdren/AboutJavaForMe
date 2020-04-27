package top.wenzhao18.www.web.util;

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
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conn =JDBCUtil.getConn();
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
			JDBCUtil.release(rs,ps, conn);
		}
	}

}
