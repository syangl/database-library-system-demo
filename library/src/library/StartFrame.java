package library;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

public class StartFrame extends JFrame {
//	private String username;
//	private String password;
//	public String getUsername() {
//		return username;
//	}
//	public String getPassword() {
//		return password;
//	}

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartFrame frame = new StartFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StartFrame() {
		setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		setIconImage(Toolkit.getDefaultToolkit().getImage(StartFrame.class.getResource("/library/book.jpg")));
		setTitle("\u767B\u5F55\u754C\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 245, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblTitle = new JLabel("\u56FE\u4E66\u7BA1\u7406\u7CFB\u7EDF-\u767B\u9646\u754C\u9762");
		lblTitle.setForeground(Color.BLACK);
		lblTitle.setBackground(Color.WHITE);
		lblTitle.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 60));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 20));
		textArea.setBackground(new Color(255, 255, 240));
		textArea.setPreferredSize(new Dimension(50,50));
		
		JLabel lblUserName = new JLabel("\u7528\u6237\u540D");
		lblUserName.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserName.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 30));
		
		JLabel lblPassword = new JLabel("\u5BC6\u7801");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 30));
		
		JButton btnLogin = new JButton("\u767B\u5F55");
		btnLogin.setBackground(new Color(255, 228, 196));
		btnLogin.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 20));
		
		JButton btnExit = new JButton("\u9000\u51FA");
		btnExit.setBackground(new Color(255, 235, 205));
		btnExit.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 20));
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(255, 255, 240));
		passwordField.setFont(new Font("ËÎÌå", Font.PLAIN, 20));
		
		JButton btnRegister = new JButton("\u6CE8\u518C");
		btnRegister.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 20));
		btnRegister.setBackground(new Color(255, 228, 196));
		
		JCheckBox chckbxManagerLogin = new JCheckBox("\u4EE5\u7BA1\u7406\u5458\u767B\u5F55");
		chckbxManagerLogin.setBackground(new Color(255, 228, 225));
		chckbxManagerLogin.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxManagerLogin.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 18));
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("ËÎÌå", Font.PLAIN, 20));
		textField.setEditable(false);
		textField.setBackground(new Color(255, 239, 213));
		textField.setColumns(10);
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblTitle, GroupLayout.PREFERRED_SIZE, 976, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(186, Short.MAX_VALUE)
					.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
					.addGap(103)
					.addComponent(btnRegister, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
					.addGap(110)
					.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
					.addGap(167))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(259, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 455, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(chckbxManagerLogin, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblUserName, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(passwordField, 389, 389, 389)
										.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 389, GroupLayout.PREFERRED_SIZE))))
							.addGap(150))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblTitle)
					.addGap(18)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addGap(51)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblUserName)
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPassword, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
					.addGap(30)
					.addComponent(chckbxManagerLogin, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnRegister, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
					.addGap(41))
		);
		contentPane.setLayout(gl_contentPane);
		
		
		
		
		
		
		
		chckbxManagerLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ¹´Ñ¡Ê±°ÑLoginVerifyÖÐµÄidentFlagÖÃÎª¹ÜÀíÔ±
				
				
				
				
			}
		});
		
		btnExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ÍË³ö
				System.exit(0);
			}
		});
		
		
		btnRegister.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ×¢²á
				
				
				
				
			}
		});
		
		
		btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// µÇÂ¼
				new LoginVerify().Start(lblUserName.getText(), lblPassword.getText());
			}
		});
		
		
	}
}
