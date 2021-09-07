package com.bridgelabz.testproject;
import java.util.regex.Matcher;
//import java.util.*;
import java.util.regex.Pattern;
public class User_Registration {
	static boolean UserfirstName(String FirstName) {
		String regex= "^[A-Z]{1}[a-z]{3,}$";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(FirstName);
		return matcher.matches();

	}
	 static boolean UserlastName(String LastName) {
			String regex= "^[A-Z]{1}[a-z]{3,}$";
			Pattern pattern=Pattern.compile(regex);
			Matcher matcher=pattern.matcher(LastName);
			return matcher.matches();

		}
	 static boolean UserEmailvalidation(String EmailId) {
		 String regex= "^^[0-9a-zA-Z]+([+_.-][0-9a-zA-Z]+)*@[a-zA-Z0-9]+([.][a-zA-Z]{2,3}){1,2}$";
			Pattern pattern=Pattern.compile(regex);
			Matcher matcher=pattern.matcher(EmailId);
			return matcher.matches();
	 }
	 static boolean UserMobilenumber(String MobileNumber) {
		 String regex= "^[0-9]{2}[ ][0-9]{10}$";
			Pattern pattern=Pattern.compile(regex);
			Matcher matcher=pattern.matcher(MobileNumber);
			 return matcher.matches();
	 }
	 static boolean UserPassWord(String PassWord) {
		 String regex= "^[A-Za-z]{1,}[!@#$%^&*()_-]{1}[0-9]{1,}$";
			Pattern pattern=Pattern.compile(regex);
			Matcher matcher=pattern.matcher(PassWord);
			return matcher.matches();
	 }

}
