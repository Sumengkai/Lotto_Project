package com.example.Lotto_Project.Service.Interface;

import com.example.Lotto_Project.Vo.Req.Lotto_Req_1;
import com.example.Lotto_Project.Vo.Res.Lotto_Res_1;

public interface Lotto_Service_1 {
	// -----------------------------------------------
	// "新增"或"修改" - T_00_0001
//	public Lotto_Res_1 Create_Update__T_00_0001(Lotto_Req_1 req);

	// -----------------------------------------------
	// "新增" - T_01_0001
	public Lotto_Res_1 Create__T_01_0001(Lotto_Req_1 req);

	// -----------------------------------------------
	// "修改" - T_01_0001
	public Lotto_Res_1 Update__T_01_0001(Lotto_Req_1 req);

	// -----------------------------------------------
	// "檢查用戶" (單個) - T_03_0001
	public Lotto_Res_1 Select__T_03_0001(Lotto_Req_1 req);
}
