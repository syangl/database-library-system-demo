package library;
import java.sql.*;

public class LoginVerify {
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost:3306/library?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    
    // ���ݿ���û���������
    static final String USER = "root";
    static final String PASS = "123456";
    
    //��ݱ�ʶ 0 is reader; 1 is manager
    static boolean identFlag = false;
    
    public void Start(String loginName, String loginPwd) {
    	Connection conn = null;
    	Statement stmt = null;
    	try{
    		// ע�� JDBC ����
    		Class.forName(JDBC_DRIVER);
    		
    		// ������
    		System.out.println("�������ݿ�...");
    		conn = DriverManager.getConnection(DB_URL,USER,PASS);
    		
    		// ��֤id��pwd
    		
    		//����Ա��֤��¼
    		if(identFlag == true) {
    			System.out.println(" ����Ա��֤��¼...");
    			stmt = conn.createStatement();
    			String sql;
    			sql = "SELECT * FROM ����Ա";
    			ResultSet rs = stmt.executeQuery(sql);

    			// չ����������ݿ�
    			while(rs.next()){
    				// ͨ���ֶμ���
    				int managerID  = rs.getInt("�˻�ID");
    				String ManagerName = rs.getString("����Ա��");
    				String ManagerPwd = rs.getString("����Ա����");
    				//��֤
    				if(loginName == ManagerName && loginPwd == ManagerPwd) {
    					//�ɹ��л�����Ա����
    					new ManagerFrame();
    					
    					
    				}else {
    					//ʧ������startFrame��textField��ʾʧ�ܣ�ʲôҲ����
    					
    					
    					
    				}
    				
//    				// debug
//    				System.out.print("�˻�ID: " + id);
//    				System.out.print(", ����Ա��: " + ManagerName);
//    				System.out.print(", ����Ա����: " + ManagerPwd);
//    				System.out.print("\n");
    			}
    			
    			// ��ɺ�ر�
    			rs.close();
    			stmt.close();
    			conn.close();
    		}else {
    			System.out.println(" ������֤��¼...");
    			stmt = conn.createStatement();
    			String sql;
    			sql = "SELECT * FROM ����";
    			ResultSet rs = stmt.executeQuery(sql);

    			// չ����������ݿ�
    			while(rs.next()){
    				// ͨ���ֶμ���
    				int readerID  = rs.getInt("�˻�ID");
    				String readerName = rs.getString("������");
    				String readerPwd = rs.getString("��������");
    				//��֤
    				if(loginName == readerName && loginPwd == readerPwd) {
    					//�ɹ��л������û�����
    					new UserFrame();
    					
    					
    				}else {
    					//ʧ������startFrame��textField��ʾʧ�ܣ�ʲôҲ����
    					
    					
    					
    				}
    			}
    			// ��ɺ�ر�
    			rs.close();
    			stmt.close();
    			conn.close();
    		}
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    	}catch(SQLException se){
    		// ���� JDBC ����
    		se.printStackTrace();
    	}catch(Exception e){
    		// ���� Class.forName ����
    		e.printStackTrace();
    	}finally{
    		// �ر���Դ
    		try{
    			if(stmt!=null) stmt.close();
    		}catch(SQLException se2){
    		}// ʲô������
    		try{
    			if(conn!=null) conn.close();
    		}catch(SQLException se){
    			se.printStackTrace();
    		}
    	}
    	System.out.println("�ټ�!");
    }
    
    public static void main(String[] args) {
//    	ConnectControl test = new ConnectControl();
//    	test.Start(USER,PASS);
    }
}
