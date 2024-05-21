package com.example.Lotto_Project;

import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.Lotto_Project.Constants.Lotto_RtnCode_2;
import com.example.Lotto_Project.Entity.T_01_0001;
import com.example.Lotto_Project.Entity.T_01_0002;
import com.example.Lotto_Project.Entity.T_01_0003;
import com.example.Lotto_Project.Entity.T_01_0004;
import com.example.Lotto_Project.Repository.T_01_0004_Dao;
import com.example.Lotto_Project.Service.Interface.Lotto_Service_1;
import com.example.Lotto_Project.Vo.Req.Lotto_Req_1;
import com.example.Lotto_Project.Vo.Res.Lotto_Res_1;

@SpringBootTest
class LottoProjectApplicationTests {
	// -----------------------------------------------
	@Autowired
	private Lotto_Service_1 lotto_Service_1;
	@Autowired
	private T_01_0004_Dao t_01_0004_Dao;

	// -----------------------------------------------
	@Test
	void contextLoads() {
	}

	// -----------------------------------------------
	// "新增" - T_01_0001
	@Test
	public void Create__T_01_0001() {
		Lotto_Req_1 req = new Lotto_Req_1();
		req.setT_01_0001__t_code_1("02");
		req.setT_01_0001__t_describe_1("樂透_是否為特別號");
		req.setT_01_0001__t_describe_2("樂透_是否為特別號(英文)");
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
		req.setT_01_0001__t_code_1("02");
		req.setT_01_0002__t_code_2("B");
		req.setT_01_0002__t_describe_1("不是");
		req.setT_01_0002__t_describe_2("不是(英文)");
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
	// "查詢" - T_01_0002 - 1
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

	// -----------------------------------------------
	// "新增" - T_01_0003
	@Test
	public void Create__T_01_0003() {
		Lotto_Req_1 req = new Lotto_Req_1();
		req.setT_01_0001__t_code_1("01");
		req.setT_01_0002__t_code_2("01-A");
		req.setT_01_0003__t_describe_1("樂透-A- EX: 大樂透");
		req.setT_01_0003__t_describe_2("樂透-A- EX: 大樂透 (英文)");
		req.setT_01_0003__t_describe_3("樂透-A- EX: 大樂透 (玩法描述)");
		req.setT_01_0003__t_describe_4("樂透-A- EX: 大樂透 (玩法描述) (英文)");
		req.setT_01_0003__t_special_treatment_1("");
		req.setT_01_0003__total_several_numbers(49);
		req.setT_01_0003__winning_several_numbers(2);
		req.setT_01_0003__top_winning_total_several_numbers(6);
		req.setT_01_0003__special_total_several_numbers(1);
		req.setT_01_0003__generally_total_several_numbers(6);
		req.setLottoPrice(50);
		req.setOpenNumbers(7);
		Lotto_Res_1 res = lotto_Service_1.Create__T_01_0003(req);
		System.out.println("訊息 : " + res.getRtn_Message());
	}

	// -----------------------------------------------
	// "修改" - T_01_0003
	@Test
	public void Update__T_01_0003() {
		Lotto_Req_1 req = new Lotto_Req_1();
		req.setT_01_0001__t_code_1("01");
		req.setT_01_0002__t_code_2("01-A");
		req.setT_01_0003__t_describe_1("樂透-A- EX: 大樂透_改");
		req.setT_01_0003__t_describe_2("樂透-A- EX: 大樂透 (英文)_改");
		req.setT_01_0003__t_describe_3("樂透-A- EX: 大樂透 (玩法描述)_改");
		req.setT_01_0003__t_describe_4("樂透-A- EX: 大樂透 (玩法描述) (英文)_改");
		req.setT_01_0003__t_special_treatment_1("");
		req.setT_01_0003__total_several_numbers(49);
		req.setT_01_0003__winning_several_numbers(2);
		req.setT_01_0003__top_winning_total_several_numbers(6);
		req.setT_01_0003__special_total_several_numbers(1);
		req.setT_01_0003__generally_total_several_numbers(6);
		req.setLottoPrice(50);
		req.setOpenNumbers(7);
		Lotto_Res_1 res = lotto_Service_1.Update__T_01_0003(req);
		System.out.println("訊息 : " + res.getRtn_Message());
	}

	// -----------------------------------------------
	// "查詢" - T_01_0003 - 1
	@Test
	public void Search__T_01_0003___1() {
		Lotto_Req_1 req = new Lotto_Req_1();
		req.setT_01_0001__t_code_1("01");
		req.setT_01_0002__t_code_2("");
		req.setT_describe("");
		Lotto_Res_1 res = lotto_Service_1.Search__T_01_0003___1(req);
		List<T_01_0003> t_01_0003_List = res.getT_01_0003_List();
		for (T_01_0003 item : t_01_0003_List) {
			System.out.println("-------------");
			System.out.println("代碼1 : " + item.getTableCode1());
			System.out.println("代碼2 : " + item.getTableCode2());
			System.out.println("描述1 : " + item.getTableDescribe1());
			System.out.println("描述2 : " + item.getTableDescribe2());
			System.out.println("價格 : " + item.getLottoPrice());
			System.out.println("-------------");
		}
		System.out.println("訊息 : " + res.getRtn_Message());
		System.out.println("資料長度 : " + res.getT_01_0003_List().size());
	}

	// -----------------------------------------------
	// "新增"(C) - T_01_0004 (排程)
	@Test
	public void Create__T_01_0004() {
		Lotto_Res_1 res = lotto_Service_1.Create__T_01_0004();
		List<T_01_0004> t_01_0004_List = res.getT_01_0004_List();
		for (T_01_0004 item : t_01_0004_List) {
			System.out.println("-------------");
			System.out.println("第 " + item.getLottoSort() + " 期");
			System.out.println("代碼1 : " + item.getTableCode1());
			System.out.println("代碼2 : " + item.getTableCode2());
			System.out.println("開獎號碼 : " + item.getWinningNumber());
			System.out.println("是特別號碼嗎 : " + item.getSpecialWinningNumberBol());
			System.out.println("描述1 : " + item.getTableDescribe1());
			System.out.println("描述2 : " + item.getTableDescribe2());
			System.out.println("-------------");
		}
		System.out.println("訊息 : " + res.getRtn_Message());
		System.out.println("資料長度 : " + res.getT_01_0004_List().size());
	}

	// -----------------------------------------------
	// "查詢" - T_01_0003 - 1
	@Test
	public void Search__T_01_0004___1() {
		Lotto_Req_1 req = new Lotto_Req_1();
		req.setT_01_0001__t_code_1("01");
		req.setT_01_0002__t_code_2("01-A");
		req.setT_describe("");
		req.setT_startDate("");
		req.setT_endDate("");
		Lotto_Res_1 res = lotto_Service_1.Search__T_01_0004___1(req);
		List<T_01_0004> t_01_0004_List = res.getT_01_0004_List();
		for (T_01_0004 item : t_01_0004_List) {
			System.out.println("-------------");
			System.out.println("代碼1 : " + item.getTableCode1());
			System.out.println("代碼2 : " + item.getTableCode2());
			System.out.println("描述1 : " + item.getTableDescribe1());
			System.out.println("描述2 : " + item.getTableDescribe2());
			System.out.println("開獎號碼 : " + item.getWinningNumber());
			System.out.println("-------------");
		}
		System.out.println("訊息 : " + res.getRtn_Message());
		System.out.println("資料長度 : " + res.getT_01_0004_List().size());
	}

}
