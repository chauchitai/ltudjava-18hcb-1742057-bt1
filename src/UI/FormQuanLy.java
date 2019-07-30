package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import IO_File.FileManager;
import Model.BangDiem;
import Model.ModelManager;
import Model.SinhVien;
import Model.ThoiKhoaBieu;

import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;

public class FormQuanLy extends JFrame {

	private JPanel contentPane;
	private JTextField txtmssv;
	private JTextField txtten;
	private JTextField txtcmnd;
	private JTable table_1;
	private JTable table_schedule;
	private JTable table_caithien;
	private JTextField txtgk;
	private JTextField txtck;
	private JTextField txtkhac;
	private JTextField txttong;
	private JTextField txtlop;
	DefaultTableModel defaultTableModelLop;
	DefaultTableModel defaultTableModelDiem;
	DefaultTableModel defaultTableModeltkb;
	DefaultTableModel defaultTableModelct;
	public ArrayList<SinhVien>dssv;
	public ArrayList<ThoiKhoaBieu>tkb;
	JRadioButton rdnam, rdnu;
	JButton btnthem;
	JComboBox comboBoxClass;
	JComboBox comboBoxClasstkb;
	JComboBox comboBoxClassct;
	DefaultComboBoxModel defaultComboBoxClass;
	String dataComboboxLop="";
	String dataComboboxTKB="";
	String dataComboboxCT="";
	private JTable table_bang_diem;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormQuanLy frame = new FormQuanLy();
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
	public FormQuanLy() {
		setTitle("Giáo Vụ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 887, 492);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(28, 11, 804, 431);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Them SV", null, panel, null);
		panel.setLayout(null);
		
		txtmssv = new JTextField();
		txtmssv.setBounds(115, 35, 210, 20);
		panel.add(txtmssv);
		txtmssv.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("MaSV");
		lblNewLabel.setBounds(44, 38, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblTn = new JLabel("Tên");
		lblTn.setBounds(44, 77, 46, 14);
		panel.add(lblTn);
		
		txtten = new JTextField();
		txtten.setColumns(10);
		txtten.setBounds(115, 77, 210, 20);
		panel.add(txtten);
		
		JLabel lblGiiTnh = new JLabel("Giới Tính");
		lblGiiTnh.setBounds(395, 38, 52, 14);
		panel.add(lblGiiTnh);
		
		JLabel lblCmnd = new JLabel("CMND");
		lblCmnd.setBounds(395, 80, 46, 14);
		panel.add(lblCmnd);
		
		txtcmnd = new JTextField();
		txtcmnd.setColumns(10);
		txtcmnd.setBounds(463, 77, 170, 20);
		panel.add(txtcmnd);
		
		 rdnam = new JRadioButton("Nam");
		rdnam.setBounds(479, 34, 58, 23);
		panel.add(rdnam);
		
		 rdnu = new JRadioButton("Nữ");
		rdnu.setBounds(550, 34, 58, 23);
		panel.add(rdnu);
		
		ButtonGroup  buttonGroup=new ButtonGroup();
		buttonGroup.add(rdnam);
		buttonGroup.add(rdnu);
		
		JScrollPane scrollPane_Student = new JScrollPane();
		scrollPane_Student.setBounds(44, 134, 711, 196);
		panel.add(scrollPane_Student);
		
		//variable table student
		table_1 = new JTable();
		scrollPane_Student.setViewportView(table_1);
		String col_student[] = {"STT","MSSV","Họ Tên", "Giới Tính", "CMND"};
		scrollPane_Student.setViewportView(table_1);
		//String col_student[] = {"STT","MSSV","HO TEN", "GIOI TINH", "CMND"};
		
		defaultTableModelLop = new DefaultTableModel(col_student, 0);
		                                            // The 0 argument is number rows.
		table_1 = new JTable(defaultTableModelLop);
		scrollPane_Student.setViewportView(table_1);
		
        btnthem = new JButton("Thêm");
		
		btnthem.setBounds(214, 353, 89, 23);
		panel.add(btnthem);
		
	
		
		
		String[] entries = { "17HCB", "18HCB"};
		 comboBoxClass = new JComboBox(entries);
		comboBoxClass.setBounds(550, 354, 149, 20);
		panel.add(comboBoxClass);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Thời Khóa Biểu", null, panel_1, null);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane_schedule = new JScrollPane();
		scrollPane_schedule.setBounds(49, 57, 710, 174);
		panel_1.add(scrollPane_schedule);
		
		//variable table schedule
		table_schedule = new JTable();
		scrollPane_schedule.setViewportView(table_schedule);
		
		String col_schedule[] = {"STT","Mã","Tên", "Phòng"};

		defaultTableModeltkb = new DefaultTableModel(col_schedule, 0);
		                                            // The 0 argument is number rows.
		table_schedule = new JTable(defaultTableModeltkb);
		scrollPane_schedule.setViewportView(table_schedule);
		
		JLabel lblThiKhaBiu = new JLabel("THỜI KHÓA BIỂU");
		lblThiKhaBiu.setBounds(319, 26, 172, 14);
		panel_1.add(lblThiKhaBiu);
		

		/*JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"17HCB", "18HCB"}));
		comboBox.setBounds(338, 290, 114, 22);
		panel_1.add(comboBox);*/
		
		
		String[] entries1 = { "17HCB", "18HCB"};
		comboBoxClasstkb = new JComboBox(entries1);
		comboBoxClasstkb.setBounds(550, 354, 149, 20);
		panel_1.add(comboBoxClasstkb);

		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Danh Sách Lớp", null, panel_2, null);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane_caithien = new JScrollPane();
		scrollPane_caithien.setBounds(44, 58, 700, 220);
		panel_2.add(scrollPane_caithien);
		
		
		JLabel lblDanhSchHc = new JLabel("DANH SÁCH LỚP");
		lblDanhSchHc.setBounds(293, 22, 200, 14);
		panel_2.add(lblDanhSchHc);
		
		//variable table caithien
		table_caithien = new JTable();
		scrollPane_caithien.setViewportView(table_caithien);
				
		String col_caithien[] = {"STT","MSSV","Họ Tên", "Giới Tính", "CMND"};

		defaultTableModelct = new DefaultTableModel(col_caithien, 0);
				                                            // The 0 argument is number rows.
		table_caithien = new JTable(defaultTableModelct);
		scrollPane_caithien.setViewportView(table_caithien);
		
		String[] entries2 = { "18HCB-CTT", "18HCB"};
		comboBoxClassct = new JComboBox(entries2);
		comboBoxClassct.setModel(new DefaultComboBoxModel(new String[] {"18HCB", "18HCB-CTT"}));
		comboBoxClassct.setBounds(535, 320, 149, 20);
		panel_2.add(comboBoxClassct);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Học Cải Thiện", null, panel_3, null);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(45, 45, 709, 218);
		panel_3.add(scrollPane_3);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Bảng Điểm", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Điểm GK");
		lblNewLabel_2.setBounds(33, 37, 61, 14);
		panel_4.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("Điểm CK");
		lblNewLabel_4.setBounds(211, 37, 61, 14);
		panel_4.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("Điểm Khác");
		lblNewLabel_3.setBounds(376, 37, 73, 14);
		panel_4.add(lblNewLabel_3);
		
		txtgk = new JTextField();
		txtgk.setBounds(118, 34, 61, 20);
		panel_4.add(txtgk);
		txtgk.setColumns(10);
		
		txtck = new JTextField();
		txtck.setBounds(282, 34, 61, 20);
		panel_4.add(txtck);
		txtck.setColumns(10);
		
		txtkhac = new JTextField();
		txtkhac.setBounds(473, 34, 61, 20);
		panel_4.add(txtkhac);
		txtkhac.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Tổng");
		lblNewLabel_5.setBounds(561, 37, 46, 14);
		panel_4.add(lblNewLabel_5);
		
		txttong = new JTextField();
		txttong.setBounds(630, 34, 61, 20);
		panel_4.add(txttong);
		txttong.setColumns(10);
		
		JButton btnsua = new JButton("Sửa");
		btnsua.setBounds(315, 95, 89, 23);
		panel_4.add(btnsua);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(33, 171, 725, 202);
		panel_4.add(scrollPane);
		
		table_bang_diem = new JTable();
		String col_diem[] = {"STT","Mã","Tên", "Diem GK", "Diem CK", "Diem Khac", "Diem Tong"};

		defaultTableModelDiem = new DefaultTableModel(col_diem, 0);
		                                            // The 0 argument is number rows.
		table_bang_diem = new JTable(defaultTableModelDiem);
		scrollPane.setViewportView(table_bang_diem);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Thống Kê", null, panel_5, null);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Lớp");
		lblNewLabel_6.setBounds(52, 45, 46, 14);
		panel_5.add(lblNewLabel_6);
		
