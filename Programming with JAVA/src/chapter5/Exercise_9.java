package chapter5;

import java.util.Scanner;

public class Exercise_9 {
	public static void main(String[]args)
    {
		int num,i;
		System.out.println("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(i=1;i<=num;i++) {
			
				if(num%i==0) {
					System.out.println(i);
				}
			}
		}
		
    }

