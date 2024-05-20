package com.example.Lotto_Project.Entity;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "t_02_0002")
public class T_02_0002 {
	// -----------------------------------------------
	// 用戶買樂透的號碼table
	// -----------------------------------------------
	@Id
	@Column(name = "t_uuid_1")
	@Type(type = "uuid-char")
	private UUID tableUuid1;
	@Column(name = "t_uuid_2")
	@Type(type = "uuid-char")
	private UUID tableUuid2;
	@Column(name = "select_number_1")
	private String selectNumber1;
	@Column(name = "special_winning_number_bol")
	private String specialWinningNumberBol;
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

	public T_02_0002() {

	}

	public T_02_0002(UUID tableUuid1, UUID tableUuid2, String selectNumber1, String specialWinningNumberBol,
			LocalDateTime tableDate1, LocalDateTime tableDate2, String tableName, String tableSpecialTreatment1,
			String deleteBol) {
		this.tableUuid1 = tableUuid1;
		this.tableUuid2 = tableUuid2;
		this.selectNumber1 = selectNumber1;
		this.specialWinningNumberBol = specialWinningNumberBol;
		this.tableDate1 = tableDate1;
		this.tableDate2 = tableDate2;
		this.tableName = tableName;
		this.tableSpecialTreatment1 = tableSpecialTreatment1;
		this.deleteBol = deleteBol;
	}

	// -----------------------------------------------
	public UUID getTableUuid1() {
		return tableUuid1;
	}

	public void setTableUuid1(UUID tableUuid1) {
		this.tableUuid1 = tableUuid1;
	}

	public UUID getTableUuid2() {
		return tableUuid2;
	}

	public void setTableUuid2(UUID tableUuid2) {
		this.tableUuid2 = tableUuid2;
	}

	public String getSelectNumber1() {
		return selectNumber1;
	}

	public void setSelectNumber1(String selectNumber1) {
		this.selectNumber1 = selectNumber1;
	}

	public String getSpecialWinningNumberBol() {
		return specialWinningNumberBol;
	}

	public void setSpecialWinningNumberBol(String specialWinningNumberBol) {
		this.specialWinningNumberBol = specialWinningNumberBol;
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
