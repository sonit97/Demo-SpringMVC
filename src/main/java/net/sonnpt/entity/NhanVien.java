package net.sonnpt.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity(name="NhanVien")
public class NhanVien {
	@Id
	String tenNhanVien;
	String diaChi;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "NV_SP",
	joinColumns ={@JoinColumn(name ="tenNhanVien",referencedColumnName="tenNhanVien")},
	inverseJoinColumns = {@JoinColumn(name ="idSanPham",referencedColumnName="idSanPham")})
	Set<SanPham> sanpham;
	 
	public Set<SanPham> getSanpham() {
		return sanpham;
	}

	public void setSanpham(Set<SanPham> sanpham) {
		this.sanpham = sanpham;
	}

	public String getTenNhanVien() {
		return tenNhanVien;
	}

	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public NhanVien() {

	}

	public NhanVien(String tenNhanVien) {
		super();
		this.tenNhanVien = tenNhanVien;
	}

	public NhanVien(String tenNhanVien, String diaChi) {
		super();
		this.tenNhanVien = tenNhanVien;
		this.diaChi = diaChi;
	}

	public void inNhanVien() {
		System.out.println("Hello nhan viên!" + tenNhanVien);

	}
}
