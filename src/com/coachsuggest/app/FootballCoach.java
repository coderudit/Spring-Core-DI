package com.coachsuggest.app;

import org.springframework.beans.factory.DisposableBean;

//Demos
public class FootballCoach implements Coach, DisposableBean {
	private IFortuneService fortuneService;

	public FootballCoach() {
		super();
	}

	public FootballCoach(IFortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Play football for 30 minutes.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public void doMyStartupStuff() {
		System.out.println("I am called to do startup stuff.");
	}
	
	public void doMyCleanupStuff() {
		System.out.println("I am called to do cleanup stuff.");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("I am called to do destroy stuff.");

	}
}
