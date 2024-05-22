package com.example.Lotto_Project.Repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Lotto_Project.Entity.T_00_0001;

@Transactional
@Repository
public interface SearchTable_1 extends JpaRepository<T_00_0001, String> {
	// 範例
	// "查詢" - 條件 : 編碼_1、編碼_2、描述、開始日期、結束日期
	@Query("SELECT "
			//
			+ "t.tableName, t.tableSerialNumber1 "
			//
			+ "FROM T_01_0004 t "
			//
			+ "JOIN T_01_0003 ON 1 = 1 "
			//
			+ "WHERE 1 = 1 "
			//
			+ "AND (:tableCode1 = '' OR  t.tableCode1 = :tableCode1 ) "
			//
			+ "AND (:tableCode2 = '' OR  t.tableCode2 = :tableCode2 ) ")
	public List<Object[]> search_1(
			//
			@Param("tableCode1") String tableCode1,
			//
			@Param("tableCode2") String tableCode2);

}
