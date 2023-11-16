/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hawkshop_top01.service;


import hawkshop_top01.entity.voucher;
import hawkshop_top01.repository.DBconnection;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import static java.util.Collections.list;
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
    ArrayList<voucher> list = new ArrayList<>();
    public ArrayList<voucher> getVoucherAll() {
        sql = "Select * from voucher";
        ArrayList<voucher> list = new ArrayList<>();
        list.removeAll(list);
        try {

            cn = DBconnection.getConnection();
            ptm = cn.prepareStatement(sql);
            rs = ptm.executeQuery();
            while (rs.next()) {
                    Date ngay_bat_dau=rs.getDate(5);
                    Date ngay_ket_thuc=rs.getDate(6);
                    SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
                    String ns=sdf.format(ngay_bat_dau);
                    String ndk=sdf.format(ngay_ket_thuc);
                voucher nv = new voucher(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), ns, ndk, rs.getString(7));
                list.add(nv);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
//    public int AddVoucher(voucher s) {
//        sql = "INSERT INTO voucher(ten_voucher, soluong, giatri, ngay_bat_dau, ngay_ket_thuc,trangthai) VALUES(?,?,?,?,?,?)";
//        try {
//            cn = DBconnection.getConnection();
//            ptm = cn.prepareStatement(sql);
//                     
//            ptm.setString(1, s.getTen());
//            ptm.setInt(2, s.getSoLuong());
//            ptm.setString(3, s.getGiaTri());
//            ptm.setString(4,s.getNgayBatDau());
//            ptm.setString(5, s.getNgayKetThuc());
//            ptm.setString(6, s.getTrangThai());
//            return ptm.executeUpdate();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return 0;
//        }
//    }
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
//   public boolean selectByID(String ten) {
//       boolean aa = false;
//        try {
//             cn=DBconnection.getConnection();
//             ptm=cn.prepareStatement(ten);
//             rs=ptm.executeQuery("select ten_voucher from voucher where ten_voucher like '"+ten+"'");
//            while (rs.next()) {                
//                if(rs.getString(2).equals(ten)){                                  
//                aa =true;
//                break;
//                }else{
//                aa= false;
//                }
//            }          
//        } catch (Exception e) {
//            e.printStackTrace();
////            return null;
//        }
//        return aa;  
//    }
//   public int findNV(String ten){
//    int a=0;
//    for (int i = 0; i < getVoucherAll().size(); i++) {
//        if (getVoucherAll().get(i).getTen().equalsIgnoreCase(ten)) {
//            a=i;
//            break;
//        }
//    }
//    return a;
//}
//   public ArrayList<voucher> timKiem(Integer ma) {
//        ArrayList<voucher> listTimKiem = new ArrayList<>();
//        for (voucher s : list) {
//           if (ma.equals(s.getMa())) {
//                listTimKiem.add(s);
//            }
//       }
//        return listTimKiem;
//    }
    public ArrayList<voucher> findAllVoucherByName(String ten) throws SQLException{
        sql = "select * from voucher where name ='"+ten+"'";
        
            Statement srm = cn.createStatement();
            rs = srm.executeQuery(sql);
            ArrayList<voucher> list = new ArrayList<>();
            while (rs.next()) {            
            voucher vou = new voucher();
            vou.setMa(rs.getInt("id"));
            vou.setTen(rs.getString("ten_voucher"));
            vou.setSoLuong(rs.getInt("soLuong"));
            vou.setGiaTri(rs.getString("giaTri"));
            vou.setNgayBatDau(rs.getString("ngay_bat_dau"));
            vou.setNgayKetThuc(rs.getString("ngay_ket_thuc"));
            vou.setTrangThai(rs.getString("trangThai"));
        }
        return list;     
    }
}
