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
import java.awt.event.ActionEvent;

public class UserMessage extends JFrame {
	//µ¥ÀýÄ£Ê½
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
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		UserMessage.getInstance();
	}

	/**
	 * Create the frame.
	 */
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
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 35));
		scrollPane.setViewportView(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel lblNewLabel = new JLabel("\u8BFB\u8005ID");
		lblNewLabel.setForeground(UIManager.getColor("Button.foreground"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 30));
		lblNewLabel.setEnabled(false);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u8BFB\u8005\u540D");
		lblNewLabel_1.setEnabled(false);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 30));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u8BFB\u8005\u5BC6\u7801");
		lblNewLabel_2.setEnabled(false);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 30));
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_3 = new JLabel("\u67E5\u8BE2ID");
		lblNewLabel_3.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 20));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 20));
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("\u67E5\u8BE2");
		btnNewButton.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
					.addGap(513))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addComponent(btnNewButton))
		);
		panel_1.setLayout(gl_panel_1);
		
		
		setVisible(true);
	}
}
