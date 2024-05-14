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
	private String table_name;
	@Column(name = "t_serial_number_1")
	private int t_serialNumber_1;
	@Column(name = "t_date_1")
	private LocalDateTime t_date_1;
	@Column(name = "t_date_2")
	private LocalDateTime t_date_2;
	@Column(name = "t_user")
	private String t_user;

	// -----------------------------------------------
	public T_00_0001() {

	}

	public T_00_0001(String table_name, int t_serialNumber_1, LocalDateTime t_date_1, LocalDateTime t_date_2,
			String t_user) {
		this.table_name = table_name;
		this.t_serialNumber_1 = t_serialNumber_1;
		this.t_date_1 = t_date_1;
		this.t_date_2 = t_date_2;
		this.t_user = t_user;
	}

	// -----------------------------------------------
	public String getTable_name() {
		return table_name;
	}

	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}

	public int getT_serialNumber_1() {
		return t_serialNumber_1;
	}

	public void setT_serialNumber_1(int t_serialNumber_1) {
		this.t_serialNumber_1 = t_serialNumber_1;
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

	public String getT_user() {
		return t_user;
	}

	public void setT_user(String t_user) {
		this.t_user = t_user;
	}
	// -----------------------------------------------
	// Note :
	// 流水號 註記 : @GeneratedValue(strategy = GenerationType.IDENTITY)
	// UUID 註記 : @Type(type = "uuid-char")
	// -----------------------------------------------
}
