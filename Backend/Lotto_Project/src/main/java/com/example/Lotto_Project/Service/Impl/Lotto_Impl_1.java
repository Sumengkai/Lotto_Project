package com.example.Lotto_Project.Service.Impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.example.Lotto_Project.Constants.Lotto_RtnCode_1;
import com.example.Lotto_Project.Constants.Lotto_RtnCode_2;
import com.example.Lotto_Project.Constants.Lotto_RtnCode_3;
import com.example.Lotto_Project.Entity.T_00_0001;
import com.example.Lotto_Project.Entity.T_01_0001;
import com.example.Lotto_Project.Entity.T_01_0002;
import com.example.Lotto_Project.Entity.T_01_0003;
import com.example.Lotto_Project.Entity.T_01_0004;
import com.example.Lotto_Project.Repository.T_00_0001_Dao;
import com.example.Lotto_Project.Repository.T_01_0001_Dao;
import com.example.Lotto_Project.Repository.T_01_0002_Dao;
import com.example.Lotto_Project.Repository.T_01_0003_Dao;
import com.example.Lotto_Project.Repository.T_01_0004_Dao;
import com.example.Lotto_Project.Repository.T_03_0001_Dao;
import com.example.Lotto_Project.Service.Interface.Lotto_Service_1;
import com.example.Lotto_Project.Vo.Req.Lotto_Req_1;
import com.example.Lotto_Project.Vo.Res.Lotto_Res_1;
import com.mysql.cj.log.Log;

// -----------------------------------------------
// @EnableScheduling - 排程需要註釋
@EnableScheduling
@Service
public class Lotto_Impl_1 implements Lotto_Service_1 {
	// -----------------------------------------------
	// Log所需參數
	private static final Logger _logger = LoggerFactory.getLogger(Lotto_Impl_1.class);
	// -----------------------------------------------
	// 管理需要流水號的table
	@Autowired
	T_00_0001_Dao t_00_0001_Dao;
	// -------------------------
	// 管理編碼的table_1
	@Autowired
	T_01_0001_Dao t_01_0001_Dao;
	// -------------------------
	// 管理編碼的table_2
	@Autowired
	T_01_0002_Dao t_01_0002_Dao;
	// -------------------------
	// 樂透種類table
	@Autowired
	T_01_0003_Dao t_01_0003_Dao;
	// -------------------------
	// 樂透開幾紀錄table
	@Autowired
	T_01_0004_Dao t_01_0004_Dao;
	// -------------------------
	// 用戶帳號密碼管理table
	@Autowired
	T_03_0001_Dao t_03_0001_Dao;

	// -----------------------------------------------
	// "新增" - T_01_0001
	@Override
	public Lotto_Res_1 Create__T_01_0001(Lotto_Req_1 req) {
		// -------------------------
		_logger.info("-----------------------------------------------");
		_logger.info("新增 : T_01_0001 (Start)");
		_logger.info("方法名稱 : " + "Create__T_01_0001");
		// -------------------------
		// 需求參數
		String T_01_0001_t_code_1 = req.getT_01_0001__t_code_1().trim();
		String T_01_0001_t_describe_1 = req.getT_01_0001__t_describe_1().trim();
		String T_01_0001_t_describe_2 = req.getT_01_0001__t_describe_2().trim();
		String T_01_0001_t_user = req.getT_01_0001__t_user().trim();
		String T_01_0001_t_special_treatment_1 = req.getT_01_0001__t_special_treatment_1().trim();
		// -------------------------
		// 一般參數
		// 代碼_刪除布林值 - "N"
		String delete_Bol = Lotto_RtnCode_3.Bol_N.getSpecial_code_1();
		// 代碼_訊息
		String rtn_Message_1 = Lotto_RtnCode_1.SUCCESSFUL.getMessage();
		String rtn_Code_1 = Lotto_RtnCode_1.SUCCESSFUL.getCode();
		String rtn_Message_2 = Lotto_RtnCode_1.DUPLICATE_DATA.getMessage();
		String rtn_Code_2 = Lotto_RtnCode_1.DUPLICATE_DATA.getCode();
		// 代碼_表名
		String T_01_0001_table_name = Lotto_RtnCode_2.T_01_0001.getTable_name();
		// 日期時間
		LocalDateTime localDateTime = LocalDateTime.now();
		// T_01_0001
		T_01_0001 t_01_0001 = new T_01_0001();

		// -------------------------
		// 邏輯處理
		// 放Table名稱進去。管理流水號
		Optional<T_01_0001> t_01_0001_O = t_01_0001_Dao.findByTableCode1(T_01_0001_t_code_1);
		// 不是null會掉進去 (應該不會)
		if (t_01_0001_O.isPresent()) {
			_logger.info("資料重複。已被彈出該方法");
			t_01_0001 = t_01_0001_O.get();
			return new Lotto_Res_1(rtn_Message_2, rtn_Code_2, t_01_0001);
		}
		// 處理該表流水號
		Lotto_Res_1 lotto_Res_1 = Create_Update__T_00_0001(T_01_0001_table_name);
		int T_01_0001_t_serialNumber_1 = lotto_Res_1.getT_00_0001().getTableSerialNumber1();
		// 流水號、編碼1、描述1、描述2、時間1、時間2、表名、用戶、特殊處理、刪除布林值
		t_01_0001 = new T_01_0001(T_01_0001_t_serialNumber_1, T_01_0001_t_code_1, T_01_0001_t_describe_1,
				T_01_0001_t_describe_2, localDateTime, localDateTime, T_01_0001_table_name, T_01_0001_t_user,
				T_01_0001_t_special_treatment_1, delete_Bol);
		// 儲存
		t_01_0001 = t_01_0001_Dao.save(t_01_0001);
		// -------------------------
		_logger.info("流水號 : " + t_01_0001.getTableSerialNumber1());
		_logger.info("編碼_1 : " + t_01_0001.getTableCode1());
		_logger.info("描述_1 : " + t_01_0001.getTableDescribe1());
		_logger.info("描述_2 : " + t_01_0001.getTableDescribe2());
		_logger.info("新增 : T_01_0001 (End)");
		_logger.info("-----------------------------------------------");
		// -------------------------
		return new Lotto_Res_1(rtn_Message_1, rtn_Code_1, t_01_0001);
	}

