package library;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JScrollPane;
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
	//µ¥ÀýÄ£Ê½
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
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		BorrowRecords.getInstance();
	}

	/**
	 * Create the frame.
	 */
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
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 30));
		scrollPane.setViewportView(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 6, 0, 0));
		
		JLabel lblNewLabel = new JLabel("\u501F\u9605\u6570\u91CF");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 20));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u501F\u51FA\u65E5\u671F");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 20));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u5F52\u8FD8\u671F\u9650");
		lblNewLabel_2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u501F\u9605\u8BB0\u5F55ID");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 20));
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u56FE\u4E66ID");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 20));
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u8D26\u6237ID");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 20));
		panel.add(lblNewLabel_5);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_6 = new JLabel("\u67E5\u8BE2\u8D26\u6237ID");
		lblNewLabel_6.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 20));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField = new JTextField();
		textField.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 20));
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u67E5\u8BE2");
		btnNewButton.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 20));
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
		
		
		setVisible(true);
	}
}
