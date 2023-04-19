package com.webkit.shop.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webkit.shop.DB.MemberDTO;
import com.webkit.shop.DB.PaymentDTO;
import com.webkit.shop.service.PaymentService;

@Controller
@RequestMapping("/pay/*")
public class PaymentContorller {

	@Inject
	PaymentService paymentService;

	@RequestMapping("/payList")
	public String ListPayment(Model model, HttpSession session) throws Exception{
		MemberDTO member = (MemberDTO)session.getAttribute("member");
		List<PaymentDTO> list = paymentService.ListPayment(member.getC_id());
		model.addAttribute("paylist", list);
		return ("/pay/payList");
	}

	@RequestMapping("/payListM")
	public String ListPaymentM(Model model) throws Exception{
		List<PaymentDTO> list = paymentService.ListPaymentM();
		model.addAttribute("paylistM", list);
		return ("/pay/payList");
	}

}
