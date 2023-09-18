class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        
  	int maxCount = 0, res = 0,min=Integer.MAX_VALUE;
		boolean isGreater=false;

		for (int i = 0; i < divisors.length; i++) {
			int count = 0 ;

			for (int j = 0; j < nums.length; j++) {
				if (nums[j] % divisors[i] == 0) {
					count++;
				}
			}
			if (maxCount < count) {
				maxCount = count;
				res = divisors[i];
				isGreater=true;
			}
            if(maxCount == count) {
				if(res > divisors[i] && isGreater) {
					res = divisors[i];
				}
				if(min>divisors[i]) {
					min=divisors[i];
				}
			}
		}

		return (isGreater)?res:min;
    }
}
