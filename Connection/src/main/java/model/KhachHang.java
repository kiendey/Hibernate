package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.Nationalized;

import java.time.Instant;

@Entity
@Table(name = "KHACH_HANG")
public class KhachHang {
    @Id
    @Column(name = "MaKH", nullable = false, length = 10)
    private String maKH;

    @Nationalized
    @Column(name = "HoTen", length = 30)
    private String hoTen;

    @Column(name = "NgaySinh")
    private Instant ngaySinh;

    @Column(name = "SDT", length = 10)
    private String sdt;

    @Nationalized
    @Column(name = "DiaChi", length = 20)
    private String diaChi;

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Instant getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Instant ngaySinh) {
        this.ngaySinh = ngaySinh;
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

}