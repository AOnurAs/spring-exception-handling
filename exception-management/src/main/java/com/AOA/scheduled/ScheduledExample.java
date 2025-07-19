package com.AOA.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledExample {
	
	@Scheduled(cron = "0 49 14 * * *")
	//@Scheduled(cron = "*/10 * * * * *")
	public void writeOneToTen() {
		// to do work when scheduled time arrives
		for(int i = 0; i < 10 ; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
