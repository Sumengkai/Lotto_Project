package com.example.Lotto_Project.Service.Impl;

import java.util.Optional;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.Lotto_Project.Constants.Lotto_RtnCode_1;
import com.example.Lotto_Project.Constants.Lotto_RtnCode_3;
import com.example.Lotto_Project.Constants.Lotto_RtnCode_5;
import com.example.Lotto_Project.Entity.T_01_0002;
import com.example.Lotto_Project.Entity.T_03_0001;
import com.example.Lotto_Project.Repository.T_00_0001_Dao;
import com.example.Lotto_Project.Repository.T_01_0001_Dao;
import com.example.Lotto_Project.Repository.T_01_0002_Dao;
import com.example.Lotto_Project.Repository.T_01_0003_Dao;
import com.example.Lotto_Project.Repository.T_01_0004_Dao;
import com.example.Lotto_Project.Repository.T_01_0005_Dao;
import com.example.Lotto_Project.Repository.T_03_0001_Dao;
import com.example.Lotto_Project.Service.Interface.Lotto_Service_2;
import com.example.Lotto_Project.Vo.Req.Lotto_Req_1;
import com.example.Lotto_Project.Vo.Res.Lotto_Res_1;

// -----------------------------------------------
@Service
public class Lotto_Impl_2 implements Lotto_Service_2 {
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

	// -----------------------------------------------
	// 寄信方法_1
	public Lotto_Res_1 SendMailMethod_1(Lotto_Req_1 req, HttpSession httpSession) {
		// -------------------------
		// 需求參數
		String userAccount = req.getUserAcount();
		// -------------------------
		// 一般參數
		SimpleMailMessage gmail = new SimpleMailMessage();
		// 代碼_訊息
		String rtn_Message_1 = Lotto_RtnCode_1.SUCCESSFUL.getMessage();
		String rtn_Code_1 = Lotto_RtnCode_1.SUCCESSFUL.getCode();
		String rtn_Message_2 = Lotto_RtnCode_1.ERROR_DATA.getMessage();
		String rtn_Code_2 = Lotto_RtnCode_1.ERROR_DATA.getCode();
		String rtn_Message_3 = Lotto_RtnCode_1.NOT_FOUND_DATA.getMessage();
		String rtn_Code_3 = Lotto_RtnCode_1.NOT_FOUND_DATA.getCode();
		// Session
		String session_01 = Lotto_RtnCode_5.SESSION_01.getSessionKey();
		// 代碼_TableCode
		String t_01_0002__04 = Lotto_RtnCode_3.T_01_0001__T_CODE_1__04.getSpecial_code_1();
		String t_01_0002__04_01 = Lotto_RtnCode_3.T_01_0002__T_CODE_1__04_01.getSpecial_code_1();
		String t_01_0002__05 = Lotto_RtnCode_3.T_01_0001__T_CODE_1__05.getSpecial_code_1();
		String t_01_0002__05_01 = Lotto_RtnCode_3.T_01_0002__T_CODE_1__05_01.getSpecial_code_1();
		UUID uuid = UUID.randomUUID();
		String uuidString = uuid.toString().substring(0, 5);
		T_03_0001 t_03_0001 = new T_03_0001();
		T_01_0002 t_01_0002__1 = new T_01_0002();
		T_01_0002 t_01_0002__2 = new T_01_0002();
		boolean checkSuccessful = true;
		// -------------------------
		// 邏輯處理
		Optional<T_03_0001> t_03_0001_O = t_03_0001_Dao.findByUserAccount(userAccount);
		Optional<T_01_0002> t_01_0002_O_1 = t_01_0002_Dao.findByTableCode1AndTableCode2(t_01_0002__04,
				t_01_0002__04_01);
		Optional<T_01_0002> t_01_0002_O_2 = t_01_0002_Dao.findByTableCode1AndTableCode2(t_01_0002__05,
				t_01_0002__05_01);
		// 是null會掉進去
		if (!t_03_0001_O.isPresent()) {
			_logger.info("找不到資料");
			_logger.info("輸入的帳號 : " + userAccount);
			return new Lotto_Res_1(rtn_Message_3, rtn_Code_3, t_03_0001);
		}
		// 是null會掉進去
		if (!t_01_0002_O_1.isPresent()) {
			_logger.info("找不到資料");
			return new Lotto_Res_1(rtn_Message_2, rtn_Code_2, t_03_0001);
		}
		// 是null會掉進去
		if (!t_01_0002_O_2.isPresent()) {
			_logger.info("找不到資料");
			return new Lotto_Res_1(rtn_Message_2, rtn_Code_2, t_03_0001);
		}
		// 抓資料
		t_03_0001 = t_03_0001_O.get();
		t_01_0002__1 = t_01_0002_O_1.get();
		t_01_0002__2 = t_01_0002_O_2.get();
		// 設定key - value
		httpSession.setAttribute(session_01, uuidString);
		// 設定有效時間
		httpSession.setMaxInactiveInterval(600);
		gmail.setFrom("programkaitest@gmail.com");
		gmail.setTo(t_03_0001.getUserMail());
		gmail.setSubject(t_01_0002__1.getTableDescribe1());
		gmail.setText(t_01_0002__2.getTableDescribe1() + " : " + uuid);
		try {
			mailSender.send(gmail);
		} catch (Exception e) {
			checkSuccessful = false;
			_logger.info("提醒錯誤訊息 : " + e);
		}
		if (checkSuccessful == false) {
			// 清空資料
			t_03_0001 = new T_03_0001();
			return new Lotto_Res_1(rtn_Message_2, rtn_Code_2, t_03_0001);
		}
		_logger.info("驗證碼 : " + uuidString);
		return new Lotto_Res_1(rtn_Message_1, rtn_Code_1, t_03_0001);
	}

}
