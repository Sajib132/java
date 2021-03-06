package chapter7;

public class Exercise_2 {
	
	
public static int binSearch(int array[], int low, int high,int x) {
	while(low<=high) {
		int middle=(low+high)/2;
		
		 if(array[middle]==x) {
			return middle;
		}
		 else if(x<array[middle]) {
			return binSearch(array, low, middle-1,x);
		}
		else {
			return binSearch(array, middle-1,high,x);
		}
		}
	return x;
}	 

public static void main(String[] args) {
	Exercise_2 ob=new Exercise_2();
 int array[]= {1,2,3,4,5,6,7,8,9,12,24,56,76,87,99};
 int n = array.length; 
	int x = 12; 
	int result = ob.binSearch(array, 0, n - 1, x); 
	if (result == -1) 
		System.out.println("Element not present"); 
	else
		System.out.println("Element found at index " + result);

}
}
// // Java implementation of recursive Binary Search 
//class BinarySearch { 
//	// Returns index of x if it is present in arr[l.. 
//	// r], else return -1 
//	int binarySearch(int arr[], int l, int r, int x) 
//	{ 
//		if (r >= l) { 
//			int mid = l + (r - l) / 2; 
//
//			// If the element is present at the 
//			// middle itself 
//			if (arr[mid] == x) 
//				return mid; 
//
//			// If element is smaller than mid, then 
//			// it can only be present in left subarray 
//			if (arr[mid] > x) 
//				return binarySearch(arr, l, mid - 1, x); 
//
//			// Else the element can only be present 
//			// in right subarray 
//			return binarySearch(arr, mid + 1, r, x); 
//		} 
//
//		// We reach here when element is not present 
//		// in array 
//		return -1; 
//	} 
//
//	// Driver method to test above 
//	public static void main(String args[]) 
//	{ 
//		BinarySearch ob = new BinarySearch(); 
//		int arr[] = { 2, 3, 4, 10, 40 }; 
//		int n = arr.length; 
//		int x = 10; 
//		int result = ob.binarySearch(arr, 0, n - 1, x); 
//		if (result == -1) 
//			System.out.println("Element not present"); 
//		else
//			System.out.println("Element found at index " + result); 
//	} 
//} 
///* This code is contributed by Rajat Mishra */

 