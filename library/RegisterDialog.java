package library;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.Color;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

public class RegisterDialog extends JDialog {
	//单例模式
	private RegisterDialog() {};
	private static RegisterDialog instance;
	public static RegisterDialog getInstance(){
		if(instance == null) {
			instance = new RegisterDialog();
			instance.create();
		}
		return instance;
	}
	
	
	private final JPanel contentPanel = new JPanel();
	private JPanel buttonPane;
	private JPasswordField passwordField;
	private JTextField regIDField;
	private JPasswordField passwordKey;
	
	
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost:3306/library?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    
    // 数据库的用户名与密码
    static final String USER = "root";
    static final String PASS = "123456";
    
    //身份标识 0 is reader; 1 is manager
    static boolean identFlag = false;
    //管理员验证密钥
    static final String KEY = "123456";
    
    JTextArea textName = new JTextArea();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
//		try {
//			RegisterDialog dialog = new RegisterDialog();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		RegisterDialog.getInstance();
	}

	/**
	 * Create the dialog.
	 */
	public void create() {
		getContentPane().setBackground(new Color(255, 255, 224));
		setTitle("\u6CE8\u518C");
		setIconImage(Toolkit.getDefaultToolkit().getImage(RegisterDialog.class.getResource("/library/book.jpg")));
		setBounds(100, 100, 717, 468);
		contentPanel.setBackground(new Color(255, 255, 224));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		{
			buttonPane = new JPanel();
			buttonPane.setBackground(new Color(255, 255, 224));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
				
				okButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// 确认
						//先确认是不是勾选管理员注册，再调用connect插入
						if(identFlag == true) {
							//多一个key参数
							connect(textName.getText(), passwordField.getText(), regIDField.getText(), passwordKey.getText());
						}else {
							connect(textName.getText(), passwordField.getText(), regIDField.getText());
						}
						
					}
				});
				
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
				
				//listening
				cancelButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// exit
						identFlag = false;
						RegisterDialog.getInstance().dispose();
						StartFrame.getInstance().setVisible(true);
					}
				});
				
			}
		}
		getContentPane().setLayout(new BorderLayout(0, 0));
		getContentPane().add(contentPanel);
		
		JLabel lblNewLabel = new JLabel("\u6CE8\u518C");
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		textName.setBackground(new Color(255, 250, 240));
		textName.setFont(new Font("Monospaced", Font.PLAIN, 20));
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(255, 250, 240));
		passwordField.setFont(new Font("宋体", Font.PLAIN, 20));
		
		regIDField = new JTextField();
		regIDField.setBackground(new Color(255, 250, 240));
		regIDField.setFont(new Font("宋体", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1 = new JLabel("\u7528\u6237\u540D");
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_1_1 = new JLabel("\u5BC6\u7801");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		
		JLabel lblNewLabel_1_2 = new JLabel("账户ID");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("微软雅黑", Font.BOLD, 18));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("\u521B\u5EFA\u4E3A\u7BA1\u7406\u5458");
		chckbxNewCheckBox.setBackground(new Color(255, 255, 224));
		chckbxNewCheckBox.setFont(new Font("微软雅黑", Font.BOLD, 18));
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_2 = new JLabel("\u7BA1\u7406\u5458\u9A8C\u8BC1\u5BC6\u94A5");
		lblNewLabel_2.setFont(new Font("微软雅黑", Font.BOLD, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		passwordKey = new JPasswordField();
		passwordKey.setBackground(new Color(255, 250, 240));
		passwordKey.setFont(new Font("宋体", Font.PLAIN, 20));
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(135)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 419, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addGap(94)
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
									.addGap(69))
								.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
									.addContainerGap(73, Short.MAX_VALUE)
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
										.addComponent(chckbxNewCheckBox, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
									.addGap(30)))
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(textName, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
								.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 309, GroupLayout.PREFERRED_SIZE)
								.addComponent(regIDField, GroupLayout.PREFERRED_SIZE, 309, GroupLayout.PREFERRED_SIZE)
								.addComponent(passwordKey, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(111, Short.MAX_VALUE))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(34)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(textName, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
					.addGap(30)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(regIDField, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(chckbxNewCheckBox, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(13)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(passwordKey, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addGap(17))
		);
		contentPanel.setLayout(gl_contentPanel);
		getContentPane().add(buttonPane, BorderLayout.SOUTH);
		
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 勾选管理员注册
				JCheckBox ch = (JCheckBox) e.getSource();
				if(ch.isSelected()) {
					identFlag = true;
				}
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	

	//读者注册
	public void connect(String regName, String regPwd, String regID) {
		Connection conn = null;
    	Statement stmt = null;
    	try{
    		
    		// 注册 JDBC 驱动
    		Class.forName(JDBC_DRIVER);
    		
    		// 打开链接
    		System.out.println("连接数据库...");
    		conn = DriverManager.getConnection(DB_URL,USER,PASS);
    		    		
    		//读者验证登录

    		System.out.println(" 读者验证登录...");
    		stmt = conn.createStatement();
    		String sql;
    		sql = "insert into 读者(账户ID, 读者密码, 读者名) values("+regID+", "+regPwd+", '"+regName+"');";
    		System.out.println(sql);
    		stmt.execute(sql);

    		StartFrame.getInstance().setTextField("读者注册成功，请登录！");  
    		RegisterDialog.getInstance().dispose();
    		StartFrame.getInstance().setVisible(true);

    		// 完成后关闭
    		stmt.close();
    		conn.close();
    		
    	}catch(SQLException se){
    		// 处理 JDBC 错误
    		StartFrame.getInstance().setTextField("读者注册失败，注册ID已存在！");   
			RegisterDialog.getInstance().dispose();
			StartFrame.getInstance().setVisible(true);
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
	
	//管理员注册
	public void connect(String regName, String regPwd, String regID, String pwdKey) {
		Connection conn = null;
    	Statement stmt = null;
    	try{
    		
    		// 注册 JDBC 驱动
    		Class.forName(JDBC_DRIVER);
    		
    		// 打开链接
    		System.out.println("连接数据库...");
    		conn = DriverManager.getConnection(DB_URL,USER,PASS);

    		//管理员验证登录
    		if(KEY.equals(pwdKey)) {
    			System.out.println(" 管理员验证登录...");
    			stmt = conn.createStatement();
    			String sql;
    			sql = "insert into 管理员(账户ID, 管理员名, 管理员密码) values("+regID+", '"+regName+"', "+regPwd+");";
    			System.out.println(sql);
    			stmt.execute(sql);

    			StartFrame.getInstance().setTextField("管理员注册成功，请登录！");  
    			RegisterDialog.getInstance().dispose();
    			StartFrame.getInstance().setVisible(true);
    			
    			// 完成后关闭
    			stmt.close();
    			conn.close();
    			
    			
    		}else {
    			StartFrame.getInstance().setTextField("管理员注册失败，密钥错误！");   
				RegisterDialog.getInstance().dispose();
				StartFrame.getInstance().setVisible(true);
    		}
    	
    		
    	}catch(SQLException se){
    		// 处理 JDBC 错误
    		//插入失败
    		StartFrame.getInstance().setTextField("管理员注册失败，注册ID已存在！");   
			RegisterDialog.getInstance().dispose();
			StartFrame.getInstance().setVisible(true);
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
	
	
}
