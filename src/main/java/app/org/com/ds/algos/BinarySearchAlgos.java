package app.org.com.ds.algos;

public class BinarySearchAlgos {

	public static void main(String[] args) {
		
	    //int values[] = {13, 21, 54, 81, 90};
	    int values[] =  {-1,0,3,5,9,12};
	    int target = 9;
	    int result = binarySearch(values, target);
	    if(result == -1) {  
	    	System.out.println("Element is not present in the given array.");
	    } else {
	    	System.out.println("Element is present at index: " + result);
	    }
	}
	
	/*
    	function for carrying out binary search on given array
    	- values[] => given sorted array
    	- target => value to be searched
	*/
	public static int binarySearch(int values[], int target) {
	    int max = (values.length - 1);
	    int min = 0;
	    
	    int guess;  // this will hold the index of middle elements
	    int step = 0;  // to find out in how many steps we completed the search
	    
	    while(max >= min)
	    {
	        guess = (max + min) / 2;
	        // we made the first guess, incrementing step by 1
	        step++;
	        
	        if(values[guess] ==  target) {
	            System.out.println("Number of steps required for search: " + step);
	            return guess;
	        }
	        else if(values[guess] >  target) {
	            // target would be in the left half
	            max = (guess - 1);
	        } else {
	            // target would be in the right half
	            min = (guess + 1);
	        }
	    }
	 
	    // We reach here when element is not 
	    // present in array
	    return -1;
	}

}
