package com.thoughtworks.tdd;

public class Game {
	private static String FIZZ ="fizz";
	private static String BUZZ ="buzz";
	private static String WHIZZ ="whizz";

	public String fizzBuzz(int number) {
		String result="";
		if(number<1||number>120){
			return "invalid";
		}
		if(number % 3 == 0){
			 result+=FIZZ;
		}
		if(number % 5 == 0){
			 result+=BUZZ;
		}
		if(number % 7 == 0){
			 result+=WHIZZ;
		}
		if(result.equals("")){
			return String.valueOf(number);
		}
		return result;
		
		
	}
	

}
