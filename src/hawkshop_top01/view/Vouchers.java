/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package hawkshop_top01.view;

import hawkshop_top01.entity.voucher;
import hawkshop_top01.images.XImage;
import hawkshop_top01.repository.DBconnection;

import hawkshop_top01.service.Voucher_service;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.WIDTH;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author khuat
 */
public class Vouchers extends javax.swing.JPanel {

    Voucher_service sr = new Voucher_service();
    int row = -1;

    /**
     * Creates new form Vouchers
     */
    public Vouchers() {
        initComponents();
        FillTable(sr.getVoucherAll());
    }

    private void FillTable(List<voucher> lists) {
        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel) tblbangvoucher.getModel();
        model.setRowCount(0);
        for (voucher s : lists) {
            model.addRow(new Object[]{
                s.getMa(),
                s.getTen(),
                s.getSoLuong(),
                s.getGiaTri(),
                s.getNgayBatDau(),
                s.getNgayKetThuc(),
                s.getTrangThai()
            });
        }
    }
//    private void FillTable1() {
//        DefaultTableModel model = (DefaultTableModel) tblbangvoucher.getModel();        
//        model.setRowCount(0);
//        for (voucher s : sr.timkiem(stnFind)) {
//            model.addRow(new Object[]{
//                s.getMa(),
//                s.getTen(),
//                s.getSoLuong(),
//                s.getGiaTri(),
//                s.getNgayBatDau(),
//                s.getNgayKetThuc(),
//                s.getTrangThai()
//            });
//        }
//    }

    private void showData() {
        row = tblbangvoucher.getSelectedRow();
        if (row >= 0) {
            txtma.setText(tblbangvoucher.getValueAt(row, 0).toString());
            txtten.setText(tblbangvoucher.getValueAt(row, 1).toString());
            txtsoluong.setText(tblbangvoucher.getValueAt(row, 2).toString());
            txtgiatri.setText(tblbangvoucher.getValueAt(row, 3).toString());
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                SimpleDateFormat sdfs = new SimpleDateFormat("dd/MM/yyyy");
                Date ngay_bat_dau = sdf.parse(tblbangvoucher.getValueAt(row, 4).toString());
//                String ns = sdfs.format(ngay_bat_dau);
                datebatdau.setDate(ngay_bat_dau);
                Date ngay_ket_thuc = sdf.parse(tblbangvoucher.getValueAt(row, 5).toString());
                String nss = sdfs.format(ngay_ket_thuc);
                dateketthuc.setDate(ngay_ket_thuc);
            } catch (Exception e) {
            }
            txttrangthai.setText(tblbangvoucher.getValueAt(row, 6).toString());
        }
    }

    voucher Getmodel() {

//        try {
//            SimpleDateFormat sdfs = new SimpleDateFormat("dd/MM/yyyy");
//            SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
//            Date date = new Date();
//            String batdau = sdf.format(date);
//            Date ngay_bat_dau = sdfs.parse(datebatdau.getToolTipText());
//            String bd = sdf.format(ngay_bat_dau);
//            String ketthuc = sdf.format(date);
//            Date ngay_ket_thuc = sdfs.parse(dateketthuc.getToolTipText());
//            String kt = sdf.format(ngay_ket_thuc);
//            voucher vo = new voucher(WIDTH, txtten.getText(), Integer.valueOf(txtsoluong.getText()), bd, kt, batdau, ketthuc);
//            return vo;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
        try {
            SimpleDateFormat inputDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat outputDateFormat = new SimpleDateFormat("MM-dd-yyyy");

            Date currentDate = new Date();
            String text = datebatdau.getToolTipText();
            String textt = dateketthuc.getToolTipText();
            voucher v = new voucher();
            // Assuming datebatdau.getToolTipText() and dateketthuc.getToolTipText() are not null
            if (text != null) {
                Date ngay_bat_dau = inputDateFormat.parse(text);
                String bd = outputDateFormat.format(ngay_bat_dau);

                Date ngay_ket_thuc = inputDateFormat.parse(textt);
                String kt = outputDateFormat.format(ngay_ket_thuc);

                String batdau = outputDateFormat.format(currentDate);
                String ketthuc = outputDateFormat.format(currentDate);
                String ten = v.getTen();
                voucher vo = new voucher(WIDTH, txtten.getText(), Integer.parseInt(txtsoluong.getText()), txtgiatri.getText(), bd, kt, txttrangthai.getText(), batdau, ketthuc);
                return vo;
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            // Handle the exception appropriately, log it, or return an error response
            return null;
        }

    }

    private void clear() {
        txtma.setText("");
        txtten.setText("");
        txtsoluong.setText("");
        txtgiatri.setText("");
        txttrangthai.setText("");
    }

    public boolean check() {
        if (txtten.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Tên không được để trống!");
            return false;
        }
        if (txtsoluong.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Số lượng không được để trống!");
            return false;
        }
        if (txtgiatri.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Giá trị không được để trống!");
            return false;
        }
        if (datebatdau.getDate().equals("")) {
            JOptionPane.showMessageDialog(this, "Ngày bắt đầu không được để trống!");
            return false;
        }
        if (dateketthuc.getDate().equals("")) {
            JOptionPane.showMessageDialog(this, "Ngày Kết thúc không được để trống!");
            return false;
        }
        if (txttrangthai.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Trạng thái không được để trống!");
            return false;
        }
        return true;
    }

//    public void addVoucher() {
//        voucher s = Getmodel();
//        if (sr.AddVoucher(s) > 0) {
//            JOptionPane.showMessageDialog(this, "Thành công");
//            clear();
//        } else {
//            JOptionPane.showMessageDialog(this, "Không Thành công");
//        }
//    }
    public void UpdateVoucher() {
        row = tblbangvoucher.getSelectedRow();
        int id = Integer.valueOf(tblbangvoucher.getValueAt(row, 0).toString());
        voucher s = Getmodel();
        s.setMa(id);
        if (sr.UpdateVoucher(s) > 0) {
            JOptionPane.showMessageDialog(this, "Thành công");
            clear();
            FillTable(sr.getVoucherAll());
        } else {
            JOptionPane.showMessageDialog(this, "Không Thành công");
        }
    }

    public void delete() {
        row = tblbangvoucher.getSelectedRow();
        String id = tblbangvoucher.getValueAt(row, 0).toString();
        voucher s = Getmodel();
        if (sr.deteleUpdate(id) > 0) {
            JOptionPane.showMessageDialog(this, "Thành công");
        } else {
            JOptionPane.showMessageDialog(this, "Không Thành công");
        }
    }

    public void setModel(voucher v) {
//        txtma.setText(Integer.valueOf(v.getMa()).toString());
//        txtten.setText(v.getTen());
//        txtsoluong.setText(Integer.valueOf(v.getSoLuong()).toString());
//        txtgiatri.setText(v.getGiaTri());
//        txtbatdau.setText(v.getNgayBatDau());
//        txtketthuc.setText(v.getNgayKetThuc());
//        txttrangthai.setText(v.getTrangThai());
        try {
            txtma.setText(Integer.valueOf(v.getMa()).toString());
            txtten.setText(v.getTen());
            txtsoluong.setText(Integer.valueOf(v.getSoLuong()).toString());
            txtgiatri.setText(v.getGiaTri());
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            SimpleDateFormat sdfs = new SimpleDateFormat("dd/MM/yyyy");

            Date ngay_bat_dau = sdf.parse(v.getNgayBatDau());
            String ns = sdfs.format(ngay_bat_dau);
            datebatdau.setToolTipText(ns);
            Date ngay_ket_thuc = sdf.parse(v.getNgayKetThuc());
            String nss = sdfs.format(ngay_ket_thuc);
            dateketthuc.setToolTipText(nss);
            txttrangthai.setText(v.getTrangThai());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtten = new javax.swing.JTextField();
        txtsoluong = new javax.swing.JTextField();
        txtgiatri = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtma = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txttrangthai = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        dateketthuc = new com.toedter.calendar.JDateChooser();
        datebatdau = new com.toedter.calendar.JDateChooser();
        btnxoa = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnthem = new javax.swing.JButton();
        btnlammoi = new javax.swing.JButton();
        lbldongho = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblbangvoucher = new javax.swing.JTable();
        txttimkiem = new javax.swing.JTextField();
        btntimkiem = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Khuyến mãi");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Mã voucher");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Tên voucher");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Số lượng");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Giá Trị");

        txtten.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttenActionPerformed(evt);
            }
        });

        txtsoluong.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        txtgiatri.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtgiatri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgiatriActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("Voucher");

        txtma.setEditable(false);
        txtma.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtma.setForeground(new java.awt.Color(255, 0, 0));
        txtma.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtmaFocusGained(evt);
            }
        });
        txtma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtsoluong, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtgiatri, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtten, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 275, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtma)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtten, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtgiatri, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Ngày bắt đầu");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Ngày kết thúc");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Trạng thái");

        txttrangthai.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txttrangthai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttrangthaiActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("Thời Gian Sửa dụng");

        dateketthuc.setDateFormatString("yyyy-MM-dd");

        datebatdau.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txttrangthai)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(0, 228, Short.MAX_VALUE))
                    .addComponent(dateketthuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(datebatdau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(datebatdau, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(12, 12, 12)
                .addComponent(dateketthuc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txttrangthai, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        btnxoa.setBackground(new java.awt.Color(255, 255, 0));
        btnxoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnxoa.setForeground(new java.awt.Color(0, 102, 255));
        btnxoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hawkshop_top01/images/icons/delete-button.png"))); // NOI18N
        btnxoa.setText("Xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnsua.setBackground(new java.awt.Color(255, 255, 0));
        btnsua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsua.setForeground(new java.awt.Color(0, 102, 255));
        btnsua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hawkshop_top01/images/icons/sua.png"))); // NOI18N
        btnsua.setText("Sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnthem.setBackground(new java.awt.Color(255, 255, 0));
        btnthem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnthem.setForeground(new java.awt.Color(0, 102, 255));
        btnthem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hawkshop_top01/images/icons/them.png"))); // NOI18N
        btnthem.setText("Thêm");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnlammoi.setBackground(new java.awt.Color(255, 255, 0));
        btnlammoi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnlammoi.setForeground(new java.awt.Color(51, 102, 255));
        btnlammoi.setText("Làm mới");
        btnlammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlammoiActionPerformed(evt);
            }
        });

        lbldongho.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbldongho.setForeground(new java.awt.Color(0, 0, 204));
        lbldongho.setText("00:00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnthem, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnlammoi, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnsua, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnxoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lbldongho)
                                .addGap(25, 25, 25))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnlammoi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbldongho))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnthem, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsua, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tblbangvoucher.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã voucher", "Tên voucher", "Số lượng", "Giá trị", "Ngày bắt đầu", "Ngày kết thúc", "Trạng thái"
            }
        ));
        tblbangvoucher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblbangvoucherMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblbangvoucher);

        txttimkiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttimkiemKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttimkiemKeyReleased(evt);
            }
        });

        btntimkiem.setBackground(new java.awt.Color(255, 255, 0));
        btntimkiem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btntimkiem.setForeground(new java.awt.Color(0, 51, 255));
        btntimkiem.setText("Search");
        btntimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntimkiemActionPerformed(evt);
            }
        });

        jRadioButton1.setText("Đang diễn ra");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Đã kết thúc");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("Danh sách Voucher");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btntimkiem)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btntimkiem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton2)
                        .addComponent(jRadioButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txttenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttenActionPerformed

    private void txtgiatriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgiatriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgiatriActionPerformed

    private void txtmaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtmaFocusGained

    }//GEN-LAST:event_txtmaFocusGained

    private void txtmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmaActionPerformed

    private void txttrangthaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttrangthaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttrangthaiActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        delete();
        FillTable(sr.getVoucherAll());
    }//GEN-LAST:event_btnxoaActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
