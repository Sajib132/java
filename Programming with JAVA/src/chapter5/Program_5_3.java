package chapter5;
/*
 * Write a program to find after how many years an amount in fixed deposit becomes three times. 
 * Assume the rate of interest as 8%
 */
public class Program_5_3 {

	public static void main(String[] args) {
		double amount=100000.0;
		double rate=0.08;
		double limit=3*amount;
		int year=0;
		while(amount<limit) {
			year+=1;
			amount*=(1+rate);
			System.out.printf("%d%10.2f\n",year,amount);
		}
System.out.println("\nAfter"+ year + "years amount becomes three times");
	}

}
//See next problems later