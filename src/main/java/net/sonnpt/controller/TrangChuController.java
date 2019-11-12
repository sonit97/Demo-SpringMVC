package net.sonnpt.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.sonnpt.entity.NhanVien;
import net.sonnpt.entity.SanPham;

//import net.sonnpt.entity.DatabaseTest;

@Controller
@RequestMapping("/")
public class TrangChuController {
	
	@Autowired // autowire se tu dong mapping voi IOC tim sessionfactory
	SessionFactory  sessionFactory;
	
	@GetMapping
	@Transactional
	public String Default(ModelMap modelmap){
	//sessionfactory thuc hien giao thuc voi SQl tra ve 1 session
		//Session session = sessionFactory.getCurrentSession();
//		Set<NhanVien> setNV = new HashSet<>();
//		SanPham sp = new SanPham();
//		sp.setTenSanPham("xxxxx1212121212121");
//		sp.setGia(1112212121);
//		
////		SanPham sp1 = new SanPham();
////		sp1.setTenSanPham("xxxxx1"); 
////		sp1.setGia(1114);
////	
////		SanPham sp2 = new SanPham();
////		sp2.setTenSanPham("xxxxx2");
////		sp2.setGia(1115);
//		
////		Set<SanPham> setSP = new HashSet<>();
////		
////		setSP.add(sp);
////		setSP.add(sp1);
////		setSP.add(sp2);
//		//SanPham sp1 = new SanPham();
////		sp.setTenSanPham("GaRan1");
////		sp.setGia(1111);
//		
//		
//		NhanVien nv1 = new NhanVien();
//		nv1.setTenNhanVien("hihihi12222");
//		nv1.setDiaChi("hihihi1");
//		
//		NhanVien nv2 = new NhanVien();
//		nv2.setTenNhanVien("hihihi13333");
//		nv2.setDiaChi("hihihi1");
//		
//		NhanVien nv3 = new NhanVien();
//		nv3.setTenNhanVien("hihihi14444");
//		nv3.setDiaChi("hihihi1");
//		
//		setNV.add(nv1);
//		setNV.add(nv2);
//		setNV.add(nv3);
//		//sp.setNhanvien(nv);
//		sp.setNhanvien(setNV);
//		session.save(sp);
//		for (SanPham sanPham : setSP) {
//			session.save(sanPham);
//		}
//		
		
		
		
		
//		NhanVien nv = session.get(NhanVien.class, "hihihi");
//		nv.setDiaChi("xzxzxz");
//		session.update(nv);
//		NhanVien nv= new NhanVien("SonNPT", "QN");
//		nv.setTenNhanVien("hihihi");
//		nv.setDiaChi("XXXX");
//		session.update(nv);
		//String sql = "from NhanVien ";
		
//		@SuppressWarnings("unchecked")
//		List<NhanVien> list = session.createQuery(sql).getResultList();
//		
//		for(NhanVien nv:list){
//			System.out.println(nv.getTenNhanVien() + nv.getDiaChi());
//			
//			
//		}
//		
		
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("IOC.xml");
//Ket noi csdl bang jdbc		
		//DatabaseTest db = (DatabaseTest) context.getBean("databasetest");
//		DatabaseTest db = new DatabaseTest();
		//db.getListNV();
		return "home";	
	}
	@PostMapping
	@Transactional
		public String addNhanVien(@RequestParam String tenNhanVien,@RequestParam String diaChi){
			Session ess = sessionFactory.getCurrentSession();
			NhanVien nv = new NhanVien(tenNhanVien,diaChi);
			ess.save(nv);
			return "home";
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@GetMapping("/{hoten}")
//	public String getHT(@PathVariable String hoten,Model modelmap){
//		modelmap.addAttribute("hotenn", hoten);
//		return "home";	
//		  
//		
//	}
//	
	
}	
	

	// @RequestMapping(path="/",method=RequestMethod.GET) //model and view tra
	// ve ca model va view
	// @GetMapping("/")
	// public ModelAndView Index(ModelMap map) {
	//// String userName = "SonNPT";
	//// String password = "123456";
	//// map.addAttribute("USERNAME", userName);
	// ModelAndView newModel = new ModelAndView();
	//
	// newModel.setViewName("home");
	//// newModel.addObject("USERNAME", userName);
	//// newModel.addObject("PASSWORK", password);
	//// ApplicationContext context = new
	// ClassPathXmlApplicationContext("IOC.xml");
	//// NhanVien nv = (NhanVien) context.getBean("nhanVien");
	//// nv.setTenNhanVien("Son handsome ^^");
	//// System.out.println("tên nhân viên là: "+nv.getTenNhanVien() +"1");
	////// System.out.println("Who is :"+nv.getDoc().getTenNhanVien()
	// +"-"+nv.getDoc().getDiaChi() +"-"+nv.getDoc().getChucVu());
	////// for (GiamDoc element : nv.getList()) {
	////// System.out.println(element);
	////// }
	//// //nv.inNhanVien();
	//// NhanVien nv1 = (NhanVien) context.getBean("nhanVien");
	//// nv1.setTenNhanVien("Son handsome ^^");
	//// System.out.println("tên nhân viên là: "+nv1.getTenNhanVien() +"1");
	////
	////
	//// ((ClassPathXmlApplicationContext)context).close();
	//
	// return newModel;
	// }
	// @RequestMapping(path="/chitiet/{id}")//tren view se có 1 href la chitiet
	// de mapping voi request o duoi controller
	// public String chiTiet(@PathVariable("id") int id,@MatrixVariable String
	// tenSp,@MatrixVariable String ngaySx,ModelMap model){
	// model.addAttribute("ID", id);
	// model.addAttribute("NAME", tenSp);
	// model.addAttribute("SX", ngaySx);
	//
	// return "chitiet";
	// }
	//


