package com.webkit.shop.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.webkit.shop.DB.PaymentDAO;

@Service
public class PaymentServiceImp implements PaymentService {

	@Inject
	PaymentDAO dao;
	
	@Override
	public int insertPayment(String C_id) throws Exception {
		return dao.insertPayment(C_id);
	}

}
