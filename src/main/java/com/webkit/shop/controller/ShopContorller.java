package com.webkit.shop.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.webkit.shop.DB.ManagerDTO;
import com.webkit.shop.DB.MemberDTO;
import com.webkit.shop.service.ManagerService;
import com.webkit.shop.service.MemberService;

@Controller
@RequestMapping("/shop/*")
public class ShopContorller {
    @Inject
    private MemberService memberService;
    @Inject
    private ManagerService managerService;

	@RequestMapping(value = "/memberPage")
	public String memberPage() throws Exception{
		return "/shop/memberPage";
	}
	
	@RequestMapping(value = "/managerPage")
	public String managerPage() throws Exception{
		return "/shop/managerPage";
	}

	@RequestMapping(value = "/update_memberPage", method = RequestMethod.POST)
	public String update_memberPage(@ModelAttribute MemberDTO member, HttpSession session, RedirectAttributes rttr) throws Exception{
		session.setAttribute("member", memberService.update_memberPage(member));
		rttr.addFlashAttribute("msg", "회원정보 수정 완료");
		System.out.println(member);
		return "redirect:/shop/memberPage";
	}

	@RequestMapping(value = "/update_managerPage", method = RequestMethod.POST)
	public String update_managerPage(@ModelAttribute ManagerDTO manager, HttpSession session, RedirectAttributes rttr) throws Exception{
		session.setAttribute("manager", managerService.update_managerPage(manager));
		rttr.addFlashAttribute("msg", "점장정보 수정 완료");
		System.out.println(manager);
		return "redirect:/shop/managerPage";
	}

}
