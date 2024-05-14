package com.example.Lotto_Project.Entity;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "t_03_0001")
public class T_03_0001 {
	// -----------------------------------------------
	// 用戶帳號密碼管理table
	// -----------------------------------------------
	@Id
	@Column(name = "t_uuid_1")
	@Type(type = "uuid-char")
	private UUID t_uuid_1;
	@Column(name = "user_account")
	private String user_account;
	@Column(name = "user_password")
	private String user_password;
	@Column(name = "user_name")
	private String user_name;
	@Column(name = "user_gender")
	private String user_gender;
	@Column(name = "user_mail")
	private String user_mail;
	@Column(name = "company_bol")
	private String company_bol;
	@Column(name = "t_date_1")
	private LocalDateTime t_date_1;
	@Column(name = "t_date_2")
	private LocalDateTime t_date_2;
	@Column(name = "t_special_treatment_1")
	private String t_special_treatment_1;

	// -----------------------------------------------
	public T_03_0001() {

	}

	public T_03_0001(UUID t_uuid_1, String user_account, String user_password, String user_name, String user_gender,
			String user_mail, String company_bol, LocalDateTime t_date_1, LocalDateTime t_date_2,
			String t_special_treatment_1) {
		this.t_uuid_1 = t_uuid_1;
		this.user_account = user_account;
		this.user_password = user_password;
		this.user_name = user_name;
		this.user_gender = user_gender;
		this.user_mail = user_mail;
		this.company_bol = company_bol;
		this.t_date_1 = t_date_1;
		this.t_date_2 = t_date_2;
		this.t_special_treatment_1 = t_special_treatment_1;
	}

	// -----------------------------------------------
	public UUID getT_uuid_1() {
		return t_uuid_1;
	}

	public void setT_uuid_1(UUID t_uuid_1) {
		this.t_uuid_1 = t_uuid_1;
	}

	public String getUser_account() {
		return user_account;
	}

	public void setUser_account(String user_account) {
		this.user_account = user_account;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_gender() {
		return user_gender;
	}

	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
	}

	public String getUser_mail() {
		return user_mail;
	}

	public void setUser_mail(String user_mail) {
		this.user_mail = user_mail;
	}

	public String getCompany_bol() {
		return company_bol;
	}

	public void setCompany_bol(String company_bol) {
		this.company_bol = company_bol;
	}

	public LocalDateTime getT_date_1() {
		return t_date_1;
	}

	public void setT_date_1(LocalDateTime t_date_1) {
		this.t_date_1 = t_date_1;
	}

	public LocalDateTime getT_date_2() {
		return t_date_2;
	}

	public void setT_date_2(LocalDateTime t_date_2) {
		this.t_date_2 = t_date_2;
	}

	public String getT_special_treatment_1() {
		return t_special_treatment_1;
	}

	public void setT_special_treatment_1(String t_special_treatment_1) {
		this.t_special_treatment_1 = t_special_treatment_1;
	}

}
