package net.sonnpt.controller;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.sonnpt.entity.NhanVien;
import net.sonnpt.entity.SanPham;

@Controller
@RequestMapping("/chitiet")
public class ChiTietController {
	@Autowired
	SessionFactory sessionFactory;
	
	
	@GetMapping
	@Transactional
	public String Default(@RequestParam("id") int id,ModelMap modelmap){	
		
		Session ses = sessionFactory.getCurrentSession();
		
		modelmap.addAttribute("NAME", id);
		NhanVien nv = new NhanVien();
		nv.setTenNhanVien("Hello");
		nv.setDiaChi("QNNN");
		SanPham sp1 = new SanPham();
		sp1.setTenSanPham("la1");
		sp1.setGia(12121);
		SanPham sp2 = new SanPham();
		sp2.setTenSanPham("la2");
		sp2.setGia(12121);
		SanPham sp3 = new SanPham();
		sp3.setTenSanPham("la3");
		sp3.setGia(12121);
		
		Set<SanPham> setSP = new  HashSet<SanPham>();
		setSP.add(sp1);
		setSP.add(sp2);
		setSP.add(sp3);
		nv.setSanpham(setSP);
		ses.save(nv);
		return "chitiet";		
	}
	@PostMapping
	public String showInfo(@ModelAttribute NhanVien nv ,ModelMap modelmap){
		modelmap.addAttribute("nv", nv);
		System.out.println(nv.getDiaChi() +nv.getTenNhanVien());
		return "chitiet";	
	}
}
