package com.webkit.shop.service;

import com.webkit.shop.DB.CartDTO;

public interface CartService {
	public int insertCart(CartDTO cart) throws Exception;
}
