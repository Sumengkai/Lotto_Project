package com.example.Lotto_Project.Constants;

public enum Lotto_RtnCode_3 {
	// -----------------------------------------------
	// 管理"特殊代碼"的"Enum"
	// -----------------------------------------------
	//
	T_01_0001__T_CODE_1__01("01");

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
