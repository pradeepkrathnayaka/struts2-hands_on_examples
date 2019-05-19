package com.rmpksoft.demo.filter;

import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;

import org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter;

@WebFilter("/*")
public class Struts2Filter extends StrutsPrepareAndExecuteFilter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		super.init(filterConfig);		
	}
}
