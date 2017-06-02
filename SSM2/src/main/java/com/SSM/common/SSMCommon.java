package com.SSM.common;

import javax.servlet.http.HttpServletRequest;

import org.springframework.util.StringUtils;
/**
 * 通用工具类
 */
public class SSMCommon {
	
	private static SSMCommon ssMCommon;
	
	public static SSMCommon getInstance(){
		if(ssMCommon == null){
			synchronized (SSMCommon.class) {
				ssMCommon = new SSMCommon();
			}
		}
		return ssMCommon;
	}
	
	/**
	 * 获取用户端的IP地址
	 */
	public String getRealUserIP(HttpServletRequest request) {
        String ip = request.getHeader("X-Forwarded-For");
        if(!StringUtils.isEmpty(ip) && !"unKnown".equalsIgnoreCase(ip)){
            //多次反向代理后会有多个ip值，第一个ip才是真实ip
            int index = ip.indexOf(",");
            if(index != -1){
                return ip.substring(0,index);
            }else{
                return ip;
            }
        }
        ip = request.getHeader("X-Real-IP");
        if(!StringUtils.isEmpty(ip) && !"unKnown".equalsIgnoreCase(ip)){
            return ip;
        }
        return request.getRemoteAddr();
    }
}
