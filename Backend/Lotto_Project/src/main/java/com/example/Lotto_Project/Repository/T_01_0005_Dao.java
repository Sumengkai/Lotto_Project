package com.example.Lotto_Project.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Lotto_Project.Entity.T_01_0004;
import com.example.Lotto_Project.Entity.T_01_0005;

@Transactional
@Repository
public interface T_01_0005_Dao extends JpaRepository<T_01_0005, UUID> {
	// -----------------------------------------------
	// "查詢" - 條件 : 編碼_1、編碼_2
	// 回傳最大的數字 (第幾期)
	@Query("SELECT MAX(t.lottoSort) FROM T_01_0005 t "
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
	// "查詢" - 條件 : 編碼_1、編碼_2、第幾期、開始日期、結束日期
	@Query("SELECT t FROM T_01_0005 t "
			//
			+ "WHERE 1 = 1 "
			//
			+ "AND (:tableCode1 = '' OR  t.tableCode1 = :tableCode1 ) "
			//
			+ "AND (:tableCode2 = '' OR  t.tableCode2 = :tableCode2 ) "
			//
			+ "AND (:lottoSort <= 0 OR  t.lottoSort = :lottoSort ) "
			//
			+ "AND (t.tableDate1 Between :startDate And :endDate) "
			//
			+ "ORDER BY t.lottoSort ASC ")
	public List<T_01_0005> search_By_TableCode1_TableCode2_TableDescribe_StartDate_EndDate(
			//
			@Param("tableCode1") String tableCode1,
			//
			@Param("tableCode2") String tableCode2,
			//
			@Param("lottoSort") int tableDescribe,
			//
			@Param("startDate") LocalDateTime startDate,
			//
			@Param("endDate") LocalDateTime endDate);
}
