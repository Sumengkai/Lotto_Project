package com.example.Lotto_Project.Entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_01_0004")
public class T_01_0004 {
	// -----------------------------------------------
	// 樂透開幾紀錄table
	// -----------------------------------------------
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "t_serial_number_1")
	private int tableSerialNumber1;
	@Column(name = "t_serial_number_2")
	private int tableSerialNumber2;
	@Column(name = "winning_number")
	private String winningNumber;
	@Column(name = "special_winning_number_bol")
	private String specialWinningNumberBol;
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
	@Column(name = "t_special_treatment_1")
	private String tableSpecialTreatment1;
	@Column(name = "delete_bol")
	private String deleteBol;

	// -----------------------------------------------
	public T_01_0004() {

	}

	public T_01_0004(int tableSerialNumber1, int tableSerialNumber2, String winningNumber,
			String specialWinningNumberBol, String tableDescribe1, String tableDescribe2, LocalDateTime tableDate1,
			LocalDateTime tableDate2, String tableName, String tableSpecialTreatment1) {
		this.tableSerialNumber1 = tableSerialNumber1;
		this.tableSerialNumber2 = tableSerialNumber2;
		this.winningNumber = winningNumber;
		this.specialWinningNumberBol = specialWinningNumberBol;
		this.tableDescribe1 = tableDescribe1;
		this.tableDescribe2 = tableDescribe2;
		this.tableDate1 = tableDate1;
		this.tableDate2 = tableDate2;
		this.tableName = tableName;
		this.tableSpecialTreatment1 = tableSpecialTreatment1;
	}

	public T_01_0004(int tableSerialNumber1, int tableSerialNumber2, String winningNumber,
			String specialWinningNumberBol, String tableDescribe1, String tableDescribe2, LocalDateTime tableDate1,
			LocalDateTime tableDate2, String tableName, String tableSpecialTreatment1, String deleteBol) {
		super();
		this.tableSerialNumber1 = tableSerialNumber1;
		this.tableSerialNumber2 = tableSerialNumber2;
		this.winningNumber = winningNumber;
		this.specialWinningNumberBol = specialWinningNumberBol;
		this.tableDescribe1 = tableDescribe1;
		this.tableDescribe2 = tableDescribe2;
		this.tableDate1 = tableDate1;
		this.tableDate2 = tableDate2;
		this.tableName = tableName;
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

	public int getTableSerialNumber2() {
		return tableSerialNumber2;
	}

	public void setTableSerialNumber2(int tableSerialNumber2) {
		this.tableSerialNumber2 = tableSerialNumber2;
	}

	public String getWinningNumber() {
		return winningNumber;
	}

	public void setWinningNumber(String winningNumber) {
		this.winningNumber = winningNumber;
	}

	public String getSpecialWinningNumberBol() {
		return specialWinningNumberBol;
	}

	public void setSpecialWinningNumberBol(String specialWinningNumberBol) {
		this.specialWinningNumberBol = specialWinningNumberBol;
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
