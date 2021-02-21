package chapter10;

public class P_10_6 {
	static String box[]= {"Sajib","Biswas","Jamal","Sardar","Neaz","Morshed"};
	public static void main(String[] args) {
	
	int i;
	sort(5);
	for(i=0;i<=5;i++) {
		System.out.println(i+")"+box[i]);
	}
	}
	static void sort(int n) {
		int a,j;
		String k;
		for(a=0;a<n;a++) {
			for(j=0;j<n;j++) {
				if(box[j].compareTo(box[j+1])>0) { //Meaning
					k=box[j];
					box[j]=box[j+1];
					box[j+1]=k;
							
				}
			}
		}
	}
		

	}


