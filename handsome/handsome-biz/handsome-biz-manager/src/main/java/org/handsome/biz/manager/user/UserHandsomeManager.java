package org.handsome.biz.manager.user;

import org.handsome.biz.dao.user.data.UserHandsomeDO;

public interface UserHandsomeManager {
	UserHandsomeDO get(Integer userID);
}
