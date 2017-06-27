/**
 * 
 */
package com.mor.server.dubbo.service;

import java.util.Date;

/**
 * @author wanggengqi
 * @email wanggengqi@chinasofti.com
 * @date 2014年10月23日 下午1:31:47
 */
public class IMyServiceImpl implements IMyService {


	/* (non-Javadoc)
	 * @see com.mor.server.dubbo.service.IMyService#call(java.lang.String)
	 */
	public String call(String str) {
		str = "call server: " + str;
		return str;
	}

}
