package chapter7;

import java.util.Arrays;

public class Binary_Search {

	public static void main(String[] args) {
		int array[]= {1,2,3,4,5,6,7,8,9,12,24,56,76,87,99};
		System.out.println(Arrays.binarySearch(array, 99));//Predefine method
		
		int low=0;
		int high=15;
		int middle;
		int num=99;
		while(low<=high) {
			middle=(low+high)/2;
			if(num>array[middle]) {
				low=middle+1;
			}
			else if(num==array[middle]) {
				System.out.println(num + "Found at index " +(middle)+ ".");
				break;
			}
			
			else {
				high=middle-1;
			}}
			 if (low > high) {
		      System.out.println(num + " isn't present in the list.\n");
		  }
		}
		

}
	
//	public static void main(String args[])
//	  {
//	    int c, first, last, middle, n, search, array[];
//	 
//	    Scanner in = new Scanner(System.in);
//	    System.out.println("Enter number of elements");
//	    n = in.nextInt();
//	    array = new int[n];
//	 
//	    System.out.println("Enter " + n + " integers");
//	 
//	 
//	    for (c = 0; c < n; c++)
//	      array[c] = in.nextInt();
//	 
//	    System.out.println("Enter value to find");
//	    search = in.nextInt();
//	 
//	    first  = 0;
//	    last   = n - 1;
//	    middle = (first + last)/2;
//	 
//	    while( first <= last )
//	    {
//	      if ( array[middle] < search )
//	        first = middle + 1;    
//	      else if ( array[middle] == search )
//	      {
//	        System.out.println(search + " found at location " + (middle + 1) + ".");
//	        break;
//	      }
//	      else
//	         last = middle - 1;
//	 
//	      middle = (first + last)/2;
//	   }
//	   if (first > last)
//	      System.out.println(search + " isn't present in the list.\n");
//	  }

