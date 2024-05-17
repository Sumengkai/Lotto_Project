package com.example.Lotto_Project.Repository;

import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Lotto_Project.Entity.T_01_0002;
import com.example.Lotto_Project.Entity.T_01_0003;

@Transactional
@Repository
public interface T_01_0003_Dao extends JpaRepository<T_01_0003, Integer> {
	// -----------------------------------------------
	// "查詢" - T_01_0002 - By 編碼_01、編碼_02
	public Optional<T_01_0003> findByTableCode1AndTableCode2(String tableCode1, String tableCode2);
}
