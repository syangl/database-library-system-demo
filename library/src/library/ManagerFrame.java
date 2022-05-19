package library;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import javax.swing.SwingConstants;

public class ManagerFrame extends JFrame {
	//单例模式
	private ManagerFrame() {};
	private static ManagerFrame instance;
	public static ManagerFrame getInstance(){
		if(instance == null) {
			instance = new ManagerFrame();
			instance.create();
		}
		return instance;
	}

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ManagerFrame frame = new ManagerFrame();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
		ManagerFrame.getInstance();
	}

	/**
	 * Create the frame.
	 */
	public void create() {
		setTitle("\u7BA1\u7406\u5458\u670D\u52A1");
		setIconImage(Toolkit.getDefaultToolkit().getImage(ManagerFrame.class.getResource("/library/book.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1209, 714);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{1185, 0};
		gbl_contentPane.rowHeights = new int[]{55, 55, 55, 55, 55, 55, 55, 55, 60, 55, 55, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("\u670D\u52A1\u9009\u9879");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(255, 239, 213));
		lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 40));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 2;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("\u56FE\u4E66\u67E5\u8BE2");
		btnNewButton_1.setFont(new Font("微软雅黑", Font.PLAIN, 30));
		btnNewButton_1.setBackground(new Color(255, 228, 181));
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.VERTICAL;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 4;
		contentPane.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton_1_1_2 = new JButton("借阅记录");
		btnNewButton_1_1_2.setFont(new Font("微软雅黑", Font.PLAIN, 30));
		btnNewButton_1_1_2.setBackground(new Color(255, 228, 181));
		GridBagConstraints gbc_btnNewButton_1_1_2 = new GridBagConstraints();
		gbc_btnNewButton_1_1_2.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1_1_2.gridx = 0;
		gbc_btnNewButton_1_1_2.gridy = 5;
		contentPane.add(btnNewButton_1_1_2, gbc_btnNewButton_1_1_2);
		
		JButton btnNewButton_1_1 = new JButton("\u7F5A\u6B3E\u8BB0\u5F55");
		btnNewButton_1_1.setFont(new Font("微软雅黑", Font.PLAIN, 30));
		btnNewButton_1_1.setBackground(new Color(255, 228, 181));
		GridBagConstraints gbc_btnNewButton_1_1 = new GridBagConstraints();
		gbc_btnNewButton_1_1.fill = GridBagConstraints.VERTICAL;
		gbc_btnNewButton_1_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1_1.gridx = 0;
		gbc_btnNewButton_1_1.gridy = 6;
		contentPane.add(btnNewButton_1_1, gbc_btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("用户信息");
		btnNewButton_1_1_1.setFont(new Font("微软雅黑", Font.PLAIN, 30));
		btnNewButton_1_1_1.setBackground(new Color(255, 228, 181));
		GridBagConstraints gbc_btnNewButton_1_1_1 = new GridBagConstraints();
		gbc_btnNewButton_1_1_1.fill = GridBagConstraints.VERTICAL;
		gbc_btnNewButton_1_1_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1_1_1.gridx = 0;
		gbc_btnNewButton_1_1_1.gridy = 7;
		contentPane.add(btnNewButton_1_1_1, gbc_btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("\u7BA1\u7406\u5458\u4FE1\u606F");
		btnNewButton_1_1_1_1.setFont(new Font("微软雅黑", Font.PLAIN, 30));
		btnNewButton_1_1_1_1.setBackground(new Color(255, 228, 181));
		GridBagConstraints gbc_btnNewButton_1_1_1_1 = new GridBagConstraints();
		gbc_btnNewButton_1_1_1_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1_1_1_1.fill = GridBagConstraints.VERTICAL;
		gbc_btnNewButton_1_1_1_1.gridx = 0;
		gbc_btnNewButton_1_1_1_1.gridy = 8;
		contentPane.add(btnNewButton_1_1_1_1, gbc_btnNewButton_1_1_1_1);
		
		//用户信息跳转
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ManagerFrame.getInstance().dispose();
				UserMessage.getInstance().setVisible(true);
			}
		});
		
		//管理员信息跳转
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ManagerFrame.getInstance().dispose();
				ManagerMessage.getInstance().setVisible(true);
			}
		});
		//图书跳转
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ManagerFrame.getInstance().dispose();
				BookLookUp.getInstance().setVisible(true);
			}
		});
		//借阅记录跳转
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ManagerFrame.getInstance().dispose();
				BorrowRecords.getInstance().setVisible(true);
			}
		});
		//罚款记录跳转
		btnNewButton_1_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ManagerFrame.getInstance().dispose();
				Penalty.getInstance().setVisible(true);
			}
		});
		
		
		
		
		
		
		
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

}
