package library;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

public class RegisterDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JPanel buttonPane;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		/*try {
			RegisterDialog dialog = new RegisterDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
	}

	/**
	 * Create the dialog.
	 */
	public RegisterDialog() {
		getContentPane().setBackground(new Color(255, 255, 224));
		setTitle("\u6CE8\u518C");
		setIconImage(Toolkit.getDefaultToolkit().getImage(RegisterDialog.class.getResource("/library/book.jpg")));
		setBounds(100, 100, 717, 468);
		contentPanel.setBackground(new Color(255, 255, 224));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		{
			buttonPane = new JPanel();
			buttonPane.setBackground(new Color(255, 255, 224));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		getContentPane().setLayout(new BorderLayout(0, 0));
		getContentPane().add(contentPanel);
		
		JLabel lblNewLabel = new JLabel("\u6CE8\u518C");
		lblNewLabel.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(255, 250, 240));
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 20));
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(255, 250, 240));
		passwordField.setFont(new Font("ËÎÌå", Font.PLAIN, 20));
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBackground(new Color(255, 250, 240));
		passwordField_1.setFont(new Font("ËÎÌå", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1 = new JLabel("\u7528\u6237\u540D");
		lblNewLabel_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_1_1 = new JLabel("\u5BC6\u7801");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 20));
		
		JLabel lblNewLabel_1_2 = new JLabel("\u786E\u8BA4\u5BC6\u7801");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 20));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("\u521B\u5EFA\u4E3A\u7BA1\u7406\u5458");
		chckbxNewCheckBox.setBackground(new Color(255, 255, 224));
		chckbxNewCheckBox.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 18));
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_2 = new JLabel("\u7BA1\u7406\u5458\u9A8C\u8BC1\u5BC6\u94A5");
		lblNewLabel_2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBackground(new Color(255, 250, 240));
		passwordField_2.setFont(new Font("ËÎÌå", Font.PLAIN, 20));
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(135)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 419, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addGap(94)
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
									.addGap(69))
								.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
									.addContainerGap(73, Short.MAX_VALUE)
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
										.addComponent(chckbxNewCheckBox, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
									.addGap(30)))
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
								.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 309, GroupLayout.PREFERRED_SIZE)
								.addComponent(passwordField_1, GroupLayout.PREFERRED_SIZE, 309, GroupLayout.PREFERRED_SIZE)
								.addComponent(passwordField_2, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(111, Short.MAX_VALUE))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(34)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
					.addGap(30)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(passwordField_1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(chckbxNewCheckBox, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(13)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(passwordField_2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addGap(17))
		);
		contentPanel.setLayout(gl_contentPanel);
		getContentPane().add(buttonPane, BorderLayout.SOUTH);
	}
}
