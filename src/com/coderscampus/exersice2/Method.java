package com.coderscampus.exersice2;

public class Method {

	public Integer checkUserInput(Integer userInput) {
		if (userInput >= 300 || userInput <= 50) {
			return null;
		}
		return userInput;
	}
}