package com.webkit.shop.DB;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentDAO {

	@Autowired
	SqlSession session = null;

	public int insertPayment(String C_id) throws Exception {
		return session.insert("insertPayment", C_id);
	}
}
