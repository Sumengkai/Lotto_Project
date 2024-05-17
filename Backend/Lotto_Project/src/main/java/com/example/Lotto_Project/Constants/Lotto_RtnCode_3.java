package com.example.Lotto_Project.Constants;

public enum Lotto_RtnCode_3 {
	// -----------------------------------------------
	// 管理"特殊代碼"的"Enum"
	// -----------------------------------------------
	// 樂透_代碼
	T_01_0001__T_CODE_1__01("01"),
	// 是或否_代碼
	DELETE_Bol_Y("Y"),
	//
	DELETE_Bol_N("N")
	//
	;

	// -----------------------------------------------
	private String special_code_1;

	// -----------------------------------------------
	private Lotto_RtnCode_3() {
	}

	private Lotto_RtnCode_3(String special_code_1) {
		this.special_code_1 = special_code_1;
	}

	// -----------------------------------------------

	public String getSpecial_code_1() {
		return special_code_1;
	}

	public void setSpecial_code_1(String special_code_1) {
		this.special_code_1 = special_code_1;
	}

}
