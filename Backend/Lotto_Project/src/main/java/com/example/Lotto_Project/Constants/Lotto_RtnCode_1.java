package com.example.Lotto_Project.Constants;

public enum Lotto_RtnCode_1 {
	// -----------------------------------------------
	// 管理"回傳訊息"的"Enum"
	// -----------------------------------------------
	//
	SUCCESSFUL("200", "成功");

	// -----------------------------------------------
	private String code;
	private String message;

	// -----------------------------------------------
	private Lotto_RtnCode_1(String code, String message) {
		this.code = code;
		this.message = message;
	}

	// -----------------------------------------------
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
