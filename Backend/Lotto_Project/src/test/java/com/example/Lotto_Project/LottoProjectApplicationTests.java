package com.example.Lotto_Project;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.Lotto_Project.Constants.Lotto_RtnCode_2;
import com.example.Lotto_Project.Entity.T_01_0001;
import com.example.Lotto_Project.Entity.T_01_0002;
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
	// "新增" - T_01_0001
	@Test
	public void Create__T_01_0001() {
		Lotto_Req_1 req = new Lotto_Req_1();
		req.setT_01_0001__t_code_1("01");
		req.setT_01_0001__t_describe_1("樂透_樂透種類");
		req.setT_01_0001__t_describe_2("樂透_樂透種類(英文)");
		req.setT_01_0001__t_user("");
		req.setT_01_0001__t_special_treatment_1("");
		Lotto_Res_1 res = lotto_Service_1.Create__T_01_0001(req);
		System.out.println("訊息 : " + res.getRtn_Message());
	}

	// -----------------------------------------------
	// "修改" - T_01_0001
	@Test
	public void Update__T_01_0001() {
		Lotto_Req_1 req = new Lotto_Req_1();
		req.setT_01_0001__t_code_1("01");
		req.setT_01_0001__t_describe_1("樂透_樂透種類_改");
		req.setT_01_0001__t_describe_2("樂透_樂透種類(英文)_改");
		req.setT_01_0001__t_user("");
		req.setT_01_0001__t_special_treatment_1("");
		Lotto_Res_1 res = lotto_Service_1.Update__T_01_0001(req);
		System.out.println("訊息 : " + res.getRtn_Message());
	}

	// -----------------------------------------------
	// "查詢" - T_01_0001 - 1
	@Test
	public void Search__T_01_0001___1() {
		Lotto_Req_1 req = new Lotto_Req_1();
		req.setT_01_0001__t_code_1("01");
		req.setT_describe("樂");
		Lotto_Res_1 res = lotto_Service_1.Search__T_01_0001___1(req);
		List<T_01_0001> t_01_0001_List = res.getT_01_0001_List();
		for (T_01_0001 item : t_01_0001_List) {
			System.out.println("-------------");
			System.out.println("代碼1 : " + item.getTableCode1());
			System.out.println("描述1 : " + item.getTableDescribe1());
			System.out.println("描述2 : " + item.getTableDescribe2());
			System.out.println("-------------");
		}
		System.out.println("訊息 : " + res.getRtn_Message());
		System.out.println("資料長度 : " + res.getT_01_0001_List().size());
	}

	// -----------------------------------------------
	// "刪除" - T_01_0001
	@Test
	public void Delete__T_01_0001() {
		Lotto_Req_1 req = new Lotto_Req_1();
		req.setT_01_0001__t_code_1("01");
		Lotto_Res_1 res = lotto_Service_1.Delete__T_01_0001(req);
		System.out.println("訊息 : " + res.getRtn_Message());
	}

	// -----------------------------------------------
	// "新增" - T_01_0002
	@Test
	public void Create__T_01_0002() {
		Lotto_Req_1 req = new Lotto_Req_1();
		req.setT_01_0001__t_code_1("01");
		req.setT_01_0002__t_code_2("01-B");
		req.setT_01_0002__t_describe_1("樂透-B");
		req.setT_01_0002__t_describe_2("樂透-B(英文)");
		req.setT_01_0002__t_user("");
		req.setT_01_0002__t_special_treatment_1("");
		Lotto_Res_1 res = lotto_Service_1.Create__T_01_0002(req);
		System.out.println("訊息 : " + res.getRtn_Message());
	}

	// -----------------------------------------------
	// "修改" - T_01_0002
	@Test
	public void Update__T_01_0002() {
		Lotto_Req_1 req = new Lotto_Req_1();
		req.setT_01_0001__t_code_1("01");
		req.setT_01_0002__t_code_2("01-B");
		req.setT_01_0002__t_describe_1("樂透-B_改");
		req.setT_01_0002__t_describe_2("樂透-B(英文)_改");
		req.setT_01_0002__t_user("");
		req.setT_01_0002__t_special_treatment_1("");
		Lotto_Res_1 res = lotto_Service_1.Update__T_01_0002(req);
		System.out.println("訊息 : " + res.getRtn_Message());
	}

	// -----------------------------------------------
	// "查詢" - T_01_0001 - 1
	@Test
	public void Search__T_01_0002___1() {
		Lotto_Req_1 req = new Lotto_Req_1();
		req.setT_01_0001__t_code_1("01");
		req.setT_01_0002__t_code_2("");
		req.setT_describe("");
		Lotto_Res_1 res = lotto_Service_1.Search__T_01_0002___1(req);
		List<T_01_0002> t_01_0002_List = res.getT_01_0002_List();
		for (T_01_0002 item : t_01_0002_List) {
			System.out.println("-------------");
			System.out.println("代碼1 : " + item.getTableCode1());
			System.out.println("代碼2 : " + item.getTableCode2());
			System.out.println("描述1 : " + item.getTableDescribe1());
			System.out.println("描述2 : " + item.getTableDescribe2());
			System.out.println("-------------");
		}
		System.out.println("訊息 : " + res.getRtn_Message());
		System.out.println("資料長度 : " + res.getT_01_0002_List().size());
	}

	// -----------------------------------------------
	// "刪除" - T_01_0002
	@Test
	public void Delete__T_01_0002() {
		Lotto_Req_1 req = new Lotto_Req_1();
		req.setT_01_0001__t_code_1("01");
		req.setT_01_0002__t_code_2("01-B");
		Lotto_Res_1 res = lotto_Service_1.Delete__T_01_0002(req);
		System.out.println("訊息 : " + res.getRtn_Message());

	}
}
