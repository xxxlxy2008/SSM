package org.example.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.example.beans.UserBean;
import org.example.service.ILoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@Resource
	private ILoginService loginServiceImpl;

	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest req, UserBean user) {
		ModelAndView mv = new ModelAndView();
		UserBean u = loginServiceImpl.Login(user.getUsername(),
				user.getPassword());

		if (u != null) {

			req.setAttribute("user", u);
			mv.addObject("password", u.getPassword());
			System.out.println(u.getPassword());
		}
		mv.setViewName("index");
		return mv;
	}
}