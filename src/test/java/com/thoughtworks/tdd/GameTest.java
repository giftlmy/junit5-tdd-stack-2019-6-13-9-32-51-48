package com.thoughtworks.tdd;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class GameTest {
	@Test
	public void should_retrun_1_input_1(){
		//given
		 Game game = new Game();
		 int number =1;
		 //when
		 String result= game.fizzBuzz(number);
		 //then
		 Assertions.assertEquals("1", result);	 
		 
	}
	@Test 
	public void should_retrun_fizz_input_3(){
		//given
		 Game game = new Game();
		 int number =3;
		 //when
		 String result= game.fizzBuzz(number);
		 //then
		 Assertions.assertEquals("fizz", result);	 
	}
	@Test 
	public void should_retrun_buzz_input_5(){
		//given
		 Game game = new Game();
		 int number =5;
		 //when
		 String result= game.fizzBuzz(number);
		 //then
		 Assertions.assertEquals("buzz", result);	 
	}
	@Test 
	public void should_retrun_whizz_input_7(){
		//given
		 Game game = new Game();
		 int number =7;
		 //when
		 String result= game.fizzBuzz(number);
		 //then
		 Assertions.assertEquals("whizz", result);	 
	}
	@Test 
	public void should_retrun_fizzbuzz_input_15(){
		 //given
		 Game game = new Game();
		 int number =15;
		 //when
		 String result= game.fizzBuzz(number);
		 //then
		 Assertions.assertEquals("fizzbuzz", result);	 
	}
	@Test 
	public void should_retrun_fizzwhizz_input_21(){
		 //given
		 Game game = new Game();
		 int number =21;
		 //when
		 String result= game.fizzBuzz(number);
		 //then
		 Assertions.assertEquals("fizzwhizz", result);	 
	}
	@Test 
	public void should_retrun_fizzbuzzwhizz_input_105(){
		 //given
		 Game game = new Game();
		 int number =105;
		 //when
		 String result= game.fizzBuzz(number);
		 //then
		 Assertions.assertEquals("fizzbuzzwhizz", result);	 
	}
	@Test 
	public void should_retrun_invaild_input_invaildnumber(){
		 //given
		 Game game = new Game();
		 int number =-1;
		 //when
		 String result= game.fizzBuzz(number);
		 //then
		 Assertions.assertEquals("invalid", result);	 
	}

}
