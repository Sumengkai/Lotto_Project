package com.example.Lotto_Project.Vo.Res;

import java.util.List;

import com.example.Lotto_Project.Entity.T_00_0001;
import com.example.Lotto_Project.Entity.T_01_0001;

public class Lotto_Res_1 {
	// -----------------------------------------------
	// 回傳訊息
	private String rtn_Message;
	// 回應訊息代碼
	private String rtn_Code;
	// 物件<T_00_0001>
	private T_00_0001 t_00_0001;
	// 物件<T_01_0001>
	private T_01_0001 t_01_0001;
	// 物件<T_01_0001> List
	private List<T_01_0001> t_01_0001_List;

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

	public Lotto_Res_1(String rtn_Message, String rtn_Code, T_01_0001 t_01_0001) {
		this.rtn_Message = rtn_Message;
		this.rtn_Code = rtn_Code;
		this.t_01_0001 = t_01_0001;
	}

	public Lotto_Res_1(String rtn_Message, String rtn_Code, List<T_01_0001> t_01_0001_List) {
		this.rtn_Message = rtn_Message;
		this.rtn_Code = rtn_Code;
		this.t_01_0001_List = t_01_0001_List;
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

	public T_01_0001 getT_01_0001() {
		return t_01_0001;
	}

	public void setT_01_0001(T_01_0001 t_01_0001) {
		this.t_01_0001 = t_01_0001;
	}

	public List<T_01_0001> getT_01_0001_List() {
		return t_01_0001_List;
	}

	public void setT_01_0001_List(List<T_01_0001> t_01_0001_List) {
		this.t_01_0001_List = t_01_0001_List;
	}

}
