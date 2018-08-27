package com.internousdev.kamaboko.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class VillageOfKamabokoAction extends ActionSupport implements SessionAware {
	public Map<String,Object>session;
	public String execute(){
		return SUCCESS;
	}
	public Map<String,Object>getSession(){
		return this.session;
	}

	@Override
	public void setSession(Map<String,Object>session){
		this.session=session;
	}
}