package app.org.com.strings;
// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {

    public String solution(int N, int K) {
        // write your code in Java SE 8
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] ele;
        String str="";
        char midEle;

        if (K==1) {
            for (int i=0; i<N; i++) {
                str += "a";
            }
            return str;
        }
        if (N%2 == 1) {
            ele = Arrays.copyOfRange(alphabet, 0, K-2);
            midEle = alphabet[K-1];
            for (int i=0; i<(N-1)/2; i+=ele.length) {
                str += new String(ele);
            }
            str = str.substring(0, ((N-1)/2));
            String rev = new StringBuilder(new String(str)).reverse().toString();
            str = str + midEle + rev;
        } else {
            ele = Arrays.copyOfRange(alphabet, 0, K);
            for (int i=0; i<N/2; i+=ele.length) {
                str += new String(ele);
            }
            str = str.substring(0, N/2);
            String rev = new StringBuilder(new String(str)).reverse().toString();
            str = str + rev;
        }
        System.out.println(str);
        return str;
    }
    
    public static void main(String[] args) {
    	Solution s1 = new Solution();
    	s1.solution(8, 3);
    }

}
