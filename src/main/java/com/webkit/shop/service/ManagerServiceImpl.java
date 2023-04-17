package com.webkit.shop.service;

import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import com.webkit.shop.DB.ManagerDAO;
import com.webkit.shop.DB.ManagerDTO;

@Service
public class ManagerServiceImpl implements ManagerService {

	@Inject
	ManagerDAO dao;
	
	@Override
	public int managerJoin(ManagerDTO manager, HttpServletResponse response) throws Exception {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		if (dao.check_Mid(manager.getM_id()) == 1) {
			out.println("<script>");
			out.println("alert('동일한 아이디가 있습니다!');");
			out.println("history.go(-1);");
			out.println("</script>");
			out.close();
			return 0;
		} else {
			dao.managerJoin(manager);
			return 1;
		}
	}

	@Override
	public void check_Mid(String id, HttpServletResponse response) throws Exception {
		PrintWriter out = response.getWriter();
		out.println(dao.check_Mid(id));
		out.close();
	}

	@Override
	public ManagerDTO login_M(ManagerDTO manager, HttpServletResponse response) throws Exception {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		// 등록된 아이디가 없으면
		if(dao.check_Mid(manager.getM_id()) == 0) {
			out.println("<script>");
			out.println("alert('등록된 아이디가 없습니다.');");
			out.println("history.go(-1);");
			out.println("</script>");
			out.close();
			return null;
		} else {
			String pw = manager.getM_pass();
			manager = dao.login_M(manager.getM_id());
			// 비밀번호가 다를 경우
			if(!manager.getM_pass().equals(pw)) {
				out.println("<script>");
				out.println("alert('비밀번호가 다릅니다.');");
				out.println("history.go(-1);");
				out.println("</script>");
				out.close();
				return null;
			}else {
				return manager;
			}
		}
	}

	@Override
	public void logout_M(HttpServletResponse response) throws Exception {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<script>");
		out.println("location.href='/';");
		out.println("</script>");
		out.close();
	}

	@Override
	public ManagerDTO update_managerPage(ManagerDTO manager) throws Exception{
		dao.update_managerPage(manager);
		return dao.login_M(manager.getM_id());
	}

}
