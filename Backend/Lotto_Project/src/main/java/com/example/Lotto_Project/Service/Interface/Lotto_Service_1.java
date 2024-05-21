package com.example.Lotto_Project.Service.Interface;

import com.example.Lotto_Project.Vo.Req.Lotto_Req_1;
import com.example.Lotto_Project.Vo.Res.Lotto_Res_1;

public interface Lotto_Service_1 {
	// -----------------------------------------------
	// "新增"或"修改" - T_00_0001
	// public Lotto_Res_1 Create_Update__T_00_0001(Lotto_Req_1 req);

	// -----------------------------------------------
	// "新增"(C) - T_01_0001
	public Lotto_Res_1 Create__T_01_0001(Lotto_Req_1 req);

	// -----------------------------------------------
	// "修改"(U) - T_01_0001
	public Lotto_Res_1 Update__T_01_0001(Lotto_Req_1 req);

	// -----------------------------------------------
	// "查詢"(R) - T_01_0001
	public Lotto_Res_1 Search__T_01_0001___1(Lotto_Req_1 req);

	// -----------------------------------------------
	// "刪除"(D) - T_01_0001
	public Lotto_Res_1 Delete__T_01_0001(Lotto_Req_1 req);

	// -----------------------------------------------
	// "新增"(C) - T_01_0002
	public Lotto_Res_1 Create__T_01_0002(Lotto_Req_1 req);

	// -----------------------------------------------
	// "修改"(U) - T_01_0002
	public Lotto_Res_1 Update__T_01_0002(Lotto_Req_1 req);

	// -----------------------------------------------
	// "查詢"(R) - T_01_0002
	public Lotto_Res_1 Search__T_01_0002___1(Lotto_Req_1 req);

	// -----------------------------------------------
	// "刪除"(D) - T_01_0002
	public Lotto_Res_1 Delete__T_01_0002(Lotto_Req_1 req);

	// -----------------------------------------------
	// "新增"(C) - T_01_0003
	public Lotto_Res_1 Create__T_01_0003(Lotto_Req_1 req);

	// -----------------------------------------------
	// "修改"(U) - T_01_0003
	public Lotto_Res_1 Update__T_01_0003(Lotto_Req_1 req);

	// -----------------------------------------------
	// "查詢"(R) - T_01_0003
	public Lotto_Res_1 Search__T_01_0003___1(Lotto_Req_1 req);

	// -----------------------------------------------
	// "新增"(C) - T_01_0004 (排程)
	public Lotto_Res_1 Create__T_01_0004();

	// -----------------------------------------------
	// "查詢"(R) - T_01_0004
	public Lotto_Res_1 Search__T_01_0004___1(Lotto_Req_1 req);

}
