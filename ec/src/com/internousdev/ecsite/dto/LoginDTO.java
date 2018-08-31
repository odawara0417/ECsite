package com.internousdev.ecsite.dto;

public class LoginDTO {
	private static String loginId;
	private String loginPassword;
	private String userName;
	private boolean loginFlg;

	public static String getLoginId(){
		return loginId;
	}
	public void setLoginUserId(String loginId){
		LoginDTO.loginId=loginId;
	}

	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword=loginPassword;
	}
	public String getUserName(){
		return userName;
	}
	public void setUserName(String userName){
		this.userName=userName;
	}
	public void setLoginFlg(boolean loginFlg) {
		this.loginFlg = loginFlg;
	}
	public boolean getLoginFlg(){
		return loginFlg;
	}

}
