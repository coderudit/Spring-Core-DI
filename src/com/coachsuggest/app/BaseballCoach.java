package com.coachsuggest.app;

//Demo's constructor injection
public class BaseballCoach implements Coach {
	private IFortuneService fortuneService;

	public BaseballCoach(IFortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Play baseball for 30 minutes.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	
}
