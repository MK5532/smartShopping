package com.webkit.shop.service;

import java.util.List;

import com.webkit.shop.DB.CartDTO;

public interface CartService {
	public int insertCart(CartDTO cart) throws Exception;
	
	public List<CartDTO> listCart(String C_id) throws Exception;
	
	public int deleteCart(int Cart_id) throws Exception;
	
	public int cartPay(String C_id) throws Exception;
}
