package chapter7;

public class Program_7_2 {

	public static void main(String[] args) {
		int i,j;
		int matrix[][]= {{1,2,3,4},{4,6,4,3},{4,2,6,2},{2,8,1,9}};
		for(i=0;i<matrix.length;++i) {
			for(j=0;j<matrix[i].length;++j) {
				System.out.print("\t" +matrix[i][j]);
				
			}
			System.out.println();
		}

	}

}
