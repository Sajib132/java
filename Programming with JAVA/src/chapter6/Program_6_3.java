package chapter6;


public class Program_6_3 {

	public static void main(String[] args) {
		int num1=10,num2=20,swap;
		System.out.println("First: "+num1 +"Second"+num2);
		swap=sw(num1,num2);
		System.out.println("First"+num1+"Second"+num2);

	}
	public static int sw(int x, int y) {
		int temp;
		temp=x;
		x=y;
		y=temp;
		System.out.println("First"+x+"Second"+y);
		return temp;
	}

}
