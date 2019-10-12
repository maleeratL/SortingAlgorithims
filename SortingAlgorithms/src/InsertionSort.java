
public class InsertionSort {
	private static long startTime = System.currentTimeMillis();
	/*Function to sort array using insertion sort*/
    void sort(int arr[]) 
    { 
    	long startTime = System.currentTimeMillis();
        int n = arr.length;
        int compare=0;
        int move=0;
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
            compare++;
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
                move++;
            } 
            arr[j + 1] = key; 
        } 
        System.out.println("Compare: "+compare);
        System.out.println("Move: "+move);
    } 
  
    /* A utility function to print array of size n*/
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    } 
  
    // Driver method 
    public static void main(String args[]) 
    { 

  
        InsertionSort ob = new InsertionSort(); 
        int arr[] = new int [10];
        for(int i=0; i<arr.length; i++) {
        	arr[i] = (int) (Math.floor(Math.random()*100)+1);
        }
        ob.sort(arr); 
        System.out.println("Sorted array"); 
        ob.printArray(arr); 
        
		long endTime = System.currentTimeMillis();
        System.out.println("It took " + (endTime - startTime) + " milliseconds");
        
        System.out.println("-------------------------------");
        
        int arr2[] = new int [100];
        for(int i=0; i<arr2.length; i++) {
        	arr2[i] = (int) (Math.floor(Math.random()*100)+1);
        }
        ob.sort(arr2); 
        System.out.println("Sorted array"); 
        ob.printArray(arr2); 
        
		endTime = System.currentTimeMillis();
        System.out.println("It took " + (endTime - startTime) + " milliseconds");
        
        System.out.println("-------------------------------");
        
        int arr3[] = new int [1000];
        for(int i=0; i<arr3.length; i++) {
        	arr3[i] = (int) (Math.floor(Math.random()*1000)+1);
        }
        ob.sort(arr3); 
        System.out.println("Sorted array"); 
        ob.printArray(arr3); 
        
		endTime = System.currentTimeMillis();
        System.out.println("It took " + (endTime - startTime) + " milliseconds");
        
        System.out.println("-------------------------------");
        
        int arr4[] = new int [10000];
        for(int i=0; i<arr4.length; i++) {
        	arr4[i] = (int) (Math.floor(Math.random()*1000)+1);
        }
        ob.sort(arr4); 
        System.out.println("Sorted array"); 
        ob.printArray(arr4); 
        
		endTime = System.currentTimeMillis();
        System.out.println("It took " + (endTime - startTime) + " milliseconds");

    } 

}
