package com.example.Lotto_Project.Repository;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.Lotto_Project.Entity.T_01_0001;

@Transactional
@Repository
public interface T_01_0001_Dao extends JpaRepository<T_01_0001, Integer> {
	// -----------------------------------------------
	// "查詢" - T_01_0001 - By 編碼_01
	public Optional<T_01_0001> findByTableCode1(String tableCode1);

	// -----------------------------------------------
	@Query("SELECT t FROM T_01_0001 t "
			//
			+ "WHERE 1 = 1 "
			//
			+ "AND (:tableCode1 = '' OR  t.tableCode1 = :tableCode1 ) "
			//
			+ "AND (:tableDescribe = '' OR (t.tableDescribe1 LIKE :tableDescribe OR t.tableDescribe2 LIKE :tableDescribe ))")
	public List<T_01_0001> search_By_TableCode1_TableDescribe(
			//
			@Param("tableCode1") String tableCode1,
			//
			@Param("tableDescribe") String tableDescribe);

	// -----------------------------------------------
	// -----------------------------------------------
	// 範例 :
	@Query("SELECT t FROM T_01_0001 t "
			//
			+ "WHERE 1 = 1 "
			// t.(Entity裡面的屬性名稱)
			// : (@Param("名稱"))
			+ "AND t.tableCode1 = :tableCode1 ")
	public List<T_01_0001> search_EX(
			//
			@Param("tableCode1") String tableCode1);
}
