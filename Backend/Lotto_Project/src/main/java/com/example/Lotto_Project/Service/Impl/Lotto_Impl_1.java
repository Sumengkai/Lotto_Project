package com.example.Lotto_Project.Service.Impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Lotto_Project.Constants.Lotto_RtnCode_1;
import com.example.Lotto_Project.Constants.Lotto_RtnCode_2;
import com.example.Lotto_Project.Entity.T_00_0001;
import com.example.Lotto_Project.Entity.T_01_0001;
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
		String T_01_0001_t_code_1 = req.getT_01_0001__t_code_1();
		String T_01_0001_t_describe_1 = req.getT_01_0001__t_describe_1();
		String T_01_0001_t_describe_2 = req.getT_01_0001__t_describe_2();
		String T_01_0001_t_user = req.getT_01_0001__t_user();
		String T_01_0001_t_special_treatment_1 = req.getT_01_0001__t_special_treatment_1();
		// -------------------------
		// 一般參數
		// 訊息
		String rtn_Message_1 = Lotto_RtnCode_1.SUCCESSFUL.getMessage();
		String rtn_Code_1 = Lotto_RtnCode_1.SUCCESSFUL.getCode();
		String rtn_Message_2 = Lotto_RtnCode_1.DUPLICATE_DATA.getMessage();
		String rtn_Code_2 = Lotto_RtnCode_1.DUPLICATE_DATA.getCode();
		// 日期時間
		LocalDateTime localDateTime = LocalDateTime.now();
		// T_01_0001
		T_01_0001 t_01_0001 = new T_01_0001();
		String T_01_0001_table_name = Lotto_RtnCode_2.T_01_0001.getTable_name();
		// -------------------------
		// 邏輯處理
		// 放Table名稱進去。管理流水號
		Optional<T_01_0001> t_01_0001_O = t_01_0001_Dao.findByTableCode1(T_01_0001_t_code_1);
		// 不是null會掉進去
		if (t_01_0001_O.isPresent()) {
			_logger.info("資料重複。已被彈出該方法");
			t_01_0001 = t_01_0001_O.get();
			return new Lotto_Res_1(rtn_Message_2, rtn_Code_2, t_01_0001);
		}
		// 處理該表流水號
		Lotto_Res_1 lotto_Res_1 = Create_Update__T_00_0001(T_01_0001_table_name);
		int T_01_0001_t_serialNumber_1 = lotto_Res_1.getT_00_0001().getTableSerialNumber1();
		// 流水號、編碼1、描述1、描述2、時間1、時間2、表名、用戶、特殊處理
		t_01_0001 = new T_01_0001(T_01_0001_t_serialNumber_1, T_01_0001_t_code_1, T_01_0001_t_describe_1,
				T_01_0001_t_describe_2, localDateTime, localDateTime, T_01_0001_table_name, T_01_0001_t_user,
				T_01_0001_t_special_treatment_1);
		// 儲存
		t_01_0001_Dao.save(t_01_0001);
		// -------------------------
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
		String T_01_0001_t_code_1 = req.getT_01_0001__t_code_1();
		String T_01_0001_t_describe_1 = req.getT_01_0001__t_describe_1();
		String T_01_0001_t_describe_2 = req.getT_01_0001__t_describe_2();
		String T_01_0001_t_user = req.getT_01_0001__t_user();
		String T_01_0001_t_special_treatment_1 = req.getT_01_0001__t_special_treatment_1();
		// -------------------------
		// 一般參數
		// 訊息
		String rtn_Message_1 = Lotto_RtnCode_1.SUCCESSFUL.getMessage();
		String rtn_Code_1 = Lotto_RtnCode_1.SUCCESSFUL.getCode();
		String rtn_Message_2 = Lotto_RtnCode_1.DUPLICATE_DATA.getMessage();
		String rtn_Code_2 = Lotto_RtnCode_1.DUPLICATE_DATA.getCode();
		// 日期時間
		LocalDateTime localDateTime = LocalDateTime.now();
		// T_01_0001
		T_01_0001 t_01_0001 = new T_01_0001();
		// -------------------------
		// 邏輯處理
		// 抓資料 - T_01_0001
		Optional<T_01_0001> t_01_0001_O = t_01_0001_Dao.findByTableCode1(T_01_0001_t_code_1);
		// 是null會掉進去
		// 基本上不會
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
		t_01_0001_Dao.save(t_01_0001);
		// -------------------------
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
		String T_01_0001_t_code_1 = req.getT_01_0001__t_code_1();
		String t_describe = req.getT_describe();
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
		if (T_01_0001_List.size() == 0) {
			return new Lotto_Res_1(rtn_Message_2, rtn_Code_2, T_01_0001_List);
		}
		// -------------------------
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
		_logger.info("刪除 : T_01_0001 (Start)");
		_logger.info("方法名稱 : " + "Delete__T_01_0001");
		// -------------------------
		// 需求參數
		String T_01_0001_t_code_1 = req.getT_01_0001__t_code_1();
		// -------------------------
		// 一般參數
		// 訊息
		String rtn_Message_1 = Lotto_RtnCode_1.SUCCESSFUL.getMessage();
		String rtn_Code_1 = Lotto_RtnCode_1.SUCCESSFUL.getCode();
		String rtn_Message_2 = Lotto_RtnCode_1.NOT_FOUND_DATA.getMessage();
		String rtn_Code_2 = Lotto_RtnCode_1.NOT_FOUND_DATA.getCode();
		// -------------------------
		// 邏輯處理
		// 還需要處理其他檢查，以及連同其他表一起刪除。
		// 抓資料 - T_01_0001
		Optional<T_01_0001> t_01_0001_O = t_01_0001_Dao.findByTableCode1(T_01_0001_t_code_1);
		// 是null會掉進去
		// 基本上不會
		if (!t_01_0001_O.isPresent()) {
			_logger.info("資料找不到。已被彈出該方法");
			return new Lotto_Res_1(rtn_Message_2, rtn_Code_2);
		}
		t_01_0001_Dao.deleteByTableCode1(T_01_0001_t_code_1);
		// -------------------------
		_logger.info("刪除 : T_01_0001 (End)");
		_logger.info("-----------------------------------------------");
		// -------------------------
		return new Lotto_Res_1(rtn_Message_1, rtn_Code_1);
	}

	// -----------------------------------------------
	// ===============================================
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
			t_00_0001.setTableDate1(localDateTime);
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

}