	// -----------------------------------------------
	// "修改" - T_01_0001
	@Override
	public Lotto_Res_1 Update__T_01_0001(Lotto_Req_1 req) {
		// -------------------------
		_logger.info("-----------------------------------------------");
		_logger.info("修改 : T_01_0001 (Start)");
		_logger.info("方法名稱 : " + "Update__T_01_0001");
		// -------------------------
		// 需求參數
		String T_01_0001_t_code_1 = req.getT_01_0001__t_code_1().trim();
		String T_01_0001_t_describe_1 = req.getT_01_0001__t_describe_1().trim();
		String T_01_0001_t_describe_2 = req.getT_01_0001__t_describe_2().trim();
		String T_01_0001_t_user = req.getT_01_0001__t_user().trim();
		String T_01_0001_t_special_treatment_1 = req.getT_01_0001__t_special_treatment_1().trim();
		// -------------------------
		// 一般參數
		// 訊息
		String rtn_Message_1 = Lotto_RtnCode_1.SUCCESSFUL.getMessage();
		String rtn_Code_1 = Lotto_RtnCode_1.SUCCESSFUL.getCode();
		String rtn_Message_2 = Lotto_RtnCode_1.NOT_FOUND_DATA.getMessage();
		String rtn_Code_2 = Lotto_RtnCode_1.NOT_FOUND_DATA.getCode();
		// 日期時間
		LocalDateTime localDateTime = LocalDateTime.now();
		// T_01_0001
		T_01_0001 t_01_0001 = new T_01_0001();
		// -------------------------
		// 邏輯處理
		// 抓資料 - T_01_0001
		Optional<T_01_0001> t_01_0001_O = t_01_0001_Dao.findByTableCode1(T_01_0001_t_code_1);
		// 是null會掉進去 (應該不會)
		if (!t_01_0001_O.isPresent()) {
			_logger.info("資料找不到。已被彈出該方法");
			return new Lotto_Res_1(rtn_Message_2, rtn_Code_2, t_01_0001);
		}
		// 抓到原有資料
		t_01_0001 = t_01_0001_O.get();
		// 描述1、描述2、時間2、用戶、特殊處理
		t_01_0001.setTableDescribe1(T_01_0001_t_describe_1);
		t_01_0001.setTableDescribe2(T_01_0001_t_describe_2);
		t_01_0001.setTableDate2(localDateTime);
		t_01_0001.setTableUser(T_01_0001_t_user);
		t_01_0001.setTableSpecialTreatment1(T_01_0001_t_special_treatment_1);
		// 儲存
		t_01_0001 = t_01_0001_Dao.save(t_01_0001);
		// -------------------------
		_logger.info("流水號 : " + t_01_0001.getTableSerialNumber1());
		_logger.info("編碼_1 : " + t_01_0001.getTableCode1());
		_logger.info("描述_1 : " + t_01_0001.getTableDescribe1());
		_logger.info("描述_2 : " + t_01_0001.getTableDescribe2());
		_logger.info("修改 : T_01_0001 (End)");
		_logger.info("-----------------------------------------------");
		// -------------------------
		return new Lotto_Res_1(rtn_Message_1, rtn_Code_1, t_01_0001);
	}

	// -----------------------------------------------
	// "查詢" - T_01_0001 - 1
	@Override
	public Lotto_Res_1 Search__T_01_0001___1(Lotto_Req_1 req) {
		// -------------------------
		_logger.info("-----------------------------------------------");
		_logger.info("查詢 : T_01_0001 (Start) _ 1 ");
		_logger.info("方法名稱 : " + "Search__T_01_0001___1");
		// -------------------------
		// 需求參數
		String T_01_0001_t_code_1 = req.getT_01_0001__t_code_1().trim();
		String t_describe = req.getT_describe().trim();
		t_describe = "%" + t_describe + "%";
		// -------------------------
		// 一般參數
		// 訊息
		String rtn_Message_1 = Lotto_RtnCode_1.SUCCESSFUL.getMessage();
		String rtn_Code_1 = Lotto_RtnCode_1.SUCCESSFUL.getCode();
		String rtn_Message_2 = Lotto_RtnCode_1.NOT_FOUND_DATA.getMessage();
		String rtn_Code_2 = Lotto_RtnCode_1.NOT_FOUND_DATA.getCode();
		List<T_01_0001> T_01_0001_List = t_01_0001_Dao.search_By_TableCode1_TableDescribe(T_01_0001_t_code_1,
				t_describe);
		// -------------------------
		// 邏輯處理
		T_01_0001_List = FilterList__T_01_0001___1(T_01_0001_List);
		if (T_01_0001_List.size() == 0) {
			_logger.info("資料長度為 0 。已被彈出該方法");
			return new Lotto_Res_1(rtn_Message_2, rtn_Code_2, T_01_0001_List);
		}
		// -------------------------
		_logger.info("資料長度 : " + T_01_0001_List.size());
		_logger.info("查詢 : T_01_0001 (End) _ 1 ");
		_logger.info("-----------------------------------------------");
		// -------------------------
		return new Lotto_Res_1(rtn_Message_1, rtn_Code_1, T_01_0001_List);
	}

