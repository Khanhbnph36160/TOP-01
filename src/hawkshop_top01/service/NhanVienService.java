/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hawkshop_top01.service;

import hawkshop_top01.entity.NhanVien;
import hawkshop_top01.repository.NhanVienRepo;
import java.util.ArrayList;

/**
 *
 * @author MSI
 */
public class NhanVienService {
    NhanVienRepo nhanVienRepo = new NhanVienRepo();
    public ArrayList<NhanVien> getAll(){
        return nhanVienRepo.getAll();
    }
    
    public String addNew(NhanVien nhanVien){
        if(nhanVienRepo.addNew(nhanVien) == true){
            return "Them Thanh Cong";
        }
        else{
            return "Them That Bai";
        }
    }
}
