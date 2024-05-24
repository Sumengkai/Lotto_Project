package com.example.Lotto_Project.Service.Impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.Lotto_Project.Constants.Lotto_RtnCode_1;
import com.example.Lotto_Project.Constants.Lotto_RtnCode_2;
import com.example.Lotto_Project.Constants.Lotto_RtnCode_3;
import com.example.Lotto_Project.Constants.Lotto_RtnCode_4;
import com.example.Lotto_Project.Constants.Lotto_RtnCode_5;
import com.example.Lotto_Project.Entity.T_00_0001;
import com.example.Lotto_Project.Entity.T_01_0001;
import com.example.Lotto_Project.Entity.T_01_0002;
import com.example.Lotto_Project.Entity.T_01_0003;
import com.example.Lotto_Project.Entity.T_01_0004;
import com.example.Lotto_Project.Entity.T_01_0005;
import com.example.Lotto_Project.Entity.T_03_0001;
import com.example.Lotto_Project.Repository.T_00_0001_Dao;
import com.example.Lotto_Project.Repository.T_01_0001_Dao;
import com.example.Lotto_Project.Repository.T_01_0002_Dao;
import com.example.Lotto_Project.Repository.T_01_0003_Dao;
import com.example.Lotto_Project.Repository.T_01_0004_Dao;
import com.example.Lotto_Project.Repository.T_01_0005_Dao;
import com.example.Lotto_Project.Repository.T_03_0001_Dao;
import com.example.Lotto_Project.Service.Interface.Lotto_Service_1;
import com.example.Lotto_Project.Service.Interface.Lotto_Service_2;
import com.example.Lotto_Project.Vo.Req.Lotto_Req_1;
import com.example.Lotto_Project.Vo.Res.Lotto_Res_1;
import com.mysql.cj.log.Log;

// -----------------------------------------------
@Service
public class Lotto_Impl_1 implements Lotto_Service_1 {
	// -----------------------------------------------
	// Log所需參數
	private static final Logger _logger = LoggerFactory.getLogger(Lotto_Impl_1.class);
	// 對密碼進行加密參數
	private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
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
	// 樂透開幾紀錄table - 號碼
	@Autowired
	T_01_0004_Dao t_01_0004_Dao;
	// -------------------------
	// 樂透開幾紀錄table - 樂透
	@Autowired
	T_01_0005_Dao t_01_0005_Dao;
	// -------------------------
	// 用戶帳號密碼管理table
	@Autowired
	T_03_0001_Dao t_03_0001_Dao;
	// -------------------------
	// 信箱要用到的接口
	@Autowired
	JavaMailSender mailSender;
	// -------------------------
	// 管理寄信方法
	@Autowired
	Lotto_Service_2 lotto_Service_2;

	// ==========================================================================
	// T_01_0001
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
		String delete_Bol = Lotto_RtnCode_3.DELETE_Bol_N.getSpecial_code_1();
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
		String delete_Bol = Lotto_RtnCode_3.DELETE_Bol_Y.getSpecial_code_1();
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

	// ==========================================================================
	// T_01_0002
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
		String delete_Bol = Lotto_RtnCode_3.DELETE_Bol_N.getSpecial_code_1();
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
		String delete_Bol = Lotto_RtnCode_3.DELETE_Bol_Y.getSpecial_code_1();
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

