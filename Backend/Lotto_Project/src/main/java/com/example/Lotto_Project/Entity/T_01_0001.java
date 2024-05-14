package com.example.Lotto_Project.Entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_01_0001")
public class T_01_0001 {
	// -----------------------------------------------
	// 管理編碼的table_1
	// -----------------------------------------------
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "t_serial_number_1")
	private int t_serialNumber_1;
	@Column(name = "t_code_1")
	private String t_code_1;
	@Column(name = "t_describe_1")
	private String t_describe_1;
	@Column(name = "t_describe_2")
	private String t_describe_2;
	@Column(name = "t_date_1")
	private LocalDateTime t_date_1;
	@Column(name = "t_date_2")
	private LocalDateTime t_date_2;
	@Column(name = "table_name")
	private String table_name;
	@Column(name = "t_user")
	private String t_user;
	@Column(name = "t_special_treatment_1")
	private String t_special_treatment_1;

	// -----------------------------------------------
	public T_01_0001() {

	}

	public T_01_0001(int t_serialNumber_1, String t_code_1, String t_describe_1, String t_describe_2,
			LocalDateTime t_date_1, LocalDateTime t_date_2, String table_name, String t_user,
			String t_special_treatment_1) {
		this.t_serialNumber_1 = t_serialNumber_1;
		this.t_code_1 = t_code_1;
		this.t_describe_1 = t_describe_1;
		this.t_describe_2 = t_describe_2;
		this.t_date_1 = t_date_1;
		this.t_date_2 = t_date_2;
		this.table_name = table_name;
		this.t_user = t_user;
		this.t_special_treatment_1 = t_special_treatment_1;
	}

	public T_01_0001(String t_code_1, String t_describe_1, String t_describe_2, LocalDateTime t_date_1,
			LocalDateTime t_date_2, String table_name, String t_user, String t_special_treatment_1) {
		this.t_code_1 = t_code_1;
		this.t_describe_1 = t_describe_1;
		this.t_describe_2 = t_describe_2;
		this.t_date_1 = t_date_1;
		this.t_date_2 = t_date_2;
		this.table_name = table_name;
		this.t_user = t_user;
		this.t_special_treatment_1 = t_special_treatment_1;
	}

	// -----------------------------------------------
	public int getT_serialNumber_1() {
		return t_serialNumber_1;
	}

	public void setT_serialNumber_1(int t_serialNumber_1) {
		this.t_serialNumber_1 = t_serialNumber_1;
	}

	public String getT_code_1() {
		return t_code_1;
	}

	public void setT_code_1(String t_code_1) {
		this.t_code_1 = t_code_1;
	}

	public String getT_describe_1() {
		return t_describe_1;
	}

	public void setT_describe_1(String t_describe_1) {
		this.t_describe_1 = t_describe_1;
	}

	public String getT_describe_2() {
		return t_describe_2;
	}

	public void setT_describe_2(String t_describe_2) {
		this.t_describe_2 = t_describe_2;
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

	public String getTable_name() {
		return table_name;
	}

	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}

	public String getT_user() {
		return t_user;
	}

	public void setT_user(String t_user) {
		this.t_user = t_user;
	}

	public String getT_special_treatment_1() {
		return t_special_treatment_1;
	}

	public void setT_special_treatment_1(String t_special_treatment_1) {
		this.t_special_treatment_1 = t_special_treatment_1;
	}

}
