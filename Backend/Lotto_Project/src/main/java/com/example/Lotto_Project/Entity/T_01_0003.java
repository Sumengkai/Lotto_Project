package com.example.Lotto_Project.Entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_01_0003")
public class T_01_0003 {
	// -----------------------------------------------
	// 樂透種類table
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
	@Column(name = "t_describe_3")
	private String tableDescribe3;
	@Column(name = "t_describe_4")
	private String tableDescribe4;
	@Column(name = "total_several_numbers")
	private int totalSeveralNumbers;
	@Column(name = "winning_total_several_numbers")
	private int winningTotalSeveralNumbers;
	@Column(name = "top_winning_total_several_numbers")
	private int topWinningTotalSeveralNumbers;
	@Column(name = "special_total_several_numbers")
	private int specialTotalSeveralNumbers;
	@Column(name = "generally_total_several_numbers")
	private int generallyTotalSeveralNumbers;
	@Column(name = "t_date_1")
	private LocalDateTime tableDate1;
	@Column(name = "t_date_2")
	private LocalDateTime tableDate2;
	@Column(name = "table_name")
	private String tableName;
	@Column(name = "t_special_treatment_1")
	private String tableSpecialTreatment1;

	// -----------------------------------------------
	public T_01_0003() {

	}

	public T_01_0003(int tableSerialNumber1, String tableCode1, String tableCode2, String tableDescribe1,
			String tableDescribe2, String tableDescribe3, String tableDescribe4, int totalSeveralNumbers,
			int winningTotalSeveralNumbers, int topWinningTotalSeveralNumbers, int specialTotalSeveralNumbers,
			int generallyTotalSeveralNumbers, LocalDateTime tableDate1, LocalDateTime tableDate2, String tableName,
			String tableSpecialTreatment1) {
		this.tableSerialNumber1 = tableSerialNumber1;
		this.tableCode1 = tableCode1;
		this.tableCode2 = tableCode2;
		this.tableDescribe1 = tableDescribe1;
		this.tableDescribe2 = tableDescribe2;
		this.tableDescribe3 = tableDescribe3;
		this.tableDescribe4 = tableDescribe4;
		this.totalSeveralNumbers = totalSeveralNumbers;
		this.winningTotalSeveralNumbers = winningTotalSeveralNumbers;
		this.topWinningTotalSeveralNumbers = topWinningTotalSeveralNumbers;
		this.specialTotalSeveralNumbers = specialTotalSeveralNumbers;
		this.generallyTotalSeveralNumbers = generallyTotalSeveralNumbers;
		this.tableDate1 = tableDate1;
		this.tableDate2 = tableDate2;
		this.tableName = tableName;
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

	public String getTableDescribe3() {
		return tableDescribe3;
	}

	public void setTableDescribe3(String tableDescribe3) {
		this.tableDescribe3 = tableDescribe3;
	}

	public String getTableDescribe4() {
		return tableDescribe4;
	}

	public void setTableDescribe4(String tableDescribe4) {
		this.tableDescribe4 = tableDescribe4;
	}

	public int getTotalSeveralNumbers() {
		return totalSeveralNumbers;
	}

	public void setTotalSeveralNumbers(int totalSeveralNumbers) {
		this.totalSeveralNumbers = totalSeveralNumbers;
	}

	public int getWinningTotalSeveralNumbers() {
		return winningTotalSeveralNumbers;
	}

	public void setWinningTotalSeveralNumbers(int winningTotalSeveralNumbers) {
		this.winningTotalSeveralNumbers = winningTotalSeveralNumbers;
	}

	public int getTopWinningTotalSeveralNumbers() {
		return topWinningTotalSeveralNumbers;
	}

	public void setTopWinningTotalSeveralNumbers(int topWinningTotalSeveralNumbers) {
		this.topWinningTotalSeveralNumbers = topWinningTotalSeveralNumbers;
	}

	public int getSpecialTotalSeveralNumbers() {
		return specialTotalSeveralNumbers;
	}

	public void setSpecialTotalSeveralNumbers(int specialTotalSeveralNumbers) {
		this.specialTotalSeveralNumbers = specialTotalSeveralNumbers;
	}

	public int getGenerallyTotalSeveralNumbers() {
		return generallyTotalSeveralNumbers;
	}

	public void setGenerallyTotalSeveralNumbers(int generallyTotalSeveralNumbers) {
		this.generallyTotalSeveralNumbers = generallyTotalSeveralNumbers;
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

}
