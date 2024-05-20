package com.example.Lotto_Project.Constants;

public enum Lotto_RtnCode_2 {
	// -----------------------------------------------
	// 管理"資料表"的"Enum"
	// -----------------------------------------------
	// T_00_0001
	T_00_0001("T_00_0001"),
	// T_01_0001
	T_01_0001("T_01_0001"),
	// T_01_0002
	T_01_0002("T_01_0002"),
	// T_01_0003
	T_01_0003("T_01_0003"),
	// T_01_0004
	T_01_0004("T_01_0004"),
	// T_02_0001
	T_02_0001("T_02_0001"),
	// T_02_0002
	T_02_0002("T_02_0002"),
	// T_03_0001
	T_03_0001("T_03_0001")
	//
	;

	// -----------------------------------------------
	private String table_name;

	// -----------------------------------------------
	private Lotto_RtnCode_2() {
	}

	private Lotto_RtnCode_2(String table_name) {
		this.table_name = table_name;
	}

	// -----------------------------------------------
	public String getTable_name() {
		return table_name;
	}

	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}
}
