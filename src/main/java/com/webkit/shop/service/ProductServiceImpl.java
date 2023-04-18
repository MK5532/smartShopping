package com.webkit.shop.service;

import java.util.List;

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

	@Override
	public List<ProductDTO> selectProduct(ProductDTO product) throws Exception{
		return dao.selectProduct(product);
	}
	
	@Override
	public ProductDTO selectProductDetail(ProductDTO product) throws Exception{
		return dao.selectProductDetail(product);
	}
}
