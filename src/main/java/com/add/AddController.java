package com.add;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AddController {
	
	@RequestMapping(method=RequestMethod.POST, value="/add")
	@ResponseBody
	public String add() {
		return "data";
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/check")
	@ResponseBody
	public String check() {
		return "data";
	}

}
