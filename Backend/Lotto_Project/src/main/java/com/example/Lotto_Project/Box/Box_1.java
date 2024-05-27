package com.example.Lotto_Project.Box;

public class Box_1 {
	// -----------------------------------------------
	// 用戶買樂透封的箱子
	// -----------------------------------------------
	// t_01_0005__t_uuid_1 : 買的樂透種類
	// numberArray : 選的數字
	// -----------------------------------------------
	private String t_01_0005__t_uuid_1;
	private String[] numberArray;

	// -----------------------------------------------
	public Box_1(String t_01_0005__t_uuid_1, String[] numberArray) {
		this.t_01_0005__t_uuid_1 = t_01_0005__t_uuid_1;
		this.numberArray = numberArray;
	}

	// -----------------------------------------------
	public String getT_01_0005__t_uuid_1() {
		return t_01_0005__t_uuid_1;
	}

	public void setT_01_0005__t_uuid_1(String t_01_0005__t_uuid_1) {
		this.t_01_0005__t_uuid_1 = t_01_0005__t_uuid_1;
	}

	public String[] getNumberArray() {
		return numberArray;
	}

	public void setNumberArray(String[] numberArray) {
		this.numberArray = numberArray;
	}

}
