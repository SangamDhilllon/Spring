package com.springdemo;

public class TrackCoach implements Coach{

	//define private field and constructor
		private FortuneService fortune;
		
		public TrackCoach(FortuneService fortune) {
			this.fortune=fortune;
		}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "TrackCoach---Run 5k on track";
	}

	@Override
	public String getDailyFortune() {
		return fortune.getFortune();
	}
	
	//add init method
	public void doStart() {
		System.out.println("Inside dostart");
	}
	

	//add destroy method
	public void doStop() {
		System.out.println("Inside doStop");

	}

}