//        UpdateVoucher();
//        tblbangvoucher.setRowSelectionInterval(0, 0);
    try {
            int id = Integer.valueOf(txtma.getText());
            String ten = txtten.getText();
            int soLuong = Integer.valueOf(txtsoluong.getText());
            String giaTri = txtgiatri.getText();
            String trangThai = txttrangthai.getText();
            Connection cn = null;
            PreparedStatement ptm = null;
            String sql = null;
         

            sql = "UPDATE dbo.Voucher SET ten_voucher=?,soluong=?,giatri=?,ngay_bat_dau=?,ngay_ket_thuc=?,trangthai=? WHERE id = ?";
            try {
                cn = DBconnection.getConnection();
                ptm = cn.prepareStatement(sql);

                ptm.setObject(1, ten);
                ptm.setObject(2, soLuong);
                ptm.setObject(3, giaTri);
                ptm.setObject(4,((JTextField)datebatdau.getDateEditor().getUiComponent()).getText());
                ptm.setObject(5,((JTextField)dateketthuc.getDateEditor().getUiComponent()).getText());
                ptm.setObject(6, trangThai);
                ptm.setObject(7, id);
                int chk = ptm.executeUpdate();
                if (chk > 0) {
                    JOptionPane.showMessageDialog(this, "Thêm Thành Công");
                    FillTable(sr.getVoucherAll());
                }else{
                     JOptionPane.showMessageDialog(this, " Không Thành Công");
                }
                        
            } catch (Exception e) {
                e.printStackTrace();        
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed

        try {
            String ten = txtten.getText();
            int soLuong = Integer.valueOf(txtsoluong.getText());
            String giaTri = txtgiatri.getText();
            String trangThai = txttrangthai.getText();
            Connection cn = null;
            PreparedStatement ptm = null;
            String sql = null;
         

            sql = "INSERT INTO voucher(ten_voucher, soluong, giatri, ngay_bat_dau, ngay_ket_thuc,trangthai) VALUES(?,?,?,?,?,?)";
            try {
                cn = DBconnection.getConnection();
                ptm = cn.prepareStatement(sql);

                ptm.setString(1, ten);
                ptm.setInt(2, soLuong);
                ptm.setString(3, giaTri);
                ptm.setString(4, ((JTextField)datebatdau.getDateEditor().getUiComponent()).getText());
                ptm.setString(5, ((JTextField)dateketthuc.getDateEditor().getUiComponent()).getText());
                ptm.setString(6, trangThai);
                int chk = ptm.executeUpdate();
                if (chk > 0) {
                    JOptionPane.showMessageDialog(this, "Thêm Thành Công");
                    FillTable(sr.getVoucherAll());
                }else{
                     JOptionPane.showMessageDialog(this, " Không Thành Công");
                }
                        
            } catch (Exception e) {
                e.printStackTrace();        
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnlammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlammoiActionPerformed
        clear();
    }//GEN-LAST:event_btnlammoiActionPerformed

    private void tblbangvoucherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblbangvoucherMouseClicked
        showData();
    }//GEN-LAST:event_tblbangvoucherMouseClicked

    private void btntimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntimkiemActionPerformed
        int fnh = sr.findNV(txttimkiem.getText());
        if (fnh >= 0) {
            tblbangvoucher.setRowSelectionInterval(fnh, fnh);
            FillTable((List<voucher>) sr.getVoucherAll().get(fnh));
        } else {
            JOptionPane.showMessageDialog(this, "Không có");
        }

    }//GEN-LAST:event_btntimkiemActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void txttimkiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttimkiemKeyPressed

    }//GEN-LAST:event_txttimkiemKeyPressed

    private void txttimkiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttimkiemKeyReleased
