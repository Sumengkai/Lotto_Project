package com.example.Lotto_Project.Entity;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "t_01_0005")
public class T_01_0005 {
	// -----------------------------------------------
	// 用戶帳號密碼管理table - 樂透
	// -----------------------------------------------
	@Id
	@Column(name = "t_uuid_1")
	@Type(type = "uuid-char")
	private UUID tableUuid1;
	@Column(name = "t_code_1")
	private String tableCode1;
	@Column(name = "t_code_2")
	private String tableCode2;
	@Column(name = "t_describe_1")
	private String tableDescribe1;
	@Column(name = "t_describe_2")
	private String tableDescribe2;
	@Column(name = "lotto_sort")
	private int lottoSort;
	@Column(name = "t_date_1")
	private LocalDateTime tableDate1;
	@Column(name = "t_date_2")
	private LocalDateTime tableDate2;
	@Column(name = "t_special_treatment_1")
	private String tableSpecialTreatment1;
	@Column(name = "table_name")
	private String tableName;
	@Column(name = "delete_bol")
	private String deleteBol;
	// -----------------------------------------------

	public T_01_0005() {

	}

	public T_01_0005(UUID tableUuid1, String tableCode1, String tableCode2, String tableDescribe1,
			String tableDescribe2, int lottoSort, LocalDateTime tableDate1, LocalDateTime tableDate2,
			String tableSpecialTreatment1, String tableName, String deleteBol) {
		this.tableUuid1 = tableUuid1;
		this.tableCode1 = tableCode1;
		this.tableCode2 = tableCode2;
		this.tableDescribe1 = tableDescribe1;
		this.tableDescribe2 = tableDescribe2;
		this.lottoSort = lottoSort;
		this.tableDate1 = tableDate1;
		this.tableDate2 = tableDate2;
		this.tableSpecialTreatment1 = tableSpecialTreatment1;
		this.tableName = tableName;
		this.deleteBol = deleteBol;
	}

	// -----------------------------------------------
	public UUID getTableUuid1() {
		return tableUuid1;
	}

	public void setTableUuid1(UUID tableUuid1) {
		this.tableUuid1 = tableUuid1;
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

	public int getLottoSort() {
		return lottoSort;
	}

	public void setLottoSort(int lottoSort) {
		this.lottoSort = lottoSort;
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

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getDeleteBol() {
		return deleteBol;
	}

	public void setDeleteBol(String deleteBol) {
		this.deleteBol = deleteBol;
	}

}
