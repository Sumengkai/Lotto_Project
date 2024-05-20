package com.example.Lotto_Project.Repository;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Lotto_Project.Entity.T_01_0002;
import com.example.Lotto_Project.Entity.T_01_0003;

@Transactional
@Repository
public interface T_01_0003_Dao extends JpaRepository<T_01_0003, Integer> {
	// -----------------------------------------------
	// "查詢" - T_01_0002 - By 編碼_01、編碼_02
	public Optional<T_01_0003> findByTableCode1AndTableCode2(String tableCode1, String tableCode2);

	// -----------------------------------------------
	// "查詢" - 條件 : 編碼_1、編碼_2、描述
	@Query("SELECT t FROM T_01_0003 t "
			//
			+ "WHERE 1 = 1 "
			//
			+ "AND (:tableCode1 = '' OR  t.tableCode1 = :tableCode1 ) "
			//
			+ "AND (:tableCode2 = '' OR  t.tableCode2 = :tableCode2 ) "
			//
			+ "AND (:tableDescribe = '' OR (t.tableDescribe1 LIKE :tableDescribe OR t.tableDescribe2 LIKE :tableDescribe ))")
	public List<T_01_0003> search_By_TableCode1_TableCode2_TableDescribe(
			//
			@Param("tableCode1") String tableCode1,
			//
			@Param("tableCode2") String tableCode2,
			//
			@Param("tableDescribe") String tableDescribe);
	// -----------------------------------------------
}
