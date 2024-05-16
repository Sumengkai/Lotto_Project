package com.example.Lotto_Project.Entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_01_0002")
public class T_01_0002 {
	// -----------------------------------------------
	// 管理編碼的table_2
	// -----------------------------------------------
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "t_serial_number_1")
	private int tableSerialNumber1;
	@Column(name = "t_code_1")
	private String tableCode1;
	@Column(name = "t_code_2")
	private String tableCode2;
	@Column(name = "t_describe_1")
	private String tableDescribe1;
	@Column(name = "t_describe_2")
	private String tableDescribe2;
	@Column(name = "t_date_1")
	private LocalDateTime tableDate1;
	@Column(name = "t_date_2")
	private LocalDateTime tableDate2;
	@Column(name = "table_name")
	private String tableName;
	@Column(name = "t_user")
	private String tableUser;
	@Column(name = "t_special_treatment_1")
	private String tableSpecialTreatment1;

	// -----------------------------------------------

	public T_01_0002() {

	}

	public T_01_0002(int tableSerialNumber1, String tableCode1, String tableCode2, String tableDescribe1,
			String tableDescribe2, LocalDateTime tableDate1, LocalDateTime tableDate2, String tableName,
			String tableUser, String tableSpecialTreatment1) {
		this.tableSerialNumber1 = tableSerialNumber1;
		this.tableCode1 = tableCode1;
		this.tableCode2 = tableCode2;
		this.tableDescribe1 = tableDescribe1;
		this.tableDescribe2 = tableDescribe2;
		this.tableDate1 = tableDate1;
		this.tableDate2 = tableDate2;
		this.tableName = tableName;
		this.tableUser = tableUser;
		this.tableSpecialTreatment1 = tableSpecialTreatment1;
	}

	// -----------------------------------------------
	public int getTableSerialNumber1() {
		return tableSerialNumber1;
	}

	public void setTableSerialNumber1(int tableSerialNumber1) {
		this.tableSerialNumber1 = tableSerialNumber1;
	}

	public String getTableCode1() {
		return tableCode1;
	}

	public void setTableCode1(String tableCode1) {
		this.tableCode1 = tableCode1;
	}

	public String getTableCode2() {
		return tableCode2;
	}

	public void setTableCode2(String tableCode2) {
		this.tableCode2 = tableCode2;
	}

	public String getTableDescribe1() {
		return tableDescribe1;
	}

	public void setTableDescribe1(String tableDescribe1) {
		this.tableDescribe1 = tableDescribe1;
	}

	public String getTableDescribe2() {
		return tableDescribe2;
	}

	public void setTableDescribe2(String tableDescribe2) {
		this.tableDescribe2 = tableDescribe2;
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

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getTableUser() {
		return tableUser;
	}

	public void setTableUser(String tableUser) {
		this.tableUser = tableUser;
	}

	public String getTableSpecialTreatment1() {
		return tableSpecialTreatment1;
	}

	public void setTableSpecialTreatment1(String tableSpecialTreatment1) {
		this.tableSpecialTreatment1 = tableSpecialTreatment1;
	}

}
