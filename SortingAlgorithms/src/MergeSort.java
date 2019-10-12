
public class MergeSort {
	private static long startTime = System.currentTimeMillis();
	
	 int compCount;
	 int splitCount=0;
	// Merges two subarrays of arr[]. 
    // First subarray is arr[l..m] 
    // Second subarray is arr[m+1..r] 
    void merge(int arr[], int l, int m, int r) 
    { 
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 

  
        /* Create temp arrays */
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
        	compCount++;
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
  
    // Main function that sorts arr[l..r] using 
    // merge() 
    void sort(int arr[], int l, int r) 
    { 
    	compCount =0;
    	splitCount++;
        if (l < r) 
        { 
            // Find the middle point 
            int m = (l+r)/2; 
  
            // Sort first and second halves 
            sort(arr, l, m); 
            sort(arr , m+1, r); 
  
            // Merge the sorted halves 
            merge(arr, l, m, r); 
        } 
    } 
    
    /* A utility function to print array of size n*/
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
 
    } 
    void printCount() {
    	System.out.println("Compare: "+compCount);
    	System.out.println("Split: "+splitCount);
    }
    
   
    

	public static void main(String[] args) {
		MergeSort ob = new MergeSort(); 
        int arr[] = new int [10];
        for(int i=0; i<arr.length; i++) {
        	arr[i] = (int) (Math.floor(Math.random()*100)+1);
        }
        ob.sort(arr, 0, arr.length-1); 
        System.out.println("Sorted array"); 
        ob.printArray(arr); 
        
		long endTime = System.currentTimeMillis();
        System.out.println("It took " + (endTime - startTime) + " milliseconds");
        ob.printCount();
        System.out.println("-------------------------------");
        
        int arr2[] = new int [100];
        for(int i=0; i<arr2.length; i++) {
        	arr2[i] = (int) (Math.floor(Math.random()*100)+1);
        }
        ob.sort(arr2, 0, arr2.length-1); 
        System.out.println("Sorted array"); 
        ob.printArray(arr2); 
        
		endTime = System.currentTimeMillis();
        System.out.println("It took " + (endTime - startTime) + " milliseconds");
        ob.printCount();
        System.out.println("-------------------------------");
        
        int arr3[] = new int [1000];
        for(int i=0; i<arr3.length; i++) {
        	arr3[i] = (int) (Math.floor(Math.random()*1000)+1);
        }
        ob.sort(arr3, 0, arr3.length-1); 
        System.out.println("Sorted array"); 
        ob.printArray(arr3); 
        
		endTime = System.currentTimeMillis();
        System.out.println("It took " + (endTime - startTime) + " milliseconds");
        ob.printCount();
        System.out.println("-------------------------------");
        
        int arr4[] = new int [10000];
        for(int i=0; i<arr4.length; i++) {
        	arr4[i] = (int) (Math.floor(Math.random()*1000)+1);
        }
        ob.sort(arr4, 0, arr4.length-1); 
        System.out.println("Sorted array"); 
        ob.printArray(arr4); 
        
		endTime = System.currentTimeMillis();
        System.out.println("It took " + (endTime - startTime) + " milliseconds");
        ob.printCount();
	}

}
