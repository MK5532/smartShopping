package com.webkit.shop.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.webkit.shop.DB.MemberDTO;
import com.webkit.shop.service.MemberService;

@Controller
@RequestMapping("/shop/*")
public class ShopContorller {
    @Inject
    private MemberService memberService;

	@RequestMapping(value = "/memberPage")
	public String memberPage() throws Exception{
		return "/shop/memberPage";
	}

	@RequestMapping(value = "/update_Memberpage", method = RequestMethod.POST)
	public String update_mypage(@ModelAttribute MemberDTO member, HttpSession session, RedirectAttributes rttr) throws Exception{
		session.setAttribute("member", memberService.update_memberPage(member));
		rttr.addFlashAttribute("msg", "회원정보 수정 완료");
		System.out.println(member);
		return "redirect:/shop/memberPage";
	}

}
