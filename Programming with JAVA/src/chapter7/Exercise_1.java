package chapter7;

import java.util.Scanner;

public class Exercise_1 {

	public static void main(String[] args) {
		int num,i,max;
		System.out.println("Enter number of entries: ");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int arr[]=new int[num];
		System.out.println("Enter elements: ");
		for(i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		 max=arr[0];
		for( i=0;i<num;i++) {
			if(arr[i]>max) {
				max=arr[i];
				System.out.println("Maximum elemnt is: "+max);
			}

	}
	}
}
