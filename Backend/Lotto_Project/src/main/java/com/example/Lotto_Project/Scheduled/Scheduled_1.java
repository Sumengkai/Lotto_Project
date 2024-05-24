package com.example.Lotto_Project.Scheduled;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.example.Lotto_Project.Service.Interface.Lotto_Service_1;

//@EnableScheduling - 排程需要註釋
@EnableScheduling
@Service
public class Scheduled_1 {
	// -----------------------------------------------
	@Autowired
	private Lotto_Service_1 lotto_Service_1;

	// -----------------------------------------------
	@Scheduled(cron = "0 0 20 * * *")
	public void ScheduledWork_1() {
		lotto_Service_1.Create__T_01_0005();
	}
}