		txtlop = new JTextField();
		txtlop.setBounds(108, 42, 175, 20);
		panel_5.add(txtlop);
		txtlop.setColumns(10);
		
		JButton btbxem = new JButton("Xem");
		btbxem.setBounds(353, 41, 89, 23);
		panel_5.add(btbxem);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(52, 110, 687, 213);
		panel_5.add(scrollPane_5);
		addControll();
		//addControll1();
		addEvent();
		
	}
	private void addEvent() {
		
		
		btnthem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				xulythem();
			}
		});
		// TODO Auto-generated method stub
		comboBoxClass.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				dataComboboxLop=(String) comboBoxClass.getSelectedItem();
				
				ClearTable_sinhvien();
				LoadDataFornTable();
				
			}
		});
		comboBoxClasstkb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				
				dataComboboxTKB=(String) comboBoxClasstkb.getSelectedItem();
				System.out.println(dataComboboxTKB);
				ClearTable_tkb();
				LoadDataFornTableTKB();
				
			}
		});
		
		comboBoxClassct.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				
				dataComboboxCT=(String) comboBoxClassct.getSelectedItem();
				System.out.println(dataComboboxCT);
				ClearTable_ct();
				LoadDataFornTableCT();
				
			}

			private void ClearTable_ct() {
				// TODO Auto-generated method stub
				String col_caithien[] = {"STT","MSSV","Họ Tên", "Giới Tính", "CMND"};
				defaultTableModelct = new DefaultTableModel(col_caithien,0);
									// The 0 argument is number rows.
				table_caithien.setModel(defaultTableModelct);
			
			
			}
		});
		
		table_bang_diem.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				int row=table_bang_diem.getSelectedRow();
				int col=table_bang_diem.getSelectedColumn();
				if(row>=0 && col>=0){
					System.out.println(row+" "+col);
					String stt=defaultTableModelDiem.getValueAt(row, 0).toString();
					String mssv=defaultTableModelDiem.getValueAt(row, 1).toString();
					String hoten=defaultTableModelDiem.getValueAt(row, 2).toString();
					float diemgk= Float.valueOf(defaultTableModelDiem.getValueAt(row, 3).toString());
					float diemck= Float.valueOf(defaultTableModelDiem.getValueAt(row, 4).toString());
					float diemkh= Float.valueOf(defaultTableModelDiem.getValueAt(row, 5).toString());
					float diemtong= Float.valueOf(defaultTableModelDiem.getValueAt(row, 6).toString());
				
					
					setValueDiem(stt,mssv,hoten,diemgk,diemck,diemkh,diemtong);
				}
				
			}
		});
		table_1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				// TODO Auto-generated method stub
				int row=table_1.getSelectedRow();
				int col=table_1.getSelectedColumn();
				if(row>=0 && col>=0){
					String stt=defaultTableModelLop.getValueAt(row, 0).toString();
					String mssv=defaultTableModelLop.getValueAt(row, 1).toString();
					String hoten=defaultTableModelLop.getValueAt(row, 2).toString();
					String gioitinh=defaultTableModelLop.getValueAt(row, 3).toString();
					String cmnd=defaultTableModelLop.getValueAt(row, 4).toString();
					setValueSinhVien(stt,mssv,hoten,gioitinh,cmnd);
				}
				
