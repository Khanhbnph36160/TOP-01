/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hawkshop_top01.service;


import hawkshop_top01.entity.voucher;
import hawkshop_top01.repository.DBconnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author khuat
 */
public class Voucher_service {
    Connection cn = null;
    PreparedStatement ptm = null;
    String sql = null;
    ResultSet rs = null;
    public ArrayList<voucher> getVoucherAll() {
        sql = "Select * from voucher";
        ArrayList<voucher> list = new ArrayList<>();
        try {

            cn = DBconnection.getConnection();
            ptm = cn.prepareStatement(sql);
            rs = ptm.executeQuery();
            while (rs.next()) {
                voucher nv = new voucher(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
                list.add(nv);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public int AddVoucher(voucher s) {
        sql = "INSERT INTO voucher(ten_voucher, soluong, giatri, ngay_bat_dau, ngay_ket_thuc,trangthai) VALUES(?,?,?,?,?,?)";
        try {
            cn = DBconnection.getConnection();
            ptm = cn.prepareStatement(sql);
                     
            ptm.setString(1, s.getTen());
            ptm.setInt(2, s.getSoLuong());
            ptm.setString(3, s.getGiaTri());
            ptm.setString(4,s.getNgayBatDau());
            ptm.setString(5, s.getNgayKetThuc());
            ptm.setString(6, s.getTrangThai());
            return ptm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    public int deteleUpdate(String id){
        sql = "delete dbo.Voucher Where id = ?";
        try {
            cn = DBconnection.getConnection();
            ptm = cn.prepareStatement(sql);
            
            ptm.setObject(1, id);           
            return ptm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    public int UpdateVoucher(voucher s) {       
//        sql = "update voucher\n"
//                + "set ten_voucher=?,soluong=?,giatri=?,ngay_bat_dau=?,ngay_ket_thuc=?,trangthai=?\n"
//                + "where id=?";
        sql = "UPDATE dbo.Voucher SET ten_voucher=?,soluong=?,giatri=?,ngay_bat_dau=?,ngay_ket_thuc=?,trangthai=? WHERE [id] = ?";
        try {
            cn = DBconnection.getConnection();
            ptm = cn.prepareStatement(sql);
            
            ptm.setObject(7, s.getMa());
            ptm.setObject(1, s.getTen());
            ptm.setObject(2, s.getSoLuong());
            ptm.setObject(3, s.getGiaTri());
            ptm.setObject(4, s.getNgayBatDau());
            ptm.setObject(5, s.getNgayKetThuc());
            ptm.setObject(6, s.getTrangThai());
            return ptm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }  
    public voucher findVoucherByID(String ten){
        List<voucher> list = new ArrayList<>();
        for (voucher v : list) {
            if (v.getTen().equalsIgnoreCase(ten)) {
                return v;
            }
        }
        return null;
    }

    public int deteleUpdate(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   

}
