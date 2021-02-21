package chapter3;
//Program 3.5: Evaluating Boolean Expression
public class Program3_5 {
	public static void main(String[] args) {
boolean a=true;
boolean b=false;
boolean c,d;
c=a||b;//Truth table .If both true or both false it return true and false respectively. Or one of them are true it return true
d=a&&b;//Truth table .If both true or both false it return true and false respectively. Or one of them are false it return false
System.out.println(c);
System.out.println(d);
}
}
