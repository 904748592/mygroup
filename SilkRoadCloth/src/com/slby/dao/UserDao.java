package com.slby.dao;

import java.util.List;

import com.slby.base.BaseDao;
import com.slby.model.User;

/**
 * @author sp
 * dao接口
 * 2016.7.21
 */

public interface UserDao extends BaseDao<User> {
	
	public User selectUserByID(int id);
	
	public List<User> selectUsers(String username);
	
	//添加用户数据
	public void addUser(User user);
	
	//修改用户数据
	public void updateUser(User user);
	
	//删除一个用户的数据
	public void deleteUser(int id);
	
	//联表多对一查询数据
//	public List<Article> getUserArticles(int userid);
	
	//分页列表
//	public List<Article> selectArticleListPage(@Param("page") PageInfo page,@Param("userid") int userid);
	
	//choose测试
	public User selectUserChooseTest(User user);
	
	//trim测试
	public User selectUserTrimTest(User user);
}