	// -----------------------------------------------
	// "刪除" - T_01_0001 (未完成)
	@Override
	public Lotto_Res_1 Delete__T_01_0001(Lotto_Req_1 req) {
		// -------------------------
		_logger.info("-----------------------------------------------");
		_logger.info("假刪除 : T_01_0001 (Start)");
		_logger.info("方法名稱 : " + "Delete__T_01_0001");
		// -------------------------
		// 需求參數
		String T_01_0001_t_code_1 = req.getT_01_0001__t_code_1().trim();
		// -------------------------
		// 一般參數
		// 代碼_刪除布林值 - "Y"
		String delete_Bol = Lotto_RtnCode_3.Bol_Y.getSpecial_code_1();
		// 訊息
		String rtn_Message_1 = Lotto_RtnCode_1.SUCCESSFUL.getMessage();
		String rtn_Code_1 = Lotto_RtnCode_1.SUCCESSFUL.getCode();
		String rtn_Message_2 = Lotto_RtnCode_1.NOT_FOUND_DATA.getMessage();
		String rtn_Code_2 = Lotto_RtnCode_1.NOT_FOUND_DATA.getCode();
		// 日期時間
		LocalDateTime localDateTime = LocalDateTime.now();
		// T_01_0001
		T_01_0001 t_01_0001 = new T_01_0001();
		// -------------------------
		// 邏輯處理
		// 還需要處理其他檢查，以及連同其他表一起刪除。
		// 抓資料 - T_01_0001
		Optional<T_01_0001> t_01_0001_O = t_01_0001_Dao.findByTableCode1(T_01_0001_t_code_1);
		// 是null會掉進去 (應該不會)
		if (!t_01_0001_O.isPresent()) {
			_logger.info("資料找不到。已被彈出該方法");
			return new Lotto_Res_1(rtn_Message_2, rtn_Code_2);
		}
		t_01_0001 = t_01_0001_O.get();
		t_01_0001.setTableDate2(localDateTime);
		t_01_0001.setDeleteBol(delete_Bol);
		// 儲存
		t_01_0001 = t_01_0001_Dao.save(t_01_0001);
		// -------------------------
		_logger.info("流水號 : " + t_01_0001.getTableSerialNumber1());
		_logger.info("編碼_1 : " + t_01_0001.getTableCode1());
		_logger.info("描述_1 : " + t_01_0001.getTableDescribe1());
		_logger.info("描述_2 : " + t_01_0001.getTableDescribe2());
		_logger.info("刪除 : " + t_01_0001.getDeleteBol());
		_logger.info("假刪除 : T_01_0001 (End)");
		_logger.info("-----------------------------------------------");
		// -------------------------
		return new Lotto_Res_1(rtn_Message_1, rtn_Code_1, t_01_0001);
	}

	// -----------------------------------------------
	// "新增" - T_01_0002
	@Override
	public Lotto_Res_1 Create__T_01_0002(Lotto_Req_1 req) {
		// -------------------------
		_logger.info("-----------------------------------------------");
		_logger.info("新增 : T_01_0002 (Start)");
		_logger.info("方法名稱 : " + "Create__T_01_0002");
		// -------------------------
		// 需求參數
		// T_01_0001
		String T_01_0001_t_code_1 = req.getT_01_0001__t_code_1().trim();
		// T_01_0002
		String T_01_0002_t_code_2 = req.getT_01_0002__t_code_2().trim();
		String T_01_0002_t_describe_1 = req.getT_01_0002__t_describe_1().trim();
		String T_01_0002_t_describe_2 = req.getT_01_0002__t_describe_2().trim();
		String T_01_0002_t_user = req.getT_01_0002__t_user().trim();
		String T_01_0002_t_special_treatment_1 = req.getT_01_0002__t_special_treatment_1().trim();
		// -------------------------
		// 一般參數
		// 代碼_刪除布林值 - "N"
		String delete_Bol = Lotto_RtnCode_3.Bol_N.getSpecial_code_1();
		// 代碼_訊息
		String rtn_Message_1 = Lotto_RtnCode_1.SUCCESSFUL.getMessage();
		String rtn_Code_1 = Lotto_RtnCode_1.SUCCESSFUL.getCode();
		String rtn_Message_2 = Lotto_RtnCode_1.DUPLICATE_DATA.getMessage();
		String rtn_Code_2 = Lotto_RtnCode_1.DUPLICATE_DATA.getCode();
		// 代碼_表名
		String T_01_0002_table_name = Lotto_RtnCode_2.T_01_0002.getTable_name();
		// 日期時間
		LocalDateTime localDateTime = LocalDateTime.now();
		// T_01_0002
		T_01_0002 t_01_0002 = new T_01_0002();
		// -------------------------
		// 邏輯處理
		Optional<T_01_0002> t_01_0002_O = t_01_0002_Dao.findByTableCode1AndTableCode2(T_01_0001_t_code_1,
				T_01_0002_t_code_2);
		// 不是null會掉進去 (應該不會)
		if (t_01_0002_O.isPresent()) {
			_logger.info("資料重複。已被彈出該方法");
			t_01_0002 = t_01_0002_O.get();
			return new Lotto_Res_1(rtn_Message_2, rtn_Code_2, t_01_0002);
		}
		// 處理該表流水號
		Lotto_Res_1 lotto_Res_1 = Create_Update__T_00_0001(T_01_0002_table_name);
		int T_01_0002_t_serialNumber_1 = lotto_Res_1.getT_00_0001().getTableSerialNumber1();
		// 流水號、編碼1、編碼2、描述1、描述2、時間1、時間2、表名、用戶、特殊處理、刪除布林值
		t_01_0002 = new T_01_0002(T_01_0002_t_serialNumber_1, T_01_0001_t_code_1, T_01_0002_t_code_2,
				T_01_0002_t_describe_1, T_01_0002_t_describe_2, localDateTime, localDateTime, T_01_0002_table_name,
				T_01_0002_t_user, T_01_0002_t_special_treatment_1, delete_Bol);
		// 儲存
		t_01_0002 = t_01_0002_Dao.save(t_01_0002);
		// -------------------------
		_logger.info("流水號 : " + t_01_0002.getTableSerialNumber1());
		_logger.info("編碼_1 : " + t_01_0002.getTableCode1());
		_logger.info("編碼_2 : " + t_01_0002.getTableCode2());
		_logger.info("描述_1 : " + t_01_0002.getTableDescribe1());
		_logger.info("描述_2 : " + t_01_0002.getTableDescribe2());
		_logger.info("新增 : T_01_0002 (End)");
		_logger.info("-----------------------------------------------");
		// -------------------------
		return new Lotto_Res_1(rtn_Message_1, rtn_Code_1, t_01_0002);
	}

