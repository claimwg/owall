package com.owall.fourteenth.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.owall.fourteenth.model.User;

@RequestMapping("/board")
@Controller public class BoardController {

	@RequestMapping("/userlist")
	public ModelAndView userlist() {
		String message ="HI";
		ArrayList<User> userList = new ArrayList<User>();
		
		User user = new User();
		user.setAge(10);
		user.setName("김해성");
		userList.add(user);
		
		User user1 = new User();
		user1.setAge(12);
		user1.setName("박해성");
		userList.add(user1);
		
		User user2 = new User();
		user2.setAge(39);
		user2.setName("배해성");
		userList.add(user2);
		
		User user3 = new User();
		user3.setAge(18);
		user3.setName("김철수");
		userList.add(user3);
		
		User user4 = new User();
		user4.setAge(34);
		user4.setName("이영희");
		userList.add(user4);
				
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", message);
		mv.addObject("userList", userList);
		mv.setViewName("board");
		return mv;
	}
}
