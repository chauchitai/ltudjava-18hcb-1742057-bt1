package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import IO_File.FileManager;
import Model.BangDiem;
import Model.ModelManager;
import Model.TaiKhoan;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormDoiMK extends JFrame {

	private JPanel contentPane;
	private JTextField txttk;
	private JPasswordField mkc;
	private JPasswordField mkm;
	TaiKhoan taikhoan = null;
	DefaultTableModel defaultTableModelTK;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormDoiMK frame = new FormDoiMK();
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
	public FormDoiMK() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 415, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tài khoản");
		lblNewLabel.setBounds(39, 66, 71, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mật khẩu củ");
		lblNewLabel_1.setBounds(39, 101, 71, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mật khẩu mới");
		lblNewLabel_2.setBounds(39, 140, 71, 14);
		contentPane.add(lblNewLabel_2);
		
		txttk = new JTextField();
		txttk.setBounds(133, 63, 199, 20);
		contentPane.add(txttk);
		txttk.setColumns(10);
		
		mkc = new JPasswordField();
		mkc.setBounds(133, 98, 199, 20);
		contentPane.add(mkc);
		
		mkm = new JPasswordField();
		mkm.setBounds(133, 137, 199, 20);
		contentPane.add(mkm);
		
		JButton btndongy = new JButton("Đồng Ý");
		btndongy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SuaMk();
			}
		});
		btndongy.setBounds(63, 189, 89, 23);
		contentPane.add(btndongy);
		
		JButton btbhuy = new JButton("Hủy Bỏ");
		btbhuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btbhuy.setBounds(208, 189, 89, 23);
		contentPane.add(btbhuy);
		
		JLabel lbliMtKhu = new JLabel("ĐỔI MẬT KHẨU");
		lbliMtKhu.setBounds(164, 24, 106, 14);
		contentPane.add(lbliMtKhu);
	}

	protected void SuaMk() {
		// TODO Auto-generated method stub
		String tk = txttk.getText();
		String mk = mkc.getText();
		taikhoan.setUsername(tk);
		taikhoan.setPassword(mk);
	
		 
		// TODO Auto-generated method stub
		if(taikhoan!=null) {

			for(int i=0;i<ModelManager.DSTK.size();i++) {
				
				//if(ModelManager.BD.get(i).STT==taikhoan.getUsername()) {
					ModelManager.DSTK.get(i).setUsername(taikhoan.getUsername());
					ModelManager.DSTK.get(i).setPassword(taikhoan.getPassword());
					System.out.println("SuaBangDiem");
					FileManager.GhiFileTK("TaiKhoan.csv",ModelManager.DSTK);
					JOptionPane.showMessageDialog(null, "cap nhat thanh cong");
					System.out.println("cap nhat thanh cong");
					//ClearTable_diem();
					loadDataTK();
					
				}
				
			
			for(TaiKhoan b:ModelManager.DSTK) {
				
				//System.out.println(b.DiemCK);
			}
		}
		
	}

	private void loadDataTK() {
		
		// TODO Auto-generated method stub
		for(TaiKhoan tk:ModelManager.DSTK){
			
			
				Object[]  data = {tk.getUsername()+"",tk.getPassword()+""};
			    defaultTableModelTK.addRow(data);
			   

			
			
			}
     
		}

	
	
}
