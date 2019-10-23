package leetcode;

public class medianOfTwoSortedArrays {

	
	
	public static void main(String[] args) {
		findMedianSortedArraysCaller();
	}
	
	
	
	public static void findMedianSortedArraysCaller() {
		int[] nums1 = new int[] {1,2};
		int[] nums2 = new int[] {3,4};
		System.out.println(findMedianSortedArrays(nums1, nums2));
	}
	
	
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums2.length + nums1.length;
        int[] merge = new int[len];
        
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < nums1.length && j < nums2.length) {
        	if(nums1[i] <= nums2[j]) {
        		merge[k] = nums1[i];
        		i++; k++;
        	} else {
        		merge[k] = nums2[j];
        		j++; k++;
        	}
        }
        while(i < nums1.length) {
        	merge[k] = nums1[i];
        	k++; i++;
        }
        while(j < nums2.length) {
        	merge[k] = nums2[j];
        	k++; j++;
        }
        
        for(int n : merge) {System.out.print(n + "\t");}
        
        if(len%2 == 0) {
        	return (double)(merge[len/2] + merge[len/2-1]) / 2.0;
        } else {
        	return (double)(merge[len/2]);
        }
    	
    	
    }
	
	
	
}
