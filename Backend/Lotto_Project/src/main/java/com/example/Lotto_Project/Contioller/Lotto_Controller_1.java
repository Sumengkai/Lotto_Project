package com.example.Lotto_Project.Contioller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Lotto_Project.Constants.Lotto_RtnCode_4;
import com.example.Lotto_Project.Service.Interface.Lotto_Service_1;
import com.example.Lotto_Project.Vo.Req.Lotto_Req_1;
import com.example.Lotto_Project.Vo.Res.Lotto_Res_1;

@CrossOrigin
@RestController
public class Lotto_Controller_1 {
	@Autowired
	private Lotto_Service_1 lotto_Service_1;

	// -----------------------------------------------
	@PostMapping(value = "/SendMail")
	public Lotto_Res_1 SendMail(@RequestBody Lotto_Req_1 req, HttpSession httpSession) {
		// 代碼_方法
		String mailMethodName_1 = Lotto_RtnCode_4.MAIL_METHOD_NAME__1.getMailMethodName();
		return lotto_Service_1.SendMail(req, mailMethodName_1, httpSession);
	}

	@PostMapping(value = "/Update__UserPassword")
	public Lotto_Res_1 Update__UserPassword(@RequestBody Lotto_Req_1 req, HttpSession httpSession) {
		// 代碼_方法
		return lotto_Service_1.Update__UserPassword(req, httpSession);
	}

	// -----------------------------------------------
}
