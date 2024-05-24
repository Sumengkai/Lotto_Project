package com.example.Lotto_Project.Constants;

public enum Lotto_RtnCode_5 {
	// -----------------------------------------------
	// 管理"Session"的"Key"值的"Enum"
	// -----------------------------------------------
	//
	SESSION_01("01")
	//
	;

	private String sessionKey;

	private Lotto_RtnCode_5(String sessionKey) {
		this.sessionKey = sessionKey;
	}

	public String getSessionKey() {
		return sessionKey;
	}

	public void setSessionKey(String sessionKey) {
		this.sessionKey = sessionKey;
	}

}
