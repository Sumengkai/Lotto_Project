package com.example.Lotto_Project.Entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_00_0001")
public class T_00_0001 {
	// -----------------------------------------------
	// 管理需要流水號的table
	// -----------------------------------------------
	@Id
	@Column(name = "table_name")
	private String tableName;
	@Column(name = "t_serial_number_1")
	private int tableSerialNumber1;
	@Column(name = "t_date_1")
	private LocalDateTime tableDate1;
	@Column(name = "t_date_2")
	private LocalDateTime tableDate2;
	@Column(name = "t_user")
	private String tableUser;

	// -----------------------------------------------
	public T_00_0001() {

	}

	public T_00_0001(String tableName, int tableSerialNumber1, LocalDateTime tableDate1, LocalDateTime tableDate2,
			String tableUser) {
		this.tableName = tableName;
		this.tableSerialNumber1 = tableSerialNumber1;
		this.tableDate1 = tableDate1;
		this.tableDate2 = tableDate2;
		this.tableUser = tableUser;
	}
	// -----------------------------------------------

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public int getTableSerialNumber1() {
		return tableSerialNumber1;
	}

	public void setTableSerialNumber1(int tableSerialNumber1) {
		this.tableSerialNumber1 = tableSerialNumber1;
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

	public String getTableUser() {
		return tableUser;
	}

	public void setTableUser(String tableUser) {
		this.tableUser = tableUser;
	}

	// -----------------------------------------------
	// Note :
	// 流水號 註記 : @GeneratedValue(strategy = GenerationType.IDENTITY)
	// UUID 註記 : @Type(type = "uuid-char")
	// -----------------------------------------------
}
