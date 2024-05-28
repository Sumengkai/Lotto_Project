package com.example.Lotto_Project.Entity;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "t_02_0001")
public class T_02_0001 {
	// -----------------------------------------------
	// 用戶買樂透table - 樂透本身
	// -----------------------------------------------
	@Id
	@Column(name = "t_uuid_1")
	@Type(type = "uuid-char")
	private UUID tableUuid1;
	@Column(name = "t_uuid_2")
	@Type(type = "uuid-char")
	private UUID tableUuid2;
	@Column(name = "user_account")
	private String userAccount;
	@Column(name = "t_date_1")
	private LocalDateTime tableDate1;
	@Column(name = "t_date_2")
	private LocalDateTime tableDate2;
	@Column(name = "number_selection_method")
	private String numberSelectionMethod;
	@Column(name = "table_name")
	private String tableName;
	@Column(name = "t_special_treatment_1")
	private String tableSpecialTreatment1;
	@Column(name = "delete_bol")
	private String deleteBol;
	// -----------------------------------------------

	public T_02_0001() {

	}

	public T_02_0001(UUID tableUuid1, UUID tableUuid2, String userAccount, LocalDateTime tableDate1,
			LocalDateTime tableDate2, String numberSelectionMethod, String tableName, String tableSpecialTreatment1,
			String deleteBol) {
		this.tableUuid1 = tableUuid1;
		this.tableUuid2 = tableUuid2;
		this.userAccount = userAccount;
		this.tableDate1 = tableDate1;
		this.tableDate2 = tableDate2;
		this.numberSelectionMethod = numberSelectionMethod;
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

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
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

	public String getNumberSelectionMethod() {
		return numberSelectionMethod;
	}

	public void setNumberSelectionMethod(String numberSelectionMethod) {
		this.numberSelectionMethod = numberSelectionMethod;
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

	public UUID getTableUuid2() {
		return tableUuid2;
	}

	public void setTableUuid2(UUID tableUuid2) {
		this.tableUuid2 = tableUuid2;
	}

}
