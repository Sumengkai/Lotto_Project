package com.example.Lotto_Project.Repository;

import java.util.Optional;
import java.util.UUID;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Lotto_Project.Entity.T_03_0001;

@Transactional
@Repository
public interface T_03_0001_Dao extends JpaRepository<T_03_0001, UUID> {
	// "查詢" - T_03_0001 - By 帳號
	Optional<T_03_0001> findByUserAccount(String userAccount);

	// "查詢" - T_03_0001 - By 帳號、密碼
	Optional<T_03_0001> findByUserAccountAndUserPassword(String userAccount, String userPassword);
}
