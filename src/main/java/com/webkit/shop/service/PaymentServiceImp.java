package com.webkit.shop.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.webkit.shop.DB.PaymentDAO;
import com.webkit.shop.DB.PaymentDTO;

@Service
public class PaymentServiceImp implements PaymentService {

	@Inject
	PaymentDAO dao;
	
	@Override
	public int insertPayment(PaymentDTO payment) throws Exception {
		return dao.insertPayment(payment);
	}

	@Override
	public List<PaymentDTO> ListPayment(String C_id) throws Exception{
		return dao.ListPayment(C_id);
	}
	
	@Override
	public List<PaymentDTO> ListPaymentM() throws Exception{
		return dao.ListPaymentM();
	}
}
