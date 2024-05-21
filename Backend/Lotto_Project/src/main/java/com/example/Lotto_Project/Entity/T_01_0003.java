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
	private int totalSeveralNumbers;// 號碼總數
	@Column(name = "winning_several_numbers")
	private int winningSeveralNumbers;// 中獎號碼數量 (至少需要中幾個號碼)
	@Column(name = "top_winning_total_several_numbers")
	private int topWinningTotalSeveralNumbers; // 頭獎號碼中獎數量
	@Column(name = "generally_total_several_numbers")
	private int generallyTotalSeveralNumbers; // 一般號碼數量
	@Column(name = "special_total_several_numbers")
	private int specialTotalSeveralNumbers; // 特別號數量
	@Column(name = "open_numbers")
	private int openNumbers; // 開獎號碼數量
	@Column(name = "t_date_1")
	private LocalDateTime tableDate1;
	@Column(name = "t_date_2")
	private LocalDateTime tableDate2;
	@Column(name = "lotto_price")
	private int lottoPrice;
	@Column(name = "table_name")
	private String tableName;
	@Column(name = "t_special_treatment_1")
	private String tableSpecialTreatment1;
	@Column(name = "delete_bol")
	private String deleteBol;

	// -----------------------------------------------
	public T_01_0003() {

	}

	// 流水號、編碼1、編碼2、描述1、描述2、描述3、描述4、號碼總數量、中獎號碼數量(至少中獎號碼數量)、頭獎號碼數量、特別號碼數量、一般號碼數量、時間1、時間2、表名、特殊處理、刪除布林值
	public T_01_0003(int tableSerialNumber1, String tableCode1, String tableCode2, String tableDescribe1,
			String tableDescribe2, String tableDescribe3, String tableDescribe4, int totalSeveralNumbers,
			int winningSeveralNumbers, int topWinningTotalSeveralNumbers, int specialTotalSeveralNumbers,
			int generallyTotalSeveralNumbers, LocalDateTime tableDate1, LocalDateTime tableDate2, String tableName,
			String tableSpecialTreatment1, String deleteBol) {
		this.tableSerialNumber1 = tableSerialNumber1;
		this.tableCode1 = tableCode1;
		this.tableCode2 = tableCode2;
		this.tableDescribe1 = tableDescribe1;
		this.tableDescribe2 = tableDescribe2;
		this.tableDescribe3 = tableDescribe3;
		this.tableDescribe4 = tableDescribe4;
		this.totalSeveralNumbers = totalSeveralNumbers;
		this.winningSeveralNumbers = winningSeveralNumbers;
		this.topWinningTotalSeveralNumbers = topWinningTotalSeveralNumbers;
		this.specialTotalSeveralNumbers = specialTotalSeveralNumbers;
		this.generallyTotalSeveralNumbers = generallyTotalSeveralNumbers;
		this.tableDate1 = tableDate1;
		this.tableDate2 = tableDate2;
		this.tableName = tableName;
		this.tableSpecialTreatment1 = tableSpecialTreatment1;
		this.deleteBol = deleteBol;
	}

	// 流水號、編碼1、編碼2、描述1、描述2、描述3、描述4、號碼總數量、中獎號碼數量(至少中獎號碼數量)、頭獎號碼數量、特別號碼數量、一般號碼數量、時間1、時間2、價格、表名、特殊處理、刪除布林值
	public T_01_0003(int tableSerialNumber1, String tableCode1, String tableCode2, String tableDescribe1,
			String tableDescribe2, String tableDescribe3, String tableDescribe4, int totalSeveralNumbers,
			int winningSeveralNumbers, int topWinningTotalSeveralNumbers, int generallyTotalSeveralNumbers,
			int specialTotalSeveralNumbers, LocalDateTime tableDate1, LocalDateTime tableDate2, int lottoPrice,
			String tableName, String tableSpecialTreatment1, String deleteBol) {
		this.tableSerialNumber1 = tableSerialNumber1;
		this.tableCode1 = tableCode1;
		this.tableCode2 = tableCode2;
		this.tableDescribe1 = tableDescribe1;
		this.tableDescribe2 = tableDescribe2;
		this.tableDescribe3 = tableDescribe3;
		this.tableDescribe4 = tableDescribe4;
		this.totalSeveralNumbers = totalSeveralNumbers;
		this.winningSeveralNumbers = winningSeveralNumbers;
		this.topWinningTotalSeveralNumbers = topWinningTotalSeveralNumbers;
		this.generallyTotalSeveralNumbers = generallyTotalSeveralNumbers;
		this.specialTotalSeveralNumbers = specialTotalSeveralNumbers;
		this.tableDate1 = tableDate1;
		this.tableDate2 = tableDate2;
		this.lottoPrice = lottoPrice;
		this.tableName = tableName;
		this.tableSpecialTreatment1 = tableSpecialTreatment1;
		this.deleteBol = deleteBol;
	}

	// 流水號、編碼1、編碼2、描述1、描述2、描述3、描述4、號碼總數量、中獎號碼數量(至少中獎號碼數量)、頭獎號碼數量、特別號碼數量、一般號碼數量、
	// 開獎號碼數量、時間1、時間2、價格、表名、特殊處理、刪除布林值
	public T_01_0003(int tableSerialNumber1, String tableCode1, String tableCode2, String tableDescribe1,
			String tableDescribe2, String tableDescribe3, String tableDescribe4, int totalSeveralNumbers,
			int winningSeveralNumbers, int topWinningTotalSeveralNumbers, int generallyTotalSeveralNumbers,
			int specialTotalSeveralNumbers, int openNumbers, LocalDateTime tableDate1, LocalDateTime tableDate2,
			int lottoPrice, String tableName, String tableSpecialTreatment1, String deleteBol) {
		this.tableSerialNumber1 = tableSerialNumber1;
		this.tableCode1 = tableCode1;
		this.tableCode2 = tableCode2;
		this.tableDescribe1 = tableDescribe1;
		this.tableDescribe2 = tableDescribe2;
		this.tableDescribe3 = tableDescribe3;
		this.tableDescribe4 = tableDescribe4;
		this.totalSeveralNumbers = totalSeveralNumbers;
		this.winningSeveralNumbers = winningSeveralNumbers;
		this.topWinningTotalSeveralNumbers = topWinningTotalSeveralNumbers;
		this.generallyTotalSeveralNumbers = generallyTotalSeveralNumbers;
		this.specialTotalSeveralNumbers = specialTotalSeveralNumbers;
		this.openNumbers = openNumbers;
		this.tableDate1 = tableDate1;
		this.tableDate2 = tableDate2;
		this.lottoPrice = lottoPrice;
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

	public int getWinningSeveralNumbers() {
		return winningSeveralNumbers;
	}

	public void setWinningSeveralNumbers(int winningSeveralNumbers) {
		this.winningSeveralNumbers = winningSeveralNumbers;
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

	public String getDeleteBol() {
		return deleteBol;
	}

	public void setDeleteBol(String deleteBol) {
		this.deleteBol = deleteBol;
	}

	public int getLottoPrice() {
		return lottoPrice;
	}

	public void setLottoPrice(int lottoPrice) {
		this.lottoPrice = lottoPrice;
	}

	public int getOpenNumbers() {
		return openNumbers;
	}

	public void setOpenNumbers(int openNumbers) {
		this.openNumbers = openNumbers;
	}

}
