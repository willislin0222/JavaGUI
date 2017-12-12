import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.awt.event.ActionEvent;

public class getIPname extends JFrame {

	private JPanel contentPane;
	private JTextField iptext;
	private JTextField nametext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					getIPname frame = new getIPname();
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
	public getIPname() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("獲取本機的網域和主機名");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel.setBounds(92, 33, 246, 46);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("域名:");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1.setBounds(31, 101, 72, 25);
		contentPane.add(lblNewLabel_1);
		
		iptext = new JTextField();
		iptext.setBounds(92, 104, 282, 21);
		contentPane.add(iptext);
		iptext.setColumns(10);
		
		JButton btnNewButton = new JButton("獲得域名和主機名");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					InetAddress inetAddr = InetAddress.getLocalHost();//建立本機主機的InetAddress物件
					
					String canonical = inetAddr.getCanonicalHostName();//獲得本機的功能變數名稱
					
					String host = inetAddr.getHostName(); //取得主機名稱
					
					//將取得域名設定到text
					iptext.setText(canonical);
					
					//將取得主機名稱設定到text
					nametext.setText(host);
				} catch (UnknownHostException e) {
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(58, 202, 158, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("退出系統");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//關閉程式
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(251, 202, 123, 25);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("主機名:");
		lblNewLabel_2.setFont(new Font("新細明體", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_2.setBounds(31, 146, 72, 30);
		contentPane.add(lblNewLabel_2);
		
		nametext = new JTextField();
		nametext.setBounds(92, 152, 282, 24);
		contentPane.add(nametext);
		nametext.setColumns(10);
	}
}
