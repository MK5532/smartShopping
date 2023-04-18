package com.webkit.shop.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.webkit.shop.DB.CartDAO;
import com.webkit.shop.DB.CartDTO;

@Service
public class CartServiceImpl implements CartService {
	
	@Inject
	CartDAO dao;

	@Override
	public int insertCart(CartDTO cart) throws Exception {
		return dao.insertCart(cart);
	}

	@Override
	public List<CartDTO> listCart(CartDTO cart, String C_id) throws Exception{
		return dao.listCart(cart, C_id);
	}
}
