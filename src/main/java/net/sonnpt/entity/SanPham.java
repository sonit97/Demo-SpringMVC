package net.sonnpt.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity(name="SanPham")
public class SanPham {
		
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 int idSanPham;
	 String tenSanPham;
	 int gia;

	  
	 @ManyToMany(cascade = CascadeType.ALL)
		@JoinTable(name = "NV_SP",
		joinColumns ={@JoinColumn(name ="idSanPham",referencedColumnName="idSanPham")},
		inverseJoinColumns = {@JoinColumn(name ="tenNhanVien",referencedColumnName="tenNhanVien")})
	 Set<NhanVien> nhanvien;
	 
	public int getIdSanPham() {
		return idSanPham;
	}
	public void setIdSanPham(int idSanPham) {
		this.idSanPham = idSanPham;
	}
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public Set<NhanVien> getNhanvien() {
		return nhanvien;
	}
	public void setNhanvien(Set<NhanVien> nhanvien) {
		this.nhanvien = nhanvien;
	}
	
	 
	 	
	 
}
