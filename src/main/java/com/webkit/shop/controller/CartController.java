package com.webkit.shop.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webkit.shop.DB.CartDTO;
import com.webkit.shop.service.CartService;

@Controller
@RequestMapping("/cart/*")
public class CartController {

	@Inject
	CartService cartService;
	
	@RequestMapping("/insert")
	public String insertCart(@ModelAttribute CartDTO cart, HttpSession session) throws Exception {
		cartService.insertCart(cart);
		return "redirect:/cart/cartList";
	}
}
