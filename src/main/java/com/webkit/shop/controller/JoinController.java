package com.webkit.shop.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.webkit.shop.DB.ManagerDTO;
import com.webkit.shop.DB.MemberDTO;
import com.webkit.shop.service.MemberService;
import com.webkit.shop.service.ManagerService;;

@Controller
@RequestMapping("/join/*")
public class JoinController {
	
    @Inject
    private MemberService MemberService;
    
    @Inject
    private ManagerService ManagerService;

	@GetMapping("/memberjoin")
	public String memberJoinGet(){
		return "/join/memberjoin";
	}

	@GetMapping("/managerjoin")
	public String managerJoinGet(){
		return "/join/managerjoin";
	}

	@PostMapping("/memberjoin")
	public String memberJoinPost(MemberDTO member, RedirectAttributes rttr, HttpServletResponse response) throws Exception
	{
		rttr.addFlashAttribute("result", MemberService.memberJoin(member, response));
		return "/join/joinComplete";
	}
	
	@PostMapping("/managerjoin")
	public String managerJoinPost(ManagerDTO manager, RedirectAttributes rttr, HttpServletResponse response) throws Exception
	{
		rttr.addFlashAttribute("result", ManagerService.managerJoin(manager, response));
		return "/join/joinComplete";
	}

    @PostMapping("/memeber/check_id.do")
	public void check_id(@RequestParam("C_id") String id, HttpServletResponse response) throws Exception{
    	MemberService.check_id(id, response);
	}
    
    @PostMapping("/manager/check_id.do")
	public void check_Mid(@RequestParam("M_id") String id, HttpServletResponse response) throws Exception{
    	ManagerService.check_Mid(id, response);
	}

    @PostMapping("/login")
	public String login(@ModelAttribute MemberDTO member, HttpSession session, HttpServletResponse response) throws Exception{
		member = MemberService.login(member, response);
		session.setAttribute("member", member);
		return "main";
	}
	
    @PostMapping("/login_M")
	public String login_M(@ModelAttribute ManagerDTO manager, HttpSession session, HttpServletResponse response) throws Exception{
    	manager = ManagerService.login_M(manager, response);
		session.setAttribute("manager", manager);
		return "mainM";
	}
    
    @GetMapping("/logout")
	public void logout(HttpSession session, HttpServletResponse response) throws Exception{
		session.invalidate();
		MemberService.logout(response);
	}

    @GetMapping("/logout_M")
	public void logout_M(HttpSession session, HttpServletResponse response) throws Exception{
		session.invalidate();
		ManagerService.logout_M(response);
	}

}
