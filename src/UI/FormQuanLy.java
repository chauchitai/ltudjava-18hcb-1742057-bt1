package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
	private JTextField txttenlop;
	private JTextField txtgk;
	private JTextField txtck;
	private JTextField txtkhac;
	private JTextField txttong;
	private JTextField txtlop;

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
		
		JRadioButton rdnam = new JRadioButton("Nam");
		rdnam.setBounds(479, 34, 58, 23);
		panel.add(rdnam);
		
		JRadioButton rdnu = new JRadioButton("Nữ");
		rdnu.setBounds(550, 34, 58, 23);
		panel.add(rdnu);
		
		ButtonGroup  buttonGroup=new ButtonGroup();
		buttonGroup.add(rdnam);
		buttonGroup.add(rdnu);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(44, 134, 711, 196);
		panel.add(scrollPane);
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		
		JButton btnthem = new JButton("Thêm");
		btnthem.setBounds(214, 353, 89, 23);
		panel.add(btnthem);
		
		JButton btnXoa = new JButton("Xóa");
		btnXoa.setBounds(418, 353, 89, 23);
		panel.add(btnXoa);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Thời Khóa Biểu", null, panel_1, null);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(49, 57, 710, 174);
		panel_1.add(scrollPane_1);
		
		JLabel lblThiKhaBiu = new JLabel("THỜI KHÓA BIỂU");
		lblThiKhaBiu.setBounds(319, 26, 172, 14);
		panel_1.add(lblThiKhaBiu);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Học Cải Thiện", null, panel_2, null);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(44, 58, 700, 220);
		panel_2.add(scrollPane_2);
		
		JLabel lblDanhSchHc = new JLabel("DANH SÁCH HỌC CẢI THIỆN");
		lblDanhSchHc.setBounds(293, 22, 200, 14);
		panel_2.add(lblDanhSchHc);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Xem Ds Lớp", null, panel_3, null);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(45, 45, 709, 218);
		panel_3.add(scrollPane_3);
		
		JButton btnxem = new JButton("Xem");
		btnxem.setBounds(491, 327, 89, 23);
		panel_3.add(btnxem);
		
		JLabel lblNewLabel_1 = new JLabel("Tên Lớp");
		lblNewLabel_1.setBounds(123, 331, 46, 14);
		panel_3.add(lblNewLabel_1);
		
		txttenlop = new JTextField();
		txttenlop.setBounds(209, 328, 207, 20);
		panel_3.add(txttenlop);
		txttenlop.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Bảng Điểm", null, panel_4, null);
		panel_4.setLayout(null);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(33, 152, 691, 201);
		panel_4.add(scrollPane_4);
		
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
		
		
	}
}
