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
	private int t_serialNumber_1;
	@Column(name = "t_code_1")
	private String t_code_1;
	@Column(name = "t_code_2")
	private String t_code_2;
	@Column(name = "t_describe_1")
	private String t_describe_1;
	@Column(name = "t_describe_2")
	private String t_describe_2;
	@Column(name = "t_describe_3")
	private String t_describe_3;
	@Column(name = "t_describe_4")
	private String t_describe_4;
	@Column(name = "total_several_numbers")
	private int total_several_numbers;
	@Column(name = "winning_total_several_numbers")
	private int winning_total_several_numbers;
	@Column(name = "top_winning_total_several_numbers")
	private int top_winning_total_several_numbers;
	@Column(name = "special_total_several_numbers")
	private int special_total_several_numbers;
	@Column(name = "generally_total_several_numbers")
	private int generally_total_several_numbers;
	@Column(name = "t_date_1")
	private LocalDateTime t_date_1;
	@Column(name = "t_date_2")
	private LocalDateTime t_date_2;
	@Column(name = "table_name")
	private String table_name;
	@Column(name = "t_special_treatment_1")
	private String t_special_treatment_1;

	// -----------------------------------------------
	public T_01_0003() {

	}

	public T_01_0003(String t_code_1, String t_code_2, String t_describe_1, String t_describe_2, String t_describe_3,
			String t_describe_4, int total_several_numbers, int winning_total_several_numbers,
			int top_winning_total_several_numbers, int special_total_several_numbers,
			int generally_total_several_numbers, LocalDateTime t_date_1, LocalDateTime t_date_2, String table_name,
			String t_special_treatment_1) {

		this.t_code_1 = t_code_1;
		this.t_code_2 = t_code_2;
		this.t_describe_1 = t_describe_1;
		this.t_describe_2 = t_describe_2;
		this.t_describe_3 = t_describe_3;
		this.t_describe_4 = t_describe_4;
		this.total_several_numbers = total_several_numbers;
		this.winning_total_several_numbers = winning_total_several_numbers;
		this.top_winning_total_several_numbers = top_winning_total_several_numbers;
		this.special_total_several_numbers = special_total_several_numbers;
		this.generally_total_several_numbers = generally_total_several_numbers;
		this.t_date_1 = t_date_1;
		this.t_date_2 = t_date_2;
		this.table_name = table_name;
		this.t_special_treatment_1 = t_special_treatment_1;
	}

	public T_01_0003(int t_serialNumber_1, String t_code_1, String t_code_2, String t_describe_1, String t_describe_2,
			String t_describe_3, String t_describe_4, int total_several_numbers, int winning_total_several_numbers,
			int top_winning_total_several_numbers, int special_total_several_numbers,
			int generally_total_several_numbers, LocalDateTime t_date_1, LocalDateTime t_date_2, String table_name,
			String t_special_treatment_1) {

		this.t_serialNumber_1 = t_serialNumber_1;
		this.t_code_1 = t_code_1;
		this.t_code_2 = t_code_2;
		this.t_describe_1 = t_describe_1;
		this.t_describe_2 = t_describe_2;
		this.t_describe_3 = t_describe_3;
		this.t_describe_4 = t_describe_4;
		this.total_several_numbers = total_several_numbers;
		this.winning_total_several_numbers = winning_total_several_numbers;
		this.top_winning_total_several_numbers = top_winning_total_several_numbers;
		this.special_total_several_numbers = special_total_several_numbers;
		this.generally_total_several_numbers = generally_total_several_numbers;
		this.t_date_1 = t_date_1;
		this.t_date_2 = t_date_2;
		this.table_name = table_name;
		this.t_special_treatment_1 = t_special_treatment_1;
	}

	// -----------------------------------------------
	public int getT_serialNumber_1() {
		return t_serialNumber_1;
	}

	public void setT_serialNumber_1(int t_serialNumber_1) {
		this.t_serialNumber_1 = t_serialNumber_1;
	}

	public String getT_code_1() {
		return t_code_1;
	}

	public void setT_code_1(String t_code_1) {
		this.t_code_1 = t_code_1;
	}

	public String getT_code_2() {
		return t_code_2;
	}

	public void setT_code_2(String t_code_2) {
		this.t_code_2 = t_code_2;
	}

	public String getT_describe_1() {
		return t_describe_1;
	}

	public void setT_describe_1(String t_describe_1) {
		this.t_describe_1 = t_describe_1;
	}

	public String getT_describe_2() {
		return t_describe_2;
	}

	public void setT_describe_2(String t_describe_2) {
		this.t_describe_2 = t_describe_2;
	}

	public String getT_describe_3() {
		return t_describe_3;
	}

	public void setT_describe_3(String t_describe_3) {
		this.t_describe_3 = t_describe_3;
	}

	public String getT_describe_4() {
		return t_describe_4;
	}

	public void setT_describe_4(String t_describe_4) {
		this.t_describe_4 = t_describe_4;
	}

	public int getTotal_several_numbers() {
		return total_several_numbers;
	}

	public void setTotal_several_numbers(int total_several_numbers) {
		this.total_several_numbers = total_several_numbers;
	}

	public int getWinning_total_several_numbers() {
		return winning_total_several_numbers;
	}

	public void setWinning_total_several_numbers(int winning_total_several_numbers) {
		this.winning_total_several_numbers = winning_total_several_numbers;
	}

	public int getTop_winning_total_several_numbers() {
		return top_winning_total_several_numbers;
	}

	public void setTop_winning_total_several_numbers(int top_winning_total_several_numbers) {
		this.top_winning_total_several_numbers = top_winning_total_several_numbers;
	}

	public int getSpecial_total_several_numbers() {
		return special_total_several_numbers;
	}

	public void setSpecial_total_several_numbers(int special_total_several_numbers) {
		this.special_total_several_numbers = special_total_several_numbers;
	}

	public int getGenerally_total_several_numbers() {
		return generally_total_several_numbers;
	}

	public void setGenerally_total_several_numbers(int generally_total_several_numbers) {
		this.generally_total_several_numbers = generally_total_several_numbers;
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

	public String getTable_name() {
		return table_name;
	}

	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}

	public String getT_special_treatment_1() {
		return t_special_treatment_1;
	}

	public void setT_special_treatment_1(String t_special_treatment_1) {
		this.t_special_treatment_1 = t_special_treatment_1;
	}

}
