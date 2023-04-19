package com.webkit.shop.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.webkit.shop.DB.CartDTO;
import com.webkit.shop.DB.MemberDTO;
import com.webkit.shop.service.CartService;
import com.webkit.shop.service.PaymentService;

@Controller
@RequestMapping("/cart/*")
public class CartController {

	@Inject
	CartService cartService;
	
	@Inject
	PaymentService paymentService;
	
	@RequestMapping("/insert")
	public String insertCart(@ModelAttribute CartDTO cart) throws Exception {
		cartService.insertCart(cart);
		return "redirect:/cart/cartList";
	}

	@RequestMapping("/cartList")
	public String listCart(Model model, HttpSession session) throws Exception {
		MemberDTO member = (MemberDTO)session.getAttribute("member");
		List<CartDTO> list = cartService.listCart(member.getC_id());
		model.addAttribute("cartList", list);
		return "/cart/cartList";
	}

	@RequestMapping("/cartDelete")
	public String deleteCart(@RequestParam("Cart_id") int Cart_id) throws Exception {
		cartService.deleteCart(Cart_id);
		return "redirect:/cart/cartList";
	}
	
	@RequestMapping("/cartPay")
	public String cartPay(Model model, HttpSession session) throws Exception{
		MemberDTO member = (MemberDTO)session.getAttribute("member");
		List<CartDTO> list = cartService.listCart(member.getC_id());
		model.addAttribute("cartList", list);
		cartService.cartPay(member.getC_id());
		paymentService.insertPayment(member.getC_id());
		return "/cart/cartPay";
	}
}
