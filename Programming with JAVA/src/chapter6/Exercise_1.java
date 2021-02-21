package chapter6;

public class Exercise_1 {

	public static void main(String[] args) {
		int num=10,num2=20,GCD;
		GCD=abc(num,num2);
		System.out.println(GCD);

	}
	
	public static int abc(int x,int y) {
		int p;
		p=x%y;
		return p;
	}

}