	// -----------------------------------------------
	// "修改" - T_01_0002
	@Override
	public Lotto_Res_1 Update__T_01_0002(Lotto_Req_1 req) {
		// -------------------------
		_logger.info("-----------------------------------------------");
		_logger.info("修改 : T_01_0002 (Start)");
		_logger.info("方法名稱 : " + "Update__T_01_0002");
		// -------------------------
		// 需求參數
		// T_01_0001
		String T_01_0001_t_code_1 = req.getT_01_0001__t_code_1().trim();
		// T_01_0002
		String T_01_0002_t_code_2 = req.getT_01_0002__t_code_2().trim();
		String T_01_0002_t_describe_1 = req.getT_01_0002__t_describe_1().trim();
		String T_01_0002_t_describe_2 = req.getT_01_0002__t_describe_2().trim();
		String T_01_0002_t_user = req.getT_01_0002__t_user().trim();
		String T_01_0002_t_special_treatment_1 = req.getT_01_0002__t_special_treatment_1().trim();
		// -------------------------
		// 一般參數
		// 訊息
		String rtn_Message_1 = Lotto_RtnCode_1.SUCCESSFUL.getMessage();
		String rtn_Code_1 = Lotto_RtnCode_1.SUCCESSFUL.getCode();
		String rtn_Message_2 = Lotto_RtnCode_1.NOT_FOUND_DATA.getMessage();
		String rtn_Code_2 = Lotto_RtnCode_1.NOT_FOUND_DATA.getCode();
		// 日期時間
		LocalDateTime localDateTime = LocalDateTime.now();
		// T_01_0002
		T_01_0002 t_01_0002 = new T_01_0002();
		// -------------------------
		// 邏輯處理
		Optional<T_01_0002> t_01_0002_O = t_01_0002_Dao.findByTableCode1AndTableCode2(T_01_0001_t_code_1,
				T_01_0002_t_code_2);
		// 是null會掉進去 (應該不會)
		if (!t_01_0002_O.isPresent()) {
			_logger.info("資料找不到。已被彈出該方法");
			return new Lotto_Res_1(rtn_Message_2, rtn_Code_2, t_01_0002);
		}
		// 抓到原有資料
		t_01_0002 = t_01_0002_O.get();
		// 描述1、描述2、時間2、用戶、特殊處理
		t_01_0002.setTableDescribe1(T_01_0002_t_describe_1);
		t_01_0002.setTableDescribe2(T_01_0002_t_describe_2);
		t_01_0002.setTableDate2(localDateTime);
		t_01_0002.setTableUser(T_01_0002_t_user);
		t_01_0002.setTableSpecialTreatment1(T_01_0002_t_special_treatment_1);
		// 儲存
		t_01_0002 = t_01_0002_Dao.save(t_01_0002);
		// -------------------------
		_logger.info("流水號 : " + t_01_0002.getTableSerialNumber1());
		_logger.info("編碼_1 : " + t_01_0002.getTableCode1());
		_logger.info("編碼_2 : " + t_01_0002.getTableCode2());
		_logger.info("描述_1 : " + t_01_0002.getTableDescribe1());
		_logger.info("描述_2 : " + t_01_0002.getTableDescribe2());
		_logger.info("修改 : T_01_0001 (End)");
		_logger.info("-----------------------------------------------");
		// -------------------------
		return new Lotto_Res_1(rtn_Message_1, rtn_Code_1, t_01_0002);
	}

	// -----------------------------------------------
	// "查詢" - T_01_0002 - 1
	@Override
	public Lotto_Res_1 Search__T_01_0002___1(Lotto_Req_1 req) {
		// -------------------------
		_logger.info("-----------------------------------------------");
		_logger.info("查詢 : T_01_0002 (Start) _ 1 ");
		_logger.info("方法名稱 : " + "Search__T_01_0002___1");
		// -------------------------
		// 需求參數
		String T_01_0001_t_code_1 = req.getT_01_0001__t_code_1().trim();
		String T_01_0002_t_code_2 = req.getT_01_0002__t_code_2().trim();
		String t_describe = req.getT_describe().trim();
		t_describe = "%" + t_describe + "%";
		// -------------------------
		// 一般參數
		// 訊息
		String rtn_Message_1 = Lotto_RtnCode_1.SUCCESSFUL.getMessage();
		String rtn_Code_1 = Lotto_RtnCode_1.SUCCESSFUL.getCode();
		String rtn_Message_2 = Lotto_RtnCode_1.NOT_FOUND_DATA.getMessage();
		String rtn_Code_2 = Lotto_RtnCode_1.NOT_FOUND_DATA.getCode();
		List<T_01_0002> T_01_0002_List = t_01_0002_Dao.search_By_TableCode1_TableCode2_TableDescribe(T_01_0001_t_code_1,
				T_01_0002_t_code_2, t_describe);
		// -------------------------
		// 邏輯處理
		T_01_0002_List = FilterList__T_01_0002___1(T_01_0002_List);
		if (T_01_0002_List.size() == 0) {
			_logger.info("資料長度為 0 。已被彈出該方法");
			return new Lotto_Res_1(rtn_Message_2, rtn_Code_2, T_01_0002_List, "");
		}
		// -------------------------
		_logger.info("資料長度 : " + T_01_0002_List.size());
		_logger.info("查詢 : T_01_0002 (End) _ 1 ");
		_logger.info("-----------------------------------------------");
		// -------------------------
		return new Lotto_Res_1(rtn_Message_1, rtn_Code_1, T_01_0002_List, "");
	}

