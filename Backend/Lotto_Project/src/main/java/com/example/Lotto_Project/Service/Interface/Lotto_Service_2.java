package com.example.Lotto_Project.Service.Interface;

import javax.servlet.http.HttpSession;

import com.example.Lotto_Project.Vo.Req.Lotto_Req_1;
import com.example.Lotto_Project.Vo.Res.Lotto_Res_1;

public interface Lotto_Service_2 {
	// -----------------------------------------------
	// 管理"信箱方法"的"Service"
	// -----------------------------------------------
	// 寄信方法_1
	public Lotto_Res_1 SendMailMethod_1(Lotto_Req_1 req, HttpSession httpSession);
}
