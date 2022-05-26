package library;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.event.ActionListener;import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class UserFrame extends JFrame {
	//µ¥ÀýÄ£Ê½
	private UserFrame() {};
	private static UserFrame instance;
	public static UserFrame getInstance(){
		if(instance == null) {
			instance = new UserFrame();
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
//					UserFrame frame = new UserFrame();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
		UserFrame.getInstance();
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	public void create() {
		setTitle("\u7528\u6237\u670D\u52A1");
		setIconImage(Toolkit.getDefaultToolkit().getImage(UserFrame.class.getResource("/library/book.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1209, 714);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{71, 77, 68, 80, 67, 64, 72, 67, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("\u670D\u52A1\u9009\u9879");
		lblNewLabel.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 40));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 2;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JButton btnNewButton_1_1 = new JButton("\u56FE\u4E66\u67E5\u8BE2");
		btnNewButton_1_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 30));
		btnNewButton_1_1.setBackground(new Color(255, 228, 181));
		GridBagConstraints gbc_btnNewButton_1_1 = new GridBagConstraints();
		gbc_btnNewButton_1_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1_1.gridx = 0;
		gbc_btnNewButton_1_1.gridy = 5;
		contentPane.add(btnNewButton_1_1, gbc_btnNewButton_1_1);
		
		
		
		JButton btnNewButton_2 = new JButton("\u501F\u9605\u8BB0\u5F55");
		btnNewButton_2.setBackground(new Color(255, 228, 181));
		btnNewButton_2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 30));
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_2.gridx = 0;
		gbc_btnNewButton_2.gridy = 6;
		contentPane.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("\u7F5A\u6B3E\u8BB0\u5F55");
		btnNewButton_2_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 30));
		btnNewButton_2_1.setBackground(new Color(255, 228, 181));
		GridBagConstraints gbc_btnNewButton_2_1 = new GridBagConstraints();
		gbc_btnNewButton_2_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_2_1.gridx = 0;
		gbc_btnNewButton_2_1.gridy = 7;
		contentPane.add(btnNewButton_2_1, gbc_btnNewButton_2_1);
		
		//Í¼Êé²éÑ¯Ìø×ª
		btnNewButton_1_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				UserFrame.getInstance().dispose();
				BookLookUp.getInstance().setIdentFlagFalse();
				BookLookUp.getInstance().setVisible(true);
			}
		});
		//½èÔÄ¼ÇÂ¼
		btnNewButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				UserFrame.getInstance().dispose();
				BorrowRecords.getInstance().setVisible(true);
			}
		});
		//·£¿î¼ÇÂ¼
		btnNewButton_2_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				UserFrame.getInstance().dispose();
				Penalty.getInstance().setVisible(true);
			}
		});
		
		
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

}
