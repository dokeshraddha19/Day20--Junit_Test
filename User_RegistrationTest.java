package com.bridgelabz.testproject;

import static org.junit.Assert.*;

import org.junit.Test;

public class User_RegistrationTest {

	@Test
	public void shouldreturnValidFirstName() {
		User_Registration user=new User_Registration();
		boolean result= user.UserfirstName("Shraddha");
		assertEquals(result,true);
	}
	@Test
	public void shouldreturnValidLastName() {
		User_Registration user=new User_Registration();
		boolean result= user.UserlastName("Doke");
		assertEquals(result,true);
	}
	@Test
	public void cheackEmailvalidation() {
		User_Registration user=new User_Registration();
		boolean result= user.UserEmailvalidation("abc123@gmail.com");
		assertEquals(result,true);
	}
	@Test
	public void checkMobilenumber() {
		User_Registration user=new User_Registration();
		boolean result= user.UserMobilenumber("91 987654301");
		assertEquals(result,true);
	}
	@Test
	public void checkPassWord() {
		User_Registration user=new User_Registration();
		boolean result= user.UserPassWord("Shraddha@1999");
		assertEquals(result,true);
	}
	
	
	

}
