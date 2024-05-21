package com.example.Lotto_Project.Repository;

import java.time.LocalDateTime;
import java.util.List;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Lotto_Project.Entity.T_01_0003;
import com.example.Lotto_Project.Entity.T_01_0004;

@Transactional
@Repository
public interface T_01_0004_Dao extends JpaRepository<T_01_0004, Integer> {
	// -----------------------------------------------
	// "查詢" - 條件 : 編碼_1、編碼_2、描述、開始日期、結束日期
	@Query("SELECT t FROM T_01_0004 t "
			//
			+ "WHERE 1 = 1 "
			//
			+ "AND (:tableCode1 = '' OR  t.tableCode1 = :tableCode1 ) "
			//
			+ "AND (:tableCode2 = '' OR  t.tableCode2 = :tableCode2 ) "
			//
			+ "AND (:tableDescribe = '' OR (t.tableDescribe1 LIKE :tableDescribe OR t.tableDescribe2 LIKE :tableDescribe )) "
			//
			+ "AND (t.tableDate1 Between :startDate And :endDate)")
	public List<T_01_0004> search_By_TableCode1_TableCode2_TableDescribe_StartDate_EndDate(
			//
			@Param("tableCode1") String tableCode1,
			//
			@Param("tableCode2") String tableCode2,
			//
			@Param("tableDescribe") String tableDescribe,
			//
			@Param("startDate") LocalDateTime startDate,
			//
			@Param("endDate") LocalDateTime endDate);

	// -----------------------------------------------
	// "查詢" - 條件 : 編碼_1、編碼_2
	@Query("SELECT t FROM T_01_0004 t "
			//
			+ "WHERE 1 = 1 "
			//
			+ "AND (:tableCode1 = '' OR  t.tableCode1 = :tableCode1 ) "
			//
			+ "AND (:tableCode2 = '' OR  t.tableCode2 = :tableCode2 ) ")
	public List<T_01_0004> search_By_TableCode1_TableCode2(
			//
			@Param("tableCode1") String tableCode1,
			//
			@Param("tableCode2") String tableCode2);

	// -----------------------------------------------
	// "查詢" - 條件 : 編碼_1、編碼_2
	// 回傳最大的數字 (第幾期)
	@Query("SELECT MAX(t.lottoSort) FROM T_01_0004 t "
			//
			+ "WHERE 1 = 1 "
			//
			+ "AND (:tableCode1 = '' OR  t.tableCode1 = :tableCode1 ) "
			//
			+ "AND (:tableCode2 = '' OR  t.tableCode2 = :tableCode2 ) ")
	public int search_MAX_LottoSort_By_TableCode1_TableCode2(
			//
			@Param("tableCode1") String tableCode1,
			//
			@Param("tableCode2") String tableCode2);
	// -----------------------------------------------
}
