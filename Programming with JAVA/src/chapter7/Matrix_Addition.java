package chapter7;

import java.util.Scanner;

public class Matrix_Addition {

	public static void main(String[] args) {
		int a,b,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows and column: ");
		a=sc.nextInt();
		b=sc.nextInt();
	int first[][]=new int[a][b];
	int second[][]=new int[a][b];
	int sum[][]=new int[a][b];
		System.out.println("Enter element of First Matrix: ");
		for(i=0;i<a;i++) {
			for(j=0;j<b;j++) {
				first[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter element of second Matrix: ");
		for(i=0;i<a;i++) {
			for(j=0;j<b;j++) {
				second[i][j]=sc.nextInt();
			}
		}
		
		for(i=0;i<a;i++) {
			for(j=0;j<b;j++) {
				sum[i][j]=first[i][j]+second[i][j];
			}
		}
		System.out.println("Addition of Matrix: ");
		for(i=0;i<a;i++) {
			for(j=0;j<b;j++) {
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println();
		}
	}
//		int i,j;
//		int mat1[][]= {{1,2,3},{4,5,6},{0,1,9}};
//		int mat2[][]= {{3,0,1},{2,4,1},{0,0,1}};
//		int mat3[][]=new int[3][3];
//		for(i=0;i<mat1.length;i++) {
//			for(j=0;j<mat2.length;j++) {
//				mat3[i][j]=(mat1[i][j]+mat2[i][j]);
//			}
//		}
//System.out.println("Addition Matrix");
//for(i=0;i<mat1.length;i++) {
//	for(j=0;j<mat2.length;j++) {
//		System.out.print("\t"+mat3[i][j]);
//	}
//	System.out.println();
//	}
//
//	}
}
