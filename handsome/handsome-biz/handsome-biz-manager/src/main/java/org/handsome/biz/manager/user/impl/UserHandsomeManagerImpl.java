package org.handsome.biz.manager.user.impl;

import org.handsome.biz.dao.user.UserHandsomeDAO;
import org.handsome.biz.dao.user.data.UserHandsomeDO;
import org.handsome.biz.manager.user.UserHandsomeManager;
import org.springframework.beans.factory.annotation.Autowired;

public class UserHandsomeManagerImpl implements UserHandsomeManager{
	@Autowired
	private UserHandsomeDAO userHandsomeDAO;
	public UserHandsomeDO get(Integer userID) {
		return userHandsomeDAO.get(userID);
	}

}
