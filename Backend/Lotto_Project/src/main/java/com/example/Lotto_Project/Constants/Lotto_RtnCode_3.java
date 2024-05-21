package com.example.Lotto_Project.Constants;

public enum Lotto_RtnCode_3 {
	// -----------------------------------------------
	// 管理"特殊代碼"的"Enum"
	// -----------------------------------------------
	// 樂透_代碼
	T_01_0001__T_CODE_1__01("01"),
	// 樂透_特殊處理_代碼 (代表有支線)
	TABLE_SPECIAL_TREATMENT__1("A"),
	// 是或否_代碼
	Bol_Y("Y"),
	//
	Bol_N("N"),
	// 02 - Y、N (是、否)
	T_01_0002__T_CODE_1__02("02"),
	//
	T_01_0002__T_CODE_1__02_Y("Y"),
	//
	T_01_0002__T_CODE_1__02_N("N"),
	// 樂透的起始數字
	START_NUMBER("01"),
	//
	;;

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
