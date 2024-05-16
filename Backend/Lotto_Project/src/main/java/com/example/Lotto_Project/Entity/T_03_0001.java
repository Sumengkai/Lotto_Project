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
	private UUID tableUuid1;
	@Column(name = "user_account")
	private String userAccount;
	@Column(name = "user_password")
	private String userPassword;
	@Column(name = "user_name")
	private String userName;
	@Column(name = "user_gender")
	private String userGender;
	@Column(name = "user_mail")
	private String userMail;
	@Column(name = "company_bol")
	private String companyBol;
	@Column(name = "t_date_1")
	private LocalDateTime tableDate1;
	@Column(name = "t_date_2")
	private LocalDateTime tableDate2;
	@Column(name = "t_special_treatment_1")
	private String tableSpecialTreatment1;

	// -----------------------------------------------
	public T_03_0001() {

	}

	public T_03_0001(UUID tableUuid1, String userAccount, String userPassword, String userName, String userGender,
			String userMail, String companyBol, LocalDateTime tableDate1, LocalDateTime tableDate2,
			String tableSpecialTreatment1) {
		this.tableUuid1 = tableUuid1;
		this.userAccount = userAccount;
		this.userPassword = userPassword;
		this.userName = userName;
		this.userGender = userGender;
		this.userMail = userMail;
		this.companyBol = companyBol;
		this.tableDate1 = tableDate1;
		this.tableDate2 = tableDate2;
		this.tableSpecialTreatment1 = tableSpecialTreatment1;
	}
	// -----------------------------------------------

	public UUID getTableUuid1() {
		return tableUuid1;
	}

	public void setTableUuid1(UUID tableUuid1) {
		this.tableUuid1 = tableUuid1;
	}

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	public String getCompanyBol() {
		return companyBol;
	}

	public void setCompanyBol(String companyBol) {
		this.companyBol = companyBol;
	}

	public LocalDateTime getTableDate1() {
		return tableDate1;
	}

	public void setTableDate1(LocalDateTime tableDate1) {
		this.tableDate1 = tableDate1;
	}

	public LocalDateTime getTableDate2() {
		return tableDate2;
	}

	public void setTableDate2(LocalDateTime tableDate2) {
		this.tableDate2 = tableDate2;
	}

	public String getTableSpecialTreatment1() {
		return tableSpecialTreatment1;
	}

	public void setTableSpecialTreatment1(String tableSpecialTreatment1) {
		this.tableSpecialTreatment1 = tableSpecialTreatment1;
	}

}
