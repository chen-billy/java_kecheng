package Ex0514;

import java.sql.*;

public class Ex01 {
	public static void main(String[] args) {
		Statement stmt = null;
		ResultSet rs = null;
		Connection conn = null;
		try {
			// 1.ע�����ݿ������
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2.ͨ��DriverManager��ȡ���ݿ�����
			String url = "jdbc:mysql://localhost:3308/example_jdbc?serverTimezone=UTC&characterEncoding=utf-8";
			String username = "root";
			String password = "123456";
			conn = DriverManager.getConnection(url, username, password);
			// 3.ͨ��Connection�����ȡStatement����
			stmt = conn.createStatement();
			// 4.ʹ��Statementִ��SQL���
			String sql = "select * from users";
			rs = stmt.executeQuery(sql);
			// 5.����ResultSet�����
			System.out.println("id |   name   |   password |   email    |   birthday");
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String psw = rs.getString("password");
				String email = rs.getString("email");
				Date birthday = rs.getDate("birthday");
				System.out.println(id + "  |  " + name + "  |   " + psw + "  |  " + email + "  |  " + birthday);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				stmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				conn = null;
			}
		}
	}
}