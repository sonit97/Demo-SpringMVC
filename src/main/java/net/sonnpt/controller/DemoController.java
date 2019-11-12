package net.sonnpt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {
	
	/*@RequestMapping("/chitiett")
	public String chiTiet(@RequestParam int id,ModelMap map){
		map.addAttribute("NAME",id);
		return "chitiet";
		
	}*/
//	@RequestMapping(path="/chitiett/{id}/{hoten}" , method=RequestMethod.GET)
//	public String chiTiet(@PathVariable("id") int id,@PathVariable("hoten") int hoten,ModelMap map){
//		map.addAttribute("NAME",id);
//		map.addAttribute("NAME1",hoten);
//		return "chitiet";  
//		
//	}
	@RequestMapping(path="/chitiett/{id}", method=RequestMethod.GET)
	public String chiTiet(@PathVariable("id") int id,@MatrixVariable String hoten ,ModelMap map){
		map.addAttribute("NAME",id);
		map.addAttribute("NAME1",hoten);
		return "chitiet";  
		
	}

}
