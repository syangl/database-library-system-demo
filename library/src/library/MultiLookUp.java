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

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class MultiLookUp extends JDialog {
	//����ģʽ
	private MultiLookUp() {};
	private static MultiLookUp instance;
	public static MultiLookUp getInstance(){
		if(instance == null) {
			instance = new MultiLookUp();
			instance.create();
		}
		return instance;
	}

	private final JPanel contentPanel = new JPanel();
	private JScrollPane scrollPane;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextArea textField;
	//private JTextField textField_1;
	//private JLabel lblNewLabel;
	
	
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost:3306/library?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    
    // ���ݿ���û���������
    static final String USER = "root";
    static final String PASS = "123456";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		MultiLookUp.getInstance();
	}

	/**
	 * Create the dialog.
	 */
	public void create() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MultiLookUp.class.getResource("/library/book.jpg")));
		setBounds(100, 100, 1206, 645);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			scrollPane = new JScrollPane();
		}
		contentPanel.setLayout(new BorderLayout(0, 0));
		contentPanel.add(scrollPane);
		{
			textField = new JTextArea();
			textField.setColumns(10);
			textField.setAlignmentY(TOP_ALIGNMENT);
			textField.setFont(new Font("΢���ź�", Font.BOLD, 20));
			textField.setEditable(false);
			textField.setSize(2000, 2000);
			scrollPane.setViewportView(textField);
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.NORTH);
			{
				lblNewLabel_1 = new JLabel("\u501F\u9605\u8BB0\u5F55ID");
				lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1.setFont(new Font("΢���ź�", Font.BOLD, 20));
			}
			{
				lblNewLabel_2 = new JLabel("\u501F\u9605\u6570\u91CF");
				lblNewLabel_2.setFont(new Font("΢���ź�", Font.BOLD, 20));
				lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			}
			JLabel lblNewLabel_2_1 = new JLabel("\u501F\u51FA\u65E5\u671F");
			lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2_1.setFont(new Font("΢���ź�", Font.BOLD, 20));
			JLabel lblNewLabel_2_2 = new JLabel("\u5F52\u8FD8\u671F\u9650");
			lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2_2.setFont(new Font("΢���ź�", Font.BOLD, 20));
			JLabel lblNewLabel_2_3 = new JLabel("\u56FE\u4E66ID");
			lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2_3.setFont(new Font("΢���ź�", Font.BOLD, 20));
			JLabel lblNewLabel_2_4 = new JLabel("\u8D26\u6237ID");
			lblNewLabel_2_4.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2_4.setFont(new Font("΢���ź�", Font.BOLD, 20));
			JLabel lblNewLabel_2_5 = new JLabel("\u51FA\u7248\u793E");
			lblNewLabel_2_5.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2_5.setFont(new Font("΢���ź�", Font.BOLD, 20));
			GroupLayout gl_panel = new GroupLayout(panel);
			gl_panel.setHorizontalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel.createSequentialGroup()
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
						.addGap(45)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
						.addGap(32)
						.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
						.addGap(33)
						.addComponent(lblNewLabel_2_2, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
						.addGap(66)
						.addComponent(lblNewLabel_2_3, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
						.addGap(75)
						.addComponent(lblNewLabel_2_4, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
						.addGap(37)
						.addComponent(lblNewLabel_2_5, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
			);
			gl_panel.setVerticalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel_2_5, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel_2_4, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel_2_3, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel_2_2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
			);
			panel.setLayout(gl_panel);
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.SOUTH);
			{
//				lblNewLabel = new JLabel("\u67E5\u8BE2\u8D26\u6237ID");
//				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
//				lblNewLabel.setFont(new Font("΢���ź�", Font.BOLD, 20));
			}
			{
//				textField_1 = new JTextField();
//				textField_1.setColumns(10);
			}
			
			JButton btnNewButton = new JButton("\u67E5\u8BE2");
			btnNewButton.setFont(new Font("΢���ź�", Font.BOLD, 20));
			btnNewButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// ��ѯ
					multiLookUp();
				}

				// ��ѯ��ͼ
				public void multiLookUp() {
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
			    		sql = "select * from multi_lookup;";
			    		System.out.println(sql);
			    		ResultSet rs = stmt.executeQuery(sql);

			    		// չ����������ݿ�
			    		StringBuffer str = new StringBuffer("");
			    		while(rs.next()){
			    			// ͨ���ֶμ���
			    			Integer borrowID  = rs.getInt("���ļ�¼ID");
			    			Integer borrowNum = rs.getInt("��������");
			    			String borrowDate = rs.getString("�������");
			    			String backDate = rs.getString("�黹����");
			    			Integer bookID = rs.getInt("ͼ��ID");
			    			Integer userID = rs.getInt("�˻�ID");
			    			String publiser = rs.getString("������");
			    			str.append(borrowID.toString()+" 	"+borrowNum.toString()+" 	"+borrowDate
			    					+" 	    "+backDate+"		"+bookID.toString()+" 	"+userID.toString()+"	"+publiser+"\n");
			    			
			    			textField.setText(str.toString());
			    			

			    			// �������
			    			System.out.print("����ID " + borrowID);
			    			System.out.print(", �������� " + borrowNum);
			    			System.out.print(", ������� " + borrowDate);
			    			System.out.print("�黹����\n");
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
			GroupLayout gl_panel = new GroupLayout(panel);
			gl_panel.setHorizontalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel.createSequentialGroup()
						.addGap(311)
						//.addComponent(lblNewLabel)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						//.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addComponent(btnNewButton)
						.addGap(404))
			);
			gl_panel.setVerticalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel.createSequentialGroup()
						.addGap(8)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							//.addComponent(lblNewLabel)
							//.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnNewButton))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
			);
			panel.setLayout(gl_panel);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
				
				okButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						MultiLookUp.getInstance().dispose();
						ManagerFrame.getInstance().setVisible(true);
					}
				});
				
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
				
				cancelButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						MultiLookUp.getInstance().dispose();
						ManagerFrame.getInstance().setVisible(true);
					}
				});
				
			}
		}
		
		
	
		setResizable(false);
		setVisible(true);
	}
}
