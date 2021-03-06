/*
 *按照从上到下从左至右的序号是开始界面的文本框序号 
 */

package library;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateInsertDelete extends JDialog {
	//单例模式
	private UpdateInsertDelete() {};
	private static UpdateInsertDelete instance;
	public static UpdateInsertDelete getInstance(){
		if(instance == null) {
			instance = new UpdateInsertDelete();
			instance.create();
		}
		return instance;
	}
	
	
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost:3306/library?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    
    // 数据库的用户名与密码
    static final String USER = "root";
    static final String PASS = "123456";
	
	
	

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		UpdateInsertDelete.getInstance();
	}

	/**
	 * Create the dialog.
	 */
	public void create() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(UpdateInsertDelete.class.getResource("/library/book.jpg")));
		setBounds(100, 100, 1190, 829);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 228, 225));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		textField = new JTextField();
		textField.setBackground(new Color(255, 250, 205));
		textField.setFont(new Font("微软雅黑", Font.BOLD, 20));
		textField.setEditable(false);
		textField.setColumns(10);
		JLabel lblNewLabel = new JLabel("\u56FE\u4E66\u64CD\u4F5C");
		lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel lblNewLabel_1 = new JLabel("\u501F\u9605\u8BB0\u5F55\u64CD\u4F5C");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		JLabel lblNewLabel_2 = new JLabel("\u7F5A\u6B3E\u8BB0\u5F55\u64CD\u4F5C");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		JLabel BookIDLabel = new JLabel("\u56FE\u4E66ID");
		BookIDLabel.setFont(new Font("微软雅黑", Font.BOLD, 20));
		BookIDLabel.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel AuthorLabel_1 = new JLabel("\u4F5C\u8005");
		AuthorLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		AuthorLabel_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		JLabel BookPriceLabel = new JLabel("\u4EF7\u683C");
		BookPriceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		BookPriceLabel.setFont(new Font("微软雅黑", Font.BOLD, 20));
		JLabel PublisherLabel = new JLabel("\u51FA\u7248\u793E");
		PublisherLabel.setHorizontalAlignment(SwingConstants.CENTER);
		PublisherLabel.setFont(new Font("微软雅黑", Font.BOLD, 20));
		JLabel NumLabel = new JLabel("\u5E93\u5B58\u6570\u91CF");
		NumLabel.setHorizontalAlignment(SwingConstants.CENTER);
		NumLabel.setFont(new Font("微软雅黑", Font.BOLD, 20));
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JLabel BookIDLabel_1 = new JLabel("\u501F\u9605\u6570\u91CF");
		BookIDLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		BookIDLabel_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		
		JLabel BookIDLabel_1_1 = new JLabel("\u501F\u51FA\u65E5\u671F");
		BookIDLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		BookIDLabel_1_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		
		JLabel BookIDLabel_1_2 = new JLabel("\u5F52\u8FD8\u671F\u9650");
		BookIDLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		BookIDLabel_1_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
		
		JLabel BookIDLabel_1_3 = new JLabel("\u501F\u9605\u8BB0\u5F55ID");
		BookIDLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		BookIDLabel_1_3.setFont(new Font("微软雅黑", Font.BOLD, 20));
		
		JLabel BookIDLabel_1_4 = new JLabel("\u56FE\u4E66ID");
		BookIDLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		BookIDLabel_1_4.setFont(new Font("微软雅黑", Font.BOLD, 20));
		
		JLabel BookIDLabel_1_5 = new JLabel("\u8D26\u6237ID");
		BookIDLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		BookIDLabel_1_5.setFont(new Font("微软雅黑", Font.BOLD, 20));
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		
		JButton bookInsertButton = new JButton("\u63D2\u5165");
		bookInsertButton.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		
		JButton bookDeleteButton = new JButton("\u5220\u9664");
		bookDeleteButton.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		
		JButton bookUpdateButton = new JButton("\u66F4\u65B0");
		bookUpdateButton.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		
		JButton borrowInsertButton_1 = new JButton("\u63D2\u5165");
		borrowInsertButton_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		
		JButton borrowDeleteButton_1 = new JButton("\u5220\u9664");
		borrowDeleteButton_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		
		JButton borrowUpdateButton = new JButton("\u66F4\u65B0");
		borrowUpdateButton.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		
		JLabel BookIDLabel_1_6 = new JLabel("\u672A\u8FD8\u6570\u91CF");
		BookIDLabel_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		BookIDLabel_1_6.setFont(new Font("微软雅黑", Font.BOLD, 20));
		
		JLabel BookIDLabel_1_3_1 = new JLabel("\u56FE\u4E66ID");
		BookIDLabel_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		BookIDLabel_1_3_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		
		JLabel BookIDLabel_1_3_2 = new JLabel("\u7F5A\u6B3E\u91D1\u989D");
		BookIDLabel_1_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		BookIDLabel_1_3_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
		
		JLabel BookIDLabel_1_3_3 = new JLabel("\u8D26\u6237ID");
		BookIDLabel_1_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		BookIDLabel_1_3_3.setFont(new Font("微软雅黑", Font.BOLD, 20));
		
		JLabel BookIDLabel_1_3_4 = new JLabel("\u7F5A\u6B3E\u8BB0\u5F55ID");
		BookIDLabel_1_3_4.setHorizontalAlignment(SwingConstants.CENTER);
		BookIDLabel_1_3_4.setFont(new Font("微软雅黑", Font.BOLD, 20));
		
		JLabel BookIDLabel_1_3_5 = new JLabel("\u8D85\u65F6\u65F6\u957F");
		BookIDLabel_1_3_5.setHorizontalAlignment(SwingConstants.CENTER);
		BookIDLabel_1_3_5.setFont(new Font("微软雅黑", Font.BOLD, 20));
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		
		JButton penaltyInsertButton_1_1 = new JButton("\u63D2\u5165");
		penaltyInsertButton_1_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		
		JButton penaltyDeleteButton_1_1 = new JButton("\u5220\u9664");
		penaltyDeleteButton_1_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		
		JButton penaltyUpdateButton_1 = new JButton("\u66F4\u65B0");
		penaltyUpdateButton_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 1166, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 2095, Short.MAX_VALUE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(BookIDLabel, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(AuthorLabel_1, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
							.addGap(5)
							.addComponent(BookPriceLabel, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
							.addGap(20)
							.addComponent(PublisherLabel, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
							.addGap(8)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(NumLabel, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
							.addGap(9)
							.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(24)
							.addComponent(BookIDLabel_1, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
							.addGap(13)
							.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
							.addGap(147)
							.addComponent(BookIDLabel_1_1, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
							.addGap(45)
							.addComponent(BookIDLabel_1_2, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
							.addGap(9)
							.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(7)
							.addComponent(BookIDLabel_1_3, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
							.addGap(147)
							.addComponent(BookIDLabel_1_4, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
							.addGap(23)
							.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
							.addGap(44)
							.addComponent(BookIDLabel_1_5, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
							.addGap(26)
							.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(241)
							.addComponent(borrowInsertButton_1, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
							.addGap(178)
							.addComponent(borrowDeleteButton_1, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
							.addGap(171)
							.addComponent(borrowUpdateButton, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(231)
							.addComponent(bookInsertButton, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
							.addGap(171)
							.addComponent(bookDeleteButton, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
							.addGap(172)
							.addComponent(bookUpdateButton, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 1144, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(25)
							.addComponent(BookIDLabel_1_6, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
							.addGap(8)
							.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
							.addGap(149)
							.addComponent(BookIDLabel_1_3_2, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
							.addGap(13)
							.addComponent(BookIDLabel_1_3_4, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(27)
							.addComponent(BookIDLabel_1_3_1, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
							.addGap(25)
							.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
							.addGap(145)
							.addComponent(BookIDLabel_1_3_3, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
							.addGap(20)
							.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
							.addGap(39)
							.addComponent(BookIDLabel_1_3_5, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
							.addGap(5)
							.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(243)
							.addComponent(penaltyInsertButton_1_1, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
							.addGap(170)
							.addComponent(penaltyDeleteButton_1_1, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
							.addGap(184)
							.addComponent(penaltyUpdateButton_1, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 1162, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(10)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(12)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(13)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(10)
							.addComponent(PublisherLabel, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(NumLabel, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addComponent(BookIDLabel, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addComponent(AuthorLabel_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addComponent(BookPriceLabel, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(8)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(9)
							.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(54)
							.addComponent(bookInsertButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addGap(31))
						.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(bookDeleteButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addGap(31))
						.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(bookUpdateButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addGap(32)))
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addGap(19)
									.addComponent(BookIDLabel_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addGap(18)
									.addComponent(BookIDLabel_1_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addGap(17)
									.addComponent(BookIDLabel_1_2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPanel.createSequentialGroup()
											.addGap(31)
											.addComponent(BookIDLabel_1_5, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPanel.createSequentialGroup()
											.addGap(23)
											.addComponent(BookIDLabel_1_4, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))))
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addGap(27)
									.addComponent(BookIDLabel_1_3, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
							.addGap(22))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(19)
							.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addGap(30)
							.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(20)
							.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addGap(23)
							.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(14)
							.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addGap(34)
							.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(17)
							.addComponent(borrowInsertButton_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(20)
							.addComponent(borrowDeleteButton_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(borrowUpdateButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
					.addGap(19)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(14)
							.addComponent(BookIDLabel_1_6, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(38)
							.addComponent(BookIDLabel_1_3_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(3)
							.addComponent(BookIDLabel_1_3_2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(32)
							.addComponent(BookIDLabel_1_3_3, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(1)
							.addComponent(BookIDLabel_1_3_4, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(33)
							.addComponent(BookIDLabel_1_3_5, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(15)
							.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addGap(36)
							.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(5)
							.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addGap(36)
							.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(2)
							.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addGap(32)
							.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
							.addComponent(penaltyInsertButton_1_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
							.addComponent(penaltyDeleteButton_1_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addGap(9))
						.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
							.addComponent(penaltyUpdateButton_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(255, 228, 225));
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
						UpdateInsertDelete.getInstance().dispose();
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
						UpdateInsertDelete.getInstance().dispose();
						ManagerFrame.getInstance().setVisible(true);
					}
				});
				
			}
		}
		
		//listeners
		bookInsertButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 插入图书
				InsertBookConnect(textField_1.getText(), textField_2.getText(),
						textField_3.getText(), textField_4.getText(), textField_5.getText());
			}
		});
		
		borrowInsertButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 借阅记录插入
				InsertBorrowConnect(textField_6.getText(), textField_7.getText(), textField_8.getText(), 
										textField_9.getText(), textField_10.getText(), textField_11.getText());
				
			}
		});
		
		penaltyInsertButton_1_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 罚款记录插入
				InsertPenaltyConnect(textField_12.getText(), textField_14.getText(), textField_16.getText(), 
						textField_13.getText(), textField_15.getText(), textField_17.getText());
			}
		});
		
		bookDeleteButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 图书事物删除
				DeleteBookConnect(textField_1.getText());
			}
		});
		
		penaltyDeleteButton_1_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 罚款记录删除
				DeletePenaltyConnect(textField_16.getText());
			}
		});
		
		borrowDeleteButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 借阅记录删除
				DeleteBorrowConnect(textField_9.getText());
			}
		});
		
		bookUpdateButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// book数量更新
				String str = textField_5.getText();
				String[] addNum = str.split("\\+");
				UpdateBookConnect(addNum[1], textField_1.getText(), "1");//1代表图书
			}
		});
		
		borrowUpdateButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 借阅数量更新
				String str = textField_6.getText();
				String[] addNum = str.split("\\+");
				UpdateBorrowConnect(addNum[1], textField_9.getText(), "2");//2代表借阅
			}
		});
		
		penaltyUpdateButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 罚款数量更新
				String str = textField_12.getText();
				String[] addNum = str.split("\\+");
				UpdatePenaltyConnect(addNum[1], textField_16.getText(), "3");//3代表罚款
			}
		});
		
		
		
		
		
		
		
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	
	
	//按下插入更新删除，调用对应的connect函数进行sql操作，结果成功与否反馈在最上方的文本框（记录可以回到查询界面查询）
	//图书，无关联
	public void InsertBookConnect(String bookID, String author, String price, String publisher, String numbers) {
		Connection conn = null;
    	Statement stmt = null;
    	try{
    		
    		// 注册 JDBC 驱动
    		Class.forName(JDBC_DRIVER);
    		
    		// 打开链接
    		System.out.println("连接数据库...");
    		conn = DriverManager.getConnection(DB_URL,USER,PASS);
    		    		
    		//读者验证登录

    		stmt = conn.createStatement();
    		String sql;
    		if(author.equals("")) {
    			author = "NULL";
    		}
    		if(price.equals("")) {
    			price = "NULL";
    		}
    		if(publisher.equals("")) {
    			publisher = "NULL";
    		}
    		if(numbers.equals("")) {
    			numbers = "NULL";
    		}
    		sql = "insert into 图书(图书ID, 作者, 价格, 出版社, 库存数量) values("+bookID+", '"+author+"', "+price+", '"+publisher+"', "+numbers+");";
    		System.out.println(sql);
    		stmt.execute(sql);

    		UpdateInsertDelete.getInstance().textField.setText("图书插入成功！");
    		// 完成后关闭
    		stmt.close();
    		conn.close();
    		
    	}catch(SQLException se){
    		// 处理 JDBC 错误
    		UpdateInsertDelete.getInstance().textField.setText("图书插入失败！");
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
	
	public void DeleteBookConnect(String bookID) {
		Connection conn = null;
    	Statement stmt = null;
    	try{
    		
    		// 注册 JDBC 驱动
    		Class.forName(JDBC_DRIVER);
    		
    		// 打开链接
    		System.out.println("连接数据库...");
    		conn = DriverManager.getConnection(DB_URL,USER,PASS);
    		    		
    		//读者验证登录
    		int sql1Res = -1;//判断delete是否正常执行
    		int sql2Res = -1;
    		int sql3Res = -1;
    		stmt = conn.createStatement();
    		String sqlstart;
    		sqlstart = "start transaction";
    		stmt.execute(sqlstart);
    		String sql1;
    		sql1 = "delete from 借阅记录 where 借阅记录.图书ID = "+bookID+";";
    		sql1Res = stmt.executeUpdate(sql1);
    		String sql2;
    		sql2 = "delete from 罚款记录 where 罚款记录.图书ID = "+bookID+";";
    		sql2Res = stmt.executeUpdate(sql2);
    		String sql3;
    		sql3 = "delete from 图书 where 图书ID = "+bookID+";";
    		sql3Res = stmt.executeUpdate(sql3);
    		String sqlend;
    		if(sql1Res >= 0 && sql2Res >=0 && sql3Res >= 0) {
    			sqlend = "commit";
    			stmt.execute(sqlend);
    			UpdateInsertDelete.getInstance().textField.setText("commit！");
    		}else {
    			sqlend = "rollback";
    			stmt.execute(sqlend);
    			UpdateInsertDelete.getInstance().textField.setText("rollback！");
    		}

    		// 完成后关闭
    		stmt.close();
    		conn.close();
    		
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
	
	public void UpdateBookConnect(String addNum, String bookID, String optionType) {
		Connection conn = null;
    	Statement stmt = null;
    	try{
    		
    		// 注册 JDBC 驱动
    		Class.forName(JDBC_DRIVER);
    		
    		// 打开链接
    		System.out.println("连接数据库...");
    		conn = DriverManager.getConnection(DB_URL,USER,PASS);

    		stmt = conn.createStatement();
    		String sql;
    		sql = "call num_update("+addNum+","+bookID+","+optionType+");";
    		System.out.println(sql);
    		stmt.execute(sql);

    		UpdateInsertDelete.getInstance().textField.setText("库存数量更新成功！");
    		// 完成后关闭
    		stmt.close();
    		conn.close();
    		
    	}catch(SQLException se){
    		// 处理 JDBC 错误
    		UpdateInsertDelete.getInstance().textField.setText("库存数量更新失败！");
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
	//借阅记录，关联账号和图书
	public void InsertBorrowConnect(String borrowNum, String borrowDate, String backDate, String borrowID, String bookID, String userID) {
		Connection conn = null;
    	Statement stmt = null;
    	try{
    		
    		// 注册 JDBC 驱动
    		Class.forName(JDBC_DRIVER);
    		
    		// 打开链接
    		System.out.println("连接数据库...");
    		conn = DriverManager.getConnection(DB_URL,USER,PASS);
    		    		
    		//读者验证登录

    		stmt = conn.createStatement();
    		String sql;
    		if(borrowNum.equals("")) {
    			borrowNum = "NULL";
    		}
    		if(borrowDate.equals("")) {
    			borrowDate = "NULL";
    		}
    		if(backDate.equals("")) {
    			backDate = "NULL";
    		}

    		sql = "insert into 借阅记录(借阅数量, 借出日期, 归还期限, 借阅记录ID, 图书ID, 账户ID) values("+borrowNum+", '"+borrowDate+"', '"+backDate+"', "+borrowID+", "+bookID+", "+userID+");";
    		System.out.println(sql);
    		stmt.execute(sql);

    		UpdateInsertDelete.getInstance().textField.setText("借阅记录插入成功！");
    		// 完成后关闭
    		stmt.close();
    		conn.close();
    		
    	}catch(SQLException se){
    		// 处理 JDBC 错误
    		UpdateInsertDelete.getInstance().textField.setText("借阅记录插入失败，图书或读者账号不存在或ID为空！");
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
	
	public void DeleteBorrowConnect(String borrowID) {
		Connection conn = null;
    	Statement stmt = null;
    	try{
    		
    		// 注册 JDBC 驱动
    		Class.forName(JDBC_DRIVER);
    		
    		// 打开链接
    		System.out.println("连接数据库...");
    		conn = DriverManager.getConnection(DB_URL,USER,PASS);
    		    		
    		//读者验证登录

    		stmt = conn.createStatement();
    		String sql;
    		sql = "delete from 借阅记录 where 借阅记录ID = "+borrowID+";";
    		stmt.executeUpdate(sql);
    		System.out.println(sql);

    		UpdateInsertDelete.getInstance().textField.setText("借阅记录删除成功！");
    		// 完成后关闭
    		stmt.close();
    		conn.close();
    	}catch(SQLException se){
    		// 处理 JDBC 错误
    		UpdateInsertDelete.getInstance().textField.setText("借阅记录删除失败，ID未填或不存在！");
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
	
	public void UpdateBorrowConnect(String addNum, String borrowID, String optionType) {
		Connection conn = null;
    	Statement stmt = null;
    	try{
    		
    		// 注册 JDBC 驱动
    		Class.forName(JDBC_DRIVER);
    		
    		// 打开链接
    		System.out.println("连接数据库...");
    		conn = DriverManager.getConnection(DB_URL,USER,PASS);

    		stmt = conn.createStatement();
    		String sql;
    		sql = "call num_update("+addNum+","+borrowID+","+optionType+");";
    		System.out.println(sql);
    		stmt.execute(sql);

    		UpdateInsertDelete.getInstance().textField.setText("借阅数量更新成功！");
    		// 完成后关闭
    		stmt.close();
    		conn.close();
    		
    	}catch(SQLException se){
    		// 处理 JDBC 错误
    		UpdateInsertDelete.getInstance().textField.setText("借阅数量更新失败！");
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
	
	//罚款记录，关联账号和图书
	public void InsertPenaltyConnect(String unBackNum, String penaltyFee, String penaltyID, 
													String bookID, String userID, String time) {
		Connection conn = null;
    	Statement stmt = null;
    	try{
    		
    		// 注册 JDBC 驱动
    		Class.forName(JDBC_DRIVER);
    		
    		// 打开链接
    		System.out.println("连接数据库...");
    		conn = DriverManager.getConnection(DB_URL,USER,PASS);
    		    		
    		//读者验证登录

    		stmt = conn.createStatement();
    		String sql;
    		if(unBackNum.equals("")) {
    			unBackNum = "NULL";
    		}
    		if(penaltyFee.equals("")) {
    			penaltyFee = "NULL";
    		}
    		if(time.equals("")) {
    			time = "NULL";
    		}

    		sql = "insert into 罚款记录(未还数量, 罚款金额, 罚款记录ID, 图书ID, 账户ID, 超时时长) values("+unBackNum+", "+penaltyFee+", "+penaltyID+", "+bookID+", "+userID+", '"+time+"');";
    		stmt.execute(sql);
    		System.out.println(sql);

    		UpdateInsertDelete.getInstance().textField.setText("罚款记录插入成功！");
    		// 完成后关闭
    		stmt.close();
    		conn.close();
    		
    	}catch(SQLException se){
    		// 处理 JDBC 错误
    		UpdateInsertDelete.getInstance().textField.setText("罚款记录插入失败，ID未填或不存在！");
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
	
	public void DeletePenaltyConnect(String penaltyID) {
		Connection conn = null;
    	Statement stmt = null;
    	try{
    		
    		// 注册 JDBC 驱动
    		Class.forName(JDBC_DRIVER);
    		
    		// 打开链接
    		System.out.println("连接数据库...");
    		conn = DriverManager.getConnection(DB_URL,USER,PASS);
    		    		
    		//读者验证登录

    		stmt = conn.createStatement();
    		String sql;
    		sql = "delete from 罚款记录 where 罚款记录ID = "+penaltyID+";";
    		System.out.println(sql);
    		stmt.executeUpdate(sql);

    		UpdateInsertDelete.getInstance().textField.setText("罚款记录删除成功！");
    		// 完成后关闭
    		stmt.close();
    		conn.close();
    	}catch(SQLException se){
    		// 处理 JDBC 错误
    		UpdateInsertDelete.getInstance().textField.setText("罚款记录删除失败，ID未填或不存在！");
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
	
	public void UpdatePenaltyConnect(String addNum, String peanltyID, String optionType) {
		Connection conn = null;
    	Statement stmt = null;
    	try{
    		
    		// 注册 JDBC 驱动
    		Class.forName(JDBC_DRIVER);
    		
    		// 打开链接
    		System.out.println("连接数据库...");
    		conn = DriverManager.getConnection(DB_URL,USER,PASS);

    		stmt = conn.createStatement();
    		String sql;
    		sql = "call num_update("+addNum+","+peanltyID+","+optionType+");";
    		System.out.println(sql);
    		stmt.execute(sql);

    		UpdateInsertDelete.getInstance().textField.setText("罚款数量更新成功！");
    		// 完成后关闭
    		stmt.close();
    		conn.close();
    		
    	}catch(SQLException se){
    		// 处理 JDBC 错误
    		UpdateInsertDelete.getInstance().textField.setText("罚款数量更新失败！");
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
