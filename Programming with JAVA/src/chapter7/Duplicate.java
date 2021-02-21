package chapter7;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
	int i,j,num;
	System.out.println("Enter number of entries: ");
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	int array[]=new int[num];
	System.out.println("Enter element: ");
	for(i=0;i<num;i++) {
		array[i]=sc.nextInt();
	}
	
	System.out.println("Duplicate entires: ");
for(i=0;i<num;i++) {
	for(j=i+1;j<num;j++) {
		if(array[i]==array[j]) {
			System.out.print(array[j]);
		}
		
	}
}
	}

}
