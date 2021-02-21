package chapter4;

import java.util.Scanner;

public class Program_4_3 {
	public static void main(String[] args) {
		int a,b;
		char ch;
		double c;
		System.out.println("Enter two values and a Character(+ - * /)");
		Scanner Calculator= new Scanner(System.in);
		a=Calculator.nextInt();
		b=Calculator.nextInt();
		ch=Calculator.next().charAt(0);
		switch(ch) {
		case '+':c=a+b;
		System.out.println(c);
		break;
		case '-':c=a-b;
		System.out.println(c);
		break;
		case '*':c=a*b;
		System.out.println(c);
		break;
		case '/':c=(double)a/b;
		System.out.println(c);
		break;
		default:
			System.out.println("Invalid Character!");
		}
		

	}

}
