package library;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Toolkit;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class UserMessage extends JFrame {
	//����ģʽ
	private UserMessage() {};
	private static UserMessage instance;
	public static UserMessage getInstance(){
		if(instance == null) {
			instance = new UserMessage();
			instance.create();
		}
		return instance;
	}

	private String username;
	private String password;

	private JPanel contentPane;
	private JTextArea textField;
	//private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		UserMessage.getInstance();
	}

	/**
	 * Create the frame.
	 */
	
	
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost:3306/library?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    
    // ���ݿ���û���������
    static final String USER = "root";
    static final String PASS = "123456";
	
	
	public void create() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(UserMessage.class.getResource("/library/book.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1075, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		textField = new JTextArea();
		textField.setEditable(false);
		//textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("΢���ź�", Font.PLAIN, 35));
		scrollPane.setViewportView(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel lblNewLabel = new JLabel("\u8BFB\u8005ID");
		lblNewLabel.setForeground(UIManager.getColor("Button.foreground"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("΢���ź�", Font.BOLD, 30));
		lblNewLabel.setEnabled(false);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u8BFB\u8005\u540D");
		lblNewLabel_1.setEnabled(false);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("΢���ź�", Font.BOLD, 30));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u8BFB\u8005\u5BC6\u7801");
		lblNewLabel_2.setEnabled(false);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("΢���ź�", Font.BOLD, 30));
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
//		JLabel lblNewLabel_3 = new JLabel("\u67E5\u8BE2ID");
//		lblNewLabel_3.setFont(new Font("΢���ź�", Font.BOLD, 20));
//		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		
//		textField_1 = new JTextField();
//		textField_1.setFont(new Font("΢���ź�", Font.PLAIN, 20));
//		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("\u67E5\u8BE2");
		btnNewButton.setFont(new Font("΢���ź�", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					//.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					//.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
					.addGap(513))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
					//.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					//.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addComponent(btnNewButton))
		);
		panel_1.setLayout(gl_panel_1);
		
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lookup();
			}

			private void lookup() {
				Connection conn = null;
		    	Statement stmt = null;
		    	try{
		    		
		    		// ע�� JDBC ����
		    		Class.forName(JDBC_DRIVER);
		    		
		    		// ������
		    		System.out.println("�������ݿ�...");
		    		conn = DriverManager.getConnection(DB_URL,USER,PASS);
		    		    		
		    		//������֤��¼

		    		stmt = conn.createStatement();
		    		String sql;
		    		sql = "select * from ����;";
		    		System.out.println(sql);
		    		ResultSet rs = stmt.executeQuery(sql);

		    		// չ����������ݿ�
		    		StringBuffer str = new StringBuffer("");
		    		while(rs.next()){
		    			// ͨ���ֶμ���
		    			Integer userID = rs.getInt("�˻�ID");
		    			Integer pwd = rs.getInt("��������");
		    			String name = rs.getString("������");
		    			str .append("    "+userID.toString()+"	         "+name+"		"
				    			+pwd.toString()+"\n") ;
		    			textField.setText(str.toString());
		    			

		    			// �������
		    		}
		    		// ��ɺ�ر�
		    		rs.close();
		    		stmt.close();
		    		conn.close();
		    		
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
		});
		
		
		setVisible(true);
	}
}
