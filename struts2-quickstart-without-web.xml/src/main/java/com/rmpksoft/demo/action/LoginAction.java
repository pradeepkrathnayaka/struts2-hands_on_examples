package com.rmpksoft.demo.action;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/secure")
public class LoginAction extends ActionSupport {

	private static final Logger log = LogManager.getLogger(LoginAction.class);
	private static final String RESULT_PATH = "/WEB-INF/views/";

	static {
		log.info("Loading LoginAction.....................................");
	}

	private static final long serialVersionUID = 1L;
	private String username;
	private String password;

	@Action(value = "login", results = { @Result(name = SUCCESS, location = RESULT_PATH + "loginSuccess.jsp"),
			@Result(name = ERROR, location = RESULT_PATH + "login.jsp"),
			@Result(name = LOGIN, location = RESULT_PATH + "login.jsp") })
	public String login() {
		String method = ServletActionContext.getRequest().getMethod();
		System.out.println("Request method : " + method);
		if (method.equalsIgnoreCase("GET")) {
			return LOGIN;
		} else if (method.equalsIgnoreCase("POST")) {
			System.out.println("username -> " + this.username);
			System.out.println("password -> " + this.password);
			return SUCCESS;
		} else {
			return LOGIN;
		}
	}

	public String logout() {
		System.out.println("username -> " + this.username);
		System.out.println("password -> " + this.password);
		return SUCCESS;
	}

	public String loginHistory() {
		return "";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
