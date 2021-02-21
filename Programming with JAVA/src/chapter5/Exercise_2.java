package chapter5;

import java.util.Scanner;
/*
 * Write a program to find GCD of two number
 */
public class Exercise_2 {

	public static void main(String[] args) {
		int num1,num2,GCD;
		Scanner a=new Scanner(System.in);
		System.out.println("Enter first number: "); //Try it using function
		num1=a.nextInt();
		System.out.println("Enter second number: ");
		num2=a.nextInt();
		if(num2==0) {
			System.out.println("Invalid!");
		}
		else {
			GCD=num1%num2;
			System.out.println(GCD);
		}

	}

}
