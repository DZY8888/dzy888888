package util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 数据库连接工具类
 * @author 10734
 *
 */
public class DBUtil {
	
	public static Connection conn;
	
	public static Connection getConnection() {
		try {
			//加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			//数据库地址
			String url = "jdbc:mysql://127.0.0.1:3306/constructiondb?useUnicode&characterEncoding=UTF-8";
			//数据库用户名
			String user = "root";
			//数据库密码
			String password = "123456";
			//获得数据库连接
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("数据库驱动加载成功:"+conn);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