//				 JOptionPane.showMessageDialog(table_lop, "Row: "+stt+hoten);  
				
			}
		});
	}

	 protected void setValueDiem(String stt, String mssv, String hoten, float diemgk, float diemck, float diemkh,
			 float diemtong) {
		// TODO Auto-generated method stub
		 txtck.setText(String.valueOf(diemck));
		 txtgk.setText(String.valueOf(diemgk));
		 txtkhac.setText(String.valueOf(diemkh));
		 txttong.setText(String.valueOf(diemtong));
		
	}

	public void ClearTable_sinhvien(){
	    	String col[] = {"STT","MSSV","HO TEN", "GIOI TINH", "CMND"};

			defaultTableModelLop = new DefaultTableModel(col,0);
			                                            // The 0 argument is number rows.
			table_1.setModel(defaultTableModelLop);
			
	    }


	protected void ClearTable_tkb() {
		// TODO Auto-generated method stub
		String col_schedule[] = {"STT","Mã","Tên", "Phòng"};

		defaultTableModeltkb = new DefaultTableModel(col_schedule, 0);
		                                            // The 0 argument is number rows.
		table_schedule.setModel(defaultTableModeltkb);
		
	}

	protected void xulythem() {
		// TODO Auto-generated method stub
		int stt=ModelManager.DSSV.size()+1;
		String mssv=txtmssv.getText().trim();
		String hoten=txtten.getText().trim();
		String gioitinh="";
		String cmnd=txtcmnd.getText().trim();
		if(rdnam.isSelected()){
			gioitinh="nam";
		}
		if(rdnu.isSelected()){
			gioitinh="nu";
		}
		SinhVien sv=new SinhVien(stt, mssv, hoten, gioitinh, cmnd);
		ModelManager.DSSV.add(sv);
		if(dataComboboxLop.equals("17HCB")){
			FileManager.GhiFileSinhVien("Class17hcb.csv");
			FileManager.DocFileSinhVien("Class17hcb.csv");
		}
		if(dataComboboxLop.equals("18HCB")){
			FileManager.GhiFileSinhVien("18HCB.csv");
			FileManager.DocFileSinhVien("18HCB.csv");
		}
		
		ClearTable_sinhvien();
		LoadDataFornTable();
		
	}
   
  
	protected void setValueSinhVien(String stt, String mssv, String hoten, String gioitinh, String cmnd) {
		// TODO Auto-generated method stub
		txtmssv.setText(mssv);
		txtten.setText(hoten);
		txtcmnd.setText(cmnd);
		if(gioitinh.equals("nam")){
			rdnam.setSelected(true);
			rdnu.setSelected(false);
		}if(gioitinh.equals("nu")){
			rdnam.setSelected(false);
			rdnu.setSelected(true);
		}
	}

	private void addControll() {
		FileManager fileManager=new FileManager();
		fileManager.DocFileDiem("BangDiem.csv");
		
		dataComboboxLop=(String) comboBoxClass.getSelectedItem();
		dataComboboxTKB=(String) comboBoxClasstkb.getSelectedItem();
		loadDataTKB();
		loadDataDiem();
		loadDataCT();
		System.out.println(dataComboboxLop);
		dssv=new ArrayList<>();
		LoadDataFornTable();
		LoadDataFornTableTKB();
		LoadDataFornTableCT();
		// TODO Auto-generated method stub
		
	}
	private void loadDataCT() {
		// TODO Auto-generated method stub
		if(dataComboboxCT.equals("18HCB-CTT")){
			FileManager.DocFileThoiKhoaBieu("18HCB-CTT.csv");
		}
		if(dataComboboxCT.equals("18HCB")){
			FileManager.DocFileThoiKhoaBieu("18HCB.csv");
		}
	}

	private void loadDataDiem() {
		// TODO Auto-generated method stub
		for(BangDiem sv:ModelManager.BD){
			
			Object[] data = {sv.STT+"",sv.MSSV, sv.Hoten, sv.DiemGK+"",sv.DiemCK+"",sv.Diemkhac+"",sv.Tong+""};

            defaultTableModelDiem.addRow(data);
		}
	}

	private void loadDataTKB() {
		// TODO Auto-generated method stub
		if(dataComboboxTKB.equals("17HCB")){
			FileManager.DocFileThoiKhoaBieu("Tkb17HCB.csv");
		}
		if(dataComboboxTKB.equals("18HCB")){
			FileManager.DocFileThoiKhoaBieu("Tkb18HCB.csv");
			
		}
	}

