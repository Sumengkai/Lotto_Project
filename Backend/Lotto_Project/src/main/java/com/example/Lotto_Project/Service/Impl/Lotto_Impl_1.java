package com.example.Lotto_Project.Service.Impl;

import java.time.LocalDateTime;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Lotto_Project.Constants.Lotto_RtnCode_1;
import com.example.Lotto_Project.Entity.T_00_0001;
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
	// "新增"或"修改" - T_00_0001
	@Override
	public Lotto_Res_1 Create_Update__T_00_0001(Lotto_Req_1 req) {
		_logger.info("-----------------------------------------------");
		_logger.info("新增 修改 : T_00_0001 (Start)");
		// -------------------------
		// 參數
		String table_name = req.getTable_name();
		Optional<T_00_0001> t_00_0001_O = t_00_0001_Dao.findById(table_name);
		LocalDateTime localDateTime = LocalDateTime.now();
		T_00_0001 t_00_0001 = new T_00_0001();
		String rtn_Message = Lotto_RtnCode_1.SUCCESSFUL.getMessage();
		String rtn_Code = Lotto_RtnCode_1.SUCCESSFUL.getCode();
		// -------------------------
		// 邏輯處理
		// null 會掉進去
		if (!t_00_0001_O.isPresent()) {
			t_00_0001 = new T_00_0001(table_name, 1, localDateTime, localDateTime, "");
		} else {
			t_00_0001 = t_00_0001_O.get();
			t_00_0001.setT_serialNumber_1((t_00_0001.getT_serialNumber_1() + 1));
			t_00_0001.setT_date_2(localDateTime);
			t_00_0001.setT_user("");
		}
		t_00_0001 = t_00_0001_Dao.save(t_00_0001);
		_logger.info("流水號 : " + t_00_0001.getT_serialNumber_1());
		_logger.info("新增 修改 : T_00_0001 (End)");
		_logger.info("-----------------------------------------------");
		return new Lotto_Res_1(rtn_Message, rtn_Code, t_00_0001);
	}
	// -----------------------------------------------
}
