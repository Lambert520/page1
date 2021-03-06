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
		//模拟Service获取水果商品列表
		List<User> userList = userService.queryUserList();
		//返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("userList",userList);
		//相当于request的setAttribut，在JSP页面中通过userList获取数据
		modelAndView.setViewName("userList.jsp");
		return modelAndView;
	}
}

//模拟Service的内部类
class UserService{
	public List<User> queryUserList(){
		List<User> userList = new ArrayList<User>();
		
		User user1 = new User();
		user1.setId(1);
		user1.setUsername("张三");
		user1.setGender("男");
		user1.setPasswod("111");
		user1.setCity("郑州");
		
		User user2 = new User();
		user2.setId(2);
		user2.setUsername("李四");
		user2.setGender("男");
		user2.setPasswod("222");
		user2.setCity("邯郸");
		
		userList.add(user1);
		userList.add(user2);
		
		return userList;
	}
}
