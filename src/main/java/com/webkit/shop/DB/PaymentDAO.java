package com.webkit.shop.DB;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentDAO {

	@Autowired
	SqlSession session = null;

	public int insertPayment(PaymentDTO payment) throws Exception {
		return session.insert("insertPay", payment);
	}
	
	public List<PaymentDTO> ListPayment(String C_id) throws Exception{
		return session.selectList("listPayment", C_id);
	}
	public List<PaymentDTO> ListPaymentM() throws Exception{
		return session.selectList("listPaymentM");
	}
}
