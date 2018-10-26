package cn.com.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import cn.com.mvc.model.User;

public class UserControllerTest {
	private UserService userService = new UserService();
	
	//@Override
	
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		//ģ��Service��ȡˮ����Ʒ�б�
		List<User> userList = userService.queryUserList();
		//����ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("userList",userList);
		//�൱��request��setAttribut����JSPҳ����ͨ��userList��ȡ����
		modelAndView.setViewName("userList.jsp");
		return modelAndView;
	}
}

//ģ��Service���ڲ���
class UserService{
	public List<User> queryUserList(){
		List<User> userList = new ArrayList<User>();
		
		User user1 = new User();
		user1.setId(1);
		user1.setUsername("����");
		user1.setGender("��");
		user1.setPasswod("111");
		user1.setCity("֣��");
		
		User user2 = new User();
		user2.setId(2);
		user2.setUsername("����");
		user2.setGender("��");
		user2.setPasswod("222");
		user2.setCity("����");
		
		userList.add(user1);
		userList.add(user2);
		
		return userList;
	}
}