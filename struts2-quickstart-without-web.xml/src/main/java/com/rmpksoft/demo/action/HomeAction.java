package com.rmpksoft.demo.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/")
public class HomeAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	@Action(value = "home", results = { @Result(name = SUCCESS, location = "/WEB-INF/views/home.jsp"),
			@Result(name = ERROR, location = "/error/error.jsp") })
	public String index() {
		return SUCCESS;
	}

}
