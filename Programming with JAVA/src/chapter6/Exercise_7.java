package chapter6;

public class Exercise_7 {

	public static void main(String[] args) {
		int num=10;
System.out.println("First"+num+"Prime Number:");

	}
	public static void fibo(int x) {
		int count=0,i,j;
		for(j=0;count<x;j++) {
		for(i=2;j%i!=0;i++) {
			if(i==j) {
				System.out.println(j);
				count++;
			}
			
		}
	}
	}
}
