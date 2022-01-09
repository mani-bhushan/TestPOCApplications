package app.org.com.ds.algos;

public class BadVersion {
	
	public static void main(String[] args) {
		
		int num = 123456;
		int r = 0;
		while (num>0) {
			r = r*10+num%10;
			num /= 10;
		}
		System.out.println(r);
		
		int i=0;
		int sum = 0;
		while (i<100) {
			sum = sum + i;
			sum = i + sum;
			i+=1;
		}
		System.out.print(sum);
		System.out.println();
		printG(6);
		
		
//		BadVersion bad = new BadVersion();
//		System.out.println(bad.firstBadVersion(2126753390));  // 2126753390
	}
	
	public static int fib(int n) {
		if (n==0 || n==1 || n==2) {
			return 0;
		} 
		if (n==3) {
			return 1;
		}
		else {
			return fib(n-1) + fib(n-2) + fib (n-3);
		}
	}
	
	public static void printG(int n) {
		for (int i=1; i<n; i++) {
			System.out.print(fib(i) + " ");
		}
	}
	public static int next = 1 ;
	
	public int firstBadVersion(int n) {
		if (isBadVersion(n) && !isBadVersion(n-1)) {
			next = n;
		} else {
			
		}
		if (isBadVersion(n-1) && isBadVersion(n)) {
    		next = n;
    		firstBadVersion(n/2);
    	} else if (!isBadVersion(n-1) && isBadVersion(n)) {
    		next = n;
    	} else if (!(isBadVersion(n-1) && isBadVersion(n))) {
    		while (n<next) {
    			if (isBadVersion(n)) {
    				next = n;
    			} else {
    				n++;
    			}
    		}
    	}
    	return next;
    }
    
    public static int getStart(int i, int n) {
    	if (isBadVersion(n-1) && isBadVersion(n)) {
    		i = getStart(i, n/2);
    	} 
    	return i;
    }
    
    public int check(int s, int e) {
    	for (int i=s; i<=e; i++) {
    		if(isBadVersion(i)) {
    			return i;
    		}
    	}
    	return 1;
    }
    
    public static int badVer = 1702766719
    		// 1702766719
    		// 425691679
    		;
    public static boolean isBadVersion(int v) {
    	return (v >= badVer) ? true : false;
    }
    
	/* 
    	
    	if (n == 1) {
    		next = (isBadVersion(n)) ? 1 : 0;
    	} else {

        	if (isBadVersion(n-1) && isBadVersion(n)) {
        		next = n;
        		firstBadVersion(n/2);
        	} else if (!isBadVersion(n-1) && isBadVersion(n)) {
        		next = n;
        	} else if (!(isBadVersion(n-1) && isBadVersion(n))) {
        		while (n<next) {
        			if (isBadVersion(n)) {
        				next = n;
        			} else {
        				n++;
        			}
        		}
        	}
    	}
        return (next == -1) ? 1 : next;
    
    */

}
