/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hawkshop_top01.repository;

import hawkshop_top01.entity.NhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author MSI
 */
public class NhanVienRepo {
    DBconnection dBconnection;
    public ArrayList<NhanVien> getAll(){
        String sql = "SELECT * FROM NhanVien";
        ArrayList<NhanVien> listNV = new ArrayList<>();
        try (Connection conn = dBconnection.getConnection();
                PreparedStatement pst = conn.prepareCall(sql)
                ){
            ResultSet rs = pst.executeQuery();
            while (rs.next()) { 
                Integer id = rs.getInt("Id");
                String ten = rs.getString("ten");
                Integer vaiTro = rs.getInt("id_role");
                String email = rs.getString("email");
                String sdt = rs.getString("sdt");
                String diaChi = rs.getString("diaChi");
                
                NhanVien nv = new NhanVien(id, ten, email, sdt, diaChi, vaiTro);
                listNV.add(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listNV;
    }
    
    public Boolean addNew(NhanVien nhanVien){
        String sql = "INSERT INTO NhanVien (ten, id_role,email,sdt,diaChi) VALUES (?,?,?,?,?);";
        
        try(Connection conn = dBconnection.getConnection();
                PreparedStatement pst = conn.prepareStatement(sql)
                ) {
            pst.setObject(1, nhanVien.getTen());
            pst.setObject(2, nhanVien.getVaiTro());
            pst.setObject(3, nhanVien.getEmail());
            pst.setObject(4, nhanVien.getSdt());
            pst.setObject(5, nhanVien.getDiaChi());
            
            int kq = pst.executeUpdate();
            return kq > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