//         Connection cn = null;
//          PreparedStatement ptm = null;
//          String sql = null;
//          ResultSet rs = null;
//          ArrayList<voucher>  arr= new ArrayList<>();
//          arr.clear();
//          try {
//              sql = "Select dbo.Voucher where ten_voucher like N'%" + txttimkiem.getText()+ "%'";
//              
//            cn = DBconnection.getConnection();
//              System.out.println(sql);
//            ptm = cn.prepareStatement(sql);
//              while (rs.next()) {
//                voucher nv = new voucher(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
//                arr.add(nv);
//            }
//              cn.close();
//              FillTable(sr.getVoucherAll());
//        } catch (Exception e) {
//        }
    }//GEN-LAST:event_txttimkiemKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlammoi;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btntimkiem;
    private javax.swing.JButton btnxoa;
    private com.toedter.calendar.JDateChooser datebatdau;
    private com.toedter.calendar.JDateChooser dateketthuc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbldongho;
    private javax.swing.JTable tblbangvoucher;
    private javax.swing.JTextField txtgiatri;
    private javax.swing.JTextField txtma;
    private javax.swing.JTextField txtsoluong;
    private javax.swing.JTextField txtten;
    private javax.swing.JTextField txttimkiem;
    private javax.swing.JTextField txttrangthai;
    // End of variables declaration//GEN-END:variables

}
