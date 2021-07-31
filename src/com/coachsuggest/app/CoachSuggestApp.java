package com.coachsuggest.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoachSuggestApp {

	public static void main(String[] args) {
		/**Coach theCoach = new TrackCoach();
		System.out.println(theCoach.getDailyWorkout());*/
		
		//1. Load the spring configuration file
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
		
		//2. Retrieve bean from the spring container
		//When we pass the interface to the method, behind the scenes Spring will cast the object for you
		//and provides a measure of type safety by throwing a BeanNotOfRequiredTypeException if the bean is not of the required type
		//when compared to normal casting.
		Coach theCoach = appContext.getBean("myCoach", Coach.class);
		Coach theCricketCoach = appContext.getBean("myCricketCoach", CricketCoach.class);
		Coach thefootballCoach = appContext.getBean("myFootballCoach", Coach.class);
		
		//3. Call methods on the bean
		System.out.println("Constructor Injection");
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println();
		System.out.println("Setter Injection");
		System.out.println(theCricketCoach.getDailyWorkout());
		System.out.println(theCricketCoach.getDailyFortune());
		((CricketCoach)theCricketCoach).getDisplayInfo();
		System.out.println();
		System.out.println(thefootballCoach.getDailyFortune());
	
		//Close the context
	
	}

}
