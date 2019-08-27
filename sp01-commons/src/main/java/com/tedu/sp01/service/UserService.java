package com.tedu.sp01.service;
import com.tedu.sp01.pojo.User;
public interface UserService {
	/**
	 * 根据用户id获取用户数据
	 * @param id
	 * @return
	 */
	User getUser(Integer id);
	/**
	 * 增加用户积分
	 * @param id 订单id
	 * @param score 增加的积分
	 */
	void addScore(Integer id, Integer score);
}