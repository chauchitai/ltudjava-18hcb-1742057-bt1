package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import IO_File.FileManager;
import Model.ModelManager;
import Model.SinhVien;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;


public class FromSinhVien extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	DefaultTableModel defaultTableModelsv;
	public ArrayList<SinhVien>dssv;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FromSinhVien frame = new FromSinhVien();
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
	public FromSinhVien() {
		setTitle("Xem Điểm");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 898, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(37, 83, 816, 313);
		contentPane.add(scrollPane);
		
		//table = new JTable();
		scrollPane.setViewportView(table);
		String col_student[] = {"STT","MSSV","Họ Tên", "Giới Tính", "CMND"};
		defaultTableModelsv = new DefaultTableModel(col_student, 0);
		table = new JTable(defaultTableModelsv);
		scrollPane.setViewportView(table);
		JLabel lblTn = new JLabel("Tên :");
		lblTn.setBounds(37, 29, 46, 14);
		contentPane.add(lblTn);
		
		JButton btnNewButton = new JButton("Tìm Kiếm");
		btnNewButton.setBounds(317, 25, 89, 23);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(83, 26, 201, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		addEvent();
	}
	
	
	private void addEvent() {
	
		// TODO Auto-generated method stub
		
	
				ClearTable_sinhvien();
				LoadDataFornTable();
				
			

		
			

	}
	
	
	
	public void ClearTable_sinhvien(){
    	String col[] = {"STT","MSSV","HO TEN", "GIOI TINH", "CMND"};

		defaultTableModelsv = new DefaultTableModel(col,0);
		                                            // The 0 argument is number rows.
		table.setModel(defaultTableModelsv);
		
    }
	
	
	
	private void addControll() {
		dssv=new ArrayList<>();
		LoadDataFornTable();
		// TODO Auto-generated method stub
		
	}
	
	
private void LoadDataFornTable() {
		
		// TODO Auto-generated method stub
		
		    	FileManager.DocFileSinhVien("Class17hcb.csv");
		    
		    //	FileManager.DocFileSinhVien("18HCB.csv");
		   
			
			for(SinhVien sv:ModelManager.DSSV){
				
				Object[] data = {sv.getSTT()+"",sv.getMSSV(), sv.getHoten(), sv.getGioitinh(),sv.getCMND()};

                defaultTableModelsv.addRow(data);
			}
			
	}


}
