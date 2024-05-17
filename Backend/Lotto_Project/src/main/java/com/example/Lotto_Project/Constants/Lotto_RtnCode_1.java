package com.example.Lotto_Project.Constants;

public enum Lotto_RtnCode_1 {
	// -----------------------------------------------
	// 管理"回傳訊息"的"Enum"
	// -----------------------------------------------
	// Successful
	SUCCESSFUL("200", "成功"),
	// Duplicate data
	DUPLICATE_DATA("400", "資料重複"),
	// Not found data
	NOT_FOUND_DATA("400", "資料找不到"),
	// Error data
	ERROR_DATA("404", "資料不正確")
	//
	;

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
