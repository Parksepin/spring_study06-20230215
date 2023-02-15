package com.sebincompany.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sebincompany.home.command.BCommand;
import com.sebincompany.home.command.BListCommand;


@Controller
public class BController {
	
	BCommand command = null;
	
	@RequestMapping(value="/")
	public String index() {
		
		return "index";
	}
	
	@RequestMapping(value="/list")
	public String list(Model model) {
		
		command = new BListCommand();
		command.excute(model);
		
		return "list";
	}
}
