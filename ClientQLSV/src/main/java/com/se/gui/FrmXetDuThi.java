package com.se.gui;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class FrmXetDuThi extends JPanel implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8890906525762449006L;
	private JComboBox textField;
	private JComboBox textField_1;
	private JComboBox textField_2;
	private JComboBox textField_3;
	private JComboBox textField_4;
	private JTable tbDSSV;
	private JButton btnTest1;
	private JLabel lbltestData;
	private JButton btnTest2;

	/**
	 * Create the panel.
	 */
	public FrmXetDuThi() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

		JPanel pnContent = new JPanel();
		add(pnContent);
		pnContent.setLayout(null);

		JPanel pnTitle = new JPanel();
		pnTitle.setBounds(10, 10, 1068, 85);
		pnContent.add(pnTitle);
		pnTitle.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel = new JLabel("XÉT ĐIỀU KIỆN DỰ THI");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setEnabled(false);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 28));
		pnTitle.add(lblNewLabel, BorderLayout.CENTER);

		JPanel pnMain = new JPanel();
		pnMain.setBounds(10, 105, 1068, 653);
		pnContent.add(pnMain);
		pnMain.setLayout(null);

		JPanel pnTacVu = new JPanel();
		pnTacVu.setBounds(10, 10, 295, 633);
		pnMain.add(pnTacVu);
		pnTacVu.setLayout(null);

		textField = new JComboBox();
		textField.setBounds(90, 10, 195, 25);
		pnTacVu.add(textField);

		JLabel lblNewLabel_1 = new JLabel("Học kỳ:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1.setBounds(10, 10, 70, 25);
		pnTacVu.add(lblNewLabel_1);

		textField_1 = new JComboBox();
		textField_1.setBounds(90, 45, 195, 25);
		pnTacVu.add(textField_1);

		JLabel lblNewLabel_1_1 = new JLabel("Môn học:");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(10, 45, 70, 25);
		pnTacVu.add(lblNewLabel_1_1);

		textField_2 = new JComboBox();
		textField_2.setBounds(90, 80, 195, 25);
		pnTacVu.add(textField_2);

		JLabel lblNewLabel_1_2 = new JLabel("Lớp học:");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1_2.setBounds(10, 80, 70, 25);
		pnTacVu.add(lblNewLabel_1_2);

		textField_3 = new JComboBox();
		textField_3.setBounds(90, 115, 195, 25);
		pnTacVu.add(textField_3);

		JLabel lblNewLabel_1_3 = new JLabel("Mã LHP:");
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1_3.setBounds(10, 115, 70, 25);
		pnTacVu.add(lblNewLabel_1_3);

		textField_4 = new JComboBox();
		textField_4.setBounds(122, 150, 163, 25);
		pnTacVu.add(textField_4);

		JLabel lblNewLabel_1_4 = new JLabel("Trạng thái đăng ký");
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1_4.setBounds(10, 150, 110, 25);
		pnTacVu.add(lblNewLabel_1_4);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 222, 259, 411);
		pnTacVu.add(scrollPane);

		JTree jtreeDSLHP = new JTree();
		jtreeDSLHP.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		jtreeDSLHP.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Khoa Công nghệ thông tin") {
			{
				DefaultMutableTreeNode node_1;
				node_1 = new DefaultMutableTreeNode("Năm học 2021-2022 (HK01)");
				node_1.add(new DefaultMutableTreeNode("001 - Lập trình phân tán"));
				node_1.add(new DefaultMutableTreeNode("002 - Lập trình hướng sự kiện"));
				node_1.add(new DefaultMutableTreeNode("001 - Lập trình java WWW"));
				add(node_1);
			}
		}));
		scrollPane.setColumnHeaderView(jtreeDSLHP);

		JLabel lblNewLabel_1_4_1 = new JLabel("Danh sách lớp học phần");
		lblNewLabel_1_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1_4_1.setBounds(0, 197, 163, 25);
		pnTacVu.add(lblNewLabel_1_4_1);

		JPanel panel = new JPanel();
		panel.setBounds(315, 10, 743, 633);
		pnMain.add(panel);
		panel.setLayout(null);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 56, 743, 208);
		panel.add(scrollPane_1);

		tbDSSV = new JTable();
		tbDSSV.setModel(new DefaultTableModel(new Object[][] {
				{ "123", "zxc", "zxczxc", "Nam", "17-05-2001", "\u0110\u0103ng ky m\u01A1\u0301i" },
				{ "123", "zxczxc", "czxcz", "xzx", "czx", "cz" }, { "123123", "zxczxc", "zx", "cz", "zx", "xc" },
				{ "123123", "xc", "xczx", "xc", "xc", "zx" }, { "12312", "zxczxczxcc", "czxcz", "xcz", "cz", "xczzx" },
				{ "31231", "x", "czx", "zxczxc", "zxcxcz", null }, { "2312", "czxcz", "czx", "zxc", "zxc", "z" }, },
				new String[] { "MSSV", "Ho\u0323 \u0110\u00EA\u0323m", "T\u00EAn", "Gi\u01A1\u0301i ti\u0301nh",
						"Nga\u0300y sinh", "Tra\u0323ng tha\u0301i \u0111\u0103ng ky\u0301" }));
		tbDSSV.getColumnModel().getColumn(5).setPreferredWidth(113);
		scrollPane_1.setColumnHeaderView(tbDSSV);

		JLabel lblDanhSachSinh = new JLabel("Danh sách sinh viên");
		lblDanhSachSinh.setHorizontalAlignment(SwingConstants.CENTER);
		lblDanhSachSinh.setForeground(new Color(0, 0, 0));
		lblDanhSachSinh.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblDanhSachSinh.setEnabled(false);
		lblDanhSachSinh.setBounds(0, 10, 743, 26);
		panel.add(lblDanhSachSinh);

		lbltestData = new JLabel("New label");
		lbltestData.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lbltestData.setBounds(20, 298, 497, 139);
		panel.add(lbltestData);

		btnTest1 = new JButton("Test");
		btnTest1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnTest1.setBounds(20, 469, 112, 43);
		panel.add(btnTest1);

		btnTest2 = new JButton("Test");
		btnTest2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnTest2.setBounds(166, 469, 112, 43);
		panel.add(btnTest2);

		btnTest1.addActionListener(this);
		btnTest2.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {

		Object o = e.getSource();
		if (o.equals(btnTest1)) {
			OkHttpClient client = new OkHttpClient();

			Request request = new Request.Builder().url("http://localhost:8080/QLSV_Spring/api/v1/student/getall")
					.build();
			try {
				Response respone = client.newCall(request).execute();
				lbltestData.setText(respone.body().string());
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				lbltestData.setText(e1.getMessage());
			}
		}

		if (o.equals(btnTest2)) {
			OkHttpClient client = new OkHttpClient();
			String json_string = "\r\n"
					+ "    {\r\n"
					+ "        \"lastName\": \"Dat\",\r\n"
					+ "        \"numCI\": \"123123123\",\r\n"
					+ "        \"dateOfBirth\": \"1978\",\r\n"
					+ "        \"phone\": \"090902130\",\r\n"
					+ "        \"email\": \"zxczc@gmail.com\",\r\n"
					+ "        \"address\": \"quan3\",\r\n"
					+ "        \"status\": \"Active\",\r\n"
					+ "        \"major\": \"Ky thuat phan mem\",\r\n"
					+ "        \"dateStart\": \"2019-05-16\",\r\n"
					+ "        \"id\": \"SV001\",\r\n"
					+ "        \"fullName\": \"Le Quang\"\r\n"
					+ "    }";
			RequestBody body = RequestBody.create(MediaType.parse("application/json"),json_string);
			Request request = new Request.Builder().url("http://localhost:8080/QLSV_Spring/api/v1/student/getall").post(body)
					.build();
			
			try {
				Response respone = client.newCall(request).execute();
				lbltestData.setText(respone.body().string());
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}
}
