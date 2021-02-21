package chapter6;

public class Program_6_1 {

	public static void main(String[] args) {
		int rup=5;
		int paisa=28;
		int total;
		total= conver(rup,paisa);
		System.out.println(total);

	}
public static int conver(int x, int y) {
		int temp;
		temp=x*100+y;
		return temp;
	}

}
