package com.webkit.shop.DB;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ProductDAO {
	
	@Autowired
	SqlSession session = null;

	@Transactional
	public int product_Insert(ProductDTO product) throws Exception{
		return session.insert("product.product_Insert", product);
	}

	public List<ProductDTO> selectProduct(ProductDTO product) throws Exception{
		return session.selectList("product.selectProduct", product);
	}
	
	public ProductDTO selectProductDetail(ProductDTO product) throws Exception{
		return session.selectOne("product.selectProductDetail", product);
	}
}
