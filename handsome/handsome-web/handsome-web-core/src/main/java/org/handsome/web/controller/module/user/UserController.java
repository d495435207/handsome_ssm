package org.handsome.web.controller.module.user;

import org.handsome.biz.dao.user.data.UserHandsomeDO;
import org.handsome.biz.manager.user.UserHandsomeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ding.rpc.share.demo.DemoService;
import com.ding.rpc.share.demo.dto.DemoDTO;

@Controller
public class UserController {
	@Autowired
	private UserHandsomeManager userHandsomeManager;
	@Autowired
	private DemoService demoService;
	@RequestMapping(value="/user.html")
	public String user(Model model,Integer userId){
		UserHandsomeDO userDO = userHandsomeManager.get(userId);
		model.addAttribute("user", userDO);
		return "user/user";
	}
	@RequestMapping(value="/dubbo.html")
	public String dubbo(Model model,Integer id){
		DemoDTO demoDTO = demoService.get(id);
		model.addAttribute("dubbo", demoDTO);
		return "user/dubbo";
	}
}