	// -----------------------------------------------
	// "刪除" - T_01_0002 (未完成)
	@Override
	public Lotto_Res_1 Delete__T_01_0002(Lotto_Req_1 req) {
		// -------------------------
		_logger.info("-----------------------------------------------");
		_logger.info("假刪除 : T_01_0002 (Start)");
		_logger.info("方法名稱 : " + "Delete__T_01_0002");
		// -------------------------
		// 需求參數
		String T_01_0001_t_code_1 = req.getT_01_0001__t_code_1().trim();
		String T_01_0002_t_code_2 = req.getT_01_0002__t_code_2().trim();
		// -------------------------
		// 一般參數
		// 代碼_刪除布林值 - "Y"
		String delete_Bol = Lotto_RtnCode_3.Bol_Y.getSpecial_code_1();
		// 代碼_訊息
		String rtn_Message_1 = Lotto_RtnCode_1.SUCCESSFUL.getMessage();
		String rtn_Code_1 = Lotto_RtnCode_1.SUCCESSFUL.getCode();
		String rtn_Message_2 = Lotto_RtnCode_1.NOT_FOUND_DATA.getMessage();
		String rtn_Code_2 = Lotto_RtnCode_1.NOT_FOUND_DATA.getCode();
		// 日期時間
		LocalDateTime localDateTime = LocalDateTime.now();
		// T_01_0002
		T_01_0002 t_01_0002 = new T_01_0002();
		// -------------------------
		// 邏輯處理
		// 還需要處理其他檢查，以及連同其他表一起刪除。
		// 抓資料 - T_01_0002
		Optional<T_01_0002> t_01_0002_O = t_01_0002_Dao.findByTableCode1AndTableCode2(T_01_0001_t_code_1,
				T_01_0002_t_code_2);
		// 是null會掉進去 (應該不會)
		if (!t_01_0002_O.isPresent()) {
			_logger.info("資料找不到。已被彈出該方法");
			return new Lotto_Res_1(rtn_Message_2, rtn_Code_2);
		}
		t_01_0002 = t_01_0002_O.get();
		t_01_0002.setTableDate2(localDateTime);
		t_01_0002.setDeleteBol(delete_Bol);
		// 儲存
		t_01_0002 = t_01_0002_Dao.save(t_01_0002);
		// -------------------------
		_logger.info("流水號 : " + t_01_0002.getTableSerialNumber1());
		_logger.info("編碼_1 : " + t_01_0002.getTableCode1());
		_logger.info("編碼_2 : " + t_01_0002.getTableCode2());
		_logger.info("描述_1 : " + t_01_0002.getTableDescribe1());
		_logger.info("描述_2 : " + t_01_0002.getTableDescribe2());
		_logger.info("刪除 : " + t_01_0002.getDeleteBol());
		_logger.info("假刪除 : T_01_0002 (End)");
		_logger.info("-----------------------------------------------");
		// -------------------------
		return new Lotto_Res_1(rtn_Message_1, rtn_Code_1, t_01_0002);
	}

	// -----------------------------------------------
	// "新增" - T_01_0003
	@Override
	public Lotto_Res_1 Create__T_01_0003(Lotto_Req_1 req) {
		// -------------------------
		_logger.info("-----------------------------------------------");
		_logger.info("新增 : T_01_0003 (Start)");
		_logger.info("方法名稱 : " + "Create__T_01_0003");
		// -------------------------
		// 需求參數
		// T_01_0001
		String T_01_0001_t_code_1 = req.getT_01_0001__t_code_1().trim();
		// T_01_0002
		String T_01_0002_t_code_2 = req.getT_01_0002__t_code_2().trim();
		// T_01_0003
		String T_01_0003__t_describe_1 = req.getT_01_0003__t_describe_1().trim();
		String T_01_0003__t_describe_2 = req.getT_01_0003__t_describe_2().trim();
		String T_01_0003__t_describe_3 = req.getT_01_0003__t_describe_3().trim();
		String T_01_0003__t_describe_4 = req.getT_01_0003__t_describe_4().trim();
		String T_01_0003__t_special_treatment_1 = req.getT_01_0003__t_special_treatment_1().trim();
		int T_01_0003__total_several_numbers = req.getT_01_0003__total_several_numbers();
		int T_01_0003__winning_several_numbers = req.getT_01_0003__winning_several_numbers();
		int T_01_0003__top_winning_total_several_numbers = req.getT_01_0003__top_winning_total_several_numbers();
		int T_01_0003__special_total_several_numbers = req.getT_01_0003__special_total_several_numbers();
		int T_01_0003__generally_total_several_numbers = req.getT_01_0003__generally_total_several_numbers();
		int lorroPrice = req.getLottoPrice();
		// -------------------------
		// 一般參數
		// 代碼_刪除布林值 - "N"
		String delete_Bol = Lotto_RtnCode_3.Bol_N.getSpecial_code_1();
		String T_01_0001__T_CODE_1__01 = Lotto_RtnCode_3.T_01_0001__T_CODE_1__01.getSpecial_code_1();
		// 代碼_訊息
		String rtn_Message_1 = Lotto_RtnCode_1.SUCCESSFUL.getMessage();
		String rtn_Code_1 = Lotto_RtnCode_1.SUCCESSFUL.getCode();
		String rtn_Message_2 = Lotto_RtnCode_1.ERROR_DATA.getMessage();
		String rtn_Code_2 = Lotto_RtnCode_1.ERROR_DATA.getCode();
		String rtn_Message_3 = Lotto_RtnCode_1.DUPLICATE_DATA.getMessage();
		String rtn_Code_3 = Lotto_RtnCode_1.DUPLICATE_DATA.getCode();
		// 代碼_表名
		String T_01_0003_table_name = Lotto_RtnCode_2.T_01_0003.getTable_name();
		// 日期時間
		LocalDateTime localDateTime = LocalDateTime.now();
		List<Integer> numberList_1 = Arrays.asList(T_01_0003__total_several_numbers, T_01_0003__winning_several_numbers,
				T_01_0003__top_winning_total_several_numbers, T_01_0003__generally_total_several_numbers, lorroPrice);
		// T_01_0003
		T_01_0003 t_01_0003 = new T_01_0003();
		// -------------------------
		// 邏輯處理
		Optional<T_01_0003> t_01_0003_O = t_01_0003_Dao.findByTableCode1AndTableCode2(T_01_0001_t_code_1,
				T_01_0002_t_code_2);
		// != "01"<樂透代碼> (應該不會)
		if (!T_01_0001_t_code_1.equals(T_01_0001__T_CODE_1__01)) {
			_logger.info("資料不正確。已被彈出該方法");
			return new Lotto_Res_1(rtn_Message_2, rtn_Code_2);
		}
		// 不是null會掉進去 (應該不會)
		if (t_01_0003_O.isPresent()) {
			_logger.info("資料重複。已被彈出該方法");
			t_01_0003 = t_01_0003_O.get();
			return new Lotto_Res_1(rtn_Message_3, rtn_Code_3, t_01_0003);
		}
		// 檢查數字
		boolean checkNumber_1 = checkNumber_1(numberList_1, true);
		boolean checkNumber_2 = checkNumber_2(T_01_0003__total_several_numbers, T_01_0003__winning_several_numbers,
				T_01_0003__top_winning_total_several_numbers, T_01_0003__special_total_several_numbers,
				T_01_0003__generally_total_several_numbers);
		if (checkNumber_2 == false || checkNumber_1 == false) {
			_logger.info("資料不正確。已被彈出該方法");
			return new Lotto_Res_1(rtn_Message_2, rtn_Code_2);
		}
		// 處理該表流水號
		Lotto_Res_1 lotto_Res_1 = Create_Update__T_00_0001(T_01_0003_table_name);
		int T_01_0003_t_serialNumber_1 = lotto_Res_1.getT_00_0001().getTableSerialNumber1();
		// 流水號、編碼1、編碼2、描述1、描述2、描述3、描述4、號碼總數量、中獎號碼數量(至少中獎號碼數量)、頭獎號碼數量、特別號碼數量、一般號碼數量、時間1、時間2、價格、表名、特殊處理、刪除布林值
		t_01_0003 = new T_01_0003(T_01_0003_t_serialNumber_1, T_01_0001_t_code_1, T_01_0002_t_code_2,
				T_01_0003__t_describe_1, T_01_0003__t_describe_2, T_01_0003__t_describe_3, T_01_0003__t_describe_4,
				T_01_0003__total_several_numbers, T_01_0003__winning_several_numbers,
				T_01_0003__top_winning_total_several_numbers, T_01_0003__special_total_several_numbers,
				T_01_0003__generally_total_several_numbers, localDateTime, localDateTime, lorroPrice,
				T_01_0003_table_name, T_01_0003__t_special_treatment_1, delete_Bol);
		// 儲存
		t_01_0003 = t_01_0003_Dao.save(t_01_0003);
		// -------------------------
		_logger.info("流水號 : " + t_01_0003.getTableSerialNumber1());
		_logger.info("編碼_1 : " + t_01_0003.getTableCode1());
		_logger.info("編碼_2 : " + t_01_0003.getTableCode2());
		_logger.info("描述_1 : " + t_01_0003.getTableDescribe1());
		_logger.info("描述_2 : " + t_01_0003.getTableDescribe2());
		_logger.info("特殊處理 : " + t_01_0003.getTableSpecialTreatment1());
		_logger.info("新增 : T_01_0003 (End)");
		_logger.info("-----------------------------------------------");
		// -------------------------
		return new Lotto_Res_1(rtn_Message_1, rtn_Code_1, t_01_0003);
	}

