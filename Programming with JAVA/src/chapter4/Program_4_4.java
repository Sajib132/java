package chapter4;

public class Program_4_4 {

	public static void main(String[] args) {
		boolean result=true;
		int maxdays=0;
		int date=3;
		int month=8;
		switch(month) {
		case 1: maxdays=31;break;
		case 2: maxdays=28;break;
		case 3: maxdays=31;break;
		case 4: maxdays=30;break;
		case 5: maxdays=31;break;
		case 6: maxdays=30;break;
		case 7: maxdays=31;break;
		case 8: maxdays=31;break;
		case 9: maxdays=30;break;
		case 10: maxdays=31;break;
		case 11: maxdays=30;break;
		case 12: maxdays=31;break;
		default:result=false;
		
		}
		if(date>maxdays) {
			result=false;
		}
		if(result) {
			System.out.println("Valid!");
		}
		else {
			System.out.println("Invalid!");
		}

	}

}