	// ==========================================================================
	// T_01_0003
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
		int T_01_0003__openNumbers = req.getOpenNumbers();
		int lorroPrice = req.getLottoPrice();
		// -------------------------
		// 一般參數
		// 代碼_刪除布林值 - "N"
		String delete_Bol = Lotto_RtnCode_3.DELETE_Bol_N.getSpecial_code_1();
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
				T_01_0003__top_winning_total_several_numbers, T_01_0003__generally_total_several_numbers, lorroPrice,
				T_01_0003__openNumbers);
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
				T_01_0003__generally_total_several_numbers, T_01_0003__openNumbers);
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
				T_01_0003__generally_total_several_numbers, T_01_0003__openNumbers, localDateTime, localDateTime,
				lorroPrice, T_01_0003_table_name, T_01_0003__t_special_treatment_1, delete_Bol);
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
		int T_01_0003__openNumbers = req.getOpenNumbers();
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
				T_01_0003__top_winning_total_several_numbers, T_01_0003__generally_total_several_numbers, lorroPrice,
				T_01_0003__openNumbers);
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
				T_01_0003__generally_total_several_numbers, T_01_0003__openNumbers);
		if (checkNumber_2 == false || checkNumber_1 == false) {
			_logger.info("資料不正確。已被彈出該方法");
			return new Lotto_Res_1(rtn_Message_3, rtn_Code_3);
		}
		// 抓到原有資料
		t_01_0003 = t_01_0003_O.get();
		// 描述1、描述2、描述3、描述4、時間2、特殊處理、號碼總數量、中獎號碼數量(至少中獎號碼數量)、頭獎號碼數量、特別號碼數量、一般號碼數量、價格、開獎號碼數量
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
		t_01_0003.setOpenNumbers(T_01_0003__openNumbers);
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

	// ==========================================================================
	// T_01_0005
	// -----------------------------------------------
	// "新增"(C) - T_01_0005 Ps. 開樂透期數 (排程)
	@Override
	public Lotto_Res_1 Create__T_01_0005() {
		// -------------------------
		_logger.info("-----------------------------------------------");
		_logger.info("新增 : T_01_0005 (Start)");
		_logger.info("方法名稱 : " + "Create__T_01_0005");
		// -------------------------
		// 需求參數
		// -------------------------
		// 一般參數
		// 代碼_刪除布林值 - "N"
		String delete_Bol = Lotto_RtnCode_3.DELETE_Bol_N.getSpecial_code_1();
		// 代碼_訊息
		String rtn_Message_1 = Lotto_RtnCode_1.SUCCESSFUL.getMessage();
		String rtn_Code_1 = Lotto_RtnCode_1.SUCCESSFUL.getCode();
		String rtn_Message_2 = Lotto_RtnCode_1.NOT_FOUND_DATA.getMessage();
		String rtn_Code_2 = Lotto_RtnCode_1.NOT_FOUND_DATA.getCode();
		// 代碼_表名
		String t_01_0005_table_name = Lotto_RtnCode_2.T_01_0005.getTable_name();
		// 資料
		List<T_01_0003> t_01_0003_List = t_01_0003_Dao.findAll();
		// 日期時間
		LocalDateTime localDateTime = LocalDateTime.now();
		// T_01_0005
		T_01_0005 t_01_0005 = new T_01_0005();
		List<T_01_0005> t_01_0005_List = new ArrayList<T_01_0005>();
		// -------------------------
		if (t_01_0003_List.size() == 0) {
			_logger.info("資料長度為 0 。已被彈出該方法");
			return new Lotto_Res_1(rtn_Message_2, rtn_Code_2, t_01_0005);
		}
		// 邏輯處理
		for (T_01_0003 item : t_01_0003_List) {
			String tableCode1 = item.getTableCode1();
			String tableCode2 = item.getTableCode2();
			// 最大期數
			int lottoSort = getLottoSort(tableCode1, tableCode2);
			String tableDescribe1 = "第 " + lottoSort + " 期";
			String tableDescribe2 = "第 " + lottoSort + " 期(英文)";
			while (true) {
				UUID uuidPK = UUID.randomUUID();
				Optional<T_01_0005> t_01_0005_O = t_01_0005_Dao.findById(uuidPK);
				// 檢查有沒有產生重複的UUID
				// null 會掉進去
				if (!t_01_0005_O.isPresent()) {
					t_01_0005 = new T_01_0005(uuidPK, tableCode1, tableCode2, tableDescribe1, tableDescribe2, lottoSort,
							localDateTime, localDateTime, "", t_01_0005_table_name, delete_Bol);
					break;
				} else {
					continue;
				}
			}
			t_01_0005_List.add(t_01_0005);
		}
		t_01_0005_List = t_01_0005_Dao.saveAll(t_01_0005_List);
		// -------------------------
		_logger.info("新增 : T_01_0005 (End)");
		_logger.info("-----------------------------------------------");
		// -------------------------
		return new Lotto_Res_1(rtn_Message_1, rtn_Code_1, t_01_0005_List, "", "", "", "");
	}

	// -----------------------------------------------
	// "查詢"(R) - T_01_0005
	@Override
	public Lotto_Res_1 Search__T_01_0005___1(Lotto_Req_1 req) {
		// -------------------------
		_logger.info("-----------------------------------------------");
		_logger.info("查詢 : T_01_0005 (Start) _ 1 ");
		_logger.info("方法名稱 : " + "Search__T_01_0005___1");
		// -------------------------
		// 需求參數
		String T_01_0001_t_code_1 = req.getT_01_0001__t_code_1().trim();
		String T_01_0002_t_code_2 = req.getT_01_0002__t_code_2().trim();
		String t_startDate = req.getT_startDate().trim();
		String t_endDate = req.getT_endDate().trim();
		int lorroSort = req.getT_01_0005__lottoSort();
		// 處理需求參數
		t_startDate = t_startDate.equals("") || t_startDate == null ? "1000-01-01" : t_startDate;
		t_endDate = t_endDate.equals("") || t_endDate == null ? "9999-12-31" : t_endDate;
		t_startDate = t_startDate + " 00:00:00";
		t_endDate = t_endDate + " 23:59:59";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime startDateTime = LocalDateTime.parse(t_startDate, formatter);
		LocalDateTime endDateTime = LocalDateTime.parse(t_endDate, formatter);
		// -------------------------
		// 一般參數
		// 訊息
		String rtn_Message_1 = Lotto_RtnCode_1.SUCCESSFUL.getMessage();
		String rtn_Code_1 = Lotto_RtnCode_1.SUCCESSFUL.getCode();
		String rtn_Message_2 = Lotto_RtnCode_1.NOT_FOUND_DATA.getMessage();
		String rtn_Code_2 = Lotto_RtnCode_1.NOT_FOUND_DATA.getCode();
		List<T_01_0005> t_01_0005_List = null;
		try {
			t_01_0005_List = t_01_0005_Dao.search_By_TableCode1_TableCode2_TableDescribe_StartDate_EndDate(
					T_01_0001_t_code_1, T_01_0002_t_code_2, lorroSort, startDateTime, endDateTime);
		} catch (Exception e) {
			System.out.println("錯誤訊息 : " + e);
		}
		t_01_0005_List = FilterList__T_01_0005___1(t_01_0005_List);
		if (t_01_0005_List.size() == 0) {
			_logger.info("資料長度為 0 。已被彈出該方法");
			return new Lotto_Res_1(rtn_Message_2, rtn_Code_2, t_01_0005_List, "", "", "", "");
		}
		// -------------------------
		_logger.info("資料長度 : " + t_01_0005_List.size());
		_logger.info("查詢 : T_01_0005 (End) _ 1 ");
		_logger.info("-----------------------------------------------");
		// -------------------------
		return new Lotto_Res_1(rtn_Message_1, rtn_Code_1, t_01_0005_List, "", "", "", "");
	}

	// ==========================================================================
	// T_01_0004
	// -----------------------------------------------
	// "查詢"(R) - T_01_0004
	@Override
	public Lotto_Res_1 Search__T_01_0004___1(Lotto_Req_1 req) {
		// -------------------------
		_logger.info("-----------------------------------------------");
		_logger.info("查詢 : T_01_0004 (Start) _ 1 ");
		_logger.info("方法名稱 : " + "Search__T_01_0004___1");
		// -------------------------
		// 需求參數
		String t_01_0005__t_uuid_1 = req.getT_01_0005__t_uuid_1().trim();
		// -------------------------
		// 一般參數
		// 訊息
		String rtn_Message_1 = Lotto_RtnCode_1.SUCCESSFUL.getMessage();
		String rtn_Code_1 = Lotto_RtnCode_1.SUCCESSFUL.getCode();
		String rtn_Message_2 = Lotto_RtnCode_1.NOT_FOUND_DATA.getMessage();
		String rtn_Code_2 = Lotto_RtnCode_1.NOT_FOUND_DATA.getCode();
		List<T_01_0004> t_01_0004_List = null;
		try {
			t_01_0004_List = t_01_0004_Dao.search_By_TableUuid1(t_01_0005__t_uuid_1);
		} catch (Exception e) {
			_logger.info("提醒錯誤訊息 : " + e);
		}
		t_01_0004_List = FilterList__T_01_0004___1(t_01_0004_List);
		if (t_01_0004_List.size() == 0) {
			_logger.info("資料長度為 0 。已被彈出該方法");
			return new Lotto_Res_1(rtn_Message_2, rtn_Code_2, t_01_0004_List, "", "", "");
		}
		// -------------------------
		_logger.info("資料長度 : " + t_01_0004_List.size());
		_logger.info("查詢 : T_01_0004 (End) _ 1 ");
		_logger.info("-----------------------------------------------");
		// -------------------------
		return new Lotto_Res_1(rtn_Message_1, rtn_Code_1, t_01_0004_List, "", "", "");
	}

	// -----------------------------------------------
	// "新增"(C) - T_03_0001 Ps. 註冊
	@Override
	public Lotto_Res_1 Create__T_03_0001(Lotto_Req_1 req) {
		// -------------------------
		_logger.info("-----------------------------------------------");
		_logger.info("新增 : T_03_0001 (Start)");
		_logger.info("方法名稱 : " + "Create__T_03_0001");
		// -------------------------
		// 需求參數
		String userAccount = req.getUserAcount();
		String userPassword = passwordEncoder.encode(req.getUserPassword());
		String userName = req.getUserName();
		String userGender = req.getUserGender().trim();
		String userMail = req.getUserMail();
		String companyBol = req.getCompanyBol().trim();
		String t_03_0001__t_special_treatment_1 = req.getT_03_0001__t_special_treatment_1();
		// -------------------------
		// 一般參數
		// 代碼_刪除布林值 - "N"
		String delete_Bol = Lotto_RtnCode_3.DELETE_Bol_N.getSpecial_code_1();
		// 代碼_訊息
		String rtn_Message_1 = Lotto_RtnCode_1.SUCCESSFUL.getMessage();
		String rtn_Code_1 = Lotto_RtnCode_1.SUCCESSFUL.getCode();
		String rtn_Message_2 = Lotto_RtnCode_1.DUPLICATE_DATA.getMessage();
		String rtn_Code_2 = Lotto_RtnCode_1.DUPLICATE_DATA.getCode();
		String rtn_Message_3 = Lotto_RtnCode_1.ERROR_DATA.getMessage();
		String rtn_Code_3 = Lotto_RtnCode_1.ERROR_DATA.getCode();
		// 代碼_TableCode
		String t_01_0002__03 = Lotto_RtnCode_3.T_01_0002__T_CODE_1__03.getSpecial_code_1();
		String t_01_0002__02 = Lotto_RtnCode_3.T_01_0002__T_CODE_1__02.getSpecial_code_1();
		// 日期時間
		LocalDateTime localDateTime = LocalDateTime.now();
		// T_03_0001
		T_03_0001 t_03_0001 = new T_03_0001();
		// T_01_0002
		T_01_0002 t_01_0002 = new T_01_0002();
		// 檢查字串的List
		List<String> checkStringList = Arrays.asList(userAccount, userName, userGender, userMail, userPassword,
				companyBol);
		boolean checkInT_01_0002 = true;
		// -------------------------
		// 邏輯處理
		Optional<T_03_0001> t_03_0001_O = t_03_0001_Dao.findByUserAccount(userAccount);
		// 檢查有沒有存在 - T_01_0002 表裡
		try {
			t_01_0002 = t_01_0002_Dao.findByTableCode1AndTableCode2(t_01_0002__03, userGender).get();
		} catch (Exception e) {
			checkInT_01_0002 = false;
			_logger.info("提醒錯誤訊息 : " + e);
		}
		try {
			t_01_0002 = t_01_0002_Dao.findByTableCode1AndTableCode2(t_01_0002__02, companyBol).get();
		} catch (Exception e) {
			checkInT_01_0002 = false;
			_logger.info("提醒錯誤訊息 : " + e);
		}
		// 是null會掉進去 (應該不會)
		if (checkInT_01_0002 == false) {
			_logger.info("資料錯誤。已被彈出該方法");
			return new Lotto_Res_1(rtn_Message_3, rtn_Code_3);
		}
		// 不是null會掉進去
		if (t_03_0001_O.isPresent()) {
			_logger.info("資料重複。已被彈出該方法");
			return new Lotto_Res_1(rtn_Message_2, rtn_Code_2);
		}
		// 檢查字串
		boolean checkString = checkString_1(checkStringList);
		if (checkString == false) {
			_logger.info("資料錯誤。已被彈出該方法");
			return new Lotto_Res_1(rtn_Message_3, rtn_Code_3);
		}
		while (true) {
			UUID tableUuid = UUID.randomUUID();
			t_03_0001_O = t_03_0001_Dao.findById(tableUuid);
			if (!t_03_0001_O.isPresent()) {
				t_03_0001 = new T_03_0001(tableUuid, userAccount, userPassword, userName, userGender, userMail,
						companyBol, localDateTime, localDateTime, t_03_0001__t_special_treatment_1, delete_Bol);
				break;
			}
		}
		// 儲存
		t_03_0001 = t_03_0001_Dao.save(t_03_0001);
		// -------------------------
		_logger.info("新增 : T_03_0001 (End)");
		_logger.info("-----------------------------------------------");
		// -------------------------
		return new Lotto_Res_1(rtn_Message_1, rtn_Code_1, t_03_0001);
	}

	// -----------------------------------------------
	// "修改"(U) - T_03_0001
	@Override
	public Lotto_Res_1 Update__T_03_0001(Lotto_Req_1 req) {
		// -------------------------
		_logger.info("-----------------------------------------------");
		_logger.info("修改 : T_03_0001 (Start)");
		_logger.info("方法名稱 : " + "Update__T_03_0001");
		// -------------------------
		// 需求參數
		String userAccount = req.getUserAcount();
		String userName = req.getUserName();
		String userGender = req.getUserGender().trim();
		String userMail = req.getUserMail();
		String companyBol = req.getCompanyBol().trim();
		String t_03_0001__t_special_treatment_1 = req.getT_03_0001__t_special_treatment_1();
		// -------------------------
		// 一般參數
		// 代碼_訊息
		String rtn_Message_1 = Lotto_RtnCode_1.SUCCESSFUL.getMessage();
		String rtn_Code_1 = Lotto_RtnCode_1.SUCCESSFUL.getCode();
		String rtn_Message_2 = Lotto_RtnCode_1.NOT_FOUND_DATA.getMessage();
		String rtn_Code_2 = Lotto_RtnCode_1.NOT_FOUND_DATA.getCode();
		String rtn_Message_3 = Lotto_RtnCode_1.ERROR_DATA.getMessage();
		String rtn_Code_3 = Lotto_RtnCode_1.ERROR_DATA.getCode();
		// 代碼_TableCode
		String t_01_0002__03 = Lotto_RtnCode_3.T_01_0002__T_CODE_1__03.getSpecial_code_1();
		String t_01_0002__02 = Lotto_RtnCode_3.T_01_0002__T_CODE_1__02.getSpecial_code_1();
		// 日期時間
		LocalDateTime localDateTime = LocalDateTime.now();
		// T_03_0001
		T_03_0001 t_03_0001 = new T_03_0001();
		// T_01_0002
		T_01_0002 t_01_0002 = new T_01_0002();
		// 檢查字串的List
		List<String> checkStringList = Arrays.asList(userAccount, userName, userGender, userMail, companyBol);
		boolean checkInT_01_0002 = true;
		// -------------------------
		// 邏輯處理
		Optional<T_03_0001> t_03_0001_O = t_03_0001_Dao.findByUserAccount(userAccount);
		// 檢查有沒有存在 - T_01_0002 表裡
		try {
			t_01_0002 = t_01_0002_Dao.findByTableCode1AndTableCode2(t_01_0002__03, userGender).get();
		} catch (Exception e) {
			checkInT_01_0002 = false;
			_logger.info("提醒錯誤訊息 : " + e);
		}
		try {
			t_01_0002 = t_01_0002_Dao.findByTableCode1AndTableCode2(t_01_0002__02, companyBol).get();
		} catch (Exception e) {
			checkInT_01_0002 = false;
			_logger.info("提醒錯誤訊息 : " + e);
		}
		// 是null會掉進去 (應該不會)
		if (checkInT_01_0002 == false) {
			_logger.info("資料錯誤。已被彈出該方法");
			return new Lotto_Res_1(rtn_Message_3, rtn_Code_3);
		}
		// 是null會掉進去
		if (!t_03_0001_O.isPresent()) {
			_logger.info("資料找不到。已被彈出該方法");
			return new Lotto_Res_1(rtn_Message_2, rtn_Code_2);
		}
		// 檢查字串
		boolean checkString = checkString_1(checkStringList);
		if (checkString == false) {
			_logger.info("資料錯誤。已被彈出該方法");
			return new Lotto_Res_1(rtn_Message_3, rtn_Code_3);
		}
		// 取資料
		t_03_0001 = t_03_0001_O.get();
		t_03_0001.setUserName(userName);
		t_03_0001.setUserGender(userGender);
		t_03_0001.setUserMail(userMail);
		t_03_0001.setCompanyBol(companyBol);
		t_03_0001.setTableSpecialTreatment1(t_03_0001__t_special_treatment_1);
		t_03_0001.setTableDate2(localDateTime);
		// 儲存
		t_03_0001 = t_03_0001_Dao.save(t_03_0001);
		// -------------------------
		_logger.info("修改 : T_03_0001 (End)");
		_logger.info("-----------------------------------------------");
		// -------------------------
		return new Lotto_Res_1(rtn_Message_1, rtn_Code_1, t_03_0001);
	}

	// -----------------------------------------------
	// "修改"(U) - T_03_0001 Ps. 修改密碼
	@Override
	public Lotto_Res_1 Update__UserPassword(Lotto_Req_1 req, HttpSession httpSession) {
		// -------------------------
		_logger.info("-----------------------------------------------");
		_logger.info("修改密碼 : T_03_0001 (Start)");
		_logger.info("方法名稱 : " + "Update__UserPassword");
		// -------------------------
		// 需求參數
		String userAccount = req.getUserAcount();
		String userPassword = passwordEncoder.encode(req.getUserPassword());
		String verificationCode = req.getVerificationCode();
		// -------------------------
		// 一般參數
		// 代碼_訊息
		String rtn_Message_1 = Lotto_RtnCode_1.SUCCESSFUL.getMessage();
		String rtn_Code_1 = Lotto_RtnCode_1.SUCCESSFUL.getCode();
		String rtn_Message_2 = Lotto_RtnCode_1.ERROR_DATA.getMessage();
		String rtn_Code_2 = Lotto_RtnCode_1.ERROR_DATA.getCode();
		String rtn_Message_3 = Lotto_RtnCode_1.NOT_FOUND_DATA.getMessage();
		String rtn_Code_3 = Lotto_RtnCode_1.NOT_FOUND_DATA.getCode();
		// Session
		String session_01 = Lotto_RtnCode_5.SESSION_01.getSessionKey();
		// 日期時間
		LocalDateTime localDateTime = LocalDateTime.now();
		// T_03_0001
		T_03_0001 t_03_0001 = new T_03_0001();
		// 檢查字串的List
		List<String> checkStringList = Arrays.asList(userPassword);
		Object session_01_Object = httpSession.getAttribute(session_01);
		String session_01_VerificationCode = "";
		// -------------------------
		// 邏輯處理
		Optional<T_03_0001> t_03_0001_O = t_03_0001_Dao.findByUserAccount(userAccount);
		// 是null會掉進去
		if (!t_03_0001_O.isPresent()) {
			_logger.info("找不到資料");
			_logger.info("輸入的帳號 : " + userAccount);
			return new Lotto_Res_1(rtn_Message_3, rtn_Code_3, t_03_0001);
		}
		// 檢查字串
		boolean checkString = checkString_1(checkStringList);
		if (checkString == false) {
			_logger.info("資料錯誤。已被彈出該方法");
			return new Lotto_Res_1(rtn_Message_2, rtn_Code_2);
		}
		if (session_01_Object == null) {
			_logger.info("Session異常。已被彈出該方法");
			return new Lotto_Res_1(rtn_Message_2, rtn_Code_2);
		}
		if (verificationCode == null) {
			_logger.info("驗證碼錯誤。已被彈出該方法");
			_logger.info("驗證碼 : " + verificationCode);
			return new Lotto_Res_1(rtn_Message_2, rtn_Code_2);
		}
		session_01_VerificationCode = session_01_Object.toString();
		verificationCode = verificationCode.trim();
		if (!session_01_VerificationCode.equals(verificationCode)) {
			_logger.info("驗證碼錯誤。已被彈出該方法");
			_logger.info("驗證碼 : " + verificationCode);
			return new Lotto_Res_1(rtn_Message_2, rtn_Code_2);
		}
		// 取資料
		t_03_0001 = t_03_0001_O.get();
		t_03_0001.setUserPassword(userPassword);
		t_03_0001.setTableDate2(localDateTime);
		t_03_0001 = t_03_0001_Dao.save(t_03_0001);
		// -------------------------
		_logger.info("修改密碼 : T_03_0001 (End)");
		_logger.info("-----------------------------------------------");
		// -------------------------
		return new Lotto_Res_1(rtn_Message_1, rtn_Code_1, t_03_0001);
	}

	// -----------------------------------------------
	// "登入"(R) - T_03_0001
	@Override
	public Lotto_Res_1 Login(Lotto_Req_1 req) {
		// -------------------------
		_logger.info("-----------------------------------------------");
		_logger.info("登入 : T_03_0001 (Start)");
		_logger.info("方法名稱 : " + "Login");
		// -------------------------
		// 需求參數
		String userAccount = req.getUserAcount();
		// -------------------------
		// 一般參數
		// 代碼_訊息
		String rtn_Message_1 = Lotto_RtnCode_1.SUCCESSFUL.getMessage();
		String rtn_Code_1 = Lotto_RtnCode_1.SUCCESSFUL.getCode();
		String rtn_Message_2 = Lotto_RtnCode_1.ERROR_DATA.getMessage();
		String rtn_Code_2 = Lotto_RtnCode_1.ERROR_DATA.getCode();
		// 日期時間
		LocalDateTime localDateTime = LocalDateTime.now();
		// T_03_0001
		T_03_0001 t_03_0001 = new T_03_0001();
		// -------------------------
		// 邏輯處理
		Optional<T_03_0001> t_03_0001_O = t_03_0001_Dao.findByUserAccount(userAccount);
		// 是null會掉進去
		if (!t_03_0001_O.isPresent()) {
			_logger.info("帳號錯誤");
			_logger.info("帳號 : " + userAccount);
			return new Lotto_Res_1(rtn_Message_2, rtn_Code_2, t_03_0001, false);
		}
		// 取資料
		t_03_0001 = t_03_0001_O.get();
		// 一定要直接拿到req裡面的密碼，不能經過編譯
		boolean pwdCheck = passwordEncoder.matches(req.getUserPassword(), t_03_0001.getUserPassword());
		if (!pwdCheck) {
			_logger.info("密碼錯誤");
			_logger.info("帳號 : " + userAccount);
			_logger.info("名字 : " + t_03_0001.getUserName());
			_logger.info("時間 : " + localDateTime);
			// 把"T_03_0001"清空
			t_03_0001 = new T_03_0001();
			return new Lotto_Res_1(rtn_Message_2, rtn_Code_2, t_03_0001, false);
		} else {
			_logger.info("登入成功");
			_logger.info("帳號 : " + userAccount);
			_logger.info("名字 : " + t_03_0001.getUserName());
			_logger.info("時間 : " + localDateTime);
		}
		// -------------------------
		_logger.info("登入 : T_03_0001 (End)");
		_logger.info("-----------------------------------------------");
		// -------------------------
		return new Lotto_Res_1(rtn_Message_1, rtn_Code_1, t_03_0001, true);
	}

	// -----------------------------------------------
	// 寄信 - ( 透過字串判斷執行什麼方法 )
	@Override
	public Lotto_Res_1 SendMail(Lotto_Req_1 req, String mailMethodName, HttpSession httpSession) {
		// -------------------------
		_logger.info("-----------------------------------------------");
		_logger.info("寄信 : 寄信方法 (Start)");
		_logger.info("方法名稱 : " + "SendMail");
		_logger.info("信箱方法類型 : " + mailMethodName);
		// -------------------------
		// 一般參數
		// 代碼_訊息
		String rtn_Message_2 = Lotto_RtnCode_1.ERROR_DATA.getMessage();
		String rtn_Code_2 = Lotto_RtnCode_1.ERROR_DATA.getCode();
		// 代碼_方法
		String mailMethodName_1 = Lotto_RtnCode_4.MAIL_METHOD_NAME__1.getMailMethodName();
		Lotto_Res_1 res = new Lotto_Res_1();
		if (mailMethodName.equals(mailMethodName_1)) {
			res = lotto_Service_2.SendMailMethod_1(req, httpSession);
		} else {
			_logger.info("寄信 : 寄信方法 (Error)");
			_logger.info("-----------------------------------------------");
			return new Lotto_Res_1(rtn_Message_2, rtn_Code_2);
		}
		_logger.info("寄信 : 寄信方法 (End)");
		_logger.info("-----------------------------------------------");
		return res;
	}

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
		String delete_Bol = Lotto_RtnCode_3.DELETE_Bol_N.getSpecial_code_1();
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
		String delete_Bol = Lotto_RtnCode_3.DELETE_Bol_N.getSpecial_code_1();
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
		String delete_Bol = Lotto_RtnCode_3.DELETE_Bol_N.getSpecial_code_1();
		for (T_01_0003 item : list) {
			if (item.getDeleteBol().equals(delete_Bol)) {
				newList.add(item);
			}
		}
		return newList;
	}

	// -----------------------------------------------
	// 過濾_1 - T_01_0004
	// 篩選"刪除布林值" = "N"
	private List<T_01_0004> FilterList__T_01_0004___1(List<T_01_0004> list) {
		List<T_01_0004> newList = new ArrayList<T_01_0004>();
		String delete_Bol = Lotto_RtnCode_3.DELETE_Bol_N.getSpecial_code_1();
		for (T_01_0004 item : list) {
			if (item.getDeleteBol().equals(delete_Bol)) {
				newList.add(item);
			}
		}
		return newList;
	}

	// -----------------------------------------------
	// 過濾_1 - T_01_0005
	// 篩選"刪除布林值" = "N"
	private List<T_01_0005> FilterList__T_01_0005___1(List<T_01_0005> list) {
		List<T_01_0005> newList = new ArrayList<T_01_0005>();
		String delete_Bol = Lotto_RtnCode_3.DELETE_Bol_N.getSpecial_code_1();
		for (T_01_0005 item : list) {
			if (item.getDeleteBol().equals(delete_Bol)) {
				newList.add(item);
			}
		}
		return newList;
	}

	// -----------------------------------------------
	// 檢查字串_1 - 空格、空
	private boolean checkString_1(List<String> list) {
		for (String item : list) {
			// 檢查有沒有空格
			if (item.contains(" ")) {
				return false;
			}
			if (item.equals("")) {
				return false;
			}
		}
		return true;

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
			int generally_total_several_numbers, int openNumbers) {
		// 開獎號碼數量 != (一般號數量 + 特別號數量)
		if (openNumbers != (generally_total_several_numbers + special_total_several_numbers)) {
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
		// 頭獎號碼數量 > 開獎號碼數量
		if (top_winning_total_several_numbers > openNumbers) {
			return false;
		}
		return true;

	}

	// -----------------------------------------------
	// 產生樂透期數
	private int getLottoSort(String tableCode1, String tableCode2) {
		int lorroMAX_Sort = 0;
		try {
			lorroMAX_Sort = t_01_0005_Dao.search_MAX_LottoSort_By_TableCode1_TableCode2(tableCode1, tableCode2);
		} catch (Exception e) {
			_logger.info("提醒錯誤訊息 : " + e);
		}
		// 找不到回傳 1
		if (lorroMAX_Sort == 0) {
			lorroMAX_Sort = lorroMAX_Sort + 1;
			return lorroMAX_Sort;
		} else {
			lorroMAX_Sort++;
		}
		return lorroMAX_Sort;
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
	// "新增"(C) - T_01_0004 ( 放在Create__T_01_0005裡面 )
	private List<T_01_0004> Create__T_01_0004(List<T_01_0005> list) {
		// -------------------------
		_logger.info("-----------------------------------------------");
		_logger.info("新增 : T_01_0004 (Start)");
		_logger.info("方法名稱 : " + "Create__T_01_0004");
		// -------------------------
		// 需求參數
		// -------------------------
		// 一般參數
		// 代碼_刪除布林值 - "N"
		String delete_Bol = Lotto_RtnCode_3.DELETE_Bol_N.getSpecial_code_1();
		// 代碼_表名
		String t_01_0004_table_name = Lotto_RtnCode_2.T_01_0004.getTable_name();
		// 代碼_TableCode
		String t_01_0002__02 = Lotto_RtnCode_3.T_01_0002__T_CODE_1__02.getSpecial_code_1();
		String t_01_0002__02_Y = Lotto_RtnCode_3.T_01_0002__T_CODE_1__02_Y.getSpecial_code_1();
		String t_01_0002__02_N = Lotto_RtnCode_3.T_01_0002__T_CODE_1__02_N.getSpecial_code_1();
		// 代碼_樂透起始數字
		int startNumber = Integer.valueOf(Lotto_RtnCode_3.START_NUMBER.getSpecial_code_1());
		// 日期時間
		LocalDateTime localDateTime = LocalDateTime.now();
		// T_01_0004
		T_01_0004 t_01_0004 = new T_01_0004();
		List<T_01_0004> t_01_0004_List = new ArrayList<T_01_0004>();
		// T_01_0005
		List<T_01_0005> t_01_0005_List = list;
		// -------------------------
		// 邏輯處理 (應該不會)
		if (list.size() == 0) {
			_logger.info("資料長度為 0 。已被彈出該方法");
			return t_01_0004_List;
		}
		for (T_01_0005 item : t_01_0005_List) {
			String tableCode1 = item.getTableCode1();
			String tableCode2 = item.getTableCode2();
			T_01_0003 t_01_0003 = t_01_0003_Dao.findByTableCode1AndTableCode2(tableCode1, tableCode2).get();
			// 蒐集開獎號碼清單
			List<Integer> winningNumberList = new ArrayList<Integer>();
			// 號碼順序
			int numberSort = 0;
			// 蒐集開獎號碼，同時檢查有無重複號碼
			while (true) {
				int randomNumber = getRandomNumber(startNumber, t_01_0003.getTotalSeveralNumbers());
				if (winningNumberList.contains(randomNumber)) {
					continue;
				}
				winningNumberList.add(randomNumber);
				if (winningNumberList.size() == t_01_0003.getOpenNumbers()) {
					break;
				}

			}
			for (int i = 0; i < winningNumberList.size(); i++) {
				numberSort++;
				T_01_0002 t_01_0002 = new T_01_0002();
				int winningNumber = winningNumberList.get(i);
				String winningNumberString = String.valueOf(winningNumber);
				// 個位數補"0"
				if (winningNumber >= 1 && winningNumber < 10) {
					winningNumberString = "0" + winningNumberString;
				}
				String tableDescribe1 = "第 " + numberSort + " 個數字";
				String tableDescribe2 = "第 " + numberSort + " 個數字(英文)";
				// 檢查是否是特別號 (去撈出"T_01_0002"的資料)
				if ((winningNumberList.size() - numberSort) < t_01_0003.getSpecialTotalSeveralNumbers()) {
					t_01_0002 = t_01_0002_Dao.findByTableCode1AndTableCode2(t_01_0002__02, t_01_0002__02_Y).get();
				} else {
					t_01_0002 = t_01_0002_Dao.findByTableCode1AndTableCode2(t_01_0002__02, t_01_0002__02_N).get();
				}
				// 處理該表流水號
				int T_01_0003_t_serialNumber_1 = Create_Update__T_00_0001(t_01_0004_table_name).getT_00_0001()
						.getTableSerialNumber1();
				t_01_0004 = new T_01_0004(T_01_0003_t_serialNumber_1, tableCode1, tableCode2, winningNumberString,
						t_01_0002.getTableCode2(), tableDescribe1, tableDescribe2, localDateTime, localDateTime,
						t_01_0004_table_name, "", numberSort, item.getTableUuid1(), delete_Bol);
				t_01_0004_List.add(t_01_0004);
			}
		}
		// 儲存
		t_01_0004_List = t_01_0004_Dao.saveAll(t_01_0004_List);
		// -------------------------
		_logger.info("新增 : T_01_0004 (End)");
		_logger.info("-----------------------------------------------");
		// -------------------------
		return t_01_0004_List;
	}

	@Override
	public Lotto_Res_1 Create__T_01_0004() {
		// -------------------------
		_logger.info("-----------------------------------------------");
		_logger.info("新增 : T_01_0004 (Start)");
		_logger.info("方法名稱 : " + "Create__T_01_0004");
		// -------------------------
		// 需求參數
		// -------------------------
		// 一般參數
		// 代碼_刪除布林值 - "N"
		String delete_Bol = Lotto_RtnCode_3.DELETE_Bol_N.getSpecial_code_1();
		// 代碼_表名
		String t_01_0004_table_name = Lotto_RtnCode_2.T_01_0004.getTable_name();
		// 代碼_TableCode
		String t_01_0002__02 = Lotto_RtnCode_3.T_01_0002__T_CODE_1__02.getSpecial_code_1();
		String t_01_0002__02_Y = Lotto_RtnCode_3.T_01_0002__T_CODE_1__02_Y.getSpecial_code_1();
		String t_01_0002__02_N = Lotto_RtnCode_3.T_01_0002__T_CODE_1__02_N.getSpecial_code_1();
		// 代碼_訊息
		String rtn_Message_1 = Lotto_RtnCode_1.SUCCESSFUL.getMessage();
		String rtn_Code_1 = Lotto_RtnCode_1.SUCCESSFUL.getCode();
		String rtn_Message_2 = Lotto_RtnCode_1.NOT_FOUND_DATA.getMessage();
		String rtn_Code_2 = Lotto_RtnCode_1.NOT_FOUND_DATA.getCode();
		// 代碼_樂透起始數字
		int startNumber = Integer.valueOf(Lotto_RtnCode_3.START_NUMBER.getSpecial_code_1());
		// 日期時間
		LocalDateTime localDateTime = LocalDateTime.now();
		// T_01_0004
		T_01_0004 t_01_0004 = new T_01_0004();
		List<T_01_0004> t_01_0004_List = new ArrayList<T_01_0004>();
		// T_01_0005
		List<T_01_0005> t_01_0005_List = t_01_0005_Dao.findAll();
		// -------------------------
		// 邏輯處理 (應該不會)
		if (t_01_0005_List.size() == 0) {
			_logger.info("資料長度為 0 。已被彈出該方法");
			return new Lotto_Res_1(rtn_Message_2, rtn_Code_2);
		}
		for (T_01_0005 item : t_01_0005_List) {
			UUID tableUuid = item.getTableUuid1();
			List<T_01_0004> checkSize__T_01_0004 = t_01_0004_Dao.search_By_TableUuid1(String.valueOf(tableUuid));
			if (checkSize__T_01_0004.size() != 0) {
				continue;
			}
			String tableCode1 = item.getTableCode1();
			String tableCode2 = item.getTableCode2();
			T_01_0003 t_01_0003 = t_01_0003_Dao.findByTableCode1AndTableCode2(tableCode1, tableCode2).get();
			// 蒐集開獎號碼清單
			List<Integer> winningNumberList = new ArrayList<Integer>();
			// 號碼順序
			int numberSort = 0;
			// 蒐集開獎號碼，同時檢查有無重複號碼
			while (true) {
				int randomNumber = getRandomNumber(startNumber, t_01_0003.getTotalSeveralNumbers());
				if (winningNumberList.contains(randomNumber)) {
					continue;
				}
				winningNumberList.add(randomNumber);
				if (winningNumberList.size() == t_01_0003.getOpenNumbers()) {
					break;
				}

			}
			for (int i = 0; i < winningNumberList.size(); i++) {
				numberSort++;
				T_01_0002 t_01_0002 = new T_01_0002();
				int winningNumber = winningNumberList.get(i);
				String winningNumberString = String.valueOf(winningNumber);
				// 個位數補"0"
				if (winningNumber >= 1 && winningNumber < 10) {
					winningNumberString = "0" + winningNumberString;
				}
				String tableDescribe1 = "第 " + numberSort + " 個數字";
				String tableDescribe2 = "第 " + numberSort + " 個數字(英文)";
				// 檢查是否是特別號 (去撈出"T_01_0002"的資料)
				if ((winningNumberList.size() - numberSort) < t_01_0003.getSpecialTotalSeveralNumbers()) {
					t_01_0002 = t_01_0002_Dao.findByTableCode1AndTableCode2(t_01_0002__02, t_01_0002__02_Y).get();
				} else {
					t_01_0002 = t_01_0002_Dao.findByTableCode1AndTableCode2(t_01_0002__02, t_01_0002__02_N).get();
				}
				// 處理該表流水號
				int T_01_0003_t_serialNumber_1 = Create_Update__T_00_0001(t_01_0004_table_name).getT_00_0001()
						.getTableSerialNumber1();
				t_01_0004 = new T_01_0004(T_01_0003_t_serialNumber_1, tableCode1, tableCode2, winningNumberString,
						t_01_0002.getTableCode2(), tableDescribe1, tableDescribe2, localDateTime, localDateTime,
						t_01_0004_table_name, "", numberSort, tableUuid, delete_Bol);
				t_01_0004_List.add(t_01_0004);
			}
		}
		// 儲存
		t_01_0004_List = t_01_0004_Dao.saveAll(t_01_0004_List);
		// -------------------------
		_logger.info("新增 : T_01_0004 (End)");
		_logger.info("-----------------------------------------------");
		// -------------------------
		return new Lotto_Res_1(rtn_Message_1, rtn_Code_1, t_01_0004_List, "", "", "");
	}

}
