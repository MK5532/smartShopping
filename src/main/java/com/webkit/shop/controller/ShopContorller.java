package com.webkit.shop.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.webkit.shop.DB.ManagerDTO;
import com.webkit.shop.DB.MemberDTO;
import com.webkit.shop.DB.ProductDTO;
import com.webkit.shop.service.ManagerService;
import com.webkit.shop.service.MemberService;
import com.webkit.shop.service.ProductService;

@Controller
@RequestMapping("/shop/*")
public class ShopContorller {
    @Inject
    private MemberService memberService;
    @Inject
    private ManagerService managerService;
    @Inject
    private ProductService productService;

	@RequestMapping(value = "/main")
	public String mainPage() throws Exception{
		return "/shop/main";
	}

	@RequestMapping(value = "/mainM")
	public String mainMPage() throws Exception{
		return "/shop/mainM";
	}

	@RequestMapping(value = "/memberPage")
	public String memberPage() throws Exception{
		return "/shop/memberPage";
	}
	
	@RequestMapping(value = "/managerPage")
	public String managerPage() throws Exception{
		return "/shop/managerPage";
	}

	@PostMapping("/update_memberPage")
	public String update_memberPage(@ModelAttribute MemberDTO member, HttpSession session, RedirectAttributes rttr) throws Exception{
		session.setAttribute("member", memberService.update_memberPage(member));
		rttr.addFlashAttribute("msg", "회원정보 수정 완료");
		return "redirect:/shop/memberPage";
	}

	@PostMapping("/update_managerPage")
	public String update_managerPage(@ModelAttribute ManagerDTO manager, HttpSession session, RedirectAttributes rttr) throws Exception{
		session.setAttribute("manager", managerService.update_managerPage(manager));
		rttr.addFlashAttribute("msg", "점장정보 수정 완료");
		return "redirect:/shop/managerPage";
	}

	@PostMapping("/withdrawal_member")
	public String withdrawal_memeber(@ModelAttribute MemberDTO member, HttpSession session, HttpServletResponse response) throws Exception{
		if(memberService.withdrawal_member(member, response)) {
			session.invalidate();
		}
		return "/shop/withdrawComp";
	}

	@PostMapping("/withdrawal_manager")
	public String withdrawal_manager(@ModelAttribute ManagerDTO manager, HttpSession session, HttpServletResponse response) throws Exception{
		if(managerService.withdrawal_manager(manager, response)) {
			session.invalidate();
		}
		return "/shop/withdrawComp";
	}

	
	// 게시판 글 작성 폼 이동
	@GetMapping("product_InsertForm")
	public String product_InsertForm() throws Exception{
		return "/shop/product_InsertForm";
	}
	
	// 게시판 글 작성
	@PostMapping("product_Insert")
	public String product_Insert(@ModelAttribute ProductDTO product) throws Exception{
		productService.product_Insert(product);
		return "redirect:/shop/mainM";
	}


}
