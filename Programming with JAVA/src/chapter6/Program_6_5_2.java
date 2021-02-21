package chapter6;

public class Program_6_5_2 {

	public static void main(String[] args) {
		
		Program_6_5_1 ramesh=new Program_6_5_1();
		Program_6_5_1 suresh=new Program_6_5_1();
		ramesh.a=80;
		suresh.a=98;
		System.out.println("Ramesh: "+ramesh.a);
		System.out.println("Suresh: "+suresh.a);
		swap(ramesh,suresh);
		System.out.println("Ramesh: "+ramesh.a);
		System.out.println("Suresh: "+suresh.a);
	}
	public static void swap(Program_6_5_1 X,Program_6_5_1 Y) {
		Program_6_5_1  tem= new Program_6_5_1();
		tem.a=X.a;
		X.a=Y.a;
		Y.a=tem.a;
	}

}
