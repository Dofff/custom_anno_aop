package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import vo.MemberVO;
import common.LoginCheck;

@Controller
@RequestMapping("")
public class BoardController {
	
	@LoginCheck
	@RequestMapping("/insert")
	public String insert(HttpServletRequest request, HttpServletResponse response, Model model){
		System.out.println("Called Controller");
		return "insertSuccess";
	}
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request, HttpServletResponse response, Model model){
		
		MemberVO member = new MemberVO();
		member.setMemId(request.getParameter("id"));
		member.setPassword(request.getParameter("password"));
		
		HttpSession session = request.getSession();
		session.setAttribute("member", member);
		
		return "redirect:/index.jsp";
	}
	
}
