package chapter5;
/*Write a program to demonstrate how an amount grows year by year with compound interest. 
 * Assume the initial amount as Rs. 100000. Assume the rATE OF INTEREST AS 8%
 * 
 * 
 */
public class Program_5_2 {

	public static void main(String[] args) {
		double amount=100000.00;
		double rate=0.08;
		int i;
		for(i=1;i<=10;i++){
			amount*=(1+rate);
			System.out.println(amount);
		}
		
	}

}