	// -----------------------------------------------
	// "修改" - T_01_0003
	@Override
	public Lotto_Res_1 Update__T_01_0003(Lotto_Req_1 req) {
		// -------------------------
		_logger.info("-----------------------------------------------");
		_logger.info("修改 : T_01_0003 (Start)");
		_logger.info("方法名稱 : " + "Update__T_01_0003");
		// -------------------------
		// 需求參數
		// T_01_0001
		String T_01_0001_t_code_1 = req.getT_01_0001__t_code_1().trim();
		// T_01_0002
		String T_01_0002_t_code_2 = req.getT_01_0002__t_code_2().trim();
		// T_01_0003
		String T_01_0003__t_describe_1 = req.getT_01_0003__t_describe_1().trim();
		String T_01_0003__t_describe_2 = req.getT_01_0003__t_describe_2().trim();
		String T_01_0003__t_describe_3 = req.getT_01_0003__t_describe_3().trim();
		String T_01_0003__t_describe_4 = req.getT_01_0003__t_describe_4().trim();
		String T_01_0003__t_special_treatment_1 = req.getT_01_0003__t_special_treatment_1().trim();
		int T_01_0003__total_several_numbers = req.getT_01_0003__total_several_numbers();
		int T_01_0003__winning_several_numbers = req.getT_01_0003__winning_several_numbers();
		int T_01_0003__top_winning_total_several_numbers = req.getT_01_0003__top_winning_total_several_numbers();
		int T_01_0003__special_total_several_numbers = req.getT_01_0003__special_total_several_numbers();
		int T_01_0003__generally_total_several_numbers = req.getT_01_0003__generally_total_several_numbers();
		int lorroPrice = req.getLottoPrice();
		// -------------------------
		// 一般參數
		// 代碼_訊息
		String rtn_Message_1 = Lotto_RtnCode_1.SUCCESSFUL.getMessage();
		String rtn_Code_1 = Lotto_RtnCode_1.SUCCESSFUL.getCode();
		String rtn_Message_2 = Lotto_RtnCode_1.NOT_FOUND_DATA.getMessage();
		String rtn_Code_2 = Lotto_RtnCode_1.NOT_FOUND_DATA.getCode();
		String rtn_Message_3 = Lotto_RtnCode_1.ERROR_DATA.getMessage();
		String rtn_Code_3 = Lotto_RtnCode_1.ERROR_DATA.getCode();
		String T_01_0001__T_CODE_1__01 = Lotto_RtnCode_3.T_01_0001__T_CODE_1__01.getSpecial_code_1();
		// 日期時間
		LocalDateTime localDateTime = LocalDateTime.now();
		// T_01_0003
		T_01_0003 t_01_0003 = new T_01_0003();
		List<Integer> numberList_1 = Arrays.asList(T_01_0003__total_several_numbers, T_01_0003__winning_several_numbers,
				T_01_0003__top_winning_total_several_numbers, T_01_0003__generally_total_several_numbers, lorroPrice);
		// -------------------------
		// 邏輯處理
		Optional<T_01_0003> t_01_0003_O = t_01_0003_Dao.findByTableCode1AndTableCode2(T_01_0001_t_code_1,
				T_01_0002_t_code_2);
		// != "01"<樂透代碼> (應該不會)
		if (!T_01_0001_t_code_1.equals(T_01_0001__T_CODE_1__01)) {
			_logger.info("資料不正確。已被彈出該方法");
			return new Lotto_Res_1(rtn_Message_3, rtn_Code_3);
		}
		// 是null會掉進去 (應該不會)
		if (!t_01_0003_O.isPresent()) {
			_logger.info("資料找不到。已被彈出該方法");
			return new Lotto_Res_1(rtn_Message_2, rtn_Code_2, t_01_0003);
		}
		// 檢查數字
		boolean checkNumber_1 = checkNumber_1(numberList_1, true);
		boolean checkNumber_2 = checkNumber_2(T_01_0003__total_several_numbers, T_01_0003__winning_several_numbers,
				T_01_0003__top_winning_total_several_numbers, T_01_0003__special_total_several_numbers,
				T_01_0003__generally_total_several_numbers);
		if (checkNumber_2 == false || checkNumber_1 == false) {
			_logger.info("資料不正確。已被彈出該方法");
			return new Lotto_Res_1(rtn_Message_3, rtn_Code_3);
		}
		// 抓到原有資料
		t_01_0003 = t_01_0003_O.get();
		// 描述1、描述2、描述3、描述4、時間2、特殊處理、號碼總數量、中獎號碼數量(至少中獎號碼數量)、頭獎號碼數量、特別號碼數量、一般號碼數量、價格
		t_01_0003.setTableDescribe1(T_01_0003__t_describe_1);
		t_01_0003.setTableDescribe2(T_01_0003__t_describe_2);
		t_01_0003.setTableDescribe3(T_01_0003__t_describe_3);
		t_01_0003.setTableDescribe4(T_01_0003__t_describe_4);
		t_01_0003.setTableDate2(localDateTime);
		t_01_0003.setTableSpecialTreatment1(T_01_0003__t_special_treatment_1);
		t_01_0003.setTotalSeveralNumbers(T_01_0003__total_several_numbers);
		t_01_0003.setWinningSeveralNumbers(T_01_0003__winning_several_numbers);
		t_01_0003.setTopWinningTotalSeveralNumbers(T_01_0003__top_winning_total_several_numbers);
		t_01_0003.setSpecialTotalSeveralNumbers(T_01_0003__special_total_several_numbers);
		t_01_0003.setGenerallyTotalSeveralNumbers(T_01_0003__generally_total_several_numbers);
		t_01_0003.setLottoPrice(lorroPrice);
		// 儲存
		t_01_0003 = t_01_0003_Dao.save(t_01_0003);
		// -------------------------
		_logger.info("流水號 : " + t_01_0003.getTableSerialNumber1());
		_logger.info("編碼_1 : " + t_01_0003.getTableCode1());
		_logger.info("編碼_2 : " + t_01_0003.getTableCode2());
		_logger.info("描述_1 : " + t_01_0003.getTableDescribe1());
		_logger.info("描述_2 : " + t_01_0003.getTableDescribe2());
		_logger.info("修改 : T_01_0003 (End)");
		_logger.info("-----------------------------------------------");
		// -------------------------
		return new Lotto_Res_1(rtn_Message_1, rtn_Code_1, t_01_0003);
	}

