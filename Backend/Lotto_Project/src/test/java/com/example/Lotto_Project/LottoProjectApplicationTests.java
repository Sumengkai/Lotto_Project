package com.example.Lotto_Project;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.Lotto_Project.Constants.Lotto_RtnCode_2;
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
}
