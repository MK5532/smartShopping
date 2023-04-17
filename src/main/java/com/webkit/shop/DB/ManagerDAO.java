package com.webkit.shop.DB;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ManagerDAO {
	@Autowired
	@Inject
	private SqlSession session;
	
	public int check_Mid(String id){
		return session.selectOne("manager.check_Mid", id);
	}

	public int managerJoin(ManagerDTO manager) {
		session.insert("managerJoin", manager);
		return 0;
	}

	public ManagerDTO login_M(String id) {
		return session.selectOne("manager.login_M", id);
	}

}
