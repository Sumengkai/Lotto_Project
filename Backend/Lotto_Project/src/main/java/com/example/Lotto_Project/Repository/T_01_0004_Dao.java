package com.example.Lotto_Project.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

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
	// "查詢" - 條件 : 01005的UUID
	@Query("SELECT t FROM T_01_0004 t "
			//
			+ "WHERE 1 = 1 "
			//
			+ "AND (:tableUuid1 = '' OR  t.tableUuid1 = :tableUuid1 ) "
			//
			+ "ORDER BY t.winningNumber DESC ")
	public List<T_01_0004> search_By_TableUuid1(
			//
			@Param("tableUuid1") String tableUuid);

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

}
