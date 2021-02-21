package chapter6;

import java.util.Scanner;

public class Program_6_2 {

	public static void main(String[] args) {
		int num,factorial;
		System.out.println("Enter a number: ");
		Scanner ab=new Scanner(System.in);
		num=ab.nextInt();
		factorial=fact(num);
		System.out.println(factorial);

	}
	public static int fact(int x) {
		int i=0,fact=1;
		for(i=1;i<=x;i++) {
			fact=fact*i;
		}
		return fact;
	}

}
