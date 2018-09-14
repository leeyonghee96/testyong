package org.study.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.study.dao.UserDAO;
import org.study.model.User;

/**
 * 취미관리 
 * 
 * @author mycom
 *
 */
@Controller
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserDAO dao;

	/**
	 * url요청을 받아 해당 jsp페이지를 보여주는 기능
	 * 
	 * @return register.jsp
	 */
	@RequestMapping(method = RequestMethod.GET, value = "register")
	public String register() {

		logger.info("/register was called");

		return "register";
	}
	
	/**
	 * register.jsp페이지에서 사용자가 입력한 정보를 DB에 저장과 동시에 버튼 클릭시 list.jsp로 redirect함
	 * @param user 사용자가 입력한 정보를 담기위한 객체
	 * @param rttr 해당페이지에서 다음페이지로 이동시 값을 보내주기위한 객체
	 * @return list.jsp
	 */
	@RequestMapping(method = RequestMethod.POST, value = "register")
	public String procRegister(User user, RedirectAttributes rttr) {

		try {
			dao.insert(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "redirect:/list";
	}
	
	/**
	 * 사용자로부터 입력받았던 정보를 DB에서 가져와서 화면 보여주는 기능
	 * @param model User클래스에 속성값을 전달하기 위한 객체
	 * @return list.jsp
	 */
	@RequestMapping("/list")
	public String listAll(Model model) {

		List<User> list;
		try {
			list = dao.list();

			model.addAttribute("list", list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "list";
	}
}
