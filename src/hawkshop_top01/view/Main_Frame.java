/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hawkshop_top01.view;

import javax.swing.JPanel;



/**
 *
 * @author tuantq148
 */
public class Main_Frame extends javax.swing.JFrame {
    private JPanel childJPanel;
    /**
     * Creates new form Main_Frame
     */
    public Main_Frame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMenu = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        logoApp = new javax.swing.JLabel();
        NameStore = new javax.swing.JLabel();
        pnlSanPham = new javax.swing.JPanel();
        lblSanPham = new javax.swing.JLabel();
        pnlNhanVien = new javax.swing.JPanel();
        lblNhanVien = new javax.swing.JLabel();
        pnlKhachHang = new javax.swing.JPanel();
        lblKhachHang = new javax.swing.JLabel();
        pnlHoaDon = new javax.swing.JPanel();
        lblGiamGia = new javax.swing.JLabel();
        pnlThongKe = new javax.swing.JPanel();
        lblHoaDon = new javax.swing.JLabel();
        pnlTrangChu = new javax.swing.JPanel();
        lblTrangChu = new javax.swing.JLabel();
        pnlUser = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        vaitro = new javax.swing.JLabel();
        btnDangXuat = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        pnlThongKe3 = new javax.swing.JPanel();
        lblThongKe = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlMenu.setBackground(new java.awt.Color(0, 51, 102));

        jSeparator1.setForeground(new java.awt.Color(51, 255, 0));

        logoApp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoApp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hawkshop_top01/images/icons/Riverhawks-MainLogo-1568x1582.png"))); // NOI18N

        NameStore.setFont(new java.awt.Font("Rockwell Condensed", 1, 16)); // NOI18N
        NameStore.setForeground(new java.awt.Color(255, 255, 255));
        NameStore.setText("HAWK SHOP");

        pnlSanPham.setBackground(new java.awt.Color(0, 51, 102));
        pnlSanPham.setForeground(new java.awt.Color(255, 255, 255));

