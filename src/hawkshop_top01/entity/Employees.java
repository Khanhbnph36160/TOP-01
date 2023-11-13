/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hawkshop_top01.entity;

/**
 *
 * @author tuantq148
 */
public class Employees {
    private int id;
    private String tenNV,email,sdt,diaChi,matKhau;
    private Boolean ChucVu = false;

    public Employees() {
    }

    public Employees(int id, String tenNV, String email, String sdt, String diaChi, String matKhau) {
        this.id = id;
        this.tenNV = tenNV;
        this.email = email;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.matKhau = matKhau;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public Boolean getChucVu() {
        return ChucVu;
    }

    public void setChucVu(Boolean ChucVu) {
        this.ChucVu = ChucVu;
    }
    
    
}
