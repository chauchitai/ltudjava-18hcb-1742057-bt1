package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import IO_File.FileManager;
import Model.ModelManager;
import Model.TaiKhoan;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class Form_Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtusername;
	public JButton btnlogin;
	private JPasswordField txtpassword;
//
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_Login frame = new Form_Login();
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
	public Form_Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(10, 27, 78, 14);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(10, 85, 65, 14);
		contentPane.add(lblPassword);
		
		txtusername = new JTextField();
		txtusername.setBounds(64, 24, 209, 20);
		contentPane.add(txtusername);
		txtusername.setColumns(10);
		
		 btnlogin = new JButton("login");
		btnlogin.setBounds(115, 132, 89, 23);
		contentPane.add(btnlogin);
		
		txtpassword = new JPasswordField();
		txtpassword.setBounds(82, 82, 191, 20);
		contentPane.add(txtpassword);
		addEvent();
		addControll();
	}

	private void addEvent() {
		// TODO Auto-generated method stub
		
	}

	private void addControll() {
		// TODO Auto-generated method stub
		btnlogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(ModelManager.DSTK.size()==0) {
					boolean kt=FileManager.DocFileTaiKhoan("TaiKhoan.csv");
				}
				String username=txtusername.getText().trim();
				String password=txtpassword.getText().trim();
				boolean kt=CheckLogin(username,password);
				if(kt) {
					System.out.println("LOGIN THANH CONG");
				}else {
					System.out.println("LOGIN THAT BAI");
				}
			}
		});
		
		
		
	}

	private boolean CheckLogin(String username, String password) {
		// TODO Auto-generated method stub
		if(ModelManager.DSTK.size()>0) {
			for(TaiKhoan tk:ModelManager.DSTK) {
				if(tk.getUsername().equals(username) && tk.getPassword().equals(password))
				{
					return true;
				}
			}
			return false;
		}
		return false;
	}
}
