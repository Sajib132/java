package chapter3;
//Program 3.2: ASCII Number
public class Program3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char c=65;
int i,j,k;
for(j=2;j<16;j++) {
	System.out.println(j*16 +":");
	for(i=0;i<16;i++) {
		k=16*j+i;
		System.out.println((char)k +"");
		
	}
	System.out.println();
}
	}

}
