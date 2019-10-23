package leetcode;

public class containerWithMostWater {
	public int maxArea(int[] height) {

		int best_volume = 0;
		int curr_volume = 0;

		for(int i = 0; i < height.length-1; i++){
			for(int j = i+1; j < height.length; j++){
				curr_volume = Math.min(height[i], height[j]) * (j-i);

				if(best_volume < curr_volume)
					best_volume = curr_volume;
			}
		}

		return best_volume;

	}
}
