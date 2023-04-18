package com.webkit.shop.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webkit.shop.DB.CartDTO;
import com.webkit.shop.DB.MemberDTO;
import com.webkit.shop.service.CartService;

@Controller
@RequestMapping("/cart/*")
public class CartController {

	@Inject
	CartService cartService;
	
	@RequestMapping("/insert")
	public String insertCart(@ModelAttribute CartDTO cart) throws Exception {
		cartService.insertCart(cart);
		return "redirect:/cart/cartList";
	}

	@RequestMapping("/cartList")
	public String listCart(@ModelAttribute CartDTO cart, Model model, HttpSession session) throws Exception {
		MemberDTO member = (MemberDTO)session.getAttribute("member");
		List<CartDTO> list = cartService.listCart(cart, member.getC_id());
		model.addAttribute("cartList", list);
		return "/cart/cartList";
	}

}
