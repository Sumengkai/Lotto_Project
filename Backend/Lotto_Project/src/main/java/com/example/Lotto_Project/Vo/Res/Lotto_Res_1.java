package com.example.Lotto_Project.Vo.Res;

import java.util.List;

import com.example.Lotto_Project.Entity.T_00_0001;
import com.example.Lotto_Project.Entity.T_01_0001;
import com.example.Lotto_Project.Entity.T_01_0002;
import com.example.Lotto_Project.Entity.T_01_0003;
import com.example.Lotto_Project.Entity.T_01_0004;
import com.example.Lotto_Project.Entity.T_01_0005;
import com.example.Lotto_Project.Entity.T_02_0001;
import com.example.Lotto_Project.Entity.T_02_0002;
import com.example.Lotto_Project.Entity.T_03_0001;

public class Lotto_Res_1 {
	// -----------------------------------------------
	// 回傳訊息
	private String rtn_Message;
	// 回應訊息代碼
	private String rtn_Code;
	// 登入成功布林值
	private boolean login;
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
	// 物件<T_01_0002> List
	private List<T_01_0003> t_01_0003_List;
	// 物件<T_01_0004>
	private T_01_0004 t_01_0004;
	// 物件<T_01_0004> List
	private List<T_01_0004> t_01_0004_List;
	// 物件<T_01_0005>
	private T_01_0005 t_01_0005;
	// 物件<T_01_0005> List
	private List<T_01_0005> t_01_0005_List;
	// 物件<T_03_0001>
	private T_03_0001 t_03_0001;
	// 物件<T_02_0001> List
	private List<T_02_0001> t_02_0001_List;
	// 物件<T_02_0002> List
	private List<T_02_0002> t_02_0002_List;

	// -----------------------
	// 無意義字串_用來讓建構方法區分用的
	private String not_Interesting_1;
	// 無意義字串_用來讓建構方法區分用的
	private String not_Interesting_2;
	// 無意義字串_用來讓建構方法區分用的
	private String not_Interesting_3;
	// 無意義字串_用來讓建構方法區分用的
	private String not_Interesting_4;

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

	public Lotto_Res_1(String rtn_Message, String rtn_Code, List<T_01_0003> t_01_0003_List, String not_Interesting_1,
			String not_Interesting_2) {
		this.rtn_Message = rtn_Message;
		this.rtn_Code = rtn_Code;
		this.t_01_0003_List = t_01_0003_List;
		this.not_Interesting_1 = not_Interesting_1;
		this.not_Interesting_2 = not_Interesting_2;
	}

	public Lotto_Res_1(String rtn_Message, String rtn_Code, T_01_0004 t_01_0004) {
		this.rtn_Message = rtn_Message;
		this.rtn_Code = rtn_Code;
		this.t_01_0004 = t_01_0004;
	}

	public Lotto_Res_1(String rtn_Message, String rtn_Code, List<T_01_0004> t_01_0004_List, String not_Interesting_1,
			String not_Interesting_2, String not_Interesting_3) {
		this.rtn_Message = rtn_Message;
		this.rtn_Code = rtn_Code;
		this.t_01_0004_List = t_01_0004_List;
		this.not_Interesting_1 = not_Interesting_1;
		this.not_Interesting_2 = not_Interesting_2;
		this.not_Interesting_3 = not_Interesting_3;
	}

	public Lotto_Res_1(String rtn_Message, String rtn_Code, T_01_0005 t_01_0005) {
		this.rtn_Message = rtn_Message;
		this.rtn_Code = rtn_Code;
		this.t_01_0005 = t_01_0005;
	}

	public Lotto_Res_1(String rtn_Message, String rtn_Code, List<T_01_0005> t_01_0005_List, String not_Interesting_1,
			String not_Interesting_2, String not_Interesting_3, String not_Interesting_4) {
		this.rtn_Message = rtn_Message;
		this.rtn_Code = rtn_Code;
		this.t_01_0005_List = t_01_0005_List;
		this.not_Interesting_1 = not_Interesting_1;
		this.not_Interesting_2 = not_Interesting_2;
		this.not_Interesting_3 = not_Interesting_3;
		this.not_Interesting_4 = not_Interesting_4;
	}

