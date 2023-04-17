package com.webkit.shop.service;

import javax.servlet.http.HttpServletResponse;

import com.webkit.shop.DB.ManagerDTO;

public interface ManagerService {
	public int managerJoin(ManagerDTO manager, HttpServletResponse response) throws Exception;

	public void check_Mid(String id, HttpServletResponse response) throws Exception;

	public ManagerDTO login_M(ManagerDTO manager, HttpServletResponse response) throws Exception;
	
	public void logout_M(HttpServletResponse response) throws Exception;
	
	public ManagerDTO update_managerPage(ManagerDTO manager) throws Exception;
}
