package chapter5;

import java.util.Scanner;

public class Exercise_14 {
	public static void main(String[] args) {
		int num, sum=0,r;
		System.out.println("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		while(num!=0) {
			r=num%10;
			sum=(sum)+r;
			num=num/10;
		}
		System.out.println(sum);
	}
}
