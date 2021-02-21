package chapter5;
//write a program to find factorial of a given number
public class Program_5_1 {

	public static void main(String[] args) {
		int factorial, n, product=1;
		int number =10;
		if(number==1) {
			factorial=1;
		}
		else{
			for(n=2;n<=10;n++) {
				product=product*n;
				System.out.printf("%4d%10d\n",n,product);
			}
		}

	}

}
