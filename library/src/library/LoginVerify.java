package library;
import java.sql.*;

public class LoginVerify {
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost:3306/library?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    
    // 数据库的用户名与密码
    static final String USER = "root";
    static final String PASS = "123456";
    
    //身份标识 0 is reader; 1 is manager
    static boolean identFlag = false;
    
    public void Start(String loginName, String loginPwd) {
    	Connection conn = null;
    	Statement stmt = null;
    	try{
    		// 注册 JDBC 驱动
    		Class.forName(JDBC_DRIVER);
    		
    		// 打开链接
    		System.out.println("连接数据库...");
    		conn = DriverManager.getConnection(DB_URL,USER,PASS);
    		
    		// 验证id和pwd
    		
    		//管理员验证登录
    		if(identFlag == true) {
    			System.out.println(" 管理员验证登录...");
    			stmt = conn.createStatement();
    			String sql;
    			sql = "SELECT * FROM 管理员";
    			ResultSet rs = stmt.executeQuery(sql);

    			// 展开结果集数据库
    			while(rs.next()){
    				// 通过字段检索
    				int managerID  = rs.getInt("账户ID");
    				String ManagerName = rs.getString("管理员名");
    				String ManagerPwd = rs.getString("管理员密码");
    				//验证
    				if(loginName == ManagerName && loginPwd == ManagerPwd) {
    					//成功切换管理员窗口
    					new ManagerFrame();
    					
    					
    				}else {
    					//失败设置startFrame的textField提示失败，什么也不做
    					
    					
    					
    				}
    				
//    				// debug
//    				System.out.print("账户ID: " + id);
//    				System.out.print(", 管理员名: " + ManagerName);
//    				System.out.print(", 管理员密码: " + ManagerPwd);
//    				System.out.print("\n");
    			}
    			
    			// 完成后关闭
    			rs.close();
    			stmt.close();
    			conn.close();
    		}else {
    			System.out.println(" 读者验证登录...");
    			stmt = conn.createStatement();
    			String sql;
    			sql = "SELECT * FROM 读者";
    			ResultSet rs = stmt.executeQuery(sql);

    			// 展开结果集数据库
    			while(rs.next()){
    				// 通过字段检索
    				int readerID  = rs.getInt("账户ID");
    				String readerName = rs.getString("读者名");
    				String readerPwd = rs.getString("读者密码");
    				//验证
    				if(loginName == readerName && loginPwd == readerPwd) {
    					//成功切换读者用户窗口
    					new UserFrame();
    					
    					
    				}else {
    					//失败设置startFrame的textField提示失败，什么也不做
    					
    					
    					
    				}
    			}
    			// 完成后关闭
    			rs.close();
    			stmt.close();
    			conn.close();
    		}
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    	}catch(SQLException se){
    		// 处理 JDBC 错误
    		se.printStackTrace();
    	}catch(Exception e){
    		// 处理 Class.forName 错误
    		e.printStackTrace();
    	}finally{
    		// 关闭资源
    		try{
    			if(stmt!=null) stmt.close();
    		}catch(SQLException se2){
    		}// 什么都不做
    		try{
    			if(conn!=null) conn.close();
    		}catch(SQLException se){
    			se.printStackTrace();
    		}
    	}
    	System.out.println("再见!");
    }
    
    public static void main(String[] args) {
//    	ConnectControl test = new ConnectControl();
//    	test.Start(USER,PASS);
    }
}
