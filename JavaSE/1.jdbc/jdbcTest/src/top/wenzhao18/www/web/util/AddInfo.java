package top.wenzhao18.www.web.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class AddInfo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = JDBCUtil.getConn();
			String sql = "insert into user_tbl(username,password) values(?,?)";
			ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setString(1, "zhangsan");
			ps.setString(2, "123");
			int executeUpdate = ps.executeUpdate();
			System.out.println("您的操作使表格发生了" + executeUpdate + "次变化");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.release(ps, conn);
		}

	}

}