        lblSanPham.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSanPham.setForeground(new java.awt.Color(255, 255, 255));
        lblSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hawkshop_top01/images/icons/Mobile phone.png"))); // NOI18N
        lblSanPham.setText("SẢN PHẨM");
        lblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSanPhamMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlSanPhamLayout = new javax.swing.GroupLayout(pnlSanPham);
        pnlSanPham.setLayout(pnlSanPhamLayout);
        pnlSanPhamLayout.setHorizontalGroup(
            pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSanPham, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlSanPhamLayout.setVerticalGroup(
            pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        pnlNhanVien.setBackground(new java.awt.Color(0, 51, 102));
        pnlNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        pnlNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlNhanVienMouseClicked(evt);
            }
        });

        lblNhanVien.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        lblNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hawkshop_top01/images/icons/nhanvien.png"))); // NOI18N
        lblNhanVien.setText("NHÂN VIÊN");
        lblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNhanVienMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlNhanVienLayout = new javax.swing.GroupLayout(pnlNhanVien);
        pnlNhanVien.setLayout(pnlNhanVienLayout);
        pnlNhanVienLayout.setHorizontalGroup(
            pnlNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlNhanVienLayout.setVerticalGroup(
            pnlNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        pnlKhachHang.setBackground(new java.awt.Color(0, 51, 102));
        pnlKhachHang.setForeground(new java.awt.Color(255, 255, 255));

        lblKhachHang.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        lblKhachHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hawkshop_top01/images/icons/khachhang.png"))); // NOI18N
        lblKhachHang.setText("KHÁCH HÀNG");
        lblKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblKhachHangMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlKhachHangLayout = new javax.swing.GroupLayout(pnlKhachHang);
        pnlKhachHang.setLayout(pnlKhachHangLayout);
        pnlKhachHangLayout.setHorizontalGroup(
            pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlKhachHangLayout.setVerticalGroup(
            pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        pnlHoaDon.setBackground(new java.awt.Color(0, 51, 102));
        pnlHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        pnlHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlHoaDonMouseClicked(evt);
            }
        });

        lblGiamGia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblGiamGia.setForeground(new java.awt.Color(255, 255, 255));
        lblGiamGia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGiamGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hawkshop_top01/images/icons/Label.png"))); // NOI18N
        lblGiamGia.setText("GIẢM GIÁ");

        javax.swing.GroupLayout pnlHoaDonLayout = new javax.swing.GroupLayout(pnlHoaDon);
        pnlHoaDon.setLayout(pnlHoaDonLayout);
        pnlHoaDonLayout.setHorizontalGroup(
            pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGiamGia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlHoaDonLayout.setVerticalGroup(
            pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGiamGia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        pnlThongKe.setBackground(new java.awt.Color(0, 51, 102));
        pnlThongKe.setForeground(new java.awt.Color(255, 255, 255));

        lblHoaDon.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        lblHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hawkshop_top01/images/icons/hoadon.png"))); // NOI18N
        lblHoaDon.setText("HÓA ĐƠN");
        lblHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHoaDonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlThongKeLayout = new javax.swing.GroupLayout(pnlThongKe);
        pnlThongKe.setLayout(pnlThongKeLayout);
        pnlThongKeLayout.setHorizontalGroup(
            pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHoaDon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlThongKeLayout.setVerticalGroup(
            pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHoaDon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        pnlTrangChu.setBackground(new java.awt.Color(0, 51, 102));

        lblTrangChu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTrangChu.setForeground(new java.awt.Color(255, 255, 255));
        lblTrangChu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hawkshop_top01/images/icons/Home.png"))); // NOI18N
        lblTrangChu.setText("TRANG CHỦ");

        javax.swing.GroupLayout pnlTrangChuLayout = new javax.swing.GroupLayout(pnlTrangChu);
        pnlTrangChu.setLayout(pnlTrangChuLayout);
        pnlTrangChuLayout.setHorizontalGroup(
            pnlTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTrangChu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlTrangChuLayout.setVerticalGroup(
            pnlTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTrangChu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        pnlUser.setBackground(new java.awt.Color(0, 51, 102));
        pnlUser.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("User    :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Vai trò :");

        user.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));

        vaitro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        vaitro.setForeground(new java.awt.Color(255, 255, 255));

        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hawkshop_top01/images/icons/Log out.png"))); // NOI18N
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDangXuatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDangXuatMouseExited(evt);
            }
        });
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlUserLayout = new javax.swing.GroupLayout(pnlUser);
        pnlUser.setLayout(pnlUserLayout);
        pnlUserLayout.setHorizontalGroup(
            pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vaitro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(btnDangXuat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlUserLayout.setVerticalGroup(
            pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(vaitro, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlThongKe3.setBackground(new java.awt.Color(0, 51, 102));
        pnlThongKe3.setForeground(new java.awt.Color(255, 255, 255));

        lblThongKe.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblThongKe.setForeground(new java.awt.Color(255, 255, 255));
        lblThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hawkshop_top01/images/icons/thongke.png"))); // NOI18N
        lblThongKe.setText("THỐNG KÊ");
        lblThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThongKeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlThongKe3Layout = new javax.swing.GroupLayout(pnlThongKe3);
        pnlThongKe3.setLayout(pnlThongKe3Layout);
        pnlThongKe3Layout.setHorizontalGroup(
            pnlThongKe3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongKe3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblThongKe)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlThongKe3Layout.setVerticalGroup(
            pnlThongKe3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongKe3Layout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addComponent(lblThongKe)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(pnlSanPham, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlNhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlKhachHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlThongKe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlTrangChu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoApp, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameStore))
                .addContainerGap(38, Short.MAX_VALUE))
            .addComponent(pnlThongKe3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoApp, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NameStore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlThongKe3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHoaDonMouseClicked
        showPanel(new Bill_Panel());
    }//GEN-LAST:event_lblHoaDonMouseClicked

    private void btnDangXuatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangXuatMouseEntered
        btnDangXuat.setBackground(new java.awt.Color(249, 7, 22));
    }//GEN-LAST:event_btnDangXuatMouseEntered

    private void btnDangXuatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangXuatMouseExited
        btnDangXuat.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_btnDangXuatMouseExited

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void lblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSanPhamMouseClicked
        // TODO add your handling code here:
        showPanel(new Product_Panel());
    }//GEN-LAST:event_lblSanPhamMouseClicked

    private void lblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNhanVienMouseClicked
        // TODO add your handling code here:
        showPanel(new Employee_Panel());
    }//GEN-LAST:event_lblNhanVienMouseClicked

    private void lblKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHangMouseClicked
        // TODO add your handling code here:
        showPanel(new Customer_Panel());
    }//GEN-LAST:event_lblKhachHangMouseClicked

    private void lblThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongKeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblThongKeMouseClicked

    private void pnlNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNhanVienMouseClicked
        // TODO add your handling code here:
        showPanel(new Employee_Panel());
    }//GEN-LAST:event_pnlNhanVienMouseClicked

    private void pnlHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHoaDonMouseClicked
        // TODO add your handling code here
        showPanel(new Vouchers());
    }//GEN-LAST:event_pnlHoaDonMouseClicked

    private void showPanel(JPanel panel){
        childJPanel = panel;
        jPanel1.removeAll();
        jPanel1.add(childJPanel);
        jPanel1.validate();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NameStore;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblGiamGia;
    private javax.swing.JLabel lblHoaDon;
    private javax.swing.JLabel lblKhachHang;
    private javax.swing.JLabel lblNhanVien;
    private javax.swing.JLabel lblSanPham;
    private javax.swing.JLabel lblThongKe;
    private javax.swing.JLabel lblTrangChu;
    private javax.swing.JLabel logoApp;
    private javax.swing.JPanel pnlHoaDon;
    private javax.swing.JPanel pnlKhachHang;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlNhanVien;
    private javax.swing.JPanel pnlSanPham;
    private javax.swing.JPanel pnlThongKe;
    private javax.swing.JPanel pnlThongKe3;
    private javax.swing.JPanel pnlTrangChu;
    private javax.swing.JPanel pnlUser;
    private javax.swing.JLabel user;
    private javax.swing.JLabel vaitro;
    // End of variables declaration//GEN-END:variables
}