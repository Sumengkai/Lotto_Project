package com.example.Lotto_Project.Vo.Res;

import java.util.List;

import com.example.Lotto_Project.Entity.T_00_0001;
import com.example.Lotto_Project.Entity.T_01_0001;
import com.example.Lotto_Project.Entity.T_01_0002;
import com.example.Lotto_Project.Entity.T_01_0003;

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
	// 物件<T_01_0002>
	private T_01_0002 t_01_0002;
	// 物件<T_01_0002> List
	private List<T_01_0002> t_01_0002_List;
	// 物件<T_01_0003>
	private T_01_0003 t_01_0003;
	// -----------------------
	// 無意義字串_用來讓建構方法區分用的
	private String not_Interesting_1;

	// -----------------------
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

	public Lotto_Res_1(String rtn_Message, String rtn_Code, T_01_0002 t_01_0002) {
		this.rtn_Message = rtn_Message;
		this.rtn_Code = rtn_Code;
		this.t_01_0002 = t_01_0002;
	}

	public Lotto_Res_1(String rtn_Message, String rtn_Code) {
		this.rtn_Message = rtn_Message;
		this.rtn_Code = rtn_Code;
	}

	public Lotto_Res_1(String rtn_Message, String rtn_Code, List<T_01_0002> t_01_0002_List, String not_Interesting_1) {
		this.rtn_Message = rtn_Message;
		this.rtn_Code = rtn_Code;
		this.t_01_0002_List = t_01_0002_List;
		this.not_Interesting_1 = not_Interesting_1;
	}

	public Lotto_Res_1(String rtn_Message, String rtn_Code, T_01_0003 t_01_0003) {
		this.rtn_Message = rtn_Message;
		this.rtn_Code = rtn_Code;
		this.t_01_0003 = t_01_0003;
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

	public T_01_0002 getT_01_0002() {
		return t_01_0002;
	}

	public void setT_01_0002(T_01_0002 t_01_0002) {
		this.t_01_0002 = t_01_0002;
	}

	public List<T_01_0002> getT_01_0002_List() {
		return t_01_0002_List;
	}

	public void setT_01_0002_List(List<T_01_0002> t_01_0002_List) {
		this.t_01_0002_List = t_01_0002_List;
	}

	public String getNot_Interesting_1() {
		return not_Interesting_1;
	}

	public void setNot_Interesting_1(String not_Interesting_1) {
		this.not_Interesting_1 = not_Interesting_1;
	}

	public T_01_0003 getT_01_0003() {
		return t_01_0003;
	}

	public void setT_01_0003(T_01_0003 t_01_0003) {
		this.t_01_0003 = t_01_0003;
	}

}
