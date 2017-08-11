package com.slby.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.slby.model.User;
import com.slby.util.PageInfo;


@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
//	UserDao iuserMapper;

	@RequestMapping("/list")
	public ModelAndView listall(HttpServletRequest request,HttpServletResponse response){
//		List<User> users=iuserMapper.selectUsers("123"); 
		ModelAndView mav=new ModelAndView("list");
//		mav.addObject("users",users);
		return mav;
	}
	
	@RequestMapping("/detail")
	public ModelAndView detail(HttpServletRequest request,HttpServletResponse response){
//		User user=iuserMapper.selectUserByID(2); 
		ModelAndView mav=new ModelAndView("detail");
//		mav.addObject("user",user);
		return mav;
	}
	
	@RequestMapping("/search")
	public ModelAndView search(HttpServletRequest request,HttpServletResponse response){
//		List<Article> articles=iuserMapper.getUserArticles(1); 
		//制定视图，也就是list.jsp
		ModelAndView mav=new ModelAndView("search");		
		return mav;
	}
	
	@RequestMapping("/pagelist")
	public ModelAndView pageList(HttpServletRequest request,HttpServletResponse response){
		int currentPage = request.getParameter("page")==null?1:Integer.parseInt(request.getParameter("page"));
		int pageSize = 3;
		if (currentPage<=0){
			currentPage =1;
		}
		int currentResult = (currentPage-1) * pageSize;
		
		System.out.println(request.getRequestURI());
		System.out.println(request.getQueryString());
		
		PageInfo page = new PageInfo();
		page.setShowCount(pageSize);
		page.setCurrentResult(currentResult);
//		List<Article> articles=iuserMapper.selectArticleListPage(page,1);
		
		System.out.println(page);
		
		int totalCount = page.getTotalResult();
		
		int lastPage=0;
		if (totalCount % pageSize==0){
			lastPage = totalCount % pageSize;
		}
		else{
			lastPage =1+ totalCount / pageSize;
		}
		
		if (currentPage>=lastPage){
			currentPage =lastPage;
		}
		
		String pageStr = "";

		pageStr=String.format("<a href=\"%s\">上一页</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"%s\">下一页</a>",
						request.getRequestURI()+"?page="+(currentPage-1),request.getRequestURI()+"?page="+(currentPage+1) );


		//制定视图，也就是list.jsp
		ModelAndView mav=new ModelAndView("list");
//		mav.addObject("articles",articles);
		mav.addObject("pageStr",pageStr);
		return mav;
	}
	
	//sql语句choose测试
	@RequestMapping("choose")
	public ModelAndView chooseTest(HttpServletRequest request,HttpServletResponse response){
		
		User userTemp=new User();
		//userTemp.setId(5);
		//userTemp.setUserAddress("ss");
		//userTemp.setUserAge("ss");
		//userTemp.setUserName("feiying");
		
//		User user = iuserMapper.selectUserChooseTest(userTemp);
		ModelAndView mav=new ModelAndView("choose");
//		mav.addObject("user", user);
		return mav;
	}
	
	//sql语句trim测试
	@RequestMapping("trim")
	public ModelAndView trimTest(HttpServletRequest request,HttpServletResponse response){
		
		User userTemp=new User();
		userTemp.setId(2);
		/*userTemp.setUserAddress("dizhi1");
		userTemp.setUserAge(40);
		userTemp.setUserName("feiying");*/
		
//		User user = iuserMapper.selectUserTrimTest(userTemp);
		ModelAndView mav=new ModelAndView("choose");
//		mav.addObject("user", user);
		return mav;
	}
}

