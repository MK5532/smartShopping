package com.webkit.shop.DB;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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

	@Transactional
	public int update_managerPage(ManagerDTO manager) throws Exception{
		return session.update("manager.update_managerPage", manager);
	}
	
	@Transactional
	public int withdrawal_manager(ManagerDTO manager) throws Exception{
		return session.delete("manager.withdrawal_manager", manager);
	}

}
