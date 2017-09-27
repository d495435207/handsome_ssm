package org.handsome.rpc.impl;

import org.handsome.biz.dao.user.data.UserHandsomeDO;
import org.handsome.biz.manager.user.UserHandsomeManager;
import org.handsome.rpc.share.test.TestService;
import org.handsome.rpc.share.test.dto.TestDTO;
import org.springframework.beans.factory.annotation.Autowired;

public class TestServiceImpl implements TestService{
	@Autowired
	private UserHandsomeManager userHandsomeManager;
	public TestDTO get(Integer id) {
		UserHandsomeDO user = userHandsomeManager.get(id);
		TestDTO test = new TestDTO();
		if(user!=null){
			test.setId(user.getId());
			test.setName(user.getName());
		}
		return test;
	}
	
}
