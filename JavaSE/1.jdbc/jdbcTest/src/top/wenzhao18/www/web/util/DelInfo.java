package top.wenzhao18.www.web.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class DelInfo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = JDBCUtil.getConn();
			String sql = "delete from user_tbl where username=?";
			ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setString(1, "zhangsan");
			int executeUpdate = ps.executeUpdate();
			System.out.println( executeUpdate);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.release(ps, conn);
		}

	}

}
