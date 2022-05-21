/*
 * ͼ���ѯ�����ġ������¼�û������Ա��ͬһ����壬�ӱ�־������ݣ�����Ա���Ը��¡����롢ɾ�������߶����Բ�ѯ
 */


package library;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class BookLookUp extends JFrame {
	//����ģʽ
	private BookLookUp() {};
	private static BookLookUp instance;
	public static BookLookUp getInstance(){
		if(instance == null) {
			instance = new BookLookUp();
			instance.create();
		}
		return instance;
	}

	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=-49,240
	 */
	private final JPanel panel_1 = new JPanel();
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextArea textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		BookLookUp.getInstance();
	}

	/**
	 * Create the frame.
	 */
	
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost:3306/library?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    
    // ���ݿ���û���������
    static final String USER = "root";
    static final String PASS = "123456";
	
	
	static final String KEY = "123456";
	private static boolean identFlag = false;
	public void setIdentFlagFalse(){
		identFlag = false;
	}
	
	public void create() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1255, 732);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		//�������ͼ
		textField_1 = new JTextArea();
		//textField_1.setHorizontalAlignment(SwingConstants.LEADING);
		textField_1.setFont(new Font("΢���ź�", Font.PLAIN, 30));
		scrollPane.setViewportView(textField_1);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("\u7BA1\u7406\u5458\u64CD\u4F5C \u8F93\u5165\u5BC6\u94A5");
		chckbxNewCheckBox.setFont(new Font("����", Font.BOLD, 20));
		
		passwordField = new JPasswordField();
		
		JLabel lblNewLabel_5 = new JLabel("ͼ��ID");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5.setFont(new Font("΢���ź�", Font.BOLD, 20));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u67E5\u8BE2");
		
		JButton btnNewButton_1 = new JButton("\u5220\u9664");
		
		JButton btnNewButton_2 = new JButton("\u66F4\u65B0");
		
		JButton btnNewButton_3 = new JButton("\u63D2\u5165");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(17)
					.addComponent(chckbxNewCheckBox)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
					.addGap(21)
					.addComponent(lblNewLabel_5, GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(btnNewButton)
					.addGap(40)
					.addComponent(btnNewButton_2)
					.addGap(38)
					.addComponent(btnNewButton_1)
					.addGap(29)
					.addComponent(btnNewButton_3)
					.addGap(27))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(11)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxNewCheckBox)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(14)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_5)
						.addComponent(textField, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_2)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton_3)))
		);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 5, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("\u56FE\u4E66ID");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("΢���ź�", Font.BOLD, 20));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u4F5C\u8005");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("΢���ź�", Font.BOLD, 20));
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u4EF7\u683C");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("΢���ź�", Font.BOLD, 20));
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u51FA\u7248\u793E");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("΢���ź�", Font.BOLD, 20));
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel = new JLabel("\u5E93\u5B58\u6570\u91CF");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("΢���ź�", Font.BOLD, 20));
		panel.add(lblNewLabel);
		
		//�����ѯɾ����������ת�������Ի���
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(identFlag == true) {
					BookLookUp.getInstance().dispose();
					UpdateInsertDelete.getInstance().setVisible(true);
				}
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(identFlag == true) {
					BookLookUp.getInstance().dispose();
					UpdateInsertDelete.getInstance().setVisible(true);
				}
			}
		});
		btnNewButton_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(identFlag == true) {
					BookLookUp.getInstance().dispose();
					UpdateInsertDelete.getInstance().setVisible(true);
				}
			}
		});
		
		//listeners
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ����Ա����
				JCheckBox ch = (JCheckBox)e.getSource();
				if(ch.isSelected()) {
					if(passwordField.getText().equals(KEY)) {
						identFlag = true;
					}
				}
			}
		});
		//��ѯ
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lookUp(textField.getText());
			}

			public void lookUp(String bookID) {
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
		    		sql = "select * from ͼ�� where ͼ��ID = "+bookID+";";
		    		System.out.println(sql);
		    		ResultSet rs = stmt.executeQuery(sql);

		    		// չ����������ݿ�
		    		StringBuffer str = new StringBuffer("");
		    		while(rs.next()){
		    			// ͨ���ֶμ���
		    			Integer ID  = rs.getInt("ͼ��ID");
		    			String author = rs.getString("����");
		    			Integer price = rs.getInt("�۸�");
		    			String publiser = rs.getString("������");
		    			Integer num = rs.getInt("�������");
		    			str.append(ID.toString()+" 	          "+author
		    					+"	               "+price.toString()+"		"+publiser+"	  "+num.toString()+"\n");
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
		
		
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(StartFrame.class.getResource("/library/book.jpg")));
		setVisible(true);
	}

}
