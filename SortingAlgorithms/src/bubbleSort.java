import java.util.Comparator;

public class bubbleSort {
	private static long startTime = System.currentTimeMillis();

	public void bubbleSort(int arr[]) 
    { 
        int n = arr.length; 
        int compare=0;
        int move=0;
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) {
            	compare++;
                if (arr[j] > arr[j+1]) 
                { 
                    // swap arr[j+1] and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                    move++;
                } 
            }   
        System.out.println("Compare: "+compare);
        System.out.println("Move: "+move);
    } 
  
    /* Prints the array */
    public void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
        bubbleSort ob = new bubbleSort(); 
        
        int arr[] = new int [10];
        for(int i=0; i<arr.length; i++) {
        	arr[i] = (int) (Math.floor(Math.random()*100)+1);
        }
        ob.bubbleSort(arr); 
        System.out.println("Sorted array"); 
        ob.printArray(arr); 
        
		long endTime = System.currentTimeMillis();
        System.out.println("It took " + (endTime - startTime) + " milliseconds");
 
        System.out.println("-------------------------------");
        
        int arr2[] = new int [100];
        for(int i=0; i<arr2.length; i++) {
        	arr2[i] = (int) (Math.floor(Math.random()*100)+1);
        }
        ob.bubbleSort(arr2); 
        System.out.println("Sorted array"); 
        ob.printArray(arr2); 
        
		endTime = System.currentTimeMillis();
        System.out.println("It took " + (endTime - startTime) + " milliseconds");
        
        System.out.println("-------------------------------");
        
        int arr3[] = new int [1000];
        for(int i=0; i<arr3.length; i++) {
        	arr3[i] = (int) (Math.floor(Math.random()*1000)+1);
        }
        ob.bubbleSort(arr3); 
        System.out.println("Sorted array"); 
        ob.printArray(arr3); 
        
		endTime = System.currentTimeMillis();
        System.out.println("It took " + (endTime - startTime) + " milliseconds");
        
        System.out.println("-------------------------------");
        
        int arr4[] = new int [10000];
        for(int i=0; i<arr4.length; i++) {
        	arr4[i] = (int) (Math.floor(Math.random()*10000)+1);
        }
        ob.bubbleSort(arr4); 
        System.out.println("Sorted array"); 
        ob.printArray(arr4); 
        
		endTime = System.currentTimeMillis();
        System.out.println("It took " + (endTime - startTime) + " milliseconds");

    } 
    


}