	public Lotto_Res_1(String rtn_Message, String rtn_Code, List<T_01_0004> t_01_0004_List,
			List<T_01_0005> t_01_0005_List) {
		this.rtn_Message = rtn_Message;
		this.rtn_Code = rtn_Code;
		this.t_01_0004_List = t_01_0004_List;
		this.t_01_0005_List = t_01_0005_List;
	}

	public Lotto_Res_1(String rtn_Message, String rtn_Code, List<T_01_0003> t_01_0003_List,
			List<T_01_0004> t_01_0004_List, List<T_01_0005> t_01_0005_List) {
		this.rtn_Message = rtn_Message;
		this.rtn_Code = rtn_Code;
		this.t_01_0003_List = t_01_0003_List;
		this.t_01_0004_List = t_01_0004_List;
		this.t_01_0005_List = t_01_0005_List;
	}

	public Lotto_Res_1(String rtn_Message, String rtn_Code, T_03_0001 t_03_0001) {
		this.rtn_Message = rtn_Message;
		this.rtn_Code = rtn_Code;
		this.t_03_0001 = t_03_0001;
	}

	public Lotto_Res_1(String rtn_Message, String rtn_Code, T_03_0001 t_03_0001, boolean login) {
		this.rtn_Message = rtn_Message;
		this.rtn_Code = rtn_Code;
		this.t_03_0001 = t_03_0001;
		this.login = login;
	}

	public Lotto_Res_1(String rtn_Message, String rtn_Code, List<T_02_0001> t_02_0001_List,
			List<T_02_0002> t_02_0002_List, String not_Interesting_1) {
		this.rtn_Message = rtn_Message;
		this.rtn_Code = rtn_Code;
		this.t_02_0001_List = t_02_0001_List;
		this.t_02_0002_List = t_02_0002_List;
		this.not_Interesting_1 = not_Interesting_1;
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

	public List<T_01_0003> getT_01_0003_List() {
		return t_01_0003_List;
	}

	public void setT_01_0003_List(List<T_01_0003> t_01_0003_List) {
		this.t_01_0003_List = t_01_0003_List;
	}

	public String getNot_Interesting_2() {
		return not_Interesting_2;
	}

	public void setNot_Interesting_2(String not_Interesting_2) {
		this.not_Interesting_2 = not_Interesting_2;
	}

	public T_01_0004 getT_01_0004() {
		return t_01_0004;
	}

	public void setT_01_0004(T_01_0004 t_01_0004) {
		this.t_01_0004 = t_01_0004;
	}

	public List<T_01_0004> getT_01_0004_List() {
		return t_01_0004_List;
	}

	public void setT_01_0004_List(List<T_01_0004> t_01_0004_List) {
		this.t_01_0004_List = t_01_0004_List;
	}

	public String getNot_Interesting_3() {
		return not_Interesting_3;
	}

	public void setNot_Interesting_3(String not_Interesting_3) {
		this.not_Interesting_3 = not_Interesting_3;
	}

	public T_01_0005 getT_01_0005() {
		return t_01_0005;
	}

	public void setT_01_0005(T_01_0005 t_01_0005) {
		this.t_01_0005 = t_01_0005;
	}

	public List<T_01_0005> getT_01_0005_List() {
		return t_01_0005_List;
	}

	public void setT_01_0005_List(List<T_01_0005> t_01_0005_List) {
		this.t_01_0005_List = t_01_0005_List;
	}

	public String getNot_Interesting_4() {
		return not_Interesting_4;
	}

	public void setNot_Interesting_4(String not_Interesting_4) {
		this.not_Interesting_4 = not_Interesting_4;
	}

	public T_03_0001 getT_03_0001() {
		return t_03_0001;
	}

	public void setT_03_0001(T_03_0001 t_03_0001) {
		this.t_03_0001 = t_03_0001;
	}

	public boolean isLogin() {
		return login;
	}

	public void setLogin(boolean login) {
		this.login = login;
	}

	public List<T_02_0001> getT_02_0001_List() {
		return t_02_0001_List;
	}

	public void setT_02_0001_List(List<T_02_0001> t_02_0001_List) {
		this.t_02_0001_List = t_02_0001_List;
	}

	public List<T_02_0002> getT_02_0002_List() {
		return t_02_0002_List;
	}

	public void setT_02_0002_List(List<T_02_0002> t_02_0002_List) {
		this.t_02_0002_List = t_02_0002_List;
	}

}
