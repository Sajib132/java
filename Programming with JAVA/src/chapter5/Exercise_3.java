package chapter5;

import java.util.Scanner;
/*
 * Write a program to find LCM of two integer
 * Algorithm
1. Initialize A and B with positive integers.
2. Store maximum of A & B to the max.
3. Check if max is divisible by A and B.
4. If divisible, Display max as LCM.
5. If not divisible then step increase max, go to step 3.
 */
public class Exercise_3 {

	public static void main(String[] args) {
		int num1,num2,LCM=0,max,step;
		Scanner a=new Scanner(System.in);
		System.out.println("Enter first number: "); //Try it using another GCD
		num1=a.nextInt();
		System.out.println("Enter second number: ");
		num2=a.nextInt();
		if(num1>num2) {
			max=step=num1;
		}
		else {
			max=step=num2;
		}
		while(num1!=0) {
			if(max%num1==0 && max%num2==0) {
				LCM=max;
				break;
			}
			max+=step;
		}
System.out.println(LCM);
	}

}
