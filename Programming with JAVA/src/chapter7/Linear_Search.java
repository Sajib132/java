package chapter7;

import java.util.Scanner;

public class Linear_Search {

	public static void main(String[] args) {
		int a,b,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of  element: ");
		a=sc.nextInt();
		int array[]=new int[a];
		System.out.println("Enter elements: ");
		for(i=0;i<a;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("Enter number to be seearch: ");
		b=sc.nextInt();
		for( i=0;i<a;i++) {
			if(array[i]==b) {
				System.out.println(b +"Found at index"+i);
				break;
			}
		}
		if(i==b) {
			System.out.println(b+"isn't found in the list ");
		}

	}

}
