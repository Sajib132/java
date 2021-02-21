package chapter7;

public class Max_in_Array {

	
		static int num[]= {24,42,47,23,96,245,21};
		public static int large() {
		int max=num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
				
			}
			
		}
		return max;
		}
		public static int small() {
			int min=num[0];
			for(int i=0;i<num.length;i++) {
				if(num[i]<min) {
					min=num[i];
					
				}
				
			}
			return min;
			}
		
		public static void main(String[] args) {
			System.out.println(large());
			System.out.print(small());
	}


}