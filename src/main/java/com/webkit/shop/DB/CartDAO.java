package com.webkit.shop.DB;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CartDAO {
	
	@Autowired
	SqlSession session = null;

	public int insertCart(CartDTO cart) throws Exception {
		return session.insert("insertCart", cart);
	}
	
	public List<CartDTO> listCart(String C_id) throws Exception {
		return session.selectList("listCart", C_id);
	}

	public int deleteCart(int Cart_id) throws Exception{
		return session.delete("deleteCart", Cart_id);
	}
	
	public int cartPay(String C_id) throws Exception{
		return session.update("cartPay", C_id);
	}
}
