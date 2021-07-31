package com.coachsuggest.app;

//Demo's setter injection for other service and literal values
public class CricketCoach implements Coach {
	private IFortuneService fortuneService;
	private String emailAddress;
	private String team;

	public void setFortuneService(IFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "Play cricket for 30 minutes.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public void getDisplayInfo() {
		System.out.println("Team: " + team);
		System.out.println("Email address: " + emailAddress);
	}
}
