package com.webkit.shop.service;

import java.util.List;

import com.webkit.shop.DB.ProductDTO;

public interface ProductService {
	public int product_Insert(ProductDTO product) throws Exception;
	public List<ProductDTO> selectProduct(ProductDTO product) throws Exception;
	public ProductDTO selectProductDetail(ProductDTO product) throws Exception;
}
