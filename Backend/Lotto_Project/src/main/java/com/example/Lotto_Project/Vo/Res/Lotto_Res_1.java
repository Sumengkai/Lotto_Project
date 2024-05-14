package com.example.Lotto_Project.Vo.Res;

import com.example.Lotto_Project.Entity.T_00_0001;

public class Lotto_Res_1 {
	// -----------------------------------------------
	private String rtn_Message;
	private String rtn_Code;
	private T_00_0001 t_00_0001;

	// -----------------------------------------------
	public Lotto_Res_1() {

	}

	public Lotto_Res_1(T_00_0001 t_00_0001) {
		this.t_00_0001 = t_00_0001;
	}

	public Lotto_Res_1(String rtn_Message, String rtn_Code, T_00_0001 t_00_0001) {
		this.rtn_Message = rtn_Message;
		this.rtn_Code = rtn_Code;
		this.t_00_0001 = t_00_0001;
	}

	// -----------------------------------------------

	public String getRtn_Message() {
		return rtn_Message;
	}

	public void setRtn_Message(String rtn_Message) {
		this.rtn_Message = rtn_Message;
	}

	public String getRtn_Code() {
		return rtn_Code;
	}

	public void setRtn_Code(String rtn_Code) {
		this.rtn_Code = rtn_Code;
	}

	public T_00_0001 getT_00_0001() {
		return t_00_0001;
	}

	public void setT_00_0001(T_00_0001 t_00_0001) {
		this.t_00_0001 = t_00_0001;
	}

}
