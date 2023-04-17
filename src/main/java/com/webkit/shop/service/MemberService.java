package com.webkit.shop.service;

import javax.servlet.http.HttpServletResponse;

import com.webkit.shop.DB.MemberDTO;

public interface MemberService {

	public int memberJoin(MemberDTO member, HttpServletResponse response) throws Exception;

	public void check_id(String id, HttpServletResponse response) throws Exception;

	public MemberDTO login(MemberDTO member, HttpServletResponse response) throws Exception;
	
	public void logout(HttpServletResponse response) throws Exception;

	public MemberDTO update_memberPage(MemberDTO member) throws Exception;
}