	// -----------------------------------------------
	// "查詢" - T_01_0003 - 1
	@Override
	public Lotto_Res_1 Search__T_01_0003___1(Lotto_Req_1 req) {
		// -------------------------
		_logger.info("-----------------------------------------------");
		_logger.info("查詢 : T_01_0003 (Start) _ 1 ");
		_logger.info("方法名稱 : " + "Search__T_01_0003___1");
		// -------------------------
		// 需求參數
		String T_01_0001_t_code_1 = req.getT_01_0001__t_code_1().trim();
		String T_01_0002_t_code_2 = req.getT_01_0002__t_code_2().trim();
		String t_describe = req.getT_describe().trim();
		t_describe = "%" + t_describe + "%";
		// -------------------------
		// 一般參數
		// 訊息
		String rtn_Message_1 = Lotto_RtnCode_1.SUCCESSFUL.getMessage();
		String rtn_Code_1 = Lotto_RtnCode_1.SUCCESSFUL.getCode();
		String rtn_Message_2 = Lotto_RtnCode_1.NOT_FOUND_DATA.getMessage();
		String rtn_Code_2 = Lotto_RtnCode_1.NOT_FOUND_DATA.getCode();
		// 資料
		List<T_01_0003> T_01_0003_List = t_01_0003_Dao.search_By_TableCode1_TableCode2_TableDescribe(T_01_0001_t_code_1,
				T_01_0002_t_code_2, t_describe);
		// -------------------------
		// 邏輯處理
		T_01_0003_List = FilterList__T_01_0003___1(T_01_0003_List);
		if (T_01_0003_List.size() == 0) {
			_logger.info("資料長度為 0 。已被彈出該方法");
			return new Lotto_Res_1(rtn_Message_2, rtn_Code_2, T_01_0003_List, "", "");
		}
		// -------------------------
		_logger.info("資料長度 : " + T_01_0003_List.size());
		_logger.info("查詢 : T_01_0003 (End) _ 1 ");
		_logger.info("-----------------------------------------------");
		// -------------------------
		return new Lotto_Res_1(rtn_Message_1, rtn_Code_1, T_01_0003_List, "", "");
	}

	// -----------------------------------------------
	// "新增"(C) - T_01_0004 (排程)
	@Override
	public Lotto_Res_1 Create__T_01_0004(Lotto_Req_1 req) {
		// -------------------------
		_logger.info("-----------------------------------------------");
		_logger.info("新增 : T_01_0004 (Start)");
		_logger.info("方法名稱 : " + "Create__T_01_0004");
		// -------------------------
		// -------------------------
		// 需求參數
		// -------------------------
		// -------------------------
		// 一般參數
		// 代碼_刪除布林值 - "N"
		String delete_Bol = Lotto_RtnCode_3.Bol_N.getSpecial_code_1();
		// 代碼_訊息
		String rtn_Message_1 = Lotto_RtnCode_1.SUCCESSFUL.getMessage();
		String rtn_Code_1 = Lotto_RtnCode_1.SUCCESSFUL.getCode();
		String rtn_Message_2 = Lotto_RtnCode_1.NOT_FOUND_DATA.getMessage();
		String rtn_Code_2 = Lotto_RtnCode_1.NOT_FOUND_DATA.getCode();
		// 代碼_表名
		String t_01_0004_table_name = Lotto_RtnCode_2.T_01_0004.getTable_name();
		// 代碼_TableCode
		String t_01_0002__02 = Lotto_RtnCode_3.T_01_0002__T_CODE_1__02.getSpecial_code_1();
		String t_01_0002__02_A = Lotto_RtnCode_3.T_01_0002__T_CODE_1__02_A.getSpecial_code_1();
		String t_01_0002__02_B = Lotto_RtnCode_3.T_01_0002__T_CODE_1__02_B.getSpecial_code_1();
		// 代碼_樂透起始數字
		int startNumber = Integer.valueOf(Lotto_RtnCode_3.START_NUMBER.getSpecial_code_1());
		// 資料
		List<T_01_0003> t_01_0003_List = t_01_0003_Dao.findAll();
		// T_01_0004
		T_01_0004 t_01_0004 = new T_01_0004();
		// -------------------------
		// 邏輯處理
		t_01_0003_List = FilterList__T_01_0003___1(t_01_0003_List);
		if (t_01_0003_List.size() == 0) {
			_logger.info("資料長度為 0 。已被彈出該方法");
			return new Lotto_Res_1(rtn_Message_2, rtn_Code_2, t_01_0004);
		}
		for (T_01_0003 item : t_01_0003_List) {
			List<Integer> numberSetList = new ArrayList<Integer>();
			while (true) {
				int randomNumber = getRandomNumber(startNumber, item.getTotalSeveralNumbers());
				if (numberSetList.contains(randomNumber)) {
					continue;
				}
				numberSetList.add(randomNumber);
				if (numberSetList.size() == item.getTopWinningTotalSeveralNumbers()) {
					break;
				}

			}

		}

		return null;
	}

