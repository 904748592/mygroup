package com.slby.controller.base;


import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.slby.util.Logger;
import com.slby.util.PageData;
import com.slby.util.PageInfo;
import com.slby.util.UuidUtil;


/**
 * @author FH Q313596790
 * 修改时间：2015、12、11
 */
public class BaseController {
	
	protected Logger logger = Logger.getLogger(this.getClass());

	private static final long serialVersionUID = 6357869213649815390L;
	
	/** new PageData对象
	 * @return
	 */
	public PageData getPageData(){
		return new PageData(this.getRequest());
	}
	
	/**得到ModelAndView
	 * @return
	 */
	public ModelAndView getModelAndView(){
		return new ModelAndView();
	}
	
	/**得到request对象
	 * @return
	 */
	public HttpServletRequest getRequest() {
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		return request;
	}

	/**得到32位的uuid
	 * @return
	 */
	public String get32UUID(){
		return UuidUtil.get32UUID();
	}
	
	/**得到分页列表的信息
	 * @return
	 */
	public PageInfo getPage(){
		return new PageInfo();
	}
	
	public static void logBefore(Logger logger, String interfaceName){
		logger.info("");
		logger.info("start");
		logger.info(interfaceName);
	}
	
	public static void logAfter(Logger logger){
		logger.info("end");
		logger.info("");
	}
	
}