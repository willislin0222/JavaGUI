import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class guiEX2 extends JFrame {

	private JPanel contentPane;
	private JTextField text1;
	private JTextField text2;
	private JTextField sumtext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					guiEX2 frame = new guiEX2();
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
	public guiEX2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("\u8A08\u7B97");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = new Integer(text1.getText());
				int b = new Integer(text2.getText());
				
				sumtext.setText(new Integer(a+b).toString());
				
			}
		});
		btnNewButton.setBounds(171, 206, 87, 23);
		contentPane.add(btnNewButton);
		
		text1 = new JTextField();
		text1.setBounds(47, 68, 96, 21);
		contentPane.add(text1);
		text1.setColumns(10);
		
		text2 = new JTextField();
		text2.setBounds(171, 68, 96, 21);
		contentPane.add(text2);
		text2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("+");
		lblNewLabel.setBounds(152, 71, 46, 15);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("=");
		label.setBounds(286, 71, 46, 15);
		contentPane.add(label);
		
		sumtext = new JTextField();
		sumtext.setBounds(308, 68, 96, 21);
		contentPane.add(sumtext);
		sumtext.setColumns(10);
	}
}
