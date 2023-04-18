package com.webkit.shop.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.webkit.shop.DB.ProductDTO;
import com.webkit.shop.service.ProductService;

@Controller
@RequestMapping("/shop/*")
public class ShopContorller {
    @Inject
    private ProductService productService;
	
	@RequestMapping("/list")
	public String getList(@ModelAttribute ProductDTO product, Model model) throws Exception {
		List<ProductDTO> Productlist = productService.selectProduct(product);
		model.addAttribute("Productlist", Productlist);
		return "/shop/list";
	 }
	
	@GetMapping("/detail")
	public String productDetail(@ModelAttribute ProductDTO product, Model model) throws Exception{
		ProductDTO productDetail = productService.selectProductDetail(product);
		model.addAttribute("product", productDetail);
		return "/shop/detail";
	}

	
	@GetMapping("/product_InsertForm")
	public String product_InsertForm() throws Exception{
		return "/shop/product_InsertForm";
	}
	
	@PostMapping("/product_Insert")
	public String product_Insert(@ModelAttribute ProductDTO product) throws Exception{
		productService.product_Insert(product);
		return "redirect:/shop/list";
	}

}
