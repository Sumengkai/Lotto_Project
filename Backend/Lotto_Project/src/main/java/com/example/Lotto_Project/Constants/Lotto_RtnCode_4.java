package com.example.Lotto_Project.Constants;

public enum Lotto_RtnCode_4 {
	// -----------------------------------------------
	// 管理"信箱方法名稱"的"Enum"
	// -----------------------------------------------
	//
	MAIL_METHOD_NAME__1("01")
	//
	;

	// -----------------------------------------------

	private String mailMethodName;

	// -----------------------------------------------
	private Lotto_RtnCode_4() {
	}

	private Lotto_RtnCode_4(String mailMethodName) {

		this.mailMethodName = mailMethodName;
	}

	// -----------------------------------------------
	public String getMailMethodName() {
		return mailMethodName;
	}

	public void setMailMethodName(String mailMethodName) {
		this.mailMethodName = mailMethodName;
	}

}
