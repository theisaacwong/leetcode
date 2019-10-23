package leetcode;

import java.util.*;

public class threeSum {

	public List<List<Integer>> threeSum_slow(int[] nums){
		List<List<Integer>> rval = new ArrayList<List<Integer>>();
		
        int sum = 0;
        
		for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length && j != i; i++){
                for(int k = 0; k < nums.length && k != j && k != i; k++){
                    sum = nums[i] + nums[j] + nums[k];
                    if(sum == 0){
                        List<Integer> tempList = new ArrayList<Integer>();
                        tempList.add(i);
                        tempList.add(j);
                        tempList.add(k);
                        rval.add(tempList);
                    }
                }
            }
        }
		
		
		return rval;
	}
	
	
	public List<List<Integer>> threeSum_space(int[] nums){
		List<List<Integer>> rlist = new ArrayList<List<Integer>>();
		HashSet<HashSet<Integer>> rval = new HashSet<HashSet<Integer>>(); 
		
		int l = nums.length;
		int[][][] matrix = new int[l][l][l];
		
		for(int i = 0; i < l; i++) {
			for(int j = 0; j < l; j++) {
				for(int k = 0; k < l; k++) {
					matrix[i][j][k] = nums[i] + nums[j] + nums[k];
				}
			}
		}
		
		for(int i = 0; i < l; i++) {
			for(int j = 0; j < l; j++) {
				for(int k = 0; k < l; k++) {
					if(matrix[i][j][k] == 0) {
                        HashSet<Integer> tempSet = new HashSet<Integer>();
                        tempSet.add(nums[i]);
                        tempSet.add(nums[j]);
                        tempSet.add(nums[k]);
                        rval.add(tempSet);
					}
				}
			}
		}
		
		for(int i = 0; i < rval.size(); i++) {
			List<Integer> tempList = new ArrayList<Integer>();
			Iterator<HashSet<Integer>> j = rval.iterator();
			while(j.hasNext()) {
				for(Integer n : j.next()) {
					tempList.add(n);
				}
			}
			rlist.add(tempList);
		}

		return rlist;
	}
	
	public List<List<Integer>> threeSum(int[] nums){
		List<List<Integer>> rval = new ArrayList<List<Integer>>();
		
		HashMap<Integer, Integer> firstSum = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums.length; i++) {
			firstSum.put(nums[i], nums[i]);
		}
		
		HashMap<Integer, Integer> secondSum = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums.length; i++) {
			secondSum.put(nums[i], nums[i]);
		}
		
		
		
        
        

		return rval;
	}
	
}
