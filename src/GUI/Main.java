/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import DTO.TaiKhoanDTO;

import GUI.Panel.TrangChinh;
import GUI.Panel.KhuVucKho;
import GUI.Panel.NhanVien;
import GUI.Panel.KhachHang;
import GUI.Panel.SanPham;
import GUI.Panel.ThuocTinh;
import GUI.Panel.NhaCungCap;
import GUI.Panel.PhanQuyen;
import GUI.Panel.PhieuNhap;
import GUI.Panel.PhieuXuat;
import GUI.Panel.TaiKhoan;
import GUI.Panel.ThongKe;

import java.awt.*;
import javax.swing.*;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import javax.swing.border.EmptyBorder;
/**
 *
 * @author anvan
 */
public class Main extends javax.swing.JFrame {
    public TaiKhoanDTO user;        
    Color DefaultColor, ClickedColor;
    
    public Main() {
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPnlMenu = new javax.swing.JPanel();
        jPnlTop = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPnlCenter = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPnlMenu1 = new javax.swing.JPanel();
        jPnlTrangChu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();
        jPnlSanPham = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lblIcon4 = new javax.swing.JLabel();
        jPnlThuocTinh = new javax.swing.JPanel();
        lblIcon6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPnlKhuVucKho = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblIcon2 = new javax.swing.JLabel();
        jPnlPhieuNhap = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblIcon1 = new javax.swing.JLabel();
        jPnlPhieuXuat = new javax.swing.JPanel();
        lblIcon3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPnlKhachHang = new javax.swing.JPanel();
        lblIcon5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPnlNhaCungCap = new javax.swing.JPanel();
        lblIcon7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPnlNhanVien = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lblIcon8 = new javax.swing.JLabel();
        jPnlTaiKhoan = new javax.swing.JPanel();
        lblIcon9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPnlThongKe = new javax.swing.JPanel();
        lblIcon10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPnlPhanQuyen = new javax.swing.JPanel();
        lblIcon11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        lblIcon12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPnlBottom = new javax.swing.JPanel();
        jPnlDangXuat = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        lblIcon13 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPnlContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hệ thống quản lý kho hàng");
        setPreferredSize(new java.awt.Dimension(1400, 800));

        jPnlMenu.setPreferredSize(new java.awt.Dimension(250, 1400));
        jPnlMenu.setLayout(new java.awt.BorderLayout());

        jPnlTop.setBackground(new java.awt.Color(255, 255, 255));
        jPnlTop.setPreferredSize(new java.awt.Dimension(250, 80));
        jPnlTop.setLayout(new java.awt.BorderLayout());

        jPanel16.setBackground(new java.awt.Color(204, 204, 204));
        jPanel16.setPreferredSize(new java.awt.Dimension(1, 1));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPnlTop.add(jPanel16, java.awt.BorderLayout.SOUTH);

        jPanel17.setBackground(new java.awt.Color(204, 204, 204));
        jPanel17.setPreferredSize(new java.awt.Dimension(1, 1));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 79, Short.MAX_VALUE)
        );

        jPnlTop.add(jPanel17, java.awt.BorderLayout.EAST);

        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPnlTop.add(jPanel18, java.awt.BorderLayout.CENTER);

        jPnlMenu.add(jPnlTop, java.awt.BorderLayout.NORTH);

        jPnlCenter.setBackground(new java.awt.Color(255, 255, 255));
        jPnlCenter.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPnlCenter.setPreferredSize(new java.awt.Dimension(250, 770));
        jPnlCenter.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jPnlCenter.add(jScrollPane1);

        jPnlMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jPnlMenu1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPnlTrangChu.setBackground(new java.awt.Color(255, 255, 255));
        jPnlTrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPnlTrangChuMousePressed(evt);
            }
        });
        jPnlTrangChu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Trang chủ");
        jPnlTrangChu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 200, 50));

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/home-button.png"))); // NOI18N
        lblIcon.setPreferredSize(new java.awt.Dimension(50, 50));
        jPnlTrangChu.add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, -1));

        jPnlMenu1.add(jPnlTrangChu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 50));

        jPnlSanPham.setBackground(new java.awt.Color(255, 255, 255));
        jPnlSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPnlSanPhamMousePressed(evt);
            }
        });
        jPnlSanPham.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Sản phẩm");
        jPnlSanPham.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 200, 50));

        lblIcon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/product.png"))); // NOI18N
        lblIcon4.setPreferredSize(new java.awt.Dimension(50, 50));
        jPnlSanPham.add(lblIcon4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, -1));

        jPnlMenu1.add(jPnlSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 250, 50));

        jPnlThuocTinh.setBackground(new java.awt.Color(255, 255, 255));
        jPnlThuocTinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPnlThuocTinhMousePressed(evt);
            }
        });
        jPnlThuocTinh.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIcon6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/tag.png"))); // NOI18N
        lblIcon6.setPreferredSize(new java.awt.Dimension(50, 50));
        jPnlThuocTinh.add(lblIcon6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Thuộc tính");
        jPnlThuocTinh.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 200, 50));

        jPnlMenu1.add(jPnlThuocTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 250, 50));

        jPnlKhuVucKho.setBackground(new java.awt.Color(255, 255, 255));
        jPnlKhuVucKho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPnlKhuVucKhoMousePressed(evt);
            }
        });
        jPnlKhuVucKho.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Khu vực kho");
        jPnlKhuVucKho.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 200, 50));

        lblIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/placeholder.png"))); // NOI18N
        lblIcon2.setPreferredSize(new java.awt.Dimension(50, 50));
        jPnlKhuVucKho.add(lblIcon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, -1));

        jPnlMenu1.add(jPnlKhuVucKho, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 250, 50));

        jPnlPhieuNhap.setBackground(new java.awt.Color(255, 255, 255));
        jPnlPhieuNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPnlPhieuNhapMousePressed(evt);
            }
        });
        jPnlPhieuNhap.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Phiếu nhập");
        jPnlPhieuNhap.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 200, 50));

        lblIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/import.png"))); // NOI18N
        lblIcon1.setPreferredSize(new java.awt.Dimension(50, 50));
        jPnlPhieuNhap.add(lblIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, -1));

        jPnlMenu1.add(jPnlPhieuNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 250, 50));

        jPnlPhieuXuat.setBackground(new java.awt.Color(255, 255, 255));
        jPnlPhieuXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPnlPhieuXuatMousePressed(evt);
            }
        });
        jPnlPhieuXuat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIcon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/export.png"))); // NOI18N
        lblIcon3.setPreferredSize(new java.awt.Dimension(50, 50));
        jPnlPhieuXuat.add(lblIcon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Phiếu xuất");
        jPnlPhieuXuat.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 200, 50));

        jPnlMenu1.add(jPnlPhieuXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 250, 50));

        jPnlKhachHang.setBackground(new java.awt.Color(255, 255, 255));
        jPnlKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPnlKhachHangMousePressed(evt);
            }
        });
        jPnlKhachHang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIcon5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/guest.png"))); // NOI18N
        lblIcon5.setPreferredSize(new java.awt.Dimension(50, 50));
        jPnlKhachHang.add(lblIcon5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Khách hàng");
        jPnlKhachHang.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 200, 50));

        jPnlMenu1.add(jPnlKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 250, -1));

        jPnlNhaCungCap.setBackground(new java.awt.Color(255, 255, 255));
        jPnlNhaCungCap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPnlNhaCungCapMousePressed(evt);
            }
        });
        jPnlNhaCungCap.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIcon7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/supplier.png"))); // NOI18N
        lblIcon7.setPreferredSize(new java.awt.Dimension(50, 50));
        jPnlNhaCungCap.add(lblIcon7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Nhà cung cấp");
        jPnlNhaCungCap.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 200, 50));

        jPnlMenu1.add(jPnlNhaCungCap, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 250, 50));

        jPnlNhanVien.setBackground(new java.awt.Color(255, 255, 255));
        jPnlNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPnlNhanVienMousePressed(evt);
            }
        });
        jPnlNhanVien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Nhân viên");
        jPnlNhanVien.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 200, 50));

        lblIcon8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/staff.png"))); // NOI18N
        lblIcon8.setPreferredSize(new java.awt.Dimension(50, 50));
        jPnlNhanVien.add(lblIcon8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, -1));

        jPnlMenu1.add(jPnlNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 250, 50));

        jPnlTaiKhoan.setBackground(new java.awt.Color(255, 255, 255));
        jPnlTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPnlTaiKhoanMousePressed(evt);
            }
        });
        jPnlTaiKhoan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIcon9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/profile.png"))); // NOI18N
        lblIcon9.setPreferredSize(new java.awt.Dimension(50, 50));
        jPnlTaiKhoan.add(lblIcon9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Tài khoản");
        jPnlTaiKhoan.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 200, 50));

        jPnlMenu1.add(jPnlTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 250, 50));

        jPnlThongKe.setBackground(new java.awt.Color(255, 255, 255));
        jPnlThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPnlThongKeMousePressed(evt);
            }
        });
        jPnlThongKe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIcon10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/statistical.png"))); // NOI18N
        lblIcon10.setPreferredSize(new java.awt.Dimension(50, 50));
        jPnlThongKe.add(lblIcon10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("Thống kê");
        jPnlThongKe.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 200, 50));

        jPnlMenu1.add(jPnlThongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 250, -1));

        jPnlPhanQuyen.setBackground(new java.awt.Color(255, 255, 255));
        jPnlPhanQuyen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPnlPhanQuyenMousePressed(evt);
            }
        });
        jPnlPhanQuyen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIcon11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/decentralization.png"))); // NOI18N
        lblIcon11.setPreferredSize(new java.awt.Dimension(50, 50));
        jPnlPhanQuyen.add(lblIcon11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setText("Phân quyền");
        jPnlPhanQuyen.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 200, 50));

        jPnlMenu1.add(jPnlPhanQuyen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 250, 50));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIcon12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/decentralization.png"))); // NOI18N
        lblIcon12.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel13.add(lblIcon12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setText("Test");
        jPanel13.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 200, 50));

        jPnlMenu1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 720, 250, 50));

        jPnlCenter.add(jPnlMenu1);

        jPnlMenu.add(jPnlCenter, java.awt.BorderLayout.CENTER);

        jPnlBottom.setBackground(new java.awt.Color(255, 255, 255));
        jPnlBottom.setPreferredSize(new java.awt.Dimension(250, 50));
        jPnlBottom.setLayout(new java.awt.BorderLayout());

        jPnlDangXuat.setBackground(new java.awt.Color(255, 255, 255));
        jPnlDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPnlDangXuatMousePressed(evt);
            }
        });
        jPnlDangXuat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setText("Đăng xuất");
        jPnlDangXuat.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 200, 50));

        lblIcon13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/log-out.png"))); // NOI18N
        lblIcon13.setPreferredSize(new java.awt.Dimension(50, 50));
        jPnlDangXuat.add(lblIcon13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, -1));

        jPnlBottom.add(jPnlDangXuat, java.awt.BorderLayout.CENTER);

        jPanel15.setBackground(new java.awt.Color(204, 204, 204));
        jPanel15.setPreferredSize(new java.awt.Dimension(1, 1));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPnlBottom.add(jPanel15, java.awt.BorderLayout.PAGE_START);

        jPnlMenu.add(jPnlBottom, java.awt.BorderLayout.SOUTH);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1270, Short.MAX_VALUE)
        );

        jPnlMenu.add(jPanel1, java.awt.BorderLayout.EAST);

        getContentPane().add(jPnlMenu, java.awt.BorderLayout.WEST);

        jPnlContent.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPnlContent, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void jPnlSanPhamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPnlSanPhamMousePressed

        SanPham p = new SanPham();
        setPanel(p);
    }//GEN-LAST:event_jPnlSanPhamMousePressed

    private void jPnlDangXuatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPnlDangXuatMousePressed
        int input = JOptionPane.showConfirmDialog(null,
            "Bạn có chắc chắn muốn đăng xuất?", "Đăng xuất",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (input == 0) {
            Login login = new Login();
            this.dispose();
            login.setVisible(true);
        }
    }//GEN-LAST:event_jPnlDangXuatMousePressed
    
    public void setColor(Color color){
        jPnlTrangChu.setBackground(color);
        jPnlThuocTinh.setBackground(color);
        jPnlSanPham.setBackground(color);
        jPnlKhuVucKho.setBackground(color);
        jPnlPhieuNhap.setBackground(color);
        jPnlPhieuXuat.setBackground(color);
        jPnlKhachHang.setBackground(color);
        jPnlNhaCungCap.setBackground(color);
        jPnlNhanVien.setBackground(color);
        jPnlTaiKhoan.setBackground(color);
        jPnlThongKe.setBackground(color);
        jPnlPhanQuyen.setBackground(color);
    }
    
    private void jPnlTrangChuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPnlTrangChuMousePressed
        

        TrangChinh trangChinh = new TrangChinh();
        setPanel(trangChinh);
    }//GEN-LAST:event_jPnlTrangChuMousePressed

    private void jPnlThuocTinhMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPnlThuocTinhMousePressed
        ThuocTinh thuocTinh = new ThuocTinh();
        setPanel(thuocTinh);
    }//GEN-LAST:event_jPnlThuocTinhMousePressed

    private void jPnlKhuVucKhoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPnlKhuVucKhoMousePressed
        KhuVucKho khuVucKho = new KhuVucKho();
        setPanel(khuVucKho);
    }//GEN-LAST:event_jPnlKhuVucKhoMousePressed

    private void jPnlPhieuNhapMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPnlPhieuNhapMousePressed
        PhieuNhap phieuNhap = new PhieuNhap();
        setPanel(phieuNhap);
    }//GEN-LAST:event_jPnlPhieuNhapMousePressed

    private void jPnlPhieuXuatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPnlPhieuXuatMousePressed
        PhieuXuat phieuXuat = new PhieuXuat();
        setPanel(phieuXuat);
    }//GEN-LAST:event_jPnlPhieuXuatMousePressed

    private void jPnlKhachHangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPnlKhachHangMousePressed
        KhachHang khachHang = new KhachHang();
        setPanel(khachHang);
    }//GEN-LAST:event_jPnlKhachHangMousePressed

    private void jPnlNhaCungCapMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPnlNhaCungCapMousePressed
        NhaCungCap nhaCungCap = new NhaCungCap();
        setPanel(nhaCungCap);
    }//GEN-LAST:event_jPnlNhaCungCapMousePressed

    private void jPnlNhanVienMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPnlNhanVienMousePressed
        NhanVien nhanVien = new NhanVien();
        setPanel(nhanVien);
    }//GEN-LAST:event_jPnlNhanVienMousePressed

    private void jPnlTaiKhoanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPnlTaiKhoanMousePressed
        TaiKhoan taiKhoan = new TaiKhoan();
        setPanel(taiKhoan);
    }//GEN-LAST:event_jPnlTaiKhoanMousePressed

    private void jPnlThongKeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPnlThongKeMousePressed
        ThongKe thongKe = new ThongKe();
        setPanel(thongKe);
    }//GEN-LAST:event_jPnlThongKeMousePressed

    private void jPnlPhanQuyenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPnlPhanQuyenMousePressed
        PhanQuyen phanQuyen = new PhanQuyen();
        setPanel(phanQuyen);
    }//GEN-LAST:event_jPnlPhanQuyenMousePressed
  
    public Main(TaiKhoanDTO user) throws UnsupportedLookAndFeelException {
        this.user = user;
        initComponents();
        TrangChinh trangChinh = new TrangChinh();
        setPanel(trangChinh);
        jScrollPane1 = new JScrollPane(jPnlCenter, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setBorder(new EmptyBorder(0, 0, 0, 0));
        jPnlMenu.add(jScrollPane1, BorderLayout.CENTER);
        ClickedColor = new Color(26, 188, 156);
        DefaultColor = new Color(255, 255, 255);
        FlatRobotoFont.install();
        FlatLaf.setPreferredFontFamily(FlatRobotoFont.FAMILY);
        FlatLaf.setPreferredLightFontFamily(FlatRobotoFont.FAMILY_LIGHT);
        FlatLaf.setPreferredSemiboldFontFamily(FlatRobotoFont.FAMILY_SEMIBOLD);
        FlatIntelliJLaf.registerCustomDefaultsSource("style");
        FlatIntelliJLaf.setup();
        UIManager.put("Table.showVerticalLines", false);
        UIManager.put("Table.showHorizontalLines", true);
        UIManager.put("TextComponent.arc", 5);
        UIManager.put("ScrollBar.thumbArc", 999);
        UIManager.put("ScrollBar.thumbInsets", new Insets(2, 2, 2, 2));
        UIManager.put("Button.iconTextGap", 10);
        UIManager.put("PasswordField.showRevealButton", true);
        UIManager.put("Table.selectionBackground", new Color(240, 247, 250));
        UIManager.put("Table.selectionForeground", new Color(0, 0, 0));
        UIManager.put("Table.scrollPaneBorder", new EmptyBorder(0, 0, 0, 0));
        UIManager.put("Table.rowHeight", 40);
        UIManager.put("TabbedPane.selectedBackground", Color.white);
        UIManager.put("TableHeader.height", 40);
        UIManager.put("TableHeader.font", UIManager.getFont("h4.font"));
        UIManager.put("TableHeader.background", new Color(242, 242, 242));
        UIManager.put("TableHeader.separatorColor", new Color(242, 242, 242));
        UIManager.put("TableHeader.bottomSeparatorColor", new Color(242, 242, 242));
    }
    
    public void setPanel(JPanel pn) {
        jPnlContent.removeAll();
        jPnlContent.add(pn).setVisible(true);
        jPnlContent.repaint();
        jPnlContent.validate();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPnlBottom;
    private javax.swing.JPanel jPnlCenter;
    public javax.swing.JPanel jPnlContent;
    private javax.swing.JPanel jPnlDangXuat;
    private javax.swing.JPanel jPnlKhachHang;
    private javax.swing.JPanel jPnlKhuVucKho;
    private javax.swing.JPanel jPnlMenu;
    private javax.swing.JPanel jPnlMenu1;
    private javax.swing.JPanel jPnlNhaCungCap;
    private javax.swing.JPanel jPnlNhanVien;
    private javax.swing.JPanel jPnlPhanQuyen;
    private javax.swing.JPanel jPnlPhieuNhap;
    private javax.swing.JPanel jPnlPhieuXuat;
    private javax.swing.JPanel jPnlSanPham;
    private javax.swing.JPanel jPnlTaiKhoan;
    private javax.swing.JPanel jPnlThongKe;
    private javax.swing.JPanel jPnlThuocTinh;
    private javax.swing.JPanel jPnlTop;
    private javax.swing.JPanel jPnlTrangChu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblIcon1;
    private javax.swing.JLabel lblIcon10;
    private javax.swing.JLabel lblIcon11;
    private javax.swing.JLabel lblIcon12;
    private javax.swing.JLabel lblIcon13;
    private javax.swing.JLabel lblIcon2;
    private javax.swing.JLabel lblIcon3;
    private javax.swing.JLabel lblIcon4;
    private javax.swing.JLabel lblIcon5;
    private javax.swing.JLabel lblIcon6;
    private javax.swing.JLabel lblIcon7;
    private javax.swing.JLabel lblIcon8;
    private javax.swing.JLabel lblIcon9;
    // End of variables declaration//GEN-END:variables

}
