package com.webkit.shop.DB;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	
	@Autowired
	@Inject
	private SqlSession session;
	
	public int check_id(String id){
		return session.selectOne("member.check_id", id);
	}

	public int memberJoin(MemberDTO member) {
		session.insert("memberJoin", member);
		return 0;
	}

	public MemberDTO login(String id) {
		return session.selectOne("member.login", id);
	}
}
