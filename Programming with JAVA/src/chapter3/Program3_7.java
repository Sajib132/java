package chapter3;
//Shift Operator
public class Program3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j,k=7;
i=6<<2;  //op1<<op2 : Shift bits of op left by distance op
         //Binary of 6 is 110. As it '<<' that means that will shift bits of 2 distance. Means 110 00 
         //Decimal of 11000 is 24. Thats why answer is 24
j=8>>2; //op1>>op2 : Shift bits of op right by distance op
         //Binary of 8 is 1000. As it '>>' that means that will shift bits of 2 distance. Means 10.00 
         //Decimal of 10.00 is 2. Thats why answer is 2
k=(byte)(k>>1);
System.out.println(i);
System.out.println(j);
System.out.println(k);
	}

}
