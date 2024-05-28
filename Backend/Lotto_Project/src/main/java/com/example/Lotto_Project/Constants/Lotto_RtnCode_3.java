package com.example.Lotto_Project.Constants;

public enum Lotto_RtnCode_3 {
	// -----------------------------------------------
	// 管理"特殊代碼"的"Enum"
	// -----------------------------------------------
	// 樂透_代碼
	T_01_0001__T_CODE_1__01("01"),
	// 樂透_特殊處理_代碼 (代表有支線)
	TABLE_SPECIAL_TREATMENT__01("A"),
	// 是或否_代碼
	DELETE_Bol_Y("Y"),
	//
	DELETE_Bol_N("N"),
	// 02 - Y、N (是、否)
	T_01_0001__T_CODE_1__02("02"),
	//
	T_01_0002__T_CODE_1__02_Y("Y"),
	//
	T_01_0002__T_CODE_1__02_N("N"),
	// 樂透的起始數字
	START_NUMBER("01"),
	// 03 - M、G = (性別) - (男生、女生)
	T_01_0001__T_CODE_1__03("03"),
	//
	T_01_0002__T_CODE_1__03_M("M"),
	//
	T_01_0002__T_CODE_1__03_G("G"),
	// 04 - 01 = (寄信主旨) - (流水號)
	T_01_0001__T_CODE_1__04("04"),
	//
	T_01_0002__T_CODE_1__04_01("01"),
	// 05 - 01 = (寄信內容) - (流水號)
	T_01_0001__T_CODE_1__05("05"),
	//
	T_01_0002__T_CODE_1__05_01("01"),
	//
	// 06 - A、B = (選號方式) - (自動選、手選)
	T_01_0001__T_CODE_1__06("06"),
	//
	T_01_0002__T_CODE_1__06_A("A"),
	//
	T_01_0002__T_CODE_1__06_B("B"),
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