	// -----------------------------------------------
	// ==============================================================================================================
	// -----------------------------------------------
	// (私有方法)
	// "新增"或"修改" - T_00_0001
	private Lotto_Res_1 Create_Update__T_00_0001(String req_table_name) {
		// -------------------------
		_logger.info("-----------------------------------------------");
		_logger.info("新增 修改 : T_00_0001 (Start)");
		_logger.info("方法名稱 : " + "Create_Update__T_00_0001");
		// -------------------------
		// 參數
		String table_name = req_table_name;
		Optional<T_00_0001> t_00_0001_O = t_00_0001_Dao.findById(table_name);
		LocalDateTime localDateTime = LocalDateTime.now();
		T_00_0001 t_00_0001 = new T_00_0001();
		String rtn_Message = Lotto_RtnCode_1.SUCCESSFUL.getMessage();
		String rtn_Code = Lotto_RtnCode_1.SUCCESSFUL.getCode();
		// -------------------------
		// 邏輯處理
		// null 會掉進去
		if (!t_00_0001_O.isPresent()) {
			// 新增
			t_00_0001 = new T_00_0001(table_name, 1, localDateTime, localDateTime, "");
		} else {
			// 修改
			t_00_0001 = t_00_0001_O.get();
			t_00_0001.setTableSerialNumber1((t_00_0001.getTableSerialNumber1() + 1));
			t_00_0001.setTableDate2(localDateTime);
			t_00_0001.setTableUser("");
		}
		t_00_0001 = t_00_0001_Dao.save(t_00_0001);
		// -------------------------
		_logger.info("Table : " + t_00_0001.getTableName());
		_logger.info("流水號 : " + t_00_0001.getTableSerialNumber1());
		_logger.info("新增 修改 : T_00_0001 (End)");
		_logger.info("-----------------------------------------------");
		// -------------------------
		return new Lotto_Res_1(rtn_Message, rtn_Code, t_00_0001);
	}

	// -----------------------------------------------
	// 過濾_1 - T_01_0001
	// 篩選"刪除布林值" = "N"
	private List<T_01_0001> FilterList__T_01_0001___1(List<T_01_0001> list) {
		List<T_01_0001> newList = new ArrayList<T_01_0001>();
		String delete_Bol = Lotto_RtnCode_3.Bol_N.getSpecial_code_1();
		for (T_01_0001 item : list) {
			if (item.getDeleteBol().equals(delete_Bol)) {
				newList.add(item);
			}
		}
		return newList;

	}

	// -----------------------------------------------
	// 過濾_1 - T_01_0002
	// 篩選"刪除布林值" = "N"
	private List<T_01_0002> FilterList__T_01_0002___1(List<T_01_0002> list) {
		List<T_01_0002> newList = new ArrayList<T_01_0002>();
		String delete_Bol = Lotto_RtnCode_3.Bol_N.getSpecial_code_1();
		for (T_01_0002 item : list) {
			if (item.getDeleteBol().equals(delete_Bol)) {
				newList.add(item);
			}
		}
		return newList;
	}

	// -----------------------------------------------
	// 過濾_1 - T_01_0003
	// 篩選"刪除布林值" = "N"
	private List<T_01_0003> FilterList__T_01_0003___1(List<T_01_0003> list) {
		List<T_01_0003> newList = new ArrayList<T_01_0003>();
		String delete_Bol = Lotto_RtnCode_3.Bol_N.getSpecial_code_1();
		for (T_01_0003 item : list) {
			if (item.getDeleteBol().equals(delete_Bol)) {
				newList.add(item);
			}
		}
		return newList;
	}

	// -----------------------------------------------
	// 檢查數字_1 - 有沒有小於 0 或 = 0
	private boolean checkNumber_1(List<Integer> list, boolean lessThanZero) {
		if (lessThanZero == true) {
			// 小於、等於 0
			for (int item : list) {
				if (item <= 0) {
					return false;
				}
			}
		} else {
			// 小於 0
			for (int item : list) {
				if (item < 0) {
					return false;
				}
			}
		}
		return true;
	}

	// -----------------------------------------------
	// 檢查數字_2 - 號碼數量正確 Ps. 基於大樂透標準下去檢查
	private boolean checkNumber_2(int total_several_numbers, int winning_several_numbers,
			int top_winning_total_several_numbers, int special_total_several_numbers,
			int generally_total_several_numbers) {
		// 頭獎號碼數量 != (一般號數量)
		if (top_winning_total_several_numbers != (generally_total_several_numbers)) {
			return false;
		}
		// 中獎號碼數量 > 頭獎號碼數量
		if (winning_several_numbers > top_winning_total_several_numbers) {
			return false;
		}
		// 頭獎號碼數量 > 號碼總數
		if (top_winning_total_several_numbers > total_several_numbers) {
			return false;
		}
		return true;

	}

	// -----------------------------------------------
	// 產生隨機數字
	private int getRandomNumber(int start, int end) {
		// (應該不會)
		if (start >= end) {
			return -1;
		}
		Random random = new Random();
		return random.nextInt(end - start + 1) + start;
	}

	// -----------------------------------------------
	// 排程 - 範例
//	@Scheduled(cron = "* * * * * *")
//	public void schedulePrintDate() {
//		System.out.println("排程");
//	}

}
