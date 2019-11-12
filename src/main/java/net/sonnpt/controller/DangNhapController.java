package net.sonnpt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("dangnhap/")
public class DangNhapController {
	
	@GetMapping
	public String Default(){
		return "dangnhap";
	}
	@PostMapping
	public String HandleLogin(@RequestParam String tenNhanVien,@RequestParam String matkhau,ModelMap modelmap){
		if(tenNhanVien.equals("SonNPT") && matkhau.equals("1234")){
			return "redirect:/";
		}
		
		return "dangnhap";
	}

}
