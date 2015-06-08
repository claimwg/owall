package com.owall.fourteenth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/admin")
@Controller
public class AdminController {
	
	@RequestMapping("/")
	public ModelAndView dashboard(){
		ModelAndView model = new ModelAndView();
		model.addObject("INSA", "HI");
		model.setViewName("admin");
		return model;
	}	
	
	@RequestMapping("/user/list")
	public ModelAndView showUserList(){
		ModelAndView model = new ModelAndView();
		return model;
	}
	
	@RequestMapping("/user/detail")
	public ModelAndView showUserDetail(){
		ModelAndView model = new ModelAndView();
		return model;
	}
	
	@RequestMapping("/group/list")
	public ModelAndView showGroupList(){
		ModelAndView model = new ModelAndView();
		return model;
	}
	
	@RequestMapping("/group/detail")
	public ModelAndView showGroupDetail(){
		ModelAndView model = new ModelAndView();
		return model;
	}
	
	@RequestMapping("/user/edit")
	public ModelAndView modifyUser(){
		ModelAndView model = new ModelAndView();
		return model;
	}
	
	@RequestMapping("/group/delete")
	public ModelAndView deleteGroup(){
		ModelAndView model = new ModelAndView();
		return model;
	}
	
	@RequestMapping("/user/delete")
	public ModelAndView deleteUser(){
		ModelAndView model = new ModelAndView();
		return model;
	}
	
	@RequestMapping("/group/edit")
	public ModelAndView modifyGroup(){
		ModelAndView model = new ModelAndView();
		return model;
	}
	
	
	@RequestMapping("/board/create")
	public ModelAndView createBoard(){
		ModelAndView model = new ModelAndView();
		return model;
	}
	
	@RequestMapping("/board/edit")
	public ModelAndView modifyBoard(){
		ModelAndView model = new ModelAndView();
		return model;
	}
	
	@RequestMapping("/board/delete")
	public ModelAndView deleteBoard(){
		ModelAndView model = new ModelAndView();
		return model;
	}
	
}
