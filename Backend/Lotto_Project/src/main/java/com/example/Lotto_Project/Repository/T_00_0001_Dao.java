package com.example.Lotto_Project.Repository;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Lotto_Project.Entity.T_00_0001;

@Transactional
@Repository
public interface T_00_0001_Dao extends JpaRepository<T_00_0001, String> {

}
