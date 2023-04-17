package com.webkit.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webkit.shop.DB.ProductDAO;
import com.webkit.shop.DB.ProductDTO;


@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDAO dao;
	
	@Override
	public int product_Insert(ProductDTO product) throws Exception {
		return dao.product_Insert(product);
	}

}
