package chapter7;

import java.util.Scanner;

public class Multiplication_of_matrix {

	public static void main(String[] args) {
		int a,b,i,j,p,q,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of rows and columnfor first matrix ");
		a=sc.nextInt();
		b=sc.nextInt();
		int first[][]=new int[a][b];
		System.out.println("Enter number of element in first matrix");
for(i=0;i<a;i++) {
	for(j=0;j<b;j++) {
		first[i][j]=sc.nextInt();
	}
}
System.out.print("Enter number of rows and colum for second matrix ");
p=sc.nextInt();
q=sc.nextInt();
if(b!=p) {
	System.out.println("No possible");
}
else {
int second[][]=new int[p][q];
int product[][]=new int[a][q];
System.out.println("Enter elements for second matrix: ");
for(i=0;i<p;i++) {
	for(j=0;j<q;j++) {
		second[i][j]=sc.nextInt();
	}
}

	for(i=0;i<a;i++) {
		for(j=0;j<q;j++) {
			for(int k=0;k<p;k++) {
				sum+=first[i][k]*second[k][j];
			}
			product[i][j]=sum;
			sum=0;
		}
	}
	System.out.println("Multiplication of matrix");
	for(i=0;i<a;i++) {
		for(j=0;j<q;j++) {
			System.out.print(product[i][j]+"\t");
		}
		System.out.println("\n");
	}
}
	}

}

