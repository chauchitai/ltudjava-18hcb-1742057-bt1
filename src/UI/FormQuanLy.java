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

public class FormQuanLy extends JFrame {

	private JPanel contentPane;
	private JTextField txtmssv;
	private JTextField txtten;
	private JTextField txtcmnd;
	private JTable table_1;

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
		txtmssv.setBounds(115, 69, 210, 20);
		panel.add(txtmssv);
		txtmssv.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("MaSV");
		lblNewLabel.setBounds(44, 72, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblTn = new JLabel("Tên");
		lblTn.setBounds(44, 134, 46, 14);
		panel.add(lblTn);
		
		txtten = new JTextField();
		txtten.setColumns(10);
		txtten.setBounds(115, 131, 210, 20);
		panel.add(txtten);
		
		JLabel lblGiiTnh = new JLabel("Giới Tính");
		lblGiiTnh.setBounds(395, 75, 46, 14);
		panel.add(lblGiiTnh);
		
		JLabel lblCmnd = new JLabel("CMND");
		lblCmnd.setBounds(395, 131, 46, 14);
		panel.add(lblCmnd);
		
		txtcmnd = new JTextField();
		txtcmnd.setColumns(10);
		txtcmnd.setBounds(477, 128, 170, 20);
		panel.add(txtcmnd);
		
		JRadioButton rdnam = new JRadioButton("Nam");
		rdnam.setBounds(464, 68, 46, 23);
		panel.add(rdnam);
		
		JRadioButton rdnu = new JRadioButton("Nữ");
		rdnu.setBounds(531, 68, 109, 23);
		panel.add(rdnu);
		
		ButtonGroup  buttonGroup=new ButtonGroup();
		buttonGroup.add(rdnam);
		buttonGroup.add(rdnu);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(47, 196, 711, 196);
		panel.add(scrollPane);
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("", null, panel_1, null);
		
		
	}
}
