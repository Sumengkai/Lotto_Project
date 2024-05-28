package com.example.Lotto_Project.Box;

public class Box_1 {
	// -----------------------------------------------
	// 用戶買樂透封的箱子
	// -----------------------------------------------
	// t_01_0005__t_uuid_1 : 買的樂透ID
	// numberArray : 選的數字
	// -----------------------------------------------
	private String t_01_0005__t_uuid_1;
	private String[] numberArray;
	private String t_02_0001__t_special_treatment_1;
	private String numberSelectionMethod;

	// -----------------------------------------------

	public Box_1() {

	}

	public Box_1(String t_01_0005__t_uuid_1, String[] numberArray, String t_02_0001__t_special_treatment_1,
			String numberSelectionMethod) {
		this.t_01_0005__t_uuid_1 = t_01_0005__t_uuid_1;
		this.numberArray = numberArray;
		this.t_02_0001__t_special_treatment_1 = t_02_0001__t_special_treatment_1;
		this.numberSelectionMethod = numberSelectionMethod;
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

	public String getT_02_0001__t_special_treatment_1() {
		return t_02_0001__t_special_treatment_1;
	}

	public void setT_02_0001__t_special_treatment_1(String t_02_0001__t_special_treatment_1) {
		this.t_02_0001__t_special_treatment_1 = t_02_0001__t_special_treatment_1;
	}

	public String getNumberSelectionMethod() {
		return numberSelectionMethod;
	}

	public void setNumberSelectionMethod(String numberSelectionMethod) {
		this.numberSelectionMethod = numberSelectionMethod;
	}

}
