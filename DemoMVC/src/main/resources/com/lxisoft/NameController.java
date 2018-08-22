package com.lxisoft;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/*
 * @author silpa
 * 
 */
@Controller
public class NameController {

	@RequestMapping("/sample")
	
	public String sample
	{
		
		return "display.jsp";
	}
}
