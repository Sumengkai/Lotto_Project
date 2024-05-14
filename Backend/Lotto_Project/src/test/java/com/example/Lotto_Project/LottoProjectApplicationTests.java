package com.example.Lotto_Project;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.Lotto_Project.Service.Interface.Lotto_Service_1;
import com.example.Lotto_Project.Vo.Req.Lotto_Req_1;
import com.example.Lotto_Project.Vo.Res.Lotto_Res_1;

@SpringBootTest
class LottoProjectApplicationTests {
	// -----------------------------------------------
	@Autowired
	private Lotto_Service_1 lotto_Service_1;

	// -----------------------------------------------
	@Test
	void contextLoads() {
	}

	// -----------------------------------------------
	// "新增"或"修改" - T_00_0001
	@Test
	public void Create_Update__T_00_0001() {
		Lotto_Req_1 req = new Lotto_Req_1();
		req.setTable_name("Test_Table");
		Lotto_Res_1 res = lotto_Service_1.Create_Update__T_00_0001(req);
		System.out.println("Code : " + res.getRtn_Code());
		System.out.println("訊息 : " + res.getRtn_Message());
	}
	// -----------------------------------------------
}
