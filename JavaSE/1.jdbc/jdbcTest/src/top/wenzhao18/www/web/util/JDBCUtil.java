package top.wenzhao18.www.web.util;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtil {
	static String driverClass = "";
	static String url = "";
	static String name = "";
	static String passwd = "";
	static Connection conn = null;
	
	//读取配置文件
	static {
		try {
			Properties properties = new Properties();
			properties.load(JDBCUtil.class.getResourceAsStream("jdbc.properties"));
			driverClass = properties.getProperty("DriverClass");
			url = properties.getProperty("url");
			name = properties.getProperty("user");
			passwd = properties.getProperty("password");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//获取连接对象
	public static Connection getConn() {
		try {
			Class.forName(driverClass);
			conn = DriverManager.getConnection(url,name,passwd);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException s) {
			s.printStackTrace();
		}
		return conn;
	}
	
	
	//关闭连接
	public static void release(ResultSet rs,PreparedStatement ps,Connection conn){
		closeResultSet(rs);
		closePst(ps);
		closeConn(conn);
	}
	
	public static void release(PreparedStatement ps,Connection conn){
		closePst(ps);
		closeConn(conn);
	}
	
	private static void closeResultSet(ResultSet rs){
		try {
			if (rs != null) {
				rs.close();
			}

		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			rs = null;
		}
	}
	
	private static void closePst(PreparedStatement ps){
		try {
			if (ps != null) {
				ps.close();
			}

		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			ps = null;
		}
	}
	
	private static void closeConn(Connection conn){
		try {
			if (conn != null) {
				conn.close();
			}

		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			conn = null;
		}
	}
}
