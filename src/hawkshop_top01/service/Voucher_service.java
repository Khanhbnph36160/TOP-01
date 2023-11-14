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
    public int deteleSach(String ma){
        sql = "delete from voucher Where id = ?";
        try {
            cn = DBconnection.getConnection();
            ptm = cn.prepareStatement(sql);
            
            ptm.setObject(1, ma);           
            return ptm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    public int UpdateVoucher(voucher s) {       
        sql = "update voucher\n"
                + "set soluong=?,giatri=?,ngay_bat_dau=?,ngay_ket_thuc=?,trangthai=?\n"
                + "where ten_voucher=?";     
        try {
            cn = DBconnection.getConnection();
            ptm = cn.prepareStatement(sql);
            
            ptm.setString(1, s.getTen());
            ptm.setInt(2, s.getSoLuong());
            ptm.setString(3, s.getGiaTri());
            ptm.setString(4, s.getNgayBatDau());
            ptm.setString(5, s.getNgayKetThuc());
            ptm.setString(6, s.getTrangThai());
            return ptm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }  
    public List<voucher> timkiem(String name) {
        sql = "Select * from voucher where ten_voucher like '%"+name+"%' ";
        try {

            cn = DBconnection.getConnection();
            ptm = cn.prepareStatement(sql);
            rs = ptm.executeQuery();
            List<voucher> ls = new ArrayList<>();
            while (rs.next()) {
                voucher voucher = new voucher();
                voucher.setTen(rs.getString(1));
                voucher.setSoLuong(rs.getInt(2));
                voucher.setGiaTri(rs.getString(2));
                voucher.setNgayBatDau(rs.getString(3));
                voucher.setNgayKetThuc(rs.getString(4));
                voucher.setTrangThai(rs.getString(5));
                ls.add(voucher);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try {
                rs.close();ptm.close();cn.close();
            } catch (Exception e) {
            }           
        }
        return null;
    }
}
