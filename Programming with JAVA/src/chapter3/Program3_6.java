package chapter3;
//Program 3.6: Bit Manipulate
public class Program3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=4;
long a=6,b;
short c=4,d=3;
b=i|a; //if either of the bits is 1, it gives 1, else it gives 0. 100|110 =110
d=(short)(d&c); //if both bits are 1, it gives 1, else it gives 0. 011&&100
System.out.println(b);
System.out.println(d);
	}

}
