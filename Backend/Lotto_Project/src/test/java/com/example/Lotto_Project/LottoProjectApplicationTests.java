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
import com.example.Lotto_Project.Entity.T_01_0005;
import com.example.Lotto_Project.Repository.SearchTable_1;
import com.example.Lotto_Project.Repository.T_01_0004_Dao;
import com.example.Lotto_Project.Repository.T_01_0005_Dao;
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
	@Autowired
	private T_01_0005_Dao t_01_0005_Dao;
	@Autowired
	private SearchTable_1 searchTable_1;

	// -----------------------------------------------
	@Test
	void contextLoads() {
		List<Object[]> test = searchTable_1.search_1("", "");
		for (Object[] item : test) {
			for (Object item2 : item) {
				System.out.println("Value : " + item2);
			}
		}
		System.out.println("test : " + test.size());
	}

	// -----------------------------------------------
	// "新增" - T_01_0001
	@Test
	public void Create__T_01_0001() {
		Lotto_Req_1 req = new Lotto_Req_1();
		req.setT_01_0001__t_code_1("05");
		req.setT_01_0001__t_describe_1("寄信內容");
		req.setT_01_0001__t_describe_2("寄信內容(英文)");
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
		req.setT_01_0001__t_code_1("04");
		req.setT_01_0001__t_describe_1("寄信主旨");
		req.setT_01_0001__t_describe_2("寄信主旨(英文)");
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
		req.setT_01_0001__t_code_1("05");
		req.setT_01_0002__t_code_2("01");
		req.setT_01_0002__t_describe_1("測試信件-內容");
		req.setT_01_0002__t_describe_2("測試信件-內容(英文)");
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
		req.setT_01_0001__t_code_1("04");
		req.setT_01_0002__t_code_2("01");
		req.setT_01_0002__t_describe_1("測試信件-主旨");
		req.setT_01_0002__t_describe_2("測試信件-主旨(英文)");
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
		req.setT_01_0002__t_code_2("01-B");
		req.setT_01_0003__t_describe_1("樂透-B- EX: 小樂透");
		req.setT_01_0003__t_describe_2("樂透-B- EX: 小樂透 (英文)");
		req.setT_01_0003__t_describe_3("樂透-B- EX: 小樂透 (玩法描述)");
		req.setT_01_0003__t_describe_4("樂透-B- EX: 小樂透 (玩法描述) (英文)");
		req.setT_01_0003__t_special_treatment_1("");
		req.setT_01_0003__total_several_numbers(20);
		req.setT_01_0003__winning_several_numbers(3);
		req.setT_01_0003__top_winning_total_several_numbers(6);
		req.setT_01_0003__special_total_several_numbers(0);
		req.setT_01_0003__generally_total_several_numbers(6);
		req.setLottoPrice(20);
		req.setOpenNumbers(6);
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
		req.setT_01_0001__t_code_1("");
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
	// "新增"(C) - T_01_0005、T_01_0004 (排程)
	@Test
	public void Create__T_01_0005__T_01_0004() {
		Lotto_Res_1 res = lotto_Service_1.Create__T_01_0005();
		System.out.println("訊息 : " + res.getRtn_Message());
	}

	// "新增"(C) - T_01_0005、T_01_0004 (排程)
	@Test
	public void Create__T_01_0004() {
		Lotto_Res_1 res = lotto_Service_1.Create__T_01_0004();
		System.out.println("訊息 : " + res.getRtn_Message());
	}

	// -----------------------------------------------
	// "查詢" - T_01_0005 - 1
	@Test
	public void Search__T_01_0005___1() {
		Lotto_Req_1 req = new Lotto_Req_1();
		req.setT_01_0001__t_code_1("01");
		req.setT_01_0002__t_code_2("");
		req.setT_01_0005__lottoSort(1);
		req.setT_startDate("2024-05-20");
		req.setT_endDate("2024-05-22");
		Lotto_Res_1 res = lotto_Service_1.Search__T_01_0005___1(req);
		List<T_01_0005> t_01_0005_List = res.getT_01_0005_List();
		for (T_01_0005 item : t_01_0005_List) {
			System.out.println("-------------");
			System.out.println("UUID : " + item.getTableUuid1());
			System.out.println("代碼1 : " + item.getTableCode1());
			System.out.println("代碼2 : " + item.getTableCode2());
			System.out.println("描述1 : " + item.getTableDescribe1());
			System.out.println("描述2 : " + item.getTableDescribe2());
			System.out.println("發布日期 : " + item.getTableDate1());
			System.out.println("-------------");
		}
		System.out.println("訊息 : " + res.getRtn_Message());
		System.out.println("資料長度 : " + t_01_0005_List.size());
	}

	// -----------------------------------------------
	// "查詢" - T_01_0004 - 1
	@Test
	public void Search__T_01_0004___1() {
		Lotto_Req_1 req = new Lotto_Req_1();
		req.setT_01_0005__t_uuid_1("68326483-4101-4b78-8281-2b8edc3ab0f0");
		Lotto_Res_1 res = lotto_Service_1.Search__T_01_0004___1(req);
		List<T_01_0004> t_01_0004_List = res.getT_01_0004_List();
		for (T_01_0004 item : t_01_0004_List) {
			System.out.println("-------------");
			System.out.println("UUID : " + item.getTableUuid1());
			System.out.println("代碼1 : " + item.getTableCode1());
			System.out.println("代碼2 : " + item.getTableCode2());
			System.out.println("描述1 : " + item.getTableDescribe1());
			System.out.println("描述2 : " + item.getTableDescribe2());
			System.out.println("開獎號碼 : " + item.getWinningNumber());
			System.out.println("-------------");
		}
		System.out.println("訊息 : " + res.getRtn_Message());
		System.out.println("資料長度 : " + t_01_0004_List.size());
	}

	// -----------------------------------------------
	// "新增"(C) - T_03_0001 Ps. 註冊
	@Test
	public void Create__T_03_0001() {
		Lotto_Req_1 req = new Lotto_Req_1();
		req.setUserAcount("E121...");
		req.setUserPassword("A");
		req.setUserMail("a097303...");
		req.setUserName("蘇盟凱");
		req.setT_03_0001__t_special_treatment_1("");
		req.setUserGender("M");
		req.setCompanyBol("N");
		Lotto_Res_1 res = lotto_Service_1.Create__T_03_0001(req);
		System.out.println("訊息 : " + res.getRtn_Message());
	}

	// -----------------------------------------------
	// "修改"(U) - T_03_0001
	@Test
	public void Update__T_03_0001() {
		Lotto_Req_1 req = new Lotto_Req_1();
		req.setUserAcount("E125...");
		req.setUserMail("a0973038822@gmail.com");
		req.setUserName("蘇盟凱");
		req.setT_03_0001__t_special_treatment_1("");
		req.setUserGender("M");
		req.setCompanyBol("N");
		Lotto_Res_1 res = lotto_Service_1.Update__T_03_0001(req);
		System.out.println("訊息 : " + res.getRtn_Message());
	}

	// -----------------------------------------------
	// "修改"(U) - T_03_0001
	@Test
	public void Login() {
		Lotto_Req_1 req = new Lotto_Req_1();
		req.setUserAcount("E125...");
		req.setUserPassword("C");
		Lotto_Res_1 res = lotto_Service_1.Login(req);
		System.out.println("訊息 : " + res.getRtn_Message());
	}

	// -----------------------------------------------
	@Test
	public void Search_1() {
		Lotto_Req_1 req = new Lotto_Req_1();
		req.setT_01_0001__t_code_1("");
		req.setT_01_0002__t_code_2("");
		req.setT_describe("");
		List<T_01_0003> t_01_0003_List = lotto_Service_1.Search__T_01_0003___1(req).getT_01_0003_List();
		for (T_01_0003 item1 : t_01_0003_List) {
			String tableCode1 = item1.getTableCode1();
			String tableCode2 = item1.getTableCode2();
			System.out.println("======================");
			System.out.println("樂透名稱 : " + item1.getTableDescribe1());
			req = new Lotto_Req_1();
			req.setT_01_0001__t_code_1(tableCode1);
			req.setT_01_0002__t_code_2(tableCode2);
			req.setT_01_0005__lottoSort(0);
			req.setT_startDate("");
			req.setT_endDate("");
			List<T_01_0005> t_01_0005_List = lotto_Service_1.Search__T_01_0005___1(req).getT_01_0005_List();
			for (T_01_0005 item2 : t_01_0005_List) {
				req = new Lotto_Req_1();
				req.setT_01_0005__t_uuid_1(String.valueOf(item2.getTableUuid1()));
				System.out.println("--------------");
				System.out.println("第 " + item2.getLottoSort() + " 期");
				System.out.println("--------------");
				List<T_01_0004> t_01_0004_List = lotto_Service_1.Search__T_01_0004___1(req).getT_01_0004_List();
				for (T_01_0004 item3 : t_01_0004_List) {
					System.out.println("------");
					System.out.println("描述1 : " + item3.getTableDescribe1());
					System.out.println("開獎號碼 : " + item3.getWinningNumber());
					System.out.println("是特別號碼嗎 : " + item3.getSpecialWinningNumberBol());
					System.out.println("------");
				}
			}
			System.out.println("======================");
		}
	}
}
