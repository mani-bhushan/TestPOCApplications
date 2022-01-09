package app.org.com.ds.algos;

public class MoveZeroes {
	
	public static void main(String[] args) {
		int[] nums
//		= {0, 1, 0, 0, 0, 3, 12, 0, 13, 0}
		// = {0,1,0,3,0}
		// = {0}
				= { 1, 2, 3, 4, 5, 6, 7 };

		
//		1,2,3,4,5,6,7
//		
//		7,1,2,3,4,5,6 7
//		6,7,1,2,3,4,5 6
//		5,6,7,1,2,3,4 5
//		4,5,6,7,1,2,3 4
//		3,4,5,6,7,1,2 3
//		2,3,4,5,6,7,1 2
//		1,2,3,4,5,6,7 1
		
		int k = 3;
		k %= nums.length;

		int[] arr1 = new int[k];
        int c=0;
        for (int i=0; i<k; i++) {
        	arr1[i] = nums[(nums.length-k)+i];
        }
        
        for (int i=nums.length-1; i>=0; i--) {
        	if (i<k) {
        		nums[i] = arr1[i];
        	} else {
        		nums[i] = nums[i-k];
        	}
        }
        
		for (int i=0; i<nums.length; i++) {
            if (i<(nums.length-k)) {
                nums[i+k] = nums[i];
                //System.out.print(arr2[i+k] + ", ");
            } else {
                nums[c] = arr1[c++];
                 //System.out.print(arr2[i] + ", ");
            }

        }
        System.out.println();
//        for (int i=0; i<nums.length; i++) {
//            System.out.print(arr2[i] + ", ");
//        }
        System.out.println("\n\n");

//		for (int i=0, j=0; i < nums.length; i++) {
//			if (i<k) {
//				System.out.print(nums[nums.length + i - k] + " ");
//			} else {
//				System.out.print(nums[i - k] + " ");
//			}
//		}
//		leftRotate(nums, 3, 7);
//		printArray(nums, 7);

	}
	
	static void leftRotate(int arr[], int d, int n) {
        /* To handle if d >= n */
        d = d % n;
        int i, j, k, temp;
        int g_c_d = gcd(d, n);
        for (i = 0; i < g_c_d; i++) {
            /* move i-th values of blocks */
            temp = arr[i];
            j = i;
            while (true) {
                k = j + d;
                if (k >= n)
                    k = k - n;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }
 
     /*UTILITY FUNCTIONS*/
 
    /* function to print an array */
	static void printArray(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }
 
    /*Fuction to get gcd of a and b*/
    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
 

}
