package app.org.com.ds.algos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenratePermutation {

	public static void main(String[] args) {
		GenratePermutation obj = new GenratePermutation();
		int[] nums = {1,2,3,4,5};
		
		List<int[]> list = Arrays.asList(nums);

		List<List<Integer>> mainList = obj.permute(nums);
		System.out.println(mainList.size() + " : " + mainList.toString());

	}
	public class ListNode {

	    private int data;
	    private ListNode next;

	    ListNode(int data) {
	        this.data = data;
	        this.next = null;
	    }

	   // standard getters and setters
	}

	public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextElement = current.next;
            current.next = previous;
            previous = current;
            current = nextElement;
        }
        return previous;
    }
	
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> mainList = new ArrayList<>();
		List<Integer> checkList = new ArrayList<>();
		int loop = factorial(nums.length);
		System.out.println(loop);
		if (loop > 1) {
			loop /= 2;
		}

		swap(nums, checkList, (nums.length-1));
		for (int i=0; i<checkList.size(); i++) {
			if (i%nums.length == 0) {
				mainList.add(checkList.subList(i, i+nums.length));
//				if (nums.length > 1) {
//					List<Integer> rev = new ArrayList<Integer>();
//					rev.addAll(checkList.subList(i, i+nums.length));
//					Collections.reverse(rev);
//					mainList.add(rev);
//				}
				
			}
		}
		return mainList;
	}

	public void swap(int[] nums, List<Integer> checkList, int loop) {
		swapValues(nums, checkList, loop);
	}
	
	public void swapValues(int[] nums, List<Integer> checkList, int loop) {
		
		for (int j=0; j<nums.length; j++) {
			for (int i=nums.length-(j+1); i>1; i--) {
				
				addelements(checkList, nums);
				int temp = nums[i];
				nums[i] = nums[i-1];
				nums[i-1] = temp;
				System.out.println("checklist : " + checkList.subList((checkList.size() - nums.length), checkList.size()));
				
			}
			//swapValues(nums, checkList, loop);
			
		}
//		for (int i = (nums.length - loop); i < nums.length; i++) {
//			addelements(checkList, nums);
//			if (i == (nums.length - 1)) {
//				int temp = nums[i];
//				nums[i] = nums[0];
//				nums[0] = temp;
//			 } else {
//				int temp = nums[i];
//				nums[i] = nums[i + 1];
//				nums[i + 1] = temp;
//			}
//			System.out.println("checklist : " + checkList.subList((checkList.size() - nums.length), checkList.size()));
//		}

	}
	
	public void indexSwap(int[] nums, List<Integer> checkList, int index) {
		int loop = index;
		for (int i=index; i<nums.length-1; i++) {
			addelements(checkList, nums);
			int temp = nums[i];
			nums[i] = nums[i + 1];
			nums[i + 1] = temp;
			System.out.println("checklist : " + checkList.subList((checkList.size() - nums.length), checkList.size()));
		}

	}

	public void addelements(List<Integer> checkList, int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			checkList.add(nums[i]);
		}
	}

	public int factorial(int len) {
		int fact = 1;
		for (int i = len; i > 0; i--) {
			fact *= i;
		}
		return fact;
	}
	
	
	public static int[][] check = {{5,4,6,2},{5,4,2,6},{5,6,4,2},{5,6,2,4},{5,2,4,6},{5,2,6,4},{4,5,6,2},{4,5,2,6},{4,6,5,2},{4,6,2,5},{4,2,5,6},{4,2,6,5},{6,5,4,2},{6,5,2,4},{6,4,5,2},{6,4,2,5},{6,2,5,4},{6,2,4,5},{2,5,4,6},{2,5,6,4},{2,4,5,6},{2,4,6,5},{2,6,5,4},{2,6,4,5}};
}
