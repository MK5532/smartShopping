package com.webkit.shop.service;

import java.util.List;

import com.webkit.shop.DB.PaymentDTO;

public interface PaymentService {
	public int insertPayment(PaymentDTO payment) throws Exception;
	public List<PaymentDTO> ListPayment(String C_id) throws Exception;
	public List<PaymentDTO> ListPaymentM() throws Exception;
}
