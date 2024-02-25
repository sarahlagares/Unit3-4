package com.coderscampus.exersice2;

import java.util.Scanner;

public class CreatingAMethod {

	public static void main(String[] args) {

		System.out.println("Type a number between 50 and 300");

		Scanner scanner = new Scanner(System.in);
		Integer userInput = scanner.nextInt();

		Method method = new Method();
		Integer input = method.checkUserInput(userInput);

		System.out.println("The number you typed in was: " + input);
	}
}
