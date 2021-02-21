package chapter5;
/*
 * Write a program to find 15 fibonacci series
 */
public class Program_5_9 {

	public static void main(String[] args) {
		int first=0, second=1,next,i;
		System.out.println(first);
		System.out.println(second);
		for(i=3;i<=15;i++) {
			next=first+second;
			System.out.println(next);
			first=second;
			second=next;
			
		}
		return;

	}

}
