package top.wenzhao18.www.web.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class AlertInfo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Connection conn = null;
		PreparedStatement ps = null;
		Class.forName("com.mysql.jdbc.Driver");
		try {
			conn = JDBCUtil.getConn();
			String sql = "update user_tbl set password=? where username=?";
			ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setString(1, "123456");
			ps.setString(2, "zhangsan");
			int executeUpdate = ps.executeUpdate();
			System.out.println(executeUpdate);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.release(ps, conn);
		}

	}

}
