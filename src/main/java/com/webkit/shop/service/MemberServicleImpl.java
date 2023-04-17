package com.webkit.shop.service;

import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import com.webkit.shop.DB.MemberDAO;
import com.webkit.shop.DB.MemberDTO;

@Service
public class MemberServicleImpl implements MemberService {

	@Inject
	private MemberDAO dao;
	
	@Override
	public int memberJoin(MemberDTO member, HttpServletResponse response) throws Exception {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		if (dao.check_id(member.getC_id()) == 1) {
			out.println("<script>");
			out.println("alert('동일한 아이디가 있습니다!');");
			out.println("history.go(-1);");
			out.println("</script>");
			out.close();
			return 0;
		} else {
			dao.memberJoin(member);
			return 1;
		}
	}
	
	// 아이디 중복 검사
	@Override
	public void check_id(String id, HttpServletResponse response) throws Exception {
		PrintWriter out = response.getWriter();
		out.println(dao.check_id(id));
		out.close();
	}

	// 로그인
	@Override
	public MemberDTO login(MemberDTO member, HttpServletResponse response) throws Exception {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		// 등록된 아이디가 없으면
		if(dao.check_id(member.getC_id()) == 0) {
			out.println("<script>");
			out.println("alert('등록된 아이디가 없습니다.');");
			out.println("history.go(-1);");
			out.println("</script>");
			out.close();
			return null;
		} else {
			String pw = member.getC_pass();
			member = dao.login(member.getC_id());
			// 비밀번호가 다를 경우
			if(!member.getC_pass().equals(pw)) {
				out.println("<script>");
				out.println("alert('비밀번호가 다릅니다.');");
				out.println("history.go(-1);");
				out.println("</script>");
				out.close();
				return null;
			}else {
				return member;
			}
		}
	}
	
	// 로그아웃
	@Override
	public void logout(HttpServletResponse response) throws Exception {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<script>");
		out.println("location.href='/';");
		out.println("</script>");
		out.close();
	}
}
