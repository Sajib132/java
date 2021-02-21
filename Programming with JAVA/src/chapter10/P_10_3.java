package chapter10;

public class P_10_3 {

	public static void main(String[] args) {
		int i;
		char ch;
		String s="Banglasesh is my country ish";
		ch=s.charAt(4);
		System.out.println("Character at index 4 is"+ch);

		i=s.lastIndexOf('i'); //Return the index at the last occuracnce
		i=s.indexOf('i');
		System.out.println("Char i is at index "+i);
		i=s.indexOf("my");
		System.out.println("substring my is at index"+i);

	}

}
