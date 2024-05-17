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
	@Column(name = "t_serial_number_1")
	private int tableSerialNumber1;
	@Column(name = "t_code_1")
	private String tableCode1;
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
	@Column(name = "delete_bol")
	private String deleteBol;

	// -----------------------------------------------
	public T_01_0001() {

	}

	public T_01_0001(int tableSerialNumber1, String tableCode1, String tableDescribe1, String tableDescribe2,
			LocalDateTime tableDate1, LocalDateTime tableDate2, String tableName, String tableUser,
			String tableSpecialTreatment1) {
		this.tableSerialNumber1 = tableSerialNumber1;
		this.tableCode1 = tableCode1;
		this.tableDescribe1 = tableDescribe1;
		this.tableDescribe2 = tableDescribe2;
		this.tableDate1 = tableDate1;
		this.tableDate2 = tableDate2;
		this.tableName = tableName;
		this.tableUser = tableUser;
		this.tableSpecialTreatment1 = tableSpecialTreatment1;
	}

	// 流水號、編碼1、描述1、描述2、時間1、時間2、表名、用戶、特殊處理、刪除布林值
	public T_01_0001(int tableSerialNumber1, String tableCode1, String tableDescribe1, String tableDescribe2,
			LocalDateTime tableDate1, LocalDateTime tableDate2, String tableName, String tableUser,
			String tableSpecialTreatment1, String deleteBol) {
		this.tableSerialNumber1 = tableSerialNumber1;
		this.tableCode1 = tableCode1;
		this.tableDescribe1 = tableDescribe1;
		this.tableDescribe2 = tableDescribe2;
		this.tableDate1 = tableDate1;
		this.tableDate2 = tableDate2;
		this.tableName = tableName;
		this.tableUser = tableUser;
		this.tableSpecialTreatment1 = tableSpecialTreatment1;
		this.deleteBol = deleteBol;
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

	public String getDeleteBol() {
		return deleteBol;
	}

	public void setDeleteBol(String deleteBol) {
		this.deleteBol = deleteBol;
	}

}
