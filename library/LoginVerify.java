package library;
import java.awt.Font;
import java.sql.*;

public class LoginVerify {
	//����ģʽ
	private LoginVerify() {};
	private static LoginVerify instance;
	public static LoginVerify getInstance(){
		if(instance == null) {
			instance = new LoginVerify();
		}
		return instance;
	}
	
	
	
	
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost:3306/library?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    
    // ���ݿ���û���������
    static final String USER = "root";
    static final String PASS = "123456";
    
    //��ݱ�ʶ 0 is reader; 1 is manager
    static boolean identFlag = false;
    
    public void Connect(String loginName, String loginPwd) {
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
    			sql = "SELECT * FROM ����Ա WHERE �˻�ID = " + "'" + loginName + "';";
    			ResultSet rs = stmt.executeQuery(sql);
    			//System.out.println(sql);
    			// չ����������ݿ�
    			while(rs.next()){
    				// ͨ���ֶμ���
    				Integer managerID  = rs.getInt("�˻�ID");
    				String ManagerName = rs.getString("����Ա��");
    				String ManagerPwd = rs.getString("����Ա����");
    				//��֤
    				if(loginName.equals(managerID.toString()) && loginPwd.equals(ManagerPwd)) {
    					//�ɹ��л�����Ա����
    					System.out.println("success login");
    					StartFrame.getInstance().dispose();
    					ManagerFrame.getInstance().setVisible(true);
    					
    					
    				}else {
    					//ʧ������startFrame��textField��ʾʧ�ܣ�ʲôҲ����
    					System.out.println("fail login");
    					StartFrame.getInstance().setTextField("�û���������������������룡");
    					
    				}
    				
    				// debug
    				System.out.println("loginName " + loginName + ", loginPwd " + loginPwd);
    				System.out.print("�˻�ID: " + managerID);
    				System.out.print(", ����Ա��: " + ManagerName);
    				System.out.print(", ����Ա����: " + ManagerPwd);
    				System.out.print("\n");
    			}
    			
    			// ��ɺ�ر�
    			rs.close();
    			stmt.close();
    			conn.close();
    			
    			identFlag = false;
    		}else {
    			System.out.println(" ������֤��¼...");
    			stmt = conn.createStatement();
    			String sql;
    			sql = "SELECT * FROM ���� WHERE �˻�ID = " + "'" + loginName + "';";
    			ResultSet rs = stmt.executeQuery(sql);

    			// չ����������ݿ�
    			while(rs.next()){
    				// ͨ���ֶμ���
    				Integer readerID  = rs.getInt("�˻�ID");
    				String readerName = rs.getString("������");
    				String readerPwd = rs.getString("��������");
    				//��֤
    				if(loginName.equals(readerID.toString()) && loginPwd.equals(readerPwd)) {
    					//�ɹ��л������û�����
    					UserFrame.getInstance().show();
    					
    					
    				}else {
    					//ʧ������startFrame��textField��ʾʧ�ܣ�ʲôҲ����
    					StartFrame.getInstance().setTextField("�û���������������������룡");    					
    					StartFrame.getInstance().show();
    				}
    			}
    			// ��ɺ�ر�
    			rs.close();
    			stmt.close();
    			conn.close();
    			
    			identFlag = false;
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
