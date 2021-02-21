package chapter7;

import java.util.Scanner;

public class Program_7_1 {

	public static void main(String[] args) {
		System.out.println("Enter number of student: ");
		Scanner scanner=new Scanner(System.in);
		int ar=scanner.nextInt();
		int mark[]=new int[ar];
		int total=0;
		double average;
	for(int i=0;i<mark.length;i++) {
		System.out.print("Enter" + (i+1) + "of element: ");
		mark[i]=scanner.nextInt();
	}
		scanner.close();
		for(int j : mark) {
			total=total+j;
		}
		average=(double)total/mark.length;
		System.out.print( average);
		

	}
//	public static void main(String[] args) {
//        System.out.println("How many numbers you want to enter?");
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        /* Declaring array of n elements, the value
//         * of n is provided by the user
//         */
//        double[] arr = new double[n];
//        double total = 0;
//
//        for(int i=0; i<arr.length; i++){
//        	System.out.print("Enter Element No."+(i+1)+": ");
//        	arr[i] = scanner.nextDouble();
//        }
//        scanner.close();
//        for(int i=0; i<arr.length; i++){
//        	total = total + arr[i];
//        }
//
//
//        
//        double average = total / arr.length;
//        
//        System.out.format("The average is: %.3f", average);
//    }
}
