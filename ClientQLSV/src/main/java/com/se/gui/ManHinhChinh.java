package com.se.gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class ManHinhChinh implements ActionListener{

	private JFrame frmHThngQuan;
	private JPanel pnContent;
	private JPanel pnMenu;
	private JTabbedPane pnNoiDung;
	private JMenuBar menuBar;
	private JMenu mnHeThong;
	private JMenuItem mntmTaiKhoan;
	private JMenuItem mntmTroGiup;
	private JMenuItem mntmDangXuat;
	private JMenuItem mntmThoat;
	private JMenu mnHocVuSinhVien;
	private JMenu mnDanhMuc;
	private JMenu mnQLLH;
	private JMenuItem mntmDSLopDanhNghia;
	private JMenuItem mntmDSLHP;
	private JMenu mnQLKetQua;
	private JMenuItem mntmXetDKThiGK;
	private JMenuItem mntmNhapDiem;
	private JMenuItem mntmXuatBangDiem;
	private JMenuItem mntmBieuMau;
	private FrmXetDuThi frmXetDuThi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManHinhChinh window = new ManHinhChinh();
					window.frmHThngQuan.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ManHinhChinh() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		
		
		frmHThngQuan = new JFrame();
		frmHThngQuan.setTitle("H\u00EA\u0323 th\u00F4\u0301ng qua\u0309n ly\u0301 sinh vi\u00EAn");
		frmHThngQuan.setBounds(100, 100, 1594, 1012);
		frmHThngQuan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHThngQuan.getContentPane().setLayout(new BoxLayout(frmHThngQuan.getContentPane(), BoxLayout.X_AXIS));
		
		pnContent = new JPanel();
		frmHThngQuan.getContentPane().add(pnContent, BorderLayout.NORTH);
		pnContent.setLayout(new BorderLayout(0, 0));
		
		pnMenu = new JPanel();
		pnContent.add(pnMenu, BorderLayout.NORTH);
		pnMenu.setLayout(new BoxLayout(pnMenu, BoxLayout.X_AXIS));
		
		menuBar = new JMenuBar();
		menuBar.setToolTipText("");
		pnMenu.add(menuBar);
		
		mnHeThong = new JMenu("Hệ thống");
		menuBar.add(mnHeThong);
		
		mntmTaiKhoan = new JMenuItem("Thông tin tài khoản");
		mnHeThong.add(mntmTaiKhoan);
		
		mntmTroGiup = new JMenuItem("Trợ giúp");
		mnHeThong.add(mntmTroGiup);
		
		mntmDangXuat = new JMenuItem("Đăng xuất");
		mnHeThong.add(mntmDangXuat);
		
		mntmThoat = new JMenuItem("Thoát");
		mnHeThong.add(mntmThoat);
		
		mnHocVuSinhVien = new JMenu("Học vụ sinh viên");
		menuBar.add(mnHocVuSinhVien);
		
		mnQLLH = new JMenu("Quản lý lớp học");
		mnHocVuSinhVien.add(mnQLLH);
		
		mntmDSLopDanhNghia = new JMenuItem("Danh sách lớp danh nghĩa");
		mnQLLH.add(mntmDSLopDanhNghia);
		
		mntmDSLHP = new JMenuItem("Danh sách lớp học phần");
		mnQLLH.add(mntmDSLHP);
		
		mnQLKetQua = new JMenu("Quản lý kết quả học tập");
		mnHocVuSinhVien.add(mnQLKetQua);
		
		mntmXetDKThiGK = new JMenuItem("Xét điều kiện thi");
		mnQLKetQua.add(mntmXetDKThiGK);
		
		mntmNhapDiem = new JMenuItem("Nhập điểm sinh viên");
		mnQLKetQua.add(mntmNhapDiem);
		
		mntmXuatBangDiem = new JMenuItem("In bảng điểm lớp học phần");
		mnQLKetQua.add(mntmXuatBangDiem);
		
		mnDanhMuc = new JMenu("Danh mục");
		menuBar.add(mnDanhMuc);
		
		mntmBieuMau = new JMenuItem("Biểu mẫu");
		mnDanhMuc.add(mntmBieuMau);
		
		pnNoiDung = new JTabbedPane(JTabbedPane.TOP);
		pnContent.add(pnNoiDung, BorderLayout.CENTER);
		
		//Add vao chuc nang khi click
		mntmXetDKThiGK.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {

		Object o = e.getSource();
		if (o.equals(mntmXetDKThiGK)) {
			pnNoiDung.remove(pnNoiDung.getSelectedComponent());
			pnNoiDung.removeAll();
			frmXetDuThi = new FrmXetDuThi();
			pnNoiDung.add(frmXetDuThi);
		}
	}
}
