package library;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
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

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class BorrowRecords extends JFrame {
	//����ģʽ
	private BorrowRecords() {};
	private static BorrowRecords instance;
	public static BorrowRecords getInstance(){
		if(instance == null) {
			instance = new BorrowRecords();
			instance.create();
		}
		return instance;
	}


	private JPanel contentPane;
	private JTextField textField;
	private JTextArea textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		BorrowRecords.getInstance();
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
		setIconImage(Toolkit.getDefaultToolkit().getImage(BorrowRecords.class.getResource("/library/book.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1041, 662);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		textField_1 = new JTextArea();
		textField_1.setEditable(false);
		textField_1.setFont(new Font("΢���ź�", Font.PLAIN, 22));
		scrollPane.setViewportView(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 6, 0, 0));
		
		JLabel lblNewLabel = new JLabel("\u501F\u9605\u6570\u91CF");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("΢���ź�", Font.BOLD, 20));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u501F\u51FA\u65E5\u671F");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("΢���ź�", Font.BOLD, 20));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u5F52\u8FD8\u671F\u9650");
		lblNewLabel_2.setFont(new Font("΢���ź�", Font.BOLD, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u501F\u9605\u8BB0\u5F55ID");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("΢���ź�", Font.BOLD, 20));
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u56FE\u4E66ID");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("΢���ź�", Font.BOLD, 20));
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u8D26\u6237ID");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("΢���ź�", Font.BOLD, 20));
		panel.add(lblNewLabel_5);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_6 = new JLabel("\u67E5\u8BE2\u8D26\u6237ID");
		lblNewLabel_6.setFont(new Font("΢���ź�", Font.BOLD, 20));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField = new JTextField();
		textField.setFont(new Font("΢���ź�", Font.PLAIN, 20));
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u67E5\u8BE2");
		btnNewButton.setFont(new Font("΢���ź�", Font.BOLD, 20));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(29)
					.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(713, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(textField, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(3))))
		);
		panel_1.setLayout(gl_panel_1);
		
		//��ѯ
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lookUp(textField.getText());
			}

			private void lookUp(String borrowID) {
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
		    		sql = "select * from ���ļ�¼ where �˻�ID = "+borrowID+";";
		    		System.out.println(sql);
		    		ResultSet rs = stmt.executeQuery(sql);

		    		// չ����������ݿ�
		    		StringBuffer str = new StringBuffer("");
		    		while(rs.next()){
		    			// ͨ���ֶμ���
		    			Integer borrowNum = rs.getInt("��������");
		    			String borrowDate = rs.getString("�������");
		    			String backDate = rs.getString("�黹����");
		    			Integer ID  = rs.getInt("���ļ�¼ID");
		    			Integer bookID = rs.getInt("ͼ��ID");
		    			Integer userID = rs.getInt("�˻�ID");
		    			str.append("    "+borrowNum.toString()+"	"+borrowDate
		    					+"	"+backDate+"	"+ID.toString()+"	"+bookID.toString()+"	"+userID.toString()+"\n");
		    			
		    			textField_1.setText(str.toString());
		    			

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
		
		
		setResizable(false);
		setVisible(true);
	}
}
