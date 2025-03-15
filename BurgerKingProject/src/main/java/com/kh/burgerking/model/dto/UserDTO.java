package com.kh.burgerking.model.dto;

public class UserDTO {

	// 내가 전송한 값을 담을 수 있도록 필드 구성해야 함
	
	private String userId;
	private String userPw;
	private String userName;
	
	public UserDTO() {
		super();
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public UserDTO(String userId, String userPw, String userName) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + "]";
	}
	
	
	
	
}