//	private void addControll1() {
//		dataComboboxTkb=(String) comboBoxClass.getSelectedItem();
//		System.out.println(dataComboboxTkb);
//		tkb=new ArrayList<>();
//		LoadDataFornTable();
//		LoadDataFornTableTKB();
//		// TODO Auto-generated method stub
//		
//	}

	private void LoadDataFornTable() {
		
		// TODO Auto-generated method stub
		if(dataComboboxLop.equals("17HCB")){
		    	FileManager.DocFileSinhVien("Class17hcb.csv");
		    }if(dataComboboxLop.equals("18HCB")){
		    	FileManager.DocFileSinhVien("18HCB.csv");
		    }
			
			for(SinhVien sv:ModelManager.DSSV){
				
				Object[] data = {sv.getSTT()+"",sv.getMSSV(), sv.getHoten(), sv.getGioitinh(),sv.getCMND()};

                defaultTableModelLop.addRow(data);
			}
			
	}
	private void LoadDataFornTableTKB() {
	
		// TODO Auto-generated method stub
		if(dataComboboxTKB.equals("17HCB")){
		    	FileManager.DocFileThoiKhoaBieu("Tkb17HCB.csv");
		    }if(dataComboboxTKB.equals("18HCB")){
		    	FileManager.DocFileThoiKhoaBieu("Tkb18HCB.csv");
		    }
			
			for(ThoiKhoaBieu tkb:ModelManager.TKB){
				
				Object[] data = {tkb.getSTT()+"",tkb.getMaMon(), tkb.getTen(), tkb.getPhong()};

                defaultTableModeltkb.addRow(data);
			}
			
	}
	private void LoadDataFornTableCT() {
		
		// TODO Auto-generated method stub
		if(dataComboboxCT.equals("18HCB-CTT")){
		    	FileManager.DocFileSinhVien("18HCB-CTT.csv");
		    }if(dataComboboxCT.equals("18HCB")){
		    	FileManager.DocFileSinhVien("18HCB.csv");
		    }
			
			for(SinhVien sv:ModelManager.DSSV){
				
				Object[] data = {sv.getSTT()+"",sv.getMSSV(), sv.getHoten(), sv.getGioitinh(),sv.getCMND()};

				defaultTableModelct.addRow(data);
			}
			
	}
}
